// Classe Imc
public class Imc {
    // Atributos da classe Imc
    private float pesoImc;
    private float alturaImc;
    private String nomeImc;
    private float resultadoImc;

private float calcularImc(){
    imc = peso / ( Math.pow(altura, 2) );
    return imc;
}

private String analisarImc(){
    if (imcPessoa < 18.5) {
        return "Baixo peso. É recomendado procurar um médico.";
    } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
        return "Peso adequado. Avalie outros parâmetros corporais.";
    } else if (imcPessoa >= 25 && imcPessoa <= 29.9) {
        return "Sobrepeso. Consulte um médico e reveja hábitos.";
    } else if (imcPessoa >= 30 && imcPessoa <= 34.9) {
        return "Obesidade Grau I. Busque orientação médica e nutricional.";
    } else if (imcPessoa >= 35 && imcPessoa <= 39.9) {
        return "Obesidade Grau II. Não atrase a busca por orientação médica.";
    } else {
        return "Obesidade Grau III. A chance de doenças associadas é alta. Busque orientação médica.";
    }
}

public void mostrarImc(){
    System.out.println("Nome: " + this.nomePessoa);
    System.out.println("Peso: " + this.pesoPessoa);
    System.out.println("Altura: " + this.alturaPessoa);
    System.out.println("IMC: " + this.imcPessoa);
    System.out.println("Analise do IMC: " + this.analiseImcPessoa);

    
}
    