public class PrefixMatrix {
//    make prefix sum using row wise sum + column wise sum technique
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        prefixMatrix(matrix);
    }
    static int[][] prefixMatrix(int[][] matrix){
        int[][] preMat = new int[matrix.length][matrix[0].length];
        for(int i=0;i< preMat.length;i++){   // row wise sum
            for(int j=0;j<preMat[0].length;j++){
                if(j>0) {
                    preMat[i][j] = preMat[i][j - 1] + matrix[i][j];
                }if(j==0){
                    preMat[i][j] = matrix[i][j];
                }
            }
        }
        for(int j=0;j< matrix.length;j++){   // column wise sum
            for(int i=0;i<matrix[0].length;i++){
                if(i>0){
                    preMat[i][j] = preMat[i-1][j] + preMat[i][j];
                }else{
                    preMat[i][j] = preMat[i][j];
                }
            }
        }
//        for(int i=0;i< preMat.length;i++){  // print prefix sum
//            for(int j=0;j<preMat[0].length;j++){
//                System.out.print(" "+preMat[i][j]);
//            }
//            System.out.println();
//        }
        return preMat;
    }
}