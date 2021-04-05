
public abstract class AbstConnectHelper {

	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	
	// template method
	public String requestConnection(String encodedInfo) {
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = "userName";		
		int i = authorization(userName);
		
		switch(i) {
		case 0: // auth-0
			break;
		case 1: // auth-1
			break;
		case 2:	// auth-2
			break;
		case 3:	// auth-3
			break;			
		}
		
		return connection(decodedInfo);
	}
}
