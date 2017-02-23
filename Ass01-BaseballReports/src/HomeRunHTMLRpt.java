import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HomeRunHTMLRpt extends HomeRunTextRpt{

	public HomeRunHTMLRpt(String dataFile, String reportFile,String m_reportType) {
		super(dataFile, reportFile, m_reportType);
		// TODO Auto-generated constructor stub
	}

	public void generateReport(List<DataPair>data) throws FileNotFoundException{
		List<DataPair> dataPair= super.loadData();
		PrintWriter file = new PrintWriter(m_reportFile);

		file.println("<HTML>\r\n<body>\r\n<table>");
		for (DataPair d : dataPair)
		{
			file.println("<tr><td>" + d.getName() + "</td><td>" + d.getStat() + "</td></tr>");
		}
		file.println("</table>\r\n</body>\r\n</HTML>");
		file.close();
	}

}
