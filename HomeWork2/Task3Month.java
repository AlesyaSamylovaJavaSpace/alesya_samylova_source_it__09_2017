
public class Task3Month {
    private final static String[] MONTHS ={"January", "February", "March", "April", "May", "June", "July", "August",
                                           "September", "October", "November", "December"};

    public static int printMonthName(int n){

        if (n < 1 || n > 12){
            System.out.println("Invalid month number: " + n +". It should be inside the range [1; 12]");
            return 1;
        }

        System.out.println("[" + MONTHS[n-1] + "] corresponds to number [" + n + "]");
        return 0;

    }
}
