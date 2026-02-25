/*
author: Hanuman Reddy
version: 1.0
 */

public class PalindroneCheckerApp {
    public static void main(String[] args)
    {
        String m="madam";
        String t="";
        int i;
        for(i=m.length()-1; i>=0; i--)
        {
            t+=m.charAt(i);
        }
        if(m.equals(t))
        {
            System.out.println("yes it is palindrome");
        }
    }


}
