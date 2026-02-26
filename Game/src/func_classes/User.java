package func_classes;

import java.util.HashMap;
import java.util.Map;

import auth_interface.IValidate;

public class User implements IValidate {
	String userid;
	String password;

	static Map<String, String> users = new HashMap<>();
	
	public User(String userid , String password) {
		this.password = password;
		this.userid = userid;
	}

	public static void addUser(String userid, String password) {
		
		users.put(userid, password);

	}

	public  boolean IsAuthenticated(String userid, String password) {

		if (!users.containsKey(userid)) {
			return false;
		}

		return users.get(userid).equals(password);
	}

}
