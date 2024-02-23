public class Question_2 {
//    given a matrix of size n*m, for every query q, find sum of given submatrix?
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
        int a1 = 1,b1 = 1;
        int a2 = 2,b2 = 3;
        System.out.println("sum of sub matrix : "+solution(matrix,a1,a2,b1,b2));
    }
    static int solution(int[][] matrix,int a1,int a2,int b1,int b2){
        int[][] ps = PrefixMatrix.prefixMatrix(matrix);
        int ans = ps[a2][b2];
        if(a1>0 && b1>0) {
            ans = ans - ps[a1 - 1][b2] - ps[a2][b1 - 1] + ps[a1 - 1][b1 - 1];
        }else if(a1>0){
            ans = ans - ps[a1 - 1][b2];
        }else if(b1>0){
            ans = ans - ps[a2][b1-1];
        }
        return ans;
    }
}
