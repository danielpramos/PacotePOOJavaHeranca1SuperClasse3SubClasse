package PacotePOOJavaHeranca;

public class CavaloTeste 
{

	public static void main(String[] args) 
	{
		Cavalo cavalo1 = new Cavalo("cavalo", "mamífero", "campos correndo","grande", "Lusitano", 
				"preto", "pequeno", " preta e lisa");
		
		cavalo1.cavaloInfo();
		cavalo1.setAlterarAcao();
		cavalo1.setAndar();
		cavalo1.setAlterarAcao();
		cavalo1.setRinchar();
		cavalo1.setAlterarAcao();
		cavalo1.setPular();
		cavalo1.setAlterarAcao();
		cavalo1.setDormir();

	}

}
