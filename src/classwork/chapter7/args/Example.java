package classwork.chapter7.args;

public class Example {
    public static void main(String[] args) {
        if(args.length>=1){
            String laguage = args[0];
            switch (laguage){
                case "HY":
                    System.out.println("Barev");
                    break;
                case "RU":
                    System.out.println("Privet");
                    break;
                case "ENG":
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("Laguage does not support");
            }
        } else {
            System.out.println("Laguage argument is required!");
        }

    }
}
