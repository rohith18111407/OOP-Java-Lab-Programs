import java.util.Scanner;
 
class Palindrome 
{
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;
 
        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) 
        {
            ans = true;
        }
        return ans;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to check palindrome: ");
        String str =scanner.nextLine();
        Palindrome palindrome=new Palindrome();
        
        str = str.toLowerCase();
        boolean res = palindrome.isPalindrome(str);
        System.out.println(res);
    }
}