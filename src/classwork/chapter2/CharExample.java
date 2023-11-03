package classwork.chapter2;

public class CharExample {
    public static void main(String[] args) {
//        char a= 88;
//        System.out.println("\"Poxos "+ a +" Petros\"");

        //if_else


        //Switch_case
        String lang = "ARM";
        switch (lang) {
            case "HY":
            case "hy":
            case "arm":
            case "ARM":
                System.out.println("Barev");
                break;
            case "RU":
                System.out.println("Privet");
                break;
            case "ENG":
                System.out.println("Hello");
                break;
        }


    }
}
