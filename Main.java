import java.util.*;
    class solution {
        //Q1 placing negative integers at the end of an array
        void PlacingNegativeAtEndOfArray(int arr[],int ans[], int n) {
            int k=0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    ans[k] = arr[i];
                    k++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    ans[k] = arr[i];
                    k++;
                }
            }
            for (int i = 0; i < k; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        //  Q2 calculating union of two arrays in sorted order
        int PrintingUnionOfTwoArrays(int arr[],int arr1[],int n,int ans [],int m) {
            int k = 0;
            ans[k] = arr[0];
            k++;
            for (int i = 1; i < n; i++) {
                int c = 0;
                for (int j = 0; j < k; j++) {
                    if (arr[i] == ans[j]) {
                        c++;
                    }
                }
                if (c == 0) {
                    ans[k] = arr[i];
                    k++;
                }
            }
            for (int i = 0; i < m; i++) {
                int b = 0;
                for (int j = 0; j < k; j++) {
                    if (arr1[i] == ans[j]) {
                        b++;
                    }
                }
                if (b == 0) {
                    ans[k] = arr1[i];
                    k++;
                }
            }
            for (int i = 0; i < k; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            solution obj2 = new solution();
            obj2.Sorting(ans, k);
            return k;
        }
        // Q3 finding the Kth smallest element in an array
        void FindingKthSmallestElementOfAnArray(int arr[],int n,int K){
            solution obj2 = new solution();
            obj2.Sorting(arr, n);
            System.out.println("the "+K+"rd smallest elemnt is"+arr[K-1]);
        }
        //Q4 continous subarray of sum S occuring first on moving l to r in an array
        void ContinousSubArrayOfSumS(int arr[],int n,int S){
            int i=0;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j];
                if(sum>S){
                    while(sum>S &&i<j){
                        sum=sum-arr[i];
                        i++;
                    }
                }
                if(sum==S){
                    System.out.print(i+" ");
                    System.out.println(j);
                    break;
                }
            }
        }
        //Q5 testing equality of Two Arrays
        void EqualityOfTwoArrays(int arr[],int arr1[],int n,int m){
            if(n==m){
                int c=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==arr1[i])
                        c++;
                }
                if(c==m||c==n){
                    System.out.println("equality exists::TRUE");
                }
                else {
                    System.out.println("equality does not exist :: FALSE");
                }
            }
            else {
                System.out.println("equality does not exist :: FALSE");
            }
        }
            void Sorting(int ans[],int k){
                for(int i=0;i<k-1;i++){
                    for(int j=0;j<k-1-i;j++){
                        if(ans[j]>ans[j+1]){
                            int t=ans[j];
                            ans[j]=ans[j+1];
                            ans[j+1]=t;
                        }
                    }
                }
                for (int i = 0; i < k; i++) {
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
            }
    }
     public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sizes");
        int n = sc.nextInt();
        int m=sc.nextInt();
        int arr[] = new int[n];
        int arr1[]=new int[m];
        System.out.println("enter elements of n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter elements of m");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the value of S");
        int S=sc.nextInt();
        System.out.println("enter the value of K");
        int K=sc.nextInt();
        int ans[] = new int[m+n];
        solution obj = new solution();
        obj.PlacingNegativeAtEndOfArray(arr,ans,n);
       obj.PrintingUnionOfTwoArrays(arr,arr1,n,ans,m);
        obj.FindingKthSmallestElementOfAnArray(arr,n,K);
        obj.ContinousSubArrayOfSumS(arr,n,S);
        obj.EqualityOfTwoArrays(arr,arr1,n,m);
    }
    }
