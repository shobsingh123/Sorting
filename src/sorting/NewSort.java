package sorting;
//QUICK_SORT
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;  
        int[] arr={7,69,31,25,45,269,56,2,22,68};  
        quickSort(arr, 0, 9);  
        System.out.println("Array After Quick Sort");  
        for(i=0;i<10;i++)  
        System.out.print(arr[i] +" ");  
    }  
    public static int partition(int a[], int b, int end)  
    {  
          
        int l,r,temp,n,f;     
        n = l= b;  
        r = end;  
        f = 0;  
        while(f != 1)  
        {  
            while((a[n] <= a[r]) && (n!=r))  
            r--;  
            if(n==r)  
            f=1;  
            else if(a[n]>a[r])  
            {  
                temp = a[n];  
                a[n] = a[r];  
                a[r] = temp;  
                n = r;  
            }  
            if(f!=1)  
            {  
                while((a[n] >= a[l]) && (n!=l))  
                l++;  
                if(n==l)  
                f=1;  
                else if(a[n] <a[l])  
                {  
                    temp = a[n];  
                    a[n] = a[l];  
                    a[l] = temp;  
                    n= l;  
                }  
            }  
        }  
        return n;  
    }  
    static void quickSort(int a[], int b, int end)  
    {  
          
        int n;  
        if(b<end)  
        {  
            n= partition(a, b, end);  
            quickSort(a, b, n-1);  
            quickSort(a, n+1, end);  
        }  
	}

}
