package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args){
        LicneInformacije osoba1= new LicneInformacije();
        osoba1.setIme("Mirko");
        osoba1.setPrezime("Prekoplotic");
        InformacijeOStudentu student1=new InformacijeOStudentu();
        student1.setIme("Nedim");
        student1.setPrezime("Kalajdzija");
        student1.setGodinaStudija("23/24");
        student1.setBrojIndexa("101010");
        InformacijeONastavniku nastavnik1= new InformacijeONastavniku();
        nastavnik1.setIme("Gilbert");
        nastavnik1.setPrezime("Strang");
        nastavnik1.setTitula("Professor emeritus, PHD");
        List<Ocjena> zaNastavnika1=new ArrayList<>();
        zaNastavnika1.add(new Ocjena(student1, 9));
        zaNastavnika1.get(0).Ispisi();
        if(!(osoba1.getClass()==InformacijeOStudentu.class)){
            System.out.println("Zao nam je ali, samo studenti mogu ocijeniti nastavnike.");
        }






    }

}
