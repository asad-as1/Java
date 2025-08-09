public class N_Queens {
    public static void main(String[] args) {
        int tq = 2;
        int board[] = new int[4];
        find(board, tq, 1, "", -1);
    }

    public static void find(int board[], int tq, int qp, String ans, int i) {
        if(qp > tq) {
            System.out.println(ans);
            return;
        }

        for(i=i+1; i<board.length; i++) {
            if(board[i] == 0) {
                board[i] = 1;
                find(board, tq, qp+1, ans+"B"+i+"Q"+qp, i);
                board[i] = 0;
            }
        }
    }
}
