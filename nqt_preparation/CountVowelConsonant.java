package javatpoint;

public class CountVowelConsonant {
    public static void main(String[] args) {
        int noc=0,nov=0;
        String s1="I Love my India";
        s1=s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                nov++;
            }
            else if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
                noc++;
            }
        }
        System.out.println("number of vowels:"+nov);
        System.out.println("number of consonants:"+noc);

    }
}
