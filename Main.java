import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LeitorDigitos leitorDigitos = new LeitorDigitos("message.txt");

        System.out.println(leitorDigitos.lerArquivo());
        System.out.println(leitorDigitos.getPath());
    }
}