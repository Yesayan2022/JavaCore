package classwork.chapter5;

public class Switch {
    public static void main(String[] args) {
        int month =4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season ="spring";
                break;
            case 6:
            case 7:
            case 8:
                season = " autumn";
                break;
            default:
                season = "fiction month";
        }
        System.out.println("April is a "+season+" month.");
    }
}
