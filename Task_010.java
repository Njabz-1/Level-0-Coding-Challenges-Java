import java.util.HashSet;
import java.util.Set;

public class Task_010 {
    public static void main(String args[]) {

       String string1 = "house";
       String string2 = "computers";

       Set<String> sentence = new HashSet<String>();
       for(int i=0;i<string1.length();i++){
           for (int j = 0; j < string2.length(); j++) {
              if(string1.charAt(i) == string2.charAt(j)){
                  sentence.add(string1.charAt(i)+"");
                  
              }
        }   
       }
        String joined = String.join(", ",sentence);
        System.out.println("Common Letters: "+joined);
    } 
}
