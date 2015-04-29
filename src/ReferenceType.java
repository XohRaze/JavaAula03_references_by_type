
public class ReferenceType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2 = "Olé";
		int size = s2.length();
				
		System.out.println(size);
		
		s2 = s2 + "Ola";  //Concatena s2 + ola
		
		System.out.println(s2);
		
		String str = "TGPSI é um bom curso";
		
		System.out.println(str.substring(6, 8)+str.substring(11, 15)+str.substring(15, 20));  //Diferente do c#, no java a dimensao dentro dos parentes servem para msotrar os caracteres entre os intervalos
		
		String str2 = str.replace("TGPSI", "TGPSA");
		
		System.out.println(str2);
		
		System.out.println(str.replace("TGPSI", "").replace("um", ""));
		
	}

}
