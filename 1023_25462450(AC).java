import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        String a;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();    
        
        String []b = a.split("\\.");
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
