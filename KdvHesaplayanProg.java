import java.util.Scanner;
public class KdvHesaplayanProg {
    public static void main(String[] args){
    double tutar,kdvTutar,kdvliTutar,kdvOran = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Ücret tutarını giriniz:");
    tutar= input.nextDouble();

    if(tutar>0&&tutar<=1000) {
            kdvOran=0.18;
        }
    else  {
        kdvOran = 0.08;
    }

    kdvTutar=kdvOran*tutar;
    kdvliTutar=kdvTutar+tutar;

    System.out.println("Girdiğiniz Tutar:"+tutar);
    System.out.println("KDV Oran: "+kdvOran);
    System.out.println("KDV Tutar:"+kdvTutar);
    System.out.println("KDV'li Tutar:"+kdvliTutar);


    }
}