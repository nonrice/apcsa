public class StringExercises {
    public static String reverse(String s){
        if (s == null) return null;
        String reversed = "";
        for (int i=s.length()-1; i>=0; --i) reversed += s.charAt(i);
        return reversed;
    }

    public static boolean isPalindrome(String s){
        if (s == null) return false;
        int p1 = 0;
        int p2 = s.length()-1;
        while (p1 <= p2){
            while (p1<s.length() && !is_letter(s.charAt(p1))) ++p1;
            while (p2>0 && !is_letter(s.charAt(p2))) --p2;
            if (to_lower(s.charAt(p1)) != to_lower(s.charAt(p2))) return false;
            ++p1; --p2;
        }
        return true;
    }
    
    private static boolean is_letter(char ch){
        return (ch>='A' && ch<='Z') || (ch>='a' && ch<='z');
    }

    private static char to_lower(char ch){
        if (ch>='A' && ch<='Z') return (char)(ch-'A'+'a');
        return ch;
    }

    public static String removeAll(String s, String t){
        if (s == null) return null;
        if (t == null || t.equals("")) return s;
        
        String ans = "";
        int prev_end = 0;
        for (int i = s.indexOf(t); i!=-1; i=s.indexOf(t, i+t.length())){
            ans += s.substring(prev_end, i);
            prev_end = i+t.length(); 
        }

        return ans + s.substring(prev_end);
    }

    private static int get_first_vowel(String s){
        for (int i=0; i<s.length(); ++i){
            if ("aeiouAEIOU".contains(""+s.charAt(i))) return i;
        }
        return -1;
    }

    public static String toPigLatin(String s){
        if (s == null) return null;
    
        s = ' ' + s + ' ';
        String pig_latin = "";
        
        for (int prev=0, cur=s.indexOf(' ', 1); cur!=-1; prev=cur, cur=s.indexOf(' ', cur+1)){
            String word = s.substring(prev+1, cur);
            int first_vowel = get_first_vowel(word);
            if (first_vowel == 0){
                pig_latin += word + "yay";
            } else if (first_vowel == -1 && word.length() > 0){
                pig_latin += word + "ay";
            } else if (word.length() > 0) {
                pig_latin += word.substring(first_vowel) + word.substring(0, first_vowel) + "ay";
            }
            pig_latin += ' ';
        }

        if (pig_latin.length() > 0) pig_latin = pig_latin.substring(0, pig_latin.length()-1);
        return pig_latin;
    }

}
