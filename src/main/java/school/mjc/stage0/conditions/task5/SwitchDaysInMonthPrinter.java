package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        int days = 0;
        switch(month){

            case 2:
                days = 28;
                break;
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 4,6,9,11:
                days = 30;
                break;
            default:
                System.out.println("wrong number!");


        }
        System.out.println(days > 0 ? days : "");
    }
}
