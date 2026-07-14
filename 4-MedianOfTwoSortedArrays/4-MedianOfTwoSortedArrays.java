// Last updated: 7/14/2026, 2:19:12 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1 , nums2);
        int n = arr.length;
        double mid;
        if(n % 2 == 0){
            mid = (arr[(n / 2) - 1] + arr[(n / 2)]) / 2.0;
        }
        else{
            mid = arr[n / 2];
        }
        return mid;
    }

    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}