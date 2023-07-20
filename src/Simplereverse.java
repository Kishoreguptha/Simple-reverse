import java.util.*;
public class Simplereverse {
    public static int Ss(String a) {
        String rev="";
        for(int i=0;i<a.length();i++) {
            rev=a.charAt(i)+rev;
        }
        System.out.println(rev);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.next();
        Ss(a);

    }

}