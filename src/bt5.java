import java.util.Arrays;

public class bt5 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,1,3,4,9,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        try {
            int indexSearch = binarySearch(arr,11);
            System.out.println(indexSearch);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static int binarySearch(int[] arr, int search) throws Exception {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                return mid;
            }else if (arr[mid] < search) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        throw new Exception("không tìm thấy");
    }
}
