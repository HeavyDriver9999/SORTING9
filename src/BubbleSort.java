
import java.util.Scanner;
public class BubbleSort 
{
	void bubbleSort(int arr[])
    {
        int x = arr.length;
        for (int i = 0; i < x - 1; i++)
        {
            for (int j = 0; j < x - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void printarray(int arr[])
    {
        int x = arr.length;
        for (int k = 0; k < x; ++k)
        {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		BubbleSort sa = new BubbleSort();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int x;
		System.out.print("Enter first number = ");
		x = sc.nextInt();
		int[] usa = new int[x];
        System.out.println("Enter the elements of the unsorted array: ");
        for (int l = 0; l < x; l++)
        {
        	usa[l]=sc.nextInt(); 
        }
        System.out.println("The elements of the unsorted array: ");
        for (int m=0; m < x; m++)   
        {  
        	System.out.println(usa[m]);  
        }  
        sa.bubbleSort(usa);
        System.out.println("Sorted array");
        sa.printarray(usa);
	}
}
