package PacotePOOJavaHeranca;

public class Preguica extends Animal
{
		private String raca;
		private String cor ;
		private String pelagem;
		private String garra;
		
		public Preguica(String nome, String tipo, String habitat, String tamanho,
				String raca, String cor, String pelagem, String garra )
		{
			super(nome, tipo, habitat, tamanho);
			this.raca = raca;
			this.cor = cor;
			this.pelagem = pelagem;
			this.garra = garra;
			
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
		
		public void preguicaInfo()
		{
			System.out.println("\nEu sou um(a) " +getNome()+ ", sou "+getTipo()+ " e gosto de ficar no(a) "+getHabitat()+
					",\nsou "+getTamanho()+ " da raça "+raca+ ", minha cor é " +cor+ ", meu pelo é de tamanho "+pelagem+ 
					" e tenho uma garra "+garra+".\n");
		}
		public void setParado()
		{
			System.out.println("paaaaaraaaaaadoooo...");
		}


}
