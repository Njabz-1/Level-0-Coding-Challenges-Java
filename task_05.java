public class task_05 {
    
    public static void main(String[] args) {
        areaOfTriangle(9, 11, 10);
    }

    public static void areaOfTriangle(int sideA, int sideB, int sideC){
            
            int semiperimeter = (sideA + sideB + sideC) / 2;
            int sideAdifference = semiperimeter - sideA;
            int sideBdifference = semiperimeter - sideB;
            int sideCdifference = semiperimeter - sideC;    
            double area = Math.sqrt(semiperimeter * sideAdifference * sideBdifference * sideCdifference);
            System.out.println("Area of Triangle: " + area);
    }
}
