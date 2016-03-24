package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.javafx.collections.MappingChange.Map;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {

	final static HashMap<Object, Object> USUARIOS_LOGADOS = new HashMap<>();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");
		Usuario usuario	= new UsuarioDAO().buscaPorEmailESenha(email, senha);
		PrintWriter writer = resp.getWriter();
		if(usuario==null) {
			writer.println("<html><body>Usuario invalido</body></html>");
		} else {
			
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
			writer.println("<html><body>Usuario logado:" + email +  "</body></html>");
			
			
			
		}
		
		
	}




}



