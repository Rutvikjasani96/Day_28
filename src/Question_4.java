public class Question_4 {
//    find max submatrix sum of all those  matrices which start at row:2(index) & end at row:4(index).
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
        int row_start = 1;
        int row_end = 3;
        int ps=0;
        int max_sum=Integer.MIN_VALUE;
        for(int column_start = 0;column_start<matrix[0].length;column_start++){
            int sum=0;
            for(int j=row_start;j<=row_end;j++){
                sum = sum + matrix[j][column_start];
            }
            if(ps<0){
                ps=0;
            }
            ps = ps + sum;
            max_sum = Math.max(max_sum,ps);
        }
        return max_sum;
    }
}
