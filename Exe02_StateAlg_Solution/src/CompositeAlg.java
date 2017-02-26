import java.util.ArrayList;
import java.util.List;


public class CompositeAlg implements IStateAlg
{
	private List<IStateAlg> m_algorithms = new ArrayList<IStateAlg>();
	public List<Double> process(List<Double> data)
	{
		for (IStateAlg alg : m_algorithms)
		{
			data = alg.process(data);
		}
		return data;
	}

	public void addAlg(IStateAlg alg)
	{
		m_algorithms.add(alg);
	}
}

