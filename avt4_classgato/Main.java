import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<Gato>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        int op = 1;
      
        while (op != 6){
            op = Menu(teclado);
            switch (op) {
                case 1:
                    gatos.add(NovoGato(teclado));
                    break;
                case 2:
                    listaGatos(gatos);
                    break;
                case 3:
                    clientes.add(NovoCliente(teclado));
                    break;
                case 4:
                    Integer tmp_cli = selecionarCliente(teclado, clientes);
                    Integer tmp_gat = selecionarGato(teclado, gatos);
                    gatos.get(tmp_gat).setDono(clientes.get(tmp_cli));
                    break;
                case 5:
                    Cliente obj_cli = selecionarObjCliente(teclado, clientes);
                    Gato obj_gat = selecionarObjGato(teclado, gatos);
                    obj_gat.setDono(obj_cli);
                    break;
                case 6:
                    teclado.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static int Menu(Scanner teclado){
        System.out.println("\n===== MENU =====");
        System.out.println("1. Cadastrar Gato");
        System.out.println("2. Listar Gatos");
        System.out.println("3. Cadastrar Cliente");
        System.out.println("4. Vender Gato (dar um dono para o Gato)");
        System.out.println("5. Vender Gato (usando objetos)");
        System.out.println("6. Sair");
        System.out.print("Selecionar uma opção: ");
        return teclado.nextInt();
    }

    public static void listaGatos(ArrayList<Gato> gatos){
        System.out.println("Gatos: \n");
        for (int i = 0; i < gatos.size(); i++){
            gatos.get(i).quem_sou();
        }
        System.out.print("\n");
    }

    public static Integer selecionarCliente(Scanner teclado, ArrayList<Cliente> clientes){
        System.out.print("Clientes: \n");
        for (int i=0; i < clientes.size(); i++){
            System.out.print((i+1) + ": ");
            System.out.print(clientes.get(i).getNome()+"\n");
        }
        System.out.print("Selecione Cliente: ");
        Integer cli = teclado.nextInt()-1;
        return cli;
    }

    public static Integer selecionarGato(Scanner teclado, ArrayList<Gato> gatos){
        System.out.print("Gatos: \n");
        for (int i=0; i < gatos.size(); i++){
            System.out.print((i+1) + ": ");
            System.out.print(gatos.get(i).getNome()+ "\n");
        }
        System.out.print("Selecione Gato: ");
        Integer gat = teclado.nextInt()-1;
        return gat;
    }

    public static Cliente selecionarObjCliente(Scanner teclado, ArrayList<Cliente> clientes){
        System.out.print("Clientes: \n");
        for (int i=0; i < clientes.size(); i++){
            System.out.print((i+1) + ": ");
            System.out.print(clientes.get(i).getNome()+"\n");
        }
        System.out.print("Selecione Cliente: ");
        Integer cli = teclado.nextInt()-1;
        return clientes.get(cli);
    }

    public static Gato selecionarObjGato(Scanner teclado, ArrayList<Gato> gatos){
        System.out.print("Gatos: \n");
        for (int i=0; i < gatos.size(); i++){
            System.out.print((i+1) + ": ");
            System.out.print(gatos.get(i).getNome()+ "\n");
        }
        System.out.print("Selecione Gato: ");
        Integer gat = teclado.nextInt()-1;
        return gatos.get(gat);
    }

    public static Gato NovoGato(Scanner teclado){
        teclado.nextLine();
        System.out.print("Digite o nome do gato: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        Integer idade = teclado.nextInt();
        System.out.print("Digite seu peso: ");
        Double peso = teclado.nextDouble();
        teclado.nextLine();
        Gato cat_tmp = new Gato();
        cat_tmp.setNome(nome);
        cat_tmp.setIdade(idade);
        cat_tmp.setPeso(peso);
        return cat_tmp;
    }

    public static Cliente NovoCliente(Scanner teclado){
        teclado.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = teclado.nextLine();
        Cliente cli_tmp = new Cliente();
        cli_tmp.setNome(nome);
        cli_tmp.setCPF(cpf);
        return cli_tmp;
    }
  
}