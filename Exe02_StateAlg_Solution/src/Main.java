import java.util.Arrays;
import java.util.List;

public  class Main
{
	public  static void main(String[] args)
	{
		Main tester = new Main();
		tester.Test();
	}
	public void Test()
	{
		Double[] ary = {new Double(10), new Double(15),new Double(20)};
		List<Double> l = Arrays.asList(ary);
		
		Average a = new Average();
		System.out.println(a.process(l).get(0));
		
		Sum s = new Sum();
		System.out.println(s.process(l).get(0));
		
		MultiPlyByTwo m = new MultiPlyByTwo();
		System.out.println(m.process(l).get(0));
		System.out.println(m.process(l).get(1));
		System.out.println(m.process(l).get(2));
		
		CompositeAlg c = new CompositeAlg();
		System.out.println(c.process(l).get(0));
		
		System.out.println("---------------------------");
		CompositeAlg c2 = new CompositeAlg();
		c2.addAlg(m);
		c2.addAlg(a);
		System.out.println(c2.process(l).get(0));
		
		System.out.println("---------------------------");
		CompositeAlg c3 = new CompositeAlg();
		c3.addAlg(m);
		c3.addAlg(m);
		c3.addAlg(m);
		System.out.println(c3.process(l));	

		System.out.println("---------------------------");
		CompositeAlg c4 = new CompositeAlg();
		c4.addAlg(m);
		c4.addAlg(m);
		c4.addAlg(m);
		c4.addAlg(s);
		System.out.println(c4.process(l));			
		
		
	}
}