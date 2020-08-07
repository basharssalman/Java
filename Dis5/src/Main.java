class Bundle{  
String size = "super"; // size of Bundle in the super class
}  
class UserBundle extends Bundle{  
String size = "limited"; // size of Bundle in the subclass
void user(String s){ // user subroutine
	if (s == "default")
System.out.println("Your Bundle is " + size); // using the variable size from the class UserBundle
	else 
		if (s == "VIP")
	// here we can use the special variable super to use the size variable from the super class		
System.out.println("Your Bundle is " + super.size); // using the variable size from the class Bundle
}  
}  
class Main{  
public static void main(String args[]){  
UserBundle u = new UserBundle(); // object 1 of class UserBundle
UserBundle u1 = new UserBundle(); // object 2 of class UserBundle
u.user("VIP");  // this user gets a super Bundle
u1.user("default"); // this user gets a default Bundle
}}  