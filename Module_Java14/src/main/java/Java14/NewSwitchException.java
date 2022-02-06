package Java14;

public class NewSwitchException {
    public static void demo() {
        System.out.println(java14(Month.NOV));
    }

    public static String java14(Month month) {
        var result = switch (month) {
            case JAN -> "january";
            case FEB -> "february";
            case MAR -> "march";
            case APR -> "april";
            case MAY -> "may";
            case JUN -> "juny";
            case JUL -> "july";
            case AUG -> "august";
            case SEP -> "september";
            case OCT -> "october";
            case NOV -> "november";
            case DEC -> "december";

            default -> null;
        };
        return result;
    }
    enum Month {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }
}
