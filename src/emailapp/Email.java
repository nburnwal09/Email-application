package emailapp;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength=10;
	private String email;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String companySuffix="aeycompany.com";
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("EMAIL CREATED : "+ this.firstName+" "+this.lastName);
		this.department=setDepartment();
		//System.out.println("Department : "+this.department);
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password : "+this.password);
		
		email=this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
		System.out.println("Your emailid is : "+email);
	}
	
	public String setDepartment() {
		System.out.println("Department codes : \n 1 for sales\n 2 for development\n 3 for accounting\n 0 for none\n Enter department code : ");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "development";}
		else if(depChoice==3) {return "accounting";}
		else {return "";}
	}
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	public void changePassword(String passwrod) {
		this.password=password;
	}
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getpassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME : "+firstName+" "+lastName+
				"\nCOMPANY EMAIL : "+email+
				"\nMAIL BOX CAPACITY : "+mailBoxCapacity;
	}
}
