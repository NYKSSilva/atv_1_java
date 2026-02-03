import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static   ArrayList<String> nomes = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println(" Cadastro de nomes");

        while(true){
            System.out.println("1 - Cadastrar nome;");
            System.out.println("2 - Listar nomes;");
            System.out.println("3 - Atualizar nome;");
            System.out.println("4 - Remover nome;");
            System.out.println("0 - Sair.");

            System.out.println("Digite o codigo da ação desejada:");
            Scanner opcoes = new Scanner(System.in);
            int escolha = opcoes.nextInt();
            System.out.println();

            if (escolha == 1){ //Cadastrar
                System.out.println("Digite o nome que deseja cadastrar!!");
                Scanner sc = new Scanner(System.in);
                String userName = sc.nextLine();
                nomes.add(userName);
            }
            else if (escolha ==2){ //Listar
                listar();
                if (nomes.size()<1){
                    System.out.println("Lista vazia!");
                }
                System.out.println();
            }
            else if(escolha ==3){ //atualizar
                listar();
                if (nomes.size()>1) {
                    System.out.println("Digite o numero do aluno que deseja Atualizar: ");
                    Scanner id = new Scanner(System.in);
                    int user = id.nextInt();
                    nomes.remove(user);
                    System.out.println("Digite o nome atualizado: ");
                    Scanner atualizado = new Scanner(System.in);
                    String nome = atualizado.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome atualizado:" + nome);
                    System.out.println();
                }
                else {
                    System.out.println("Lista vazia, nenhum cadastro para atualizar.");
                }

            }

            else if(escolha ==4){ // Excluir
                listar();
                if (nomes.size()<1) {
                    System.out.println("Lista Vazia");
                }
                System.out.println("Digite o numero do aluno que deseja Remover:");
                Scanner id = new Scanner(System.in);
                int user = id.nextInt();
                nomes.remove(user);
            }

            else if(escolha ==0){ // sair
                break;
            }

            else {
                System.out.println("Opção invalida, digite uma opção exitente!!");
            }
        }

    }

    public static void listar(){
        if (nomes.size() == 0){
            System.out.println("sem registros de alunos no momento.");
        }
        else{
            System.out.println("Lista de nomes Cadastrados:");
            for(int i =0; i< nomes.size(); i++){
                System.out.println(i + "-" + nomes.get(i));
            }
        }
    }
}