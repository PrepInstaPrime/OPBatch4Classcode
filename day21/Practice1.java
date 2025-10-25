// write the java program to find the most repeated character in a string where string only contains lowercase letters 
public class Practice1 {
    public static void main(String[] args) {
        String str = "abcaabccceeeeeaaaaaa";
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            freq[idx]++;
        }
        int max=freq[0];
        int maxIdx=0;
        for(int i=1;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
                maxIdx=i;
            }
        }
        System.out.println("Most repeated character: "+(char)(maxIdx+97));
    }
}
