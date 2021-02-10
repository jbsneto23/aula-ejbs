package br.edu.aula.servlets;

import br.edu.aula.ejbs.CalculadoraFinanciamento;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadora-financiamento")
public class CalculadoraFinanciamentoServlet extends HttpServlet {

    @EJB
    private CalculadoraFinanciamento calculadora;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double parcela = calculadora.simulaFinanciamento(10000.0, 10);
        response.getWriter().printf("<h1>Valor da parcela: %.2f</h1>", parcela);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double valor = Double.parseDouble(request.getParameter("valor"));
        int meses = Integer.parseInt(request.getParameter("meses"));
        double taxa = Double.parseDouble(request.getParameter("taxa"));
        
        double parcela = calculadora.simulaFinanciamentoTaxa(valor, meses, taxa);
        
        request.setAttribute("valor", valor);
        request.setAttribute("meses", meses);
        request.setAttribute("taxa", taxa);
        request.setAttribute("parcela", parcela);
        request.setAttribute("valorTotal", parcela * meses);
        
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/calculadora.jsp");
        dispatcher.forward(request, response);
    }

}
