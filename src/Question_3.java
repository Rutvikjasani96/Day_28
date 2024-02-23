public class Question_3 {
//    given a matrix of size n * m, find max submatrix sum.
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;
        System.out.println("max sum : "+solution(matrix));
    }
    static int solution(int[][] matrix){
        int maxSum = Integer.MIN_VALUE;
        for(int a1=0;a1< matrix.length;a1++){
            for(int b1=0;b1<matrix.length;b1++){
                for(int a2=a1;a2< matrix.length;a2++){
                    for(int b2=b1;b2<matrix.length;b2++){
                        maxSum = Math.max(maxSum,Question_2.solution(matrix,a1,a2,b1,b2));
                    }
                }
            }
        }
        return maxSum;
    }
}
