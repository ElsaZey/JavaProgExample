import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14,daireDilimAlan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz:");
        a = input.nextInt();
        daireDilimAlan = (pi*(r*r)*a)/360;
        System.out.print("Daire Diliminin Alanı: "+daireDilimAlan);
    }
}
