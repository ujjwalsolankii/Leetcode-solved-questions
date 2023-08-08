class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[l] <= arr[mid]){               //left shift(2,3,4,6,7,0,1)
                if(key >= arr[l] && key <= arr[mid]){
                    h = mid-1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{                                 // right shift(6,7,0,1,2,3,4)
                if(key>= arr[mid] && key<=arr[h]){
                    l = mid+1;
                }
                else{
                    h = mid -1;
                }
            }
        }
        return -1;
    }
}