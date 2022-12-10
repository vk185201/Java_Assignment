import java.util.Scanner;
public class clocksmaple {
        static void convert(String str)
        {
            // Get Hours
            int h1 = (int) str.charAt(0) - '0';
            int h2 = (int) str.charAt(1) - '0';
            int hh = h1 * 10 + h2;
            // check if the time should be in AM or PM
            String mrdn;
            if (hh < 12)
            {
                mrdn = "AM";
            } else
                mrdn = "PM";
            hh %= 12;
            // Handle 00 and 12 case separately
            if (hh == 0)
            {
                System.out.print("12");
                // Printing minutes and seconds
                for (int i = 2; i < 8; ++i)
                {
                    System.out.print(str.charAt(i));
                }
            }
            else
            {
                System.out.print(hh);
                // Printing minutes and seconds
                for (int i = 2; i < 8; ++i)
                {
                    System.out.print(str.charAt(i));
                }
            }
            // After time is printed print Meridien
            System.out.println(" " + mrdn);
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the time in 24 hour format");
            System.out.println("Enter hours: ");
            String hh = sc.nextLine();
            hh = padZero(hh);
            System.out.println("Enter minutes: ");
            String mm = sc.nextLine();
            mm = padZero(mm);
            System.out.println("Enter seconds: ");
            String ss = sc.nextLine();
            ss = padZero(ss);
            String time = hh + ":" + mm + ":" + ss;
            System.out.print("Time in 12-hour format is ");
            convert(time);
        }
        private static String padZero(String n)
        {
            if (n.length() == 1)
                n = "0" + n;
            return n;
        }

}
