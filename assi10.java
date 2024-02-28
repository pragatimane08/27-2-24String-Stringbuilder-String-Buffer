package Lab.lab4;
//10.Declare enum of weekday: Print number with day
//Hint: public enum day{SUNDAY (0), MONDAY (1)}
//Print: 0 SUNDAY 1 MONDAY
public class assi10 {
    public enum Day{
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6);

        private final int number;
        private Day(int number){
            this.number = number;
        }
        public int getNumber(){
            return number;
        }
    }
    public static void main(String[] args) {
        for(Day day : Day.values()){
            System.out.println(day.getNumber()+" "+day.name());
        }
    }
}
