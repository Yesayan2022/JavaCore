package classwork.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        String lang ="";
        if(lang.equals("ARM")){
            System.out.println("Barev");
        } else if (lang.equals("RU")) {
            System.out.println("Privet");
        }else if(lang.equals ("ENG")) {
            System.out.println("Hello");
        } else {
            System.out.println("language is not supported!");
        }
    }
}
