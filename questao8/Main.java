package questao8;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("bernardo@gmail.com", "Niterói, RJ",  "Bernardo Mendes", "99999-9999",
                "00000000000", LocalDate.of(2003, 04, 28), "Masculino", "Bernardo Mendes", "00000000-0");

        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Email: " + pessoaFisica.getEmail());
        System.out.println("CPF: " + pessoaFisica.getCpf());

    }

}
