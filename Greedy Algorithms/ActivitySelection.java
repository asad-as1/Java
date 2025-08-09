import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // if end arraa is not sorted then sort
        int act[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));  // 2nd col

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>(); 

        ans.add(act[0][0]);
        // ans.add(0);  // Beacuse 1st ends in short time

        // int last = end[0];
        int last = act[0][2];

        for(int i=1; i<end.length; i++) {
            // if(start[i] >= last) {
            //     maxAct++;
            //     ans.add(i);
            //     last = end[i];
            // }

            if(act[i][1] >= last) {
                maxAct++;
                ans.add(act[i][0]);
                last = act[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for(int i=0; i<ans.size(); i++) System.out.print("A"+ans.get(i) + " ");
        
    }
}