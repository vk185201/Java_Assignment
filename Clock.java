import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        //Get input
        System.out.print("Enter hours: ");
        Scanner sc=new Scanner(System.in);
        String h = sc.nextLine();
        h = paddingZero(h);
        System.out.print("Enter minutes: ");
        String m = sc.nextLine();
        m = paddingZero(m);
        System.out.print("Enter seconds: ");
        String s = sc.nextLine();
        s = paddingZero(s);
        String time = h + ":" + m + ":" + s;
        if (!isValidTime(time)){
            System.out.println("invalid time");
        }else {
            System.out.print("output:");
            timeConversion(time);
        }
    }
    public  static String paddingZero(String s){
        if (s.length()==1){
            s="0"+s;
        }
        return s;
    }
    public  static boolean isValidTime(String time1) {
        int h1 = (int) time1.charAt(0) -'0';
        int h2 = (int) time1.charAt(1) -'0';
        int hours = h1 * 10 + h2;

        int m1 = (int) time1.charAt(3) -'0';
        int m2 = (int) time1.charAt(4) -'0';
        int minutes = m1 * 10 + m2;

        int s1 = (int) time1.charAt(6) -'0';
        int s2 = (int) time1.charAt(7) -'0';
        int seconds = s1 * 10 + s2;

        if(hours<=0 || hours>=24){
            return  false;
        }
        if(minutes<=0 || minutes>=60){
            return false;
        }
        if(seconds<=0 || seconds>=60){
            return false;
        }
        return  true;
    }

    public  static  void timeConversion(String time){
        // Get Hours
        int h1 = (int) time.charAt(0) - '0';
        int h2 = (int) time.charAt(1) - '0';
        int h = h1 * 10 + h2;
        // check if the time should be in AM or PM
        String meridian;
        if (h < 12)
        {
            meridian = "AM";
        } else
            meridian = "PM";
        h %= 12;
        // To Handle 00 and 12 case separately
        if (h == 0)
        {
            System.out.print("12");

            for (int i = 2; i < 8; ++i)
            {
                System.out.print(time.charAt(i));
            }
        }
        else
        {
            System.out.print(h);
            // Printing minutes and seconds
            for (int i = 2; i < 8; ++i)
            {
                System.out.print(time.charAt(i));
            }
        }

        System.out.println(" " + meridian);
    }
}
