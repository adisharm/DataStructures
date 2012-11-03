package Set1;

public class Problem2 {

	public char[] reverseCStyleString(char[] arr)
	{
		int end=arr.length-2;;
		for(int i=0;i<((arr.length)/2);i++)
		{
			int start=i;
			char s=arr[end];
			arr[end]=arr[start];
			arr[start]=s;
			end--;
		}
		return arr;
	}
}
