public class task_07 {
    public static void main(String[] args) {
        celsius_to_fahrenheit(5);
        fahrenheit_to_celsius(41);
    }


    public static void celsius_to_fahrenheit( int celsius){
        int convert = (9 * celsius) / 5 + 32;
        System.out.println("The temperature is " + convert +" degrees Fahrenheit"); 
    }

 public static void fahrenheit_to_celsius(int fahrenheit){
    int conversion = ((fahrenheit-32)*5)/9; 
    System.out.println("The temperature is  " + conversion + "  degrees Celsius"); 
 }
 


}
