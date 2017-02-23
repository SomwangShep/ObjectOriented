
public class SolidConstructionHouse extends House{
	private int q;

	public SolidConstructionHouse(int sqft)
	{
		this.q=sqft;
	}
	public double calculateCost()
	{
		//return (q*97)+((q*97)*(25/100));
		return (q*97) * 1.25;
	}
}
