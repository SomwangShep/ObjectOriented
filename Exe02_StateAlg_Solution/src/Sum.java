import java.util.ArrayList;
import java.util.List;


public class Sum implements IStateAlg
{
	public List<Double> process(List<Double>data)
	{
		double total=0.0;
		List<Double> list = new ArrayList<Double>();
		for (double d:data)
		{
			total += d;
		}
		list.add(total);
		return list;
	}
}
