public class Path {
    public static void main(String[] args) {
        System.out.println("\n" + find(2,2, "", 0) );
    }
    public static int  find(int x, int y, String ans, int c){

        if(x == 0 && y == 0) {
            System.out.print(ans + " ");
            return c+1;
        }

        if(x<0 || y<0) return c;
        c = find(x-1, y, ans+"H", c);
        c = find(x, y-1, ans+"V", c);
        return c;
    }
}