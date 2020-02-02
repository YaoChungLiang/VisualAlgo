package searchAlgo;

class binarySearch{
    int binarySear(int arr[], int l, int r, int tar){
        if(r>=l){
            int mid = l + (r-l)/2;
            if (arr[mid] == tar){
                return arr[mid];
            }
            if (arr[mid] > tar){
                return binarySear(arr, l, mid-1, tar);
            }
            return binarySear(arr, mid+1, r, tar);
        }
        return -1;
    }

    public static void main(String args[]){
        binarySearch BsObj = new binarySearch();
        int arr[] = {1,5,8,9,36,40,56,79,100};
        int n = arr.length ;
        int tar = 5;
        int res  = BsObj.binarySear(arr, 0, n-1, tar);
        if(res == -1){
            System.out.println("Screw you BS");
        }
        else{
            System.out.println("The result is in the array");
        }
    }
}
