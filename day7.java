import java.util.*;

public class day7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int LineNumber = 1;

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(LineNumber + " " + line);
            LineNumber++;
            
        }

        sc.close();

    }
}
