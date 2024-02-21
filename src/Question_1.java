import java.util.Arrays;

public class Question_1 {
//    given n array elements & Q queries for each query find sum of elements in a given range
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 2, 8, 6, 5, 10, 12, 14, 16, 9};
        int start=7;
        int end=11;
        System.out.println("ans : "+isIncreasing(array,start,end));
    }
    static boolean isIncreasing(int[] array,int start,int end){
        int[] b = new int[array.length];
        Arrays.fill(b,0);
        for(int i=0;i< array.length-1;i++){
            if(array[i]<array[i+1]){
                b[i] = 1;
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(" "+b[i]);
        }
        for(int i=1;i<b.length;i++){
            b[i] = b[i-1] + b[i];
        }
        if(start == 0 && (end-start) == b[end-1]){
            return true;
        }else if((end-start) == (b[end-1]-b[start-1])){
            return true;
        }
        return false;
    }
}
