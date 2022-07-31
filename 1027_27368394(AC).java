import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String time = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(time,".");
        
        String [] times = new String[4];
        
        int i=0;    
        while(st.hasMoreTokens()) {
            times[i] = st.nextToken();
            i+=1;
        }
        
        System.out.print(times[2]+"-"+times[1]+"-"+times[0]);
        
    }
}
