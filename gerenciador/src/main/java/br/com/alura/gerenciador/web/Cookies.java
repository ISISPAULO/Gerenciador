package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;

public class Cookies {

	private  final Cookie[] cookies;
	private Object req;

	public Cookies(Cookie[] cookies) {
		this.cookies = cookies;
		
	}

	public Cookie buscaUsuarioLogado() {
		
		Cookie[] cookies = req.getCookies();
		if(cookies ==null)
			return null;
			for(Cookie cookie : cookies){
					if(cookie.getName().equals("usuario.logado")) {
						return  cookie;
							
				
			}
		
	
				
				
			}
			return null;
			
		}
		
		
		
	}


