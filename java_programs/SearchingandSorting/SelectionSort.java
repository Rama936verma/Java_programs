package SearchingandSorting;

public class SelectionSort {

    public static void main(String[] args) {
        
    
    

    int arr[]={2,4,3,6,1};
    int temp;
    for(int i=0;i<5;i++)
    { 
    int minIdx=i;

        for(int j=1;j<4;j++)
        {
            if(arr[i]<arr[minIdx])
            {

                minIdx=j;
            }



        }
        temp =arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
    }
    System.out.println("after sorting:");

    for(int i=0;i<5;i++)
    {
        System.out.println(arr[i]+" ");
    }
    }
}
