import java.util.Scanner;

public class LabAzad11 {
    public static void main(String[] args) {
        String[] dni={"wtorek","środa","czwartek","piątek","sobota","niedziela","poniedziałek"};
        Scanner scam=new Scanner(System.in);
        System.out.println("Podaj date w formacie dd.mm.rrrr:");

        String cale=scam.next();

       String dd=cale.substring(0,2);
       String mm=cale.substring(3,5);
       String yy=cale.substring(6);
       int d=Integer.parseInt(dd),m=Integer.parseInt(mm),y=Integer.parseInt(yy),z=y,c=2;
if(m==1||m==2) {
    z = y - 1;
    c=0;
}
        System.out.println(dni[((23*m/9)+d+4+y+(z/4)+(z/100)+(z/400)-c)%7]);
     scam.close();
    }
}
