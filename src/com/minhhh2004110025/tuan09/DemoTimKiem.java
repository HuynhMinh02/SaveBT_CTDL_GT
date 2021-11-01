public class DemoTimKiem {
    public static int timKiem(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == x)
            return i;
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 4, 1, 12};
        int x = 6;

        int result = timKiem(arr, x);
        if (result == -1)
        System.out.println("So khong co trong mang!!");
        else
        System.out.println("So co trong mang: " + result);
    }
    
}
