package searchAlgo;
import java.awt.*;
import lib.*;


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
        int tar;
        if (args.length > 1){
            System.out.println("I only use your first argument thanks");
            tar = Integer.parseInt(args[0]);
        }
        else if(args.length ==1){
            tar = Integer.parseInt(args[0]);
        }
        else{
            tar = 9;
        }

        binarySearch BsObj = new binarySearch();
        int arr[] = {1,3,5,7,9,11,15,16,17,18,30,45,47,49};
        int n = arr.length ;
        int res  = BsObj.binarySear(arr, 0, n-1, tar);
        if(res == -1){
            System.out.printf("Sorry, the target value %d is not in your array \n", tar );
        }
        else{
            System.out.printf("The result %d is in the array \n", tar);
        }
        
        /* tried to visualize
        DrawingPanel panel = new DrawingPanel(300, 200);
        Graphics G = panel.getGraphics();
        G.fillRect(10, 30, 60, 35);
        */
    }
}
