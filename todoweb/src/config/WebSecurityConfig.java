package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//			.csrf().disable()
			.authorizeRequests()                                                                
	            .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")                                  
	            .and()
	        .formLogin()
	        	.loginPage("/login.do")
	        	.defaultSuccessUrl("/index.do")
	        	.loginProcessingUrl("/j_spring_security_check")
	        	.usernameParameter("j_username")
	        	.passwordParameter("j_password")
	        	.and()
	        	.logout()
	        	.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        	.logoutSuccessUrl("/index.do")
	        	.and()
	        .rememberMe()
	        	.key("authkey");
	}
	
	// Soporte de métodos securizados
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
	    auth
	        .jdbcAuthentication()
	            .dataSource(dataSource);
	  }
}
