import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            Double x = scan.nextDouble();
            scan.nextLine();
            String name = scan.nextLine();


        System.out.println("String: " + name);
        System.out.println("Double: " + x);
        System.out.println("Int: " + i);


        scan.close();


    }
    
}
}
