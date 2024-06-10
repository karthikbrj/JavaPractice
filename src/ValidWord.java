public class ValidWord {
    // It contains minimum of 3 characters
    // It contains only digits(0-9) & 
    // English letters (upper and lower case)
    // It includes at least one vowels
    // It includes at least one consonants

    public static void main(String[] args) {
        String word="Kr";
        boolean isValid=isValid(word);
        System.out.println("the given word is "+isValid);
    }

    public static boolean isValid(String word) {
       String vowels = "aeiou";
        vowels = vowels + vowels.toUpperCase();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        consonants +=consonants.toUpperCase();
        String numbers = "0123456789";
        boolean hasVowels = false;
        boolean hasConsonants = false;
        boolean hasNumbers = false;
        if(word.length()<3){
            return false;
        }
        for(int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
           if( vowels.contains(String.valueOf(ch))){
                hasVowels = true;
           }
           if( consonants.contains(String.valueOf(ch))){
                 hasConsonants = true;
           }
           if( numbers.contains(String.valueOf(ch))){
                 hasNumbers = true;
           }
        }
        return hasConsonants && hasNumbers && hasVowels;
        }
}
