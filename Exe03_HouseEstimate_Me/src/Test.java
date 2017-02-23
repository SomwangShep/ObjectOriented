
public class Test {
	public  static void main(String[] args)
	{
		Test tester = new Test();
		tester.tester();
	}
	public void tester()
	{
		int sq = 10;
		House h = new House();
		System.out.println(h.estimate(sq));
		
		SolidConstructionHouse s = new SolidConstructionHouse(sq);
		System.out.println(s.calculateCost());
		
	}
}
