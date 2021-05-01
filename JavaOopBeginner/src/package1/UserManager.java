package package1;

public class UserManager {

	public void AddUserList(User[] users) {
		
		
		for(User user:users ) {
			
			user.setUserList(users);
			
			
		}
				
	}
			
	public void AddUserName(User user) {
		
		
		System.out.println(user.getUserName()+"eklendi");
		
		
	}
	
   public void AddUserPassword(User user) {
		
		
		System.out.println(user.getPassword()+"eklendi");
		
		
	}
	
	
}
	
	
	

