import java.util.*;

public class teing {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        int count=0;
        
        for(int i=0;i<list.size();i++){
            int[] arr=new int[26];
            for(int j=i+1;j<list.size();j++){
                if(j!=i){
                    String s=list.get(i)+list.get(j);
                    if(s.length()%2 !=0){
                        boolean b=find(arr,s);
                        if(b)count++;
                    }
                }
            }
        }
        System.out.print(count);
    }

    public static boolean find(int[] arr,String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int a=ch[i]-'a';
            arr[a]=arr[a]+1;
        }
        int u=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                return false;
            }
            if(arr[i]!=0)u++;
        }
        if(u!=25)return false;
        return true;
    }
}