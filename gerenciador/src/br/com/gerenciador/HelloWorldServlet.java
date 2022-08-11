package br.com.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello",loadOnStartup=1)
public class HelloWorldServlet extends HttpServlet {
	
	public HelloWorldServlet() {
		System.out.println("Criando hello world servlet.");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello, World. Este é o meu primeiro servlet.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet foi chamado.");
	}

}
