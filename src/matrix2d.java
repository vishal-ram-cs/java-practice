import java.util.Arrays;

public class matrix2d {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 12, 23, 56, 89},
                {24, 35, 69, 79,90},
                {45, 59, 76,80, 92},
                {20,23,45,52,87,95}
        };
        int traget=89;
        System.out.println(Arrays.toString(matrix(mat,traget)));
    }
    static int[] matrix(int[][] mat, int target ){
        int r = 0;
        int c= mat.length;
        while(r<mat.length && c>= 0 ){
            if (mat[r][c]==target){
                return new int[] {r,c};

            }
            if(mat[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
          return new int[]{-1,-1};
    }
}
