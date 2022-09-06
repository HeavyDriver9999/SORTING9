import java.util.Scanner;

public class NewSort
{

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
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
			System.out.println("The elements of the sorted array: ");
			        for (int i = 0; i < usa.length; i++) 
			        {
			            for (int j = i + 1; j < usa.length; j++) 
			            {
			                int temp = 0;
			                if (usa[j] < usa[i]) 
			                {
			                    temp = usa[i];
			                    usa[i] = usa[j];
			                    usa[j] = temp;
			                }
			            }
			            System.out.print(usa[i] + " ");
			        }
		}
		    }
	}
