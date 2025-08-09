import java.util.Arrays;

public class SudukoSolver {
    public static void main(String[] args) {
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		solve(grid, 0, 0);


	}
    public static void display(int[][] grid){
        System.out.println("\n\n\n");
        for(int i=0; i<9; i++){
            System.out.println(Arrays.toString(grid[i]));
        }
    }
    private static void solve(int[][] grid, int row, int col) {

        if(col==9){
            col = 0;
            row = row + 1;
        }
        
		if (row == 9) {
            display(grid);
			return;
		}
		// if (col == 9) {
        //     return solve(grid, row+1, 0);
		// }
       

		if (grid[row][col] != 0) {
			solve(grid, row, col + 1);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (issafe(grid,row,col,i)) {
					grid[row][col] = i;
					solve(grid, row, col+1);
					grid[row][col] = 0;
				}
			}
		}
	}
    static boolean issafe(int[][] grid, int row, int col, int i){
        for(int j=0; j<9; j++){
            if(grid[row][j] == i){
                return false;
            }
        }
        for(int j=0; j<9; j++){
            if(grid[j][col] == i){
                return false;
            }
        }
        int r = (row/3)*3;
        int c = (col/3)*3;
        for(int j=r; j<r+3; j++){
            for(int k=c; k<c+3; k++){
                if(grid[j][k]==i){
                    return false;
                }
            }
        }
        return true;
    }
}