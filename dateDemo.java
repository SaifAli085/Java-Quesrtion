import java.util.Calendar;

public class dateDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String[] month = {"January", "Februray", "March", "April", "May","June","July","August", "September", "October", "November", "December"};
        System.out.println("Current month = " + month[c.get(Calendar.MONTH)]);
    }
}
