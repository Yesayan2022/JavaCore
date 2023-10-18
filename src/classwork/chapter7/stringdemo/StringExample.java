package classwork.chapter7.stringdemo;

public class StringExample {
    public static void main(String[] args) {
        String name = "poxOs PoXosyan Poxosi";
        String name1 = "POXOS";

        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();

        System.out.println(nameLower);
        System.out.println(nameUpper);

        boolean os = name.startsWith("O");
        System.out.println(os);

        System.out.println(name.contains("os"));
        //name.intern();
        String replaced = name.replace(" "," - ");
        System.out.println(replaced);

String [] fullNAmeArray = name.split(" ");
String namE = fullNAmeArray[0];
String surname = fullNAmeArray[1];
String middleName = fullNAmeArray[2];

        System.out.println(namE);
        System.out.println(surname);
        System.out.println(middleName);

    }
}
