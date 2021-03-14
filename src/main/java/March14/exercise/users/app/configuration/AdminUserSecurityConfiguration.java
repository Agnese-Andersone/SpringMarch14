package March14.exercise.users.app.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AdminUserSecurityConfiguration extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password("{noop}123")
            .roles("USER")
            .and()
            .withUser("admin")
            .password("{noop}123")
            .roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
      http
            .authorizeRequests()
            .antMatchers("/admin**").hasRole("ADMIN")
            .antMatchers("/logged_in").authenticated()
            .anyRequest().permitAll()
            .and()
            .formLogin();
    }
}
