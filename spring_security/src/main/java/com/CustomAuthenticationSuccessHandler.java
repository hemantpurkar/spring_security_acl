package com;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements
		AuthenticationSuccessHandler {
	
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authResult) throws IOException,
			ServletException {
		/* Redirect on the successful authentication of the user */
		System.out.println("------onAuthenticationSuccess--------");
        Collection<? extends GrantedAuthority> auths = authResult.getAuthorities();
       
        System.out.println("auths:::"+auths);
        
       
        if(auths.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
        	System.out.println("------Admin user--------");
            response.sendRedirect(response.encodeURL("dashboard"));
        }
        else if(auths.contains(new SimpleGrantedAuthority("ROLE_USER"))){
        	System.out.println("------User-------");
            response.sendRedirect(response.encodeURL("dashboard"));
        }
	}
}
