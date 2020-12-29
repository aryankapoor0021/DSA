import java.io.*;
import java.util.*;

class GFG {


public static void sort012(int a[], int n){
 int l=0;
    int mid=0;
    int h=n-1;
    while(mid<=h)
    {
        if(a[mid]==0)
        {
            swap(a[mid],a[l]);
            mid++;
            l++;
            continue;
        }
        if(a[mid]==1)
        {
            mid++;
            continue;
        }
        if(a[mid]==2)
        {
            swap(a[mid],a[h]);
            h--;
            continue;
        }
    }
    
}    
public static void swap(int x,int y)
{
    int temp=x;
    x=y;
    y=temp;
}

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}