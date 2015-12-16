package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider {
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		
		System.out.println("Coming in authentication provider....");
		String name = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		if (name.equals("admin") && password.equals("admin")) {
			System.out.println("Coming in authentication provider....ADMIN");
			List<GrantedAuthority> grantedAuths = new ArrayList();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			Authentication auth = new UsernamePasswordAuthenticationToken(name,
					password, grantedAuths);
			return auth;
		} else if (name.equals("hemant") && password.equals("12345678")) {
			System.out.println("Coming in authentication provider....User");
			List<GrantedAuthority> grantedAuths = new ArrayList();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
			Authentication auth = new UsernamePasswordAuthenticationToken(name,
					password, grantedAuths);
			return auth;
		} else {
			return null;
		}
	}

	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
