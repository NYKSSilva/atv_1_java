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

            if (escolha == 1){
                System.out.println("Digite o nome que deseja cadastrar!!");
                Scanner sc = new Scanner(System.in);
                String userName = sc.nextLine();
                nomes.add(userName);
            }
            else if (escolha ==2){
                listar();
                System.out.println();
            }
            else if(escolha ==3){
                listar();
                System.out.println("Digite o numero do aluno que deseja Atualizar:");
                Scanner id = new Scanner(System.in);
            }

            else if(escolha ==4){
                listar();
                System.out.println("Digite o numero do aluno que deseja Remover:");
                Scanner id = new Scanner(System.in);
                nomes.remove(id);
            }

            else if(escolha ==0){
                break;
            }

            else {
                System.out.println("Opção invalida, digite uma opção exitente!!");
            }
        }

//        public static void exibir(){
//            if(lista.size() == 0){
//                System.out.println("Parece que não há alunos registrados.");
//            }
//            else{
//                System.out.println("Exibindo alunos... ");
//                for (int i = 0; i < lista.size(); i++) {
//                    System.out.println(i + " - " + lista.get(i)); // Usei IA para fazer o for
//                }
//                }
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