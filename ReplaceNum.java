import java.util.*;
public class ReplaceNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem, val=0;
        if(n>=0 && n<=1000000)
        {
            int m=0;
            while(n>0)
            {
                rem = n%10;
                val = (int)((9-rem)*Math.pow(10,m)+val);
                n = n/10;
                m++;
            }
            
            System.out.println(val);
        }
        else
        {
            System.out.println("Wrong input");
        }
    }
}
