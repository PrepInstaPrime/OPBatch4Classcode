public class FrequencyCounter {
    public static void main(String[] args) {
        String str="abcaabccc";
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            freq[idx]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println((char)(i+97)+"="+freq[i]);
            }
        }
    }
}
