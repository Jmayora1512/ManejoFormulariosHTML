package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnolog�as");
        out.print("</td>");
        out.print("<td>");

        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }

        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("G�nero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupaci�n");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("M�sica Favorita");
        out.print("</td>");
        out.print("<td>");

        if (musica != null) {
            for (String m : musica) {
                out.print(m);
                out.print(" / ");
            }
        }
        else{
            out.print("Valor no proporcionado");
        }

        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print(comentarios);
        out.print("</td>");
        out.print("</tr>");

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }		
		
}


