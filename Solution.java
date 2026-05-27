public class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        for(char ch='a';ch<='z';ch++){
            if(word.lastIndexOf(ch)!=-1 && word.indexOf(Character.toUpperCase(ch))!=-1 && word.lastIndexOf(ch)< word.indexOf(Character.toUpperCase(ch))){
                c++;
            }
        } return c;
    }
} {
    
}
