import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner cislo = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.println("привет это калькулято для допусков");
        System.out.println("отверстие");
        a = cislo.nextFloat();
        System.out.println("валл");
        b = cislo.nextFloat();
        System.out.println("макс отверстия");
        c = cislo.nextFloat();
        System.out.println("мин отверстия");
        d = cislo.nextFloat();
        System.out.println("макс валл");
        e = cislo.nextFloat();
        System.out.println("мин валл");
        f = cislo.nextFloat();

        Deystvie kalkulaytor = new Deystvie (a,b,c,d,e,f);

    }
}
