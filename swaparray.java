public class swaparray {
    public static void main(String[] args) {
        int[] arr = {1,2 3,4 5};
        swap ( arr, 1 , 3);
    }
    static  void swap(int[], int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2] ;
       arr[index2]= arr[index1];
       
    }
}
