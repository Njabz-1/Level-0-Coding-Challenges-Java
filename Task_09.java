public class Task_09 {
    public static void main(String[] args) {
        System.out.print("Vowels: ");
        System.out.print(vowels("The quick brown fox called Ardo"));
        
    }
    public static String vowels(String string){
        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
                if(isVowel(c)){
                    System.out.print(c+", ");
                }
            } return "";
        }
        public static boolean isVowel(char character){
        if(character=='a' || character=='A' || character=='e' || character=='E' ||
                character=='i' || character=='I' || character=='o' || character=='O' ||
                character=='u' || character=='U'){
            return true;
        }else{
            return false;
        }
    }
}
