public class ReverseAnArray {
    public void reverseArray(int arr[]) {
        int s=arr.length-1;
        for(int i=0;i<s;){
            int temp=arr[i]+arr[s];
            arr[i]=temp-arr[i];
            arr[s]=temp-arr[i];
            i++;
            s--;
        }
    }
}
