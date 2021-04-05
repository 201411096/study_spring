
public class DefaultConnectHelper extends AbstConnectHelper{
	
	@Override
	protected String doSecurity(String string) {
		System.out.println("decode..");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("check id/pw ..");
		return true;
	}
	
	@Override
	protected int authorization(String userName) {
		System.out.println("check authorization ..");
		return 0;
	}
	
	@Override
	protected String connection(String info) {
		System.out.println("connection() ...");
		return info;
	}
}
