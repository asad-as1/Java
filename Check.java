// Identity Matrix
import java.util.Scanner;
public class Check{
    public static void main(String args[]) {
          int flag = 0;
          int mat[][] = new int[3][3];
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the elements: ");
          for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                mat[i][i] = sc.nextInt();
            }
          }
          sc.close();
          for(int i=0; i<mat.length; i++) {
                  if(mat[i][i] != 1) {
                    flag = 1;
                    break;
              }
        } 
          if(flag == 0) {
                 System.out.println("Identity Matrix");
            }
            else System.out.println("Not Identity Matrix");
    }
}