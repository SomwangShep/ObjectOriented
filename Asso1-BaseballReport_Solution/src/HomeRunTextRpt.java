import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeRunTextRpt {
	protected String m_dataFile;
	protected String m_reportFile;
	public HomeRunTextRpt(String dataFile, String reportFile)
	{
		m_dataFile = dataFile;
		m_reportFile = reportFile;
	}
	public List<DataPair> loadData() throws IOException
	{
		List<DataPair> list = new ArrayList<DataPair>();
		Scanner in = new Scanner(new File(m_dataFile));
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			if (line.isEmpty())
				continue;
			String[] tokens = line.split(",",-1);
			if(tokens[0].isEmpty())
				tokens[0] = "0";
			if(tokens[1].isEmpty())
				tokens[1] = "0";
			if(tokens[2].isEmpty())
				tokens[2] = "0";
			DataPair pair = new DataPair(tokens[0],Integer.parseInt(tokens[1]));
			list.add(pair);
		}
		in.close();
		return list;
	}
	public void generateReport(List<DataPair>data) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter(m_reportFile));
		for (DataPair pair : data)
		{
			out.write(String.format("%-30s%-4%n",pair.getName(),pair.getStat()));
		}
		out.close();
	}
	
}
