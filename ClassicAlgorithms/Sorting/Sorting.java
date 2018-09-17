public class Sorting{

    public static void printArray(int[] arr){
        for(int n: arr){
            System.out.print(n + " ");
        }
        System.out.println();

    }

    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void bubbleSort(int[] arr){
        int count = 0;
        do{
            count = 0;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    swap(arr, i-1, i);
                    count++;
                }
            }
        } while(count > 0);
    }

    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[l+i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[m+1+i];
        }
        int k = l;
        int i = 0; int j = 0;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }
        while(i < n1){
            arr[k++] = L[i++];
        }
        while(j < n2){
            arr[k++] = R[j++];
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(r > l){
            int m = l + (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args){
        int[] test = new int[] {1, 4, 2, 5, 8, 6, 10};
        printArray(test);
        mergeSort(test, 0, test.length-1);
        printArray(test);
    }

}
