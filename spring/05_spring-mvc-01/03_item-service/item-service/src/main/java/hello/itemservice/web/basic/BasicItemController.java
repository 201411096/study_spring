package hello.itemservice.web.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/basic/items")
//@RequiredArgsConstructor // 활성화 시, 생성자를 없애도 됨
public class BasicItemController {

    private final ItemRepository itemRepository;

    @Autowired
    public BasicItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }
    
    @GetMapping
    public String items(Model model){
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "/basic/items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model){
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "/basic/item";
    }

    @GetMapping("/add")
    public String addForm(){
        return "/basic/addForm";
    }

    // V1
//    @PostMapping("/add")
//    public String addItemV1(@RequestParam String itemName,
//                       @RequestParam int price,
//                       @RequestParam Integer quantity,
//                       Model model){
//        Item item = new Item();
//        item.setItemName(itemName);
//        item.setPrice(price);
//        item.setQuantity(quantity);
//
//        itemRepository.save(item);
//
//        model.addAttribute("item", item);
//
//        return "basic/item";
//    }

    // V2
//    @PostMapping("/add")
//    public String addItemV2(@ModelAttribute("item") Item item, Model model){
//        itemRepository.save(item);
//
//        model.addAttribute("item", item);
//
//        return "basic/item";
//    }

//    // V3
//    @PostMapping("/add")
//    public String addItemV3(@ModelAttribute("item") Item item){
//        itemRepository.save(item);
////        model.addAttribute("item", item); //@ModelAttribute(var_name)가 ... -> var_name을 key값으로 model에 넣어둠
//        return "basic/item";
//    }

    // V4
    // class명의 맨 앞글자를 소문자로 바꾼 값을 키값으로 model에 넣음
//    @PostMapping("/add")
//    public String addItemV4(Item item){
//        itemRepository.save(item);
//        return "basic/item";
//    }

    /*
    addItemV4 <-> edit 차이점
    addItemV4 -> 마지막 요청이 POST
    edit -> 마지막 요청이 GET (POST -> REDIRECT -> GET)
    
    addItemV4는 새로고침을 할 때마다 등록도 추가로 되는 문제가 발생함
     */

    //V5
//    @PostMapping("/add")
//    public String addItemV5(Item item){
//        itemRepository.save(item);
//        return "redirect:/basic/items/"+item.getId();
//    }

    /*
    RedirectAttributes

    RedirectAttributes 를 사용하면 URL 인코딩도 해주고, pathVarible, 쿼리 파라미터까지 처리해준다.
    redirect:/basic/items/{itemId}
    pathVariable 바인딩: {itemId}
    나머지는 쿼리 파라미터로 처리: ?status=true
     */

    @PostMapping("/add")
    public String addItemV6(Item item, RedirectAttributes redirectAttributes){
        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/basic/items/{itemId}";
    }

    /*
    속성 변경 - th:action
    th:action
    HTML form에서 action 에 값이 없으면 현재 URL에 데이터를 전송한다.
    상품 등록 폼의 URL과 실제 상품 등록을 처리하는 URL을 똑같이 맞추고 HTTP 메서드로 두 기능을 구분한다.
    상품 등록 폼: GET /basic/items/add
    상품 등록 처리: POST /basic/items/add
    이렇게 하면 하나의 URL로 등록 폼과, 등록 처리를 깔끔하게 처리할 수 있다.
     */

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model){
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "basic/editForm";
    }

    /*
    리다이렉트
    상품 수정은 마지막에 뷰 템플릿을 호출하는 대신에 상품 상세 화면으로 이동하도록 리다이렉트를 호출한다.
    스프링은 redirect:/... 으로 편리하게 리다이렉트를 지원한다.
    redirect:/basic/items/{itemId}"
    컨트롤러에 매핑된 @PathVariable 의 값은 redirect 에도 사용 할 수 있다.
    redirect:/basic/items/{itemId} {itemId} 는 @PathVariable Long itemId 의 값을 그대로 사용한다.
     */

    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item){
        itemRepository.update(itemId, item);
        return "redirect:/basic/items/{itemId}";
    }

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init(){
        itemRepository.save(new Item("testA", 10000, 10));
        itemRepository.save(new Item("testB", 20000, 20));
    }
}
