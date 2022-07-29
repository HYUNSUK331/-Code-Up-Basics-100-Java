import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        
        String[] sr = s.split(":");
        
        System.out.println(Integer.valueOf(sr[1]));
        
    }
}
