//import java.util.ArrayList;
//import java.util.List;

public class Main {
    //    start
    public static void main(String[] args) {

//        String[] weekDays1 = new String[7];
//        String[] weekDays2 = new String[] {"Pn", ""};
//
//        List<String> weekDays3 = new ArrayList<>();
//
//        weekDays3.add("Pn");
//        weekDays3.add("Pn");
//        weekDays3.add("Pn");
//        weekDays3.add("Pn");
//        weekDays3.add("Pn");
//        weekDays3.add("Pn");
//
//        int count = 10;
//
//        if (10 == count) {
//
//        }
//
//
//        if ("Pn".equals(weekDays3.get(0))) {
//
//        }
//
//        for (int i = 0; i < weekDays3.size(); i++) {
//
//        }
//
//        for (String day : weekDays3) {
//
//        }
//
//        print("Coś tam się napisze!! ");
//
//        String count2;
//        count2 = "10";

//        Human human1 = new Human();
//        human1.setFirstName("Darek");
//        human1.setLastName("Skiba");
//        human1.setAge(44);
//
//        Human human2 = new Human("Maciek", "Scisłowski", 999);
//        //human2.setFirstName("Maciek");
//        //human2.setLastName("Scisłowski");
//
//        print(human1.speak());
//        print(human2.speak());

        int val1 = 10;
        int val2 = 2;
        String sign = "/";
        Calculator calc = new Calculator();
        print(calc.calculate(val1,val2,sign));

    }

    public static void print(String text) {
        System.out.println(text);
    }

}
