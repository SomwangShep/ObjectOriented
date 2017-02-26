import java.util.Scanner;

public class Decision {

	public Decision(){}
	
	private String m_question;
	private IDecision m_yes;
	private IDecision m_no;
	private String m_yesTerminate;
	private String m_noTermiate;
	
	private static Scanner keyboard = new Scanner(System.in);
	String input="";
	
	public void setYes(IDecision yes) {
		
		
	}
	
	public void setNo(IDecision no) {
	}	
	
	public  void setYesTerminal(String terminal){
		
	}
	
	public void setNoTerminal(String terminal){
		
	}
	
	public IDecision ask(){
		
		if (msg("Do you want to buy a snowboard?").equalsIgnoreCase("y"))
		{
			if(msg("Have you snowboard before?").equalsIgnoreCase("y"))
			{
				if(msg("Are you an expert?").equalsIgnoreCase("y"))
				{
					if(msg("Do you like to go fast?").equalsIgnoreCase("y"))
					{
						System.out.print("Buy the XG300 model");
					}
					else {
						System.out.print("Buy the XG200 model");
					}
				}
				else{
					System.out.print("Buy the XG200 model");
				}
			}
			else {
				System.out.print("Buy the XG100 model");
			}
		}
		/*------------------------------------------------------------------------*/
		else if (msg("Do you want to buy downhill skis").equalsIgnoreCase("y"))
		{
			if (msg("Have you gone ski before?").equalsIgnoreCase("y"))
			{
				if (msg("Are you an expert?").equalsIgnoreCase("y"))
				{
					if (msg("Do you like to jump?").equalsIgnoreCase("y"))
					{
						System.out.print("Buy the ZR300 model");
					}
					else
					{
						System.out.print("Buy the ZR200 model");
					}
				}
				else
				{
					System.out.print("Buy the ZR200 model");
				}
			}
			else
			{
				System.out.print("Buy the ZR100 model");
			}
		}
		/*------------------------------------------------------------------------*/
		else
		{
			System.out.print("Recomment they try skiing someday");
			
		}
		return null;
	}
	
	private String msg(String s){
		System.out.print(s);
		return (keyboard.next().trim().toUpperCase());	
	}
}
