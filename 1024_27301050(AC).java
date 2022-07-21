import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String[] arr = b.split("");
        for(int i=0; i<arr.length; i++){
            System.out.println("'"+arr[i]+"'");
        }
    }
}
