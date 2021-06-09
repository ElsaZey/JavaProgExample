import java.util.Scanner;
public class hipothesap {
    public static void main(String[] args){
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci dik kenarı giriniz:");
        a = input.nextInt();
        System.out.print("İkinci dik kenarı giriniz:");
        b = input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs: "+c);
        c= input.nextDouble();
    }
}
