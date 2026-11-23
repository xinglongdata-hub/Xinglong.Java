package array000;

public class Demo03Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int birnary = Birnary(arr, 6);
        System.out.println(birnary);
    }
    public static int Birnary(int[] arr,int data){
        //定义三个变量，分别是最小索引，最大索引和中间索引
        int min = 0;
        int max = arr.length-1;
        int mid = 0;
        //查找
        while (min<=max){
            mid =(min+max)/2;
            if (data > arr[mid]){
                min = mid+1;
            } else if (data < arr[mid]) {
                max = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
