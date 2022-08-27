package clinica_vet;

public class Veterinario {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone=telefone;
    }
}
