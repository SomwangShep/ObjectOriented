import java.util.Arrays;

public class Median implements IGrader{
	protected IFilter m_filter;
	protected int[] m_grades;
	
	//private IFilter m_IFilter;
	
	public Median(int[] grades, IFilter filter) {
		m_grades = grades;
		m_filter = filter;		
	}
    @Override
    public double grade()
    {
      	//these 2 lines below I was missed during the exam, I did not pass the filter
    	if (m_filter != null)
    		m_grades = m_filter.filter(m_grades);
      	
        return median();
    }
    
    protected double median()
    {
        Arrays.sort(m_grades);
        double median = 0;
        int l = m_grades.length;
        if (l % 2 == 0)
        {
            median = (m_grades[l/2 - 1] + m_grades[l/2])/2.0;
        }
        else
        {
            median = m_grades[l/2];    
        }
        return median;
    }
}