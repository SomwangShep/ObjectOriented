import java.util.ArrayList;
import java.util.List;


public class MultiPlyByTwo implements IStateAlg
{
	public List<Double> process(List<Double>data)
	{
		List<Double> list = new ArrayList<Double>();
		for (double d:data)
		{
			list.add(d*2);
		}
		return list;
	}
}
