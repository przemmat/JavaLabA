import java.util.Scanner;

public class LabAzad9 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3";
        Scanner scam = new Scanner(s);
        String s1 = scam.next(), s2 = scam.next();
        double a = scam.nextDouble(), b = scam.nextDouble();
        System.out.printf("%s %s %.2f\n", s2, s1, a * b);
        scam.close();
    }
}
