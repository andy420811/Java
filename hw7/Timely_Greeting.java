import java.util.Calendar;

public class Timely_Greeting {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Time:");
        System.out.println(calendar.getTime());
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if(hour < 4){
            System.out.println("半夜不睡覺該吃宵夜了");
        }
        else if(hour < 10){
            System.out.println("早安!");
        }else if(hour < 16){
            System.out.println("下午好");
        }else if(hour <= 23){
            System.out.println("晚安準備睡覺了");
        }
    }
}
