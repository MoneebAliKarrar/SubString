
import java.util.Scanner;
public class SubString {

    public static void main(String[] args) {
        System.out.println("please enter the string :");
        Scanner s = new Scanner(System.in);
        String inputstring = s.nextLine();
        System.out.println("now please enter the bounderies: ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (b <= a || a< 0|| b< 0|| a > inputstring.length() || b > inputstring.length() ){
            System.out.println("THIS IS NOT VALD INPUT");
            return;
        }else{
        String substring = inputstring.substring(a, b);
        
        System.out.println(substring);
        }
        }
}
