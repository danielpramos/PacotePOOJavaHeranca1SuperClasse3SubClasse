package PacotePOOJavaHeranca;

public class Cachorro extends Animal
{
	private String raca;
	private String cor ;
	private String pelagem;
	
	public Cachorro(String nome, String tipo, String habitat, String tamanho,
			String raca, String cor, String pelagem )
	{
		super(nome, tipo, habitat, tamanho);
		this.raca = raca;
		this.cor = cor;
		this.pelagem = pelagem;
		
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public void setLatir()
	{
		System.out.println("Au Au Au Au...");
	}
	public void setRosnar()
	{
		System.out.println("Rrrrrrrrrr...");
	}
	public void cachorroInfo()
	{
		System.out.println("\nEu sou um(a) " +getNome()+ ", sou "+getTipo()+ " e gosto de ficar no(a) "+getHabitat()+
				",\nsou "+getTamanho()+ " da raça "+raca+ ", minha cor é " +cor+ " e meu pelo é de tamanho "+pelagem+ "\n");
	}
}
