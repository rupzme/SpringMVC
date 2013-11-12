package com.springapp.mvc;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

        System.out.println("Before");
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        for (GrantedAuthority grantedAuthority : currentUser.getAuthorities()) {
            System.out.println("has role: "+grantedAuthority.getAuthority());
        }
        System.out.println("After");


        return "auth/loginRequired";
	}
}