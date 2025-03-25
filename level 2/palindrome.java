import java.util.Scanner;

class PalindromeChecker {
    String text;

public boolean ispalindrome(){
   int length = text.length();

   for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }
	
public void displayResult(){

	if (ispalindrome()) {
	System.out.println("The text you hava entered is a palindrome");
	}else{
	System.out.println("The text you have entered is not a palindrome");
	}
}
}
 public class palindrome{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		   PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter the text to check if it is a palindrome: ");
        checker.text = scan.nextLine();

        checker.displayResult();

        scan.close();
    }
}
		

 

	
