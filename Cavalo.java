package PacotePOOJavaHeranca;

public class Cavalo extends Animal 
{
	private String raca;
	private String cor ;
	private String pelagem;
	private String clina;
	
		
	public Cavalo(String nome, String tipo, String habitat, String tamanho,
			String raca, String cor, String pelagem, String clina )
	{
		super(nome, tipo, habitat, tamanho);
		this.raca = raca;
		this.cor = cor;
		this.pelagem = pelagem;
		this.clina = clina;
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
	public String getClina() {
		return clina;
	}

	public void setClina(String clina) {
		this.clina = clina;
	}

	public void setRinchar()
	{
		System.out.println("Hi in in in in...");
	}
	public void cavaloInfo()
	{
		System.out.println("\nEu sou um(a) " +getNome()+ ", sou "+getTipo()+ " e gosto de ficar no(a) "+getHabitat()+
				",\nsou "+getTamanho()+ " da raça "+raca+ ", minha cor é " +cor+ ", meu pelo é de tamanho "+pelagem+ 
				" e minha clina é "+clina+ ".\n");
	}
		
	
}
