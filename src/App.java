import java.util.List;
import java.util.Map;

public class App {
    /*
     * Baseado na lista de contatos abaixo, obtenha os nomes de quem possuí o número 7 no seu número de telefone e liste os respectivos nomes em ordem alfabética.
     * Apensa utilizando Stream.
     */
    public static void main(String[] args) throws Exception {

        List.of(
            Map.of("nome", "João", "telefone", "9329823423"),
            Map.of("nome", "Maria", "telefone", "9124235435"),
            Map.of("nome", "Marta", "telefone", "9456335387"),
            Map.of("nome", "José", "telefone", "9632874738"),
            Map.of("nome", "Judas", "telefone", "9329244683")
        ).stream()
            .filter(contato -> contato.get("telefone").contains("7"))
            .map(contato -> contato.get("nome"))
            .sorted()
            .forEach(System.out::println);

    }
}
