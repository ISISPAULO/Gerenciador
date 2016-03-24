package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.EmpresaDAO;


@WebServlet(urlPatterns = "/logout")
public class Logout implements Tarefa{
	
	
	
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp)  {
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}
}		
		
		
	
	
	




