public class reverse_array{
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int i=0, n=a.length, j=n-1, temp=0;
        System.out.println("The reversed array is : ");
        while(i <= j)
        {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
        for(int el : a)
        {
            System.out.print(el + " ");
        }
    }
}