public class QuestionThree {
    public static void main(String[] args) {
        String str = "ABSG";
        int len = str.length();
        generateUniquePermutation(str, 0, len);
    }

    public static String swapString(String a , int i, int j){
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
    public static void generateUniquePermutation(String str, int begin, int last){
        if(begin == last -1){
            System.out.print(str + " ");
        }
        else{
            for(int i = begin ; i < last;i++ ){
                str= swapString(str, begin, i);
                generateUniquePermutation(str, begin+1, last);
                str= swapString(str, begin, i);
            }
        }
    }
}
