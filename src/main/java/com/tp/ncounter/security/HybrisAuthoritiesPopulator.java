package com.tp.ncounter.security;

import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bearsoftware
 * Date: 05/11/2013
 * Time: 17:25
 * To change this template use File | Settings | File Templates.
 */
public class HybrisAuthoritiesPopulator implements LdapAuthoritiesPopulator {

    @Override
    public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations userDetails, String username) {
        System.out.println("about to add roles");
        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
        //TODO Need to call Hybris employee service here e.g. http://localhost:9001/ws410/rest/employees/productmanager, where product manager is the username....
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_AUTH"));
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_DING"));
        System.out.println("done adding roles");

        return grantedAuths;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
