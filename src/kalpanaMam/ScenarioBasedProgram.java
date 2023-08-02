package kalpanaMam;

public class ScenarioBasedProgram {
	
	public int abc()
	{
		try{
			return 5;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 5;
		}
	}

	public static void main(String[] args) {
		
		ScenarioBasedProgram s=new ScenarioBasedProgram();
		System.out.println(s.abc());
		
	}

}
