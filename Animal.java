package PacotePOOJavaHeranca;

public class Animal 
{
	  private String nome;
	  private String tipo;
	  private String habitat;
	  private String tamanho;
	  
	  public Animal(String nome, String tipo, String habitat, String tamanho )
	  {
		  this.nome = nome;
		  this.tipo = tipo;
		  this.habitat = habitat;
		  this.tamanho = tamanho;
	  }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setAndar()
	{
		System.out.println("Andando...");
	}
	public void setAlterarAcao() 
	{
		System.out.println("agora estou");
	}
	public void setPular()
	{
		System.out.println("Pulando...");
	}
	public void setDormir()
	{
		System.out.println("Dorminndo ZZZZZZZZ...");
	}
   
}
