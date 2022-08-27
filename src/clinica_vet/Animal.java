package clinica_vet;

public abstract class Animal extends Especie{
	private int idade;
    private String nome;
    private String sexo;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        nome = nome.trim();    
        if(nome.isEmpty()) {
            System.out.println("Nome não pode estar invalido");
        }
        StringBuilder first = new StringBuilder(nome);
        String minusculo = first.substring(0, 1);
        this.nome = nome.replace(minusculo, minusculo.toUpperCase());
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
