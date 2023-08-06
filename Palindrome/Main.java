package Palindrome;



import java.util.Scanner;
import java.util.Stack;


public class Main {
    
    public static void main(String[] args) {
        // Finden Sie heraus, ob der Satz ein Palindrom ist...
        
        //  ein esel lese nie 
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Satz ein: ");
        String satz = scanner.nextLine();
        
        Stack <Character> stack = new Stack <Character>();
        
        for (int i = 0 ; i < satz.length() / 2 ;i++) {
            stack.push(satz.charAt(i));
            
        }
        if (isPalindrome(satz, stack)) {
            System.out.println("Dieser Satz ist palindromisch...");
        }
        else {
            System.out.println("Dieser Satz ist kein Palindrom...");
        }
        scanner.close();
        
    }
    public static boolean isPalindrome(String satz,Stack<Character> stack) {
        for (int i = (satz.length() / 2 ) + 1 ; i < satz.length() ; i++) {
            
            if (satz.charAt(i) != stack.pop()){
                
                return false;
            }
            
            
        }
        return true;
        
        
    }
    
}

