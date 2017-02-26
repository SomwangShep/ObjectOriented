import java.util.Arrays;

public class DropHigh implements IFilter{
	public int[] filter(int[] ary)
	{
	       int[] copy = new int[ary.length-1];
	        Arrays.sort(ary);
	        for (int i = 0; i < ary.length-1; i++)
	            copy[i] = ary[i];
	        ary = copy;		
	        return ary;
		
	}
}
