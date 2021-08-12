public class Task_07 {
    public static void main(String[] args) {
        celsiusToFahrenheit(5);
        fahrenheitToCelsius(41);
    }


    public static void celsiusToFahrenheit( int celsius){
        int convert = (9 * celsius) / 5 + 32;
        System.out.println("The temperature is " + convert +" degrees Fahrenheit"); 
    }

 public static void fahrenheitToCelsius(int fahrenheit){
    int conversion = ((fahrenheit-32)*5)/9; 
    System.out.println("The temperature is  " + conversion + "  degrees Celsius"); 
 }
 


}
