import java.util.List;
import java.io.FileNotFoundException;

public class RBIHTMLRptA extends HomeRunHTMLRpt {

	public RBIHTMLRptA(String m_dataFile, String m_reportFile,String m_reportType) {
		super(m_dataFile, m_reportFile, m_reportType);
		// TODO Auto-generated constructor stub
	}

	public List<DataPair>loadData()throws FileNotFoundException{
		List<DataPair> dataP= super.loadData();
		return dataP;

	}

}
