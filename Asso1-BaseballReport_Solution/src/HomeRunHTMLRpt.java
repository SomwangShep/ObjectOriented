import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HomeRunHTMLRpt extends HomeRunTextRpt {

	public HomeRunHTMLRpt(String dataFile, String reportFile) {
		super(dataFile, reportFile);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void generateReport(List<DataPair>data) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter(m_reportFile));
		out.write("<html>\n");
		out.write("<body>\n");
		out.write("<Table>\n");
		for (DataPair pair:data)
		{
			out.write(String.format("<tr><td>%s</td><td>%d</td></tr>%n",pair.getName(),pair.getStat()));						
		}
		out.write("</table>\n");
		out.write("</body>\n");
		out.write("</html>\n");
		out.close();
	}
}
