package Server.TeaTimeProjectRefactoring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfiguration {
    public UserDetailsManager userDetailsService() {
        UserDetails userDetails =
            User.withDefaultPasswordEncoder()
                .username("mason@gmail.com")
                .password("1234")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
}
