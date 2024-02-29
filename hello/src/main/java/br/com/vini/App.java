package br.com.vini;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String nome;
        User usuario = new User();

        System.out.println("Digite o nome");

        nome=scanner.nextLine();

        usuario.setNome(nome);

        System.out.println("o nome foi: "+ usuario.getName());

    }
}
