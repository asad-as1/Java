import java.util.*;
public class combination {
    public static void fun(ArrayList<Integer> list, int[] arr, int idx){
        if(idx == arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[idx]);
        fun(list, arr, idx+1);
        list.remove(list.size()-1);
        fun(list, arr, idx+1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1,2,3};
        fun(list, arr, 0);
    }
}
