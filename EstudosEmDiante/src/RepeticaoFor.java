/*
A estrutura for é como um maestro que rege a repetição de um bloco de código um número específico de vezes. Ela é perfeita quando você sabe exatamente quantas vezes precisa executar o código, como imprimir números de 1 a 10 ou verificar os itens de uma lista.
for (inicialização; condição; incremento) {
    // bloco de código a ser repetido


    for(int i = 1; i <= 10; i++) {
    System.out.println(i);
}

Use o código com cuidado.
content_copy
Neste exemplo, o loop for imprime os números de 1 a 10. A variável de controle i é inicializada com 1, a condição i <= 10 verifica se i é menor ou igual a 10, e o incremento i++ aumenta i em 1 a cada iteração.
}
*/
public class RepeticaoFor {

  public static void main(String[] args) {
    for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos ++) {
      System.out.println(carneirinhos + " - Carneirinho(os) "); 
    }
  }
}