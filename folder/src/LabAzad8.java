import java.util.Scanner;

public class LabAzad8 {
    public static void main(String[] args) {
        Scanner scam;
        System.out.println("podaj 1 przyprostokątną:");
        scam=new Scanner(System.in);
        double d1=scam.nextDouble();
        System.out.println("podaj 2 przyprostokątną:");
        double d2=scam.nextDouble();
        scam.close();
        d2=d2*d2+d1*d1;
        d2=Math.sqrt(d2);
        System.out.printf("wartość przeciwprostokątnej: %1.3f",d2);
    }
}
