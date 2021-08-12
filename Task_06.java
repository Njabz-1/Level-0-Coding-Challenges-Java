public class Task_06 {
    public static void main(String[] args) {
        maximumNumber(5, 8, 7);
    }
    public static void maximumNumber(int firstNumber, int secondNumber, int thirdNumber){
        int maximumNumber = 0;
        if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
            maximumNumber = firstNumber;
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }
        System.out.println("The Maximum number is " + maximumNumber);
    }
    
    
}
