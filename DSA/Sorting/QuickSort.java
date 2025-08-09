// Quick Sort
public class QuickSort {
    public static void main(String[] args) {
        int a[] = {7,3,9,1,2,6,-1,4,5};
        quickSort(a, 0, a.length-1);

        for(int i=0; i<a.length; i++) System.out.print(a[i] + " ");
    }

    public static void quickSort(int a[], int s, int e) {

        if(s >= e) return;

        int pi = partition(a, s, e);  // pivot correct index after partition

        quickSort(a, s, pi-1);
        quickSort(a, pi+1, e);
    }

    public static int partition(int a[], int s, int e) {
        int pivot = a[e];   // assume last index is pivot index
        int i = s-1;        // i = -1 starting from -1;

        // placing smaller element than pivot element  from starting
        for(int j=s; j<e; j++) {
            if(a[j] < pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        // palcing pivot element to its correct place
        i++;
        int temp = pivot;
        a[e] = a[i];
        a[i] = temp;
        return i;  // correct pivot index after partition
    }
}
