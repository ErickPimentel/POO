import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.List;

public class ProcessadorDemo {
    public static void main(String[] args) {
        ProcessadorClientes processadorClientes = new ProcessadorClientes();
        System.out.println("Lendo Arquivo e salvando clientes!");
        processadorClientes.lerTodosClientes(Paths.get("src/50-customers.txt"));
        System.out.println("Feito!");
        System.out.println();

        System.out.println("Clientes agrupados por idade");
        processadorClientes.agruparClientesPorIdade();
        System.out.println("Feito!");
        System.out.println();

        System.out.println("Usando ordenacao por nome:");
        processadorClientes.gravarClientesOrdenadosPor(Paths.get("src/por_nome.txt"), new ComparadorPrimeiroNome());
        System.out.println("Feito!");
        System.out.println();


        System.out.println("Usando ordenacao por idade:");
        processadorClientes.gravarClientesOrdenadosPor(Paths.get("src/por_idade.txt"), new ComparadorIdade());
        System.out.println("Feito!");
        System.out.println();

        System.out.println("Usando ordenacao por codigo:");
        processadorClientes.gravarClientesOrdenadosPor(Paths.get("src/por_codigo.txt"), new ComparadorCodigo());
        System.out.println("Feito!");
        System.out.println();

        System.out.println("Usando ordenacao por estado:");
        processadorClientes.gravarClientesOrdenadosPor(Paths.get("src/por_estado.txt"), new ComparadorEstado());
        System.out.println("Feito!");
        System.out.println();

        System.out.println("Gravando mapa de clientes:");
        processadorClientes.gravarMapaClientes(Paths.get("src/gravarMapaClientes.txt"));
        System.out.println("Feito!");
        System.out.println();

    }
}
