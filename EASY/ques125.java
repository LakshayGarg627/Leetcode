import java.util.*;
public class ques125{
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int n=s.length();
        String str=new String("");
        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
       
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
            
        }
        
            return true;
        
    }
    public static void main(String args[]){
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}