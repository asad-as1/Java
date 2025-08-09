// Merge Sort Time Complexity O(n log n)  Space Complexity O(n);

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1,-9};
        mergeSort(a, 0, a.length-1);

        for(int i=0; i<a.length; i++) System.out.print(a[i] + " ");
    }

    public static void mergeSort(int a[], int s, int e) {
        if(s >= e) return;

        int mid = s + (e-s)/2;

        mergeSort(a, s, mid);
        mergeSort(a, mid+1, e);

        merge(a, s, e, mid);

    }

    public static void merge(int a[], int s, int e, int mid) {
        int temp[] = new int[e - s + 1];

        int i = s, j = mid+1, k = 0;

        // Comparison to shorter array between(left and right)
        while(i <= mid && j <= e) {
            if(a[i] < a[j]) {
                temp[k++] = a[i++];
            }
            else temp[k++] = a[j++];
        }
       
        // if left array length is greater than right
        while(i <= mid) {
            temp[k++] = a[i++];
        }

        // if right array length is greater than left
        while(j <= e) {
            temp[k++] = a[j++];
        }

        // Copying to original array
        for(k=0, i=s; k<temp.length; i++, k++) a[i] = temp[k];

    }
}