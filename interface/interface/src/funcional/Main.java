package funcional;

import java.util.List;
import java.util.function.Function;

import funcional.interfaceFuncional.User;

/**
 * Classe principal que demonstra o uso de programação funcional com interfaces funcionais
 */
public class Main {
  public static void main(String[] args) {
    // Cria uma lista de usuários com diferentes nomes e idades
    List<User> users = List.of(
      new User("John", 30),
      new User("Jane", 25),
      new User("Bob", 40),
      new User("Alice", 35),
      new User("Bob", 40),
      new User("Alice", 48)
    );
    
    // Chama o método para imprimir os dados dos usuários usando uma função lambda
    // que combina nome e idade em uma string
    printUsersValue(user -> user.name() + "," + user.age(), users);
  }

  /**
   * Método que imprime os valores dos usuários usando uma função de callback
   * 
   * @param callback Função que define como formatar os dados do usuário
   * @param users Lista de usuários a serem processados
   */
  private static void printUsersValue(Function<User, String> callback, List<User> users) {
    // Para cada usuário na lista, aplica a função callback e imprime o resultado
    users.forEach(user -> System.out.println(callback.apply(user)));
  }
}