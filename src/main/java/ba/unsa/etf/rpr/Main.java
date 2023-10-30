package ba.unsa.etf.rpr;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Double> elementi = new ArrayList<>();

        System.out.println("Unesite brojeve ili kljucnu rijec STOP: ");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("STOP")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                elementi.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Neispravan unos, pokusajte ponovo!");
            }
        }
        double najveci=elementi.get(0);
        double najmanji=elementi.get(0)1;

        for(double e : elementi){
            if(e>najveci)najveci=e;
        }

        System.out.println("Max: " + najveci);

        for(double e : elementi){
            if(e<najmanji)najmanji=e;
        }

        System.out.println("Min: " + najmanji);



        double sum = 0.0;
        for (double e : elementi) {
            sum += e;
        }
        double mean = sum / elementi.size();


        double sumOfSquaredDifferences = 0.0;
        for (double e : elementi) {
            double difference = e - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        double variance = sumOfSquaredDifferences / elementi.size();
        double stdDeviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDeviation);


    }



}
