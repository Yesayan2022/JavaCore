package classwork.chapter3;

public class ArrayBookExample {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("There are " + month_days[3] + " days in April.");


        //katarelagorcvac tarberak
        int month_day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("There are " + month_day.length + " days in April.");
        System.out.println(month_day.length);
        System.out.println(month_day.length-1);
        System.out.println(month_day[month_days.length-1]);
        System.out.println();
        for (int i = 0; i < month_day.length; i++) {
            System.out.print(month_days[i] +" ");

        }

    }
}
