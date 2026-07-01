/*
Favorite Words
Chef loves his own name. So, he likes a word if and only if it either starts with the letter 'c', or ends with the letter 'f' (or both).
You are given a string S that represents a four-letter word.
S contains only lowercase English letters.
Does Chef like the word represented by string S?
 */
import java.util.Scanner;
public class Favourite {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.charAt(0)=='c' || s.charAt(s.length()-1)=='f'){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}