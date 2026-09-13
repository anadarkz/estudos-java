import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Gato> listaGatos = new ArrayList<>();
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    int opcao = 0;
    
    while (opcao != 5) {
      System.out.println();
      System.out.println("================================================");
      System.out.println("1 • Registrar Gato na Loja");
      System.out.println("2 • Registrar Cliente");
      System.out.println("3 • Vender Gato a Cliente");
      System.out.println("4 • Listar Gatos Vendidos");
      System.out.println("5 • Sair");
            System.out.println("================================================");
      System.out.print("Escolha: ");
      opcao = sc.nextInt();
      sc.nextLine();

    switch (opcao) {

                case 1:

                    System.out.println("\n--- REGISTRAR GATO ---");

                    System.out.print("Digite o nome do gato: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a idade: ");
                    Integer idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o peso: ");
                    Double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite o comportamento do gato: ");
                    String comportamento = sc.nextLine();

                    Gato cat1 = new Gato(
                        nome,
                        idade,
                        peso,
                        comportamento
                    );

                    listaGatos.add(cat1);

                    System.out.println(
                        "Gato " + nome + " registrado com sucesso!"
                    );

                    break;


                case 2:

                    System.out.println("\n--- REGISTRAR CLIENTE ---");

                    System.out.print("Nome do cliente: ");
                    String nomeCliente = sc.nextLine();

                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();

                    Cliente cli1 = new Cliente(
                        nomeCliente,
                        cpf
                    );

                    listaClientes.add(cli1);

                    System.out.println(
                        "Cliente " + nomeCliente +
                        " registrado com sucesso!"
                    );

                    break;


                case 3:

                    System.out.println("\n--- VENDER GATO ---");

                    if (listaGatos.isEmpty()) {

                        System.out.println(
                            "Nenhum gato registrado!"
                        );

                        break;
                    }

                    if (listaClientes.isEmpty()) {

                        System.out.println(
                            "Nenhum cliente registrado!"
                        );

                        break;
                    }

                    System.out.println("\nGatos disponíveis:");

                    boolean temGatoDisponivel = false;

                    for (int i = 0; i < listaGatos.size(); i++) {

                        Gato gato = listaGatos.get(i);

                        if (gato.getDono() == null) {

                            System.out.println(
                                i + " - " +
                                gato.getNome()
                            );

                            temGatoDisponivel = true;
                        }
                    }

                    if (!temGatoDisponivel) {

                        System.out.println(
                            "Todos os gatos já foram vendidos!"
                        );

                        break;
                    }

                    System.out.print(
                        "Escolha o número do gato: "
                    );

                    int numeroGato = sc.nextInt();
                    sc.nextLine();

                    if (
                        numeroGato < 0 ||
                        numeroGato >= listaGatos.size()
                    ) {

                        System.out.println(
                            "Gato inválido!"
                        );

                        break;
                    }

                    Gato gatoEscolhido =
                        listaGatos.get(numeroGato);

                    if (gatoEscolhido.getDono() != null) {

                        System.out.println(
                            "Esse gato já foi vendido!"
                        );

                        break;
                    }


                    System.out.println("\nClientes:");

                    for (int i = 0; i < listaClientes.size(); i++) {

                        System.out.println(
                            i + " - " +
                            listaClientes.get(i).getNome()
                        );
                    }

                    System.out.print(
                        "Escolha o número do cliente: "
                    );

                    int numeroCliente = sc.nextInt();
                    sc.nextLine();

                    if (
                        numeroCliente < 0 ||
                        numeroCliente >= listaClientes.size()
                    ) {

                        System.out.println(
                            "Cliente inválido!"
                        );

                        break;
                    }

                    Cliente clienteEscolhido =
                        listaClientes.get(numeroCliente);

                    System.out.print(
                        "Digite o valor da venda: R$ "
                    );

                    Double valor = sc.nextDouble();
                    sc.nextLine();

                    gatoEscolhido.setDono(
                        clienteEscolhido
                    );

                    gatoEscolhido.setValorVenda(
                        valor
                    );

                    System.out.println();
                    System.out.println(
                        "Venda realizada com sucesso!"
                    );

                    System.out.printf(
                        "Você vendeu o gato %s para %s por R$ %.2f%n",
                        gatoEscolhido.getNome(),
                        clienteEscolhido.getNome(),
                        valor
                    );

                    break;


                case 4:

                    System.out.println("\n--- GATOS VENDIDOS ---");

                    System.out.printf(
                        "%-20s %-20s %-15s%n",
                        "Nome do Gato",
                        "Nome do Dono",
                        "Valor"
                    );

                    System.out.println(
                        "-------------------------------------------------------"
                    );

                    boolean encontrouVenda = false;

                    for (Gato gato : listaGatos) {

                        if (gato.getDono() != null) {

                            System.out.printf(
                                "%-20s %-20s R$ %.2f%n",
                                gato.getNome(),
                                gato.getDono().getNome(),
                                gato.getValorVenda()
                            );

                            encontrouVenda = true;
                        }
                    }

                    if (!encontrouVenda) {

                        System.out.println(
                            "Nenhum gato foi vendido ainda."
                        );
                    }

                    break;


                case 5:

                    System.out.println(
                        "Saindo do sistema..."
                    );

                    break;


                default:

                    System.out.println(
                        "Opção inválida!"
                    );
            }
        }

        sc.close();
    }
} 