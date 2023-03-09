import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LabAzad10 {
    public static void main(String[] args) throws IOException {
        File f = new File("dane.txt");
        Scanner scam = new Scanner(f);
        while (scam.hasNext()) {
            String s1 = scam.next(), s2 = scam.next();
            double a = scam.nextDouble(), b = scam.nextDouble();
            System.out.printf("%s %s %.2f\n", s2, s1, a * b);
        }
        scam.close();
    }
}
