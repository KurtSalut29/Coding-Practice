import java.util.*;

public class day5 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        for(int i=0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            int sum = a;

            
            for(int j = 0; j < c;  j++){
                sum += (1 << j) * b;
                System.out.print(sum);


                if(j < c - 1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        sc.close();

    }
    
}
