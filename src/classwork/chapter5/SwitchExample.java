package classwork.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        String lang ="arm";
        switch (lang) {
            case "ARM":
            case"HY":
            case"arm":
                System.out.println("Barev");
                break;
            case "Ru":
                System.out.println("Privet");
                break;
            case "ENG":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Language is not supported.");
        }

//        if(lang.equals("ARM")){
//            System.out.println("Barev");
//        } else if (lang.equals("RU")) {
//            System.out.println("Privet");
//        }else if(lang.equals ("ENG")) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("language is not supported!");
//        }
    }
}
