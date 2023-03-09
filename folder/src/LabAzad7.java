import java.util.Scanner;

public class LabAzad7 {
    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("Podaj temperature w \u00B0C");
        scanner=new Scanner(System.in);
        double d=scanner.nextDouble();
        scanner.close();
        d=d*1.8+2;
        System.out.printf("temperatura w \u00B0F: %1.1f",d);


    }
}
