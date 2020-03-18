package conversorTemperatura;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class ConversorTemperaturaServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	Converte calcula;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double temperatura = Double.parseDouble(request.getParameter("temperatura"));
	    char opcao = request.getParameter("select").charAt(0);
	    calcula = new Converte();
	   
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("<title>TOTAL DAS PARCELAS</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>RESULTADO IGUAL = " +  calcula.converterPara(temperatura, opcao) + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}

	}
}
