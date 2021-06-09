import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class vucutKitleIndex {
    public static void main(String[] args){
        double kilo,boy,vucutIndex;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = girdi.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz:");
        boy = girdi.nextDouble();
        
        vucutIndex=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndex'iniz : "+vucutIndex);
    }
}
