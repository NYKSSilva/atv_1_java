import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("1-Cadastrar User.");
            System.out.println("2-Sair.");


        ArrayList<String> NomesIdades = new ArrayList<>();
        System.out.println("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        NomesIdades.add(sc.nextLine());

       nomes(NomesIdades);
    }
    public static void nomes(ArrayList<String> NomesIdades){
        System.out.println("Lista de nonmes:");
        for (String nome : NomesIdades){
            System.out.println(nome);
        }
    }
}