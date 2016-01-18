package nu.westlin;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DaoUserDetailsService implements UserDetailsService {

    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        switch(username) {
            case "user":
                return new User("user", "user", createAuthorities("USER"));
            case "sune":
                return new User("sune", "sune", createAuthorities("SUNE"));
            case "admin":
                return new User("admin", "admin", createAuthorities("ADMIN"));
            default:
                return null;
        }
    }

    private List<? extends GrantedAuthority> createAuthorities(String... roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();

        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }

        return authorities;
    }
}
