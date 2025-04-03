import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    String var = "Ana";
        System.out.println(var.length());
        System.out.println(var.charAt(0));
        System.out.println("" + var.charAt(0) + var.charAt(1));
        System.out.println(var.substring(1,3));


//        1 uzduotis: Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis).
//        Atspausdinti trumpesnį stringą.

        System.out.println("\n1 uzduotis ==============================>>");
        String vardas = "Bruce";
        String pavarde = "Willis";
        System.out.println(vardas.length());
        System.out.println(pavarde.length());
        if (vardas.length()<pavarde.length()){
            System.out.println(vardas);
        }
        else{
            System.out.println(pavarde);
        }

//        2 uzduotis: Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//        Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println("\n2 uzduotis ==============================>>");
        String vardas2 = "Bruce";
        String pavarde2 = "Willis";
        System.out.println(vardas2.toUpperCase());
        System.out.println(pavarde2.toLowerCase());

//        3 uzduotis: Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//        Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("\n3 uzduotis ==============================>>");
        String vardas3 = "Bruce";
        String pavarde3 = "Willis";

        String raide1 = vardas3.substring(0, 1);
        System.out.println(raide1);

        String raide2 = pavarde3.substring(0, 1);
        System.out.println(raide2);

        String VarPav = raide1 + raide2;
        System.out.println(VarPav);

//        4 uzduotis: Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//        Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("\n4 uzduotis ==============================>>");
        String vardas4 = "Bruce";
        String pavarde4 = "Willis";

        String raides4 = vardas4.substring(vardas4.length() - 3, vardas4.length());

        String raides5 = pavarde4.substring(pavarde4.length() - 3, pavarde4.length());

        String LastRaid = raides4 + raides5;
        System.out.println(LastRaid);

//        5 uzduotis: Sukurti kintamąjį su stringu: "An American in Paris".
//        Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        System.out.println("\n5 uzduotis ==============================>>");
        String vardas5 = "An American in Paris";
        System.out.println(vardas5.replace("a","*").replace("A","*"));


//        6 uduotis: Sukurti kintamąjį su stringu: "An American in Paris". Jame ištrinti visas balses. Rezultatą atspausdinti.
//        Kodą pakartoti su stringais: "Breakfast at Tiffany's", "2001: A Space Odyssey" ir "It's a Wonderful Life".

        System.out.println("\n6 uzduotis ==============================>>");
        String vardas6 = "An American in Paris";
        String vardas61 = vardas6.replaceAll("[AEIOYUayeiou]", "");
        System.out.println(vardas61);
        String vardas7 = "Breakfast at Tiffany's";
        String vardas71 = vardas7.replaceAll("[AEIOYUayeiou]", "");
        System.out.println(vardas71);
        String vardas8 = "2001: A Space Odyssey";
        String vardas81 = vardas8.replaceAll("[AEIOYUayeiou]", "");
        System.out.println(vardas81);
        String vardas9 = "It's a Wonderful Life";
        String vardas91 = vardas9.replaceAll("[AEIOYUayeiou]", "");
        System.out.println(vardas91);


//        7 uzduotis: Stringe, kurį generuoja toks kodas: String  starWars = "Star Wars:
//        Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        Surasti ir atspausdinti epizodo numerį.

        System.out.println("\n7 uzduotis ==============================>>");
        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(starWars);
        System.out.println(starWars.substring(starWars.length() - 14, starWars.length() - 13));



//        8 uzduotis: Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės.
//        Pakartokite kodą su stringu “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.

        System.out.println("\n8 uzduotis ==============================>>");
        String sakinys = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";






        git config --global user.email "ana.dolgova@gmail.com"
        git config --global user.name "Anciado5"

























































































    }
}