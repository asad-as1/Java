// Reverse an Array
public class reverse {
    public static void Reverse(int nums[]){
        for(int i=0, j=nums.length-1; i<nums.length/2; i++, j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    Reverse(a);

    for(int i=0; i<a.length; i++)
    System.out.print(a[i] + " ");
}
}
