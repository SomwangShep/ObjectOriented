import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeRunTextRpt {
	protected String m_dataFile;
	protected String m_reportFile;
	protected String m_reportType;


	private static int count = 0;
	private String[] pName= new String[10000];
	private String[] hr = new String[10000];
	private String[] rbi = new String[10000];
	private String[] rType = new String[10000];

	public HomeRunTextRpt(String m_dataFile, String m_reportFile,String m_reportType) {
		super();
		this.m_dataFile = m_dataFile;
		this.m_reportFile = m_reportFile;
		this.m_reportType = m_reportType;
	}

	public List<DataPair> loadData() throws FileNotFoundException {

		File inputFile = new File(m_dataFile);
		List<DataPair> ret = new ArrayList<DataPair>();

		Scanner fileScanner = new Scanner(inputFile);
		count = 0;

		while(fileScanner.hasNextLine())
		{
			String text = fileScanner.nextLine();
			//-1 is very important if you have name,, without -1 you will getting outbound error
			String[] tokens = text.split(",", -1);

			pName[count]= tokens[0].trim();

			//hr[count]= (tokens.length>=2?tokens[1].trim():"0");
			//rbi[count]= (tokens.length>=3?tokens[2].trim():"0");
			
			hr[count]= tokens[1].trim();
			rbi[count]= tokens[2].trim();			

			if (m_reportType.equalsIgnoreCase("hr"))
			{
				rType[count] = hr[count];
			}
			else//rbi
			{
				rType[count] = rbi[count];
			}
			if (rType[count].equalsIgnoreCase("")){rType[count]="0"; }//replace blank with 0

			DataPair d1 = new DataPair(pName[count], Integer.parseInt(rType[count]));
			ret.add(d1);
			//System.out.println(tokens.length + ": " + count + text);
			count++;
		}
		return ret;

	}

	public void generateReport(List<DataPair>data) throws FileNotFoundException{
		List<DataPair> dataPair = loadData();
		PrintWriter file = new PrintWriter(m_reportFile);
		for (DataPair d : dataPair)
		{
			file.println(String.format("%-20s%5s",d.getName(),d.getStat()));
		}
		file.close();
	}

}
