import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args){
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double armutkg,elmakg,domateskg,muzkg,patlicankg,tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç kg armut ? : ");
        armutkg = inp.nextDouble();
        System.out.print("Kaç kg elma ? : ");
        elmakg = inp.nextDouble();
        System.out.print("Kaç kg domates ? : ");
        domateskg = inp.nextDouble();
        System.out.print("Kaç kg muz? :  ");
        muzkg = inp.nextDouble();
        System.out.print("Kaç kg patlican ? : ");
        patlicankg = inp.nextDouble();

        tutar = (armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);
        System.out.print("Toplam Tutar : "+tutar);


    }
}
