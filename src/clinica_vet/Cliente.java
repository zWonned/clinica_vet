package clinica_vet;

public abstract class Cliente extends Animal{
	
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private long cep;
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone=telefone;
    }
    public String getEndereço() {
        return endereco;
    }
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getCep() {
        return cep;
    }
    public void setCep(long cep) {
        this.cep = cep;
    }
}
