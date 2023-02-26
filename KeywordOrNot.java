/* Find a taken String is a keyword or not
 * Note : 
 * "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range","return", 
   "struct", "type", "var" --- these are the keywords
 */

import java.util.*;
public class KeywordOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] keywords = {"break", "case", "continue", "default", "defer", "else", "for", "func", 
        "goto", "if", "map", "range","return", "struct", "type", "var"};
        String str = sc.nextLine();
        int c=0;
        for (int i = 0; i < keywords.length; i++) {
            if(keywords[i].equalsIgnoreCase(str))
            {
                System.out.println("Keyword");
                break;
            }
            else{
                c++;
            }
        }
        if(c==keywords.length)
        {
            System.out.println("Not a keyword");
        }
    }
}
