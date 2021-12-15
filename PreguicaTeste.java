package PacotePOOJavaHeranca;

public class PreguicaTeste
{

	public static void main(String[] args) 
	{
		Preguica preguica1 = new Preguica("preguiça", "mamífero", "pendurados em árvores","pequeno", "Preguiça-Real", 
				"marron", "médio", "Pontuda");
		
			preguica1.preguicaInfo();
			preguica1.setAlterarAcao();
			preguica1.setParado();
			preguica1.setAlterarAcao();
			preguica1.setParado();
			preguica1.setAlterarAcao();
			preguica1.setDormir();
			
			

	}

}
