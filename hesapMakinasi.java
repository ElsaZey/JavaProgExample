import java.util.Scanner;
public class hesapMakinasi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        n1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu : " + (n1 * n2));
                break;
            case 4:
                if(n2 !=0 ) {
                    System.out.println("Bölme sonucu : " + (n1 / n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.println("Hatalı işlem girdiniz ! Yeniden deneyin ");
                break;
        }
    }
}