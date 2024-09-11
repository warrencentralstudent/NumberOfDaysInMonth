class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(2, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

         // TRADITIONAL VERSION
         switch (month) {
             case 1:
                 return 31;
             case 2:
                 if (isLeapYear(year)) {
                     return 29;
                 }
                 return 28;
             case 3:
                 return 31;
             case 4:
                 return 31;
             case 5:
                 return 31;
             case 6:
                return 30;
             case 7:
                 return 31;
             case 8:
                 return 31;
             case 9:
                 return 30;
             case 10:
                 return 31;
             case 11:
                 return 30;
             case 12:
                 return 31;
             default:
                 return -1;
         }

        // // ENHANCED VERSION
        // return switch (month) {
        //     case 1 -> 31;
        //     case 2 -> {
        //         if (isLeapYear(year)) {
        //             yield 29;
        //         }
        //         yield 28;
        //     }
        //     //TODO: you do the rest for 3- 12;
        //     default -> -1;
        // };
    }
}