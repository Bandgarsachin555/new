package JAVA;

public class Duplicate_Array {

	public static void main(String[] args) {
		
		int []arr= {1,5,7,9,6,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
				  
		}
//Same for String 
	}

}
