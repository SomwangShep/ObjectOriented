import java.util.ArrayList;
import java.util.List;


public class Average implements IStateAlg 
{
	private IStateAlg m_alg = new Sum();
	public List<Double> process(List<Double> data)
	{
		List<Double> ret = new ArrayList<Double>();
		List<Double> list = m_alg.process(data);
		ret.add(list.get(0)/data.size());
		return ret;
	}
}
