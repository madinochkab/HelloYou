//import library to use Scanner object
import java.util.Scanner;


//class to get to know user
public class SecondClass {
	//create a class variable of a Scanner object to allow user to input to console
	static Scanner scanner = new Scanner (System.in);
	//static class variable to hold string array for user info
	static String[] userVars;
	static String[] details;
	
	//method to say farewell to user
	//5
	public static void exitApplication(){
		System.out.println("\nThanks you for using the SQA Greeting Application!");
		//exit the system
		System.exit(0);
	}
// this is the method of function (components that make up the method form a method signature)

	//2
public static String[] requestUserInfo(String name, String... details){
	//create an array of strings type, object to hold values for user, size is based on supplied arguments
	userVars = new String[details.length];
	//greeting of user
	System.out.println("I am excited to learn more about you "+ name + "!");
	//perform loop for the amount of iteration equal to the length of supplied items 
	for (int i=0; i<details.length; i++){
		//for each iteration ask the user for details
		System.out.println("Can I get your " + details[i]+",please?");
		//capture user input in relative variable within array
		userVars[i]=scanner.nextLine();
	}
//return the string array of supllied details
	return details;
}
//start 1 and 3
public static void main(String[] args){
	//declare local variables
	String name;
	System.out.println("Hello, and welcome to SQA Selenium bootcamp");
	System.out.println("Could I please get your name?");
	//set the captured name to a local string variable, name
	name = scanner.nextLine();
	//call method to get user input and set it to variable which holds an array of strings
	details = requestUserInfo(name, " age", " city of residence", " favorite color", " current mood");
	//output the info to the user
	outputUserDetails(name);
	//call method which gives a farewell to user and exits the system
	exitApplication();
}

//4

public static void outputUserDetails(String name){
	//begin outputing user gathered details such as theirs name
	System.out.println("\nWell " + name + ", it seems I have learned enough about you");
	//iterate through user details backwards, each iteration echos a detail
	for (int i = userVars.length - 1; i>0; i--){
		//echo details gathered of user info and requested details to console
		System.out.println("your" + details[i] + " is "+ userVars[i]+ ".");
	}
}
}