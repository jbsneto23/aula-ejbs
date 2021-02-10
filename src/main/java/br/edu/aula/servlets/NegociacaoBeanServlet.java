package br.edu.aula.servlets;

import br.edu.aula.ejbs.NegociacaoBean;
import br.edu.aula.entidades.Cliente;
import br.edu.aula.entidades.Contrato;
import static br.edu.aula.entidades.FormaPagamento.ATE_6_VEZES;
import static br.edu.aula.entidades.FormaPagamento.MAIS_6_VEZES;
import static br.edu.aula.entidades.FormaPagamento.VISTA;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/negociacao-bean")
public class NegociacaoBeanServlet extends HttpServlet {

    @EJB
    private NegociacaoBean negociacao;

    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        Cliente cliente = buscarClientePorCPF(1234567890);

        negociacao.iniciaNegociacao(cliente);

        negociacao.registrarProposta(VISTA);
        negociacao.registrarProposta(ATE_6_VEZES);
        negociacao.registrarProposta(MAIS_6_VEZES);

        negociacao.getPropostas().forEach(System.out::println);
        
        negociacao.remover();
        
        resp.getWriter().printf("Teste finalizado");
    }

    private Cliente buscarClientePorCPF(int cpf) {
        Set<Contrato> contratos = new HashSet<>();

        Contrato contrato1 = new Contrato();
        contrato1.setValor(100_000.0);
        contrato1.setSaldo(40_000.0);
        contratos.add(contrato1);

        Contrato contrato2 = new Contrato();
        contrato2.setValor(100_000.0);
        contrato2.setSaldo(60_000.0);
        contratos.add(contrato2);

        Cliente cliente = new Cliente();
        cliente.setContratos(contratos);

        return cliente;
    }

}
