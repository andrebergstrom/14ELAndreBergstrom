import java.util.Scanner;

public class TestFordon {

    public static void main(String[] args) {

        int option;
        Scanner in = new Scanner(System.in);
        do {
            String menu = "\n Vilken fordonstyp är du ute efter?"
                    + "\n1 Bil"
                    + "\n2 Lastbil"
                    + "\n3 Cykel"
                    /*+ "\n4 Get a count of all vowels."
                    + "\n5 Get position of all vowels."
                    */
                    + "\n0 Avsluta program!";
            System.out.println(menu);
            option = in.nextInt();
            switch(option) {
                case 0:
                    System.out.println("Hasta la vista Baby");
                    break;
                case 1:
                    Bil BMW = new Bil(30000, 950, "Silver", "BNU658", 170, 0.6, "BMW");
                    System.out.println("Min bil är en " + BMW.BilM);
                    System.out.println("Färgen på denna bil är " + BMW.farg);
                    System.out.println("Bilen rullar med regnummer " + BMW.regNr);
                    System.out.println("Om man ska åka 2 mil så går det åt: ");
                    System.out.println(BMW.bransleBehov(20) + " liter bensin");
                    System.out.println("Den kostar: " + BMW.nedsattPris(1));
                    break;
                case 2:
                    Lastbil Scania = new Lastbil(200000, 3000, "Mattsvart", "ABC123", 400, 1, 300, "Scania");
                    System.out.println("Lastbilen är en " + Scania.BilM);
                    System.out.println("Färgen på lastbilen är "+ Scania.farg);
                    System.out.println("Lastbilens regnummer är: " + Scania.regNr);
                    System.out.println("Om man ska åka 2 mil så drar den: " + Scania.bransleBehov(20));
                    System.out.println("Den kostar: " + Scania.nedsattPris(10));
                    System.out.println("Den har ett lastutrymme på: " +Scania.lastut);
                    break;
                /* case 3:
                    System.out.println("Option 3");
                    break;
                case 4:
                    System.out.println("Option 4");
                    break;
                case 5:
                    System.out.println("Option 5");
                    break;
                    */
                default:
                    System.out.println("Var god, välj ett giltigt alternativ!");
                    break;
            }
        } while (option != 0);
    }
}

        /*
        Bil BMW = new Bil(30000, 950, "Silver", "BNU658", 170, 0.6, "BMW");
        System.out.println("Min bil är en " + BMW.BilM);
        System.out.println("Färgen på denna bil är " + BMW.farg);
        System.out.println("Bilen rullar med regnummer " + BMW.regNr);
        System.out.println("Om man ska åka 2 mil så går det åt: ");
        System.out.println(BMW.bransleBehov(20) + " liter bensin");
        System.out.println("Den kostar: " + BMW.nedsattPris(1));
        */