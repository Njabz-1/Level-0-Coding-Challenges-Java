public class Task_08 {

    public static void main(String[] args) {
        numberToTime(51);
        numberToTime(72);
        numberToTime(130);
        numberToTime(432);
    }


    public static void numberToTime(int number){
        int hours = (int) Math.floor(number / 60);
        int minutes = number % 60;
        if (hours == 1 && minutes == 1){
            System.out.println(hours + " hour, " + minutes + " minute");
        }
        else if(hours > 1 && minutes == 1){
            System.out.println(hours + " hours, " + minutes + " minute");
        }
        else if (hours == 1 && minutes > 1){
            System.out.println(hours + " hour, " + minutes + " minutes");
        } else {
            System.out.println(hours + " hours, " + minutes + " minutes");
        }
    }


}
