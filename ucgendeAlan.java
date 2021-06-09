import java.net.SocketTimeoutException;
import java.util.Scanner;
public class ucgendeAlan {
    public static void main(String[] args){
      double a,b,c,cevre,alan,u;
      System.out.println("Alan hesaplama programına hosgeldiniz");
      Scanner girdi = new Scanner(System.in);
      System.out.print("Birinci kenarı giriniz:");
      a = girdi.nextDouble();
      System.out.print("İkinci kenarı giriniz:");
      b= girdi.nextDouble();
      System.out.print("Üçüncü kenari giriniz:");
      c= girdi.nextDouble();

      u=(a+b+c)/2;
      alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
      System.out.println("Alan :"+alan);

    }
}
