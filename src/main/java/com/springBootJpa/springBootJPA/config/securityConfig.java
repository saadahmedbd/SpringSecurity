package com.springBootJpa.springBootJPA.config;

import com.springBootJpa.springBootJPA.model.Student;
import com.springBootJpa.springBootJPA.service.studentService;
import jakarta.websocket.Session;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {

    @Autowired
    private studentService studentService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
//                .csrf(Customizer.withDefaults())
//                 // Disables CSRF protection since this is typically not required for stateless REST APIs
                .csrf(Customize -> Customize.disable())


//// Ensures that all HTTP requests must be authenticated
               .authorizeHttpRequests(Request -> Request.anyRequest().authenticated())


                // Enables HTTP Basic Authentication, which prompts the client to provide
                // a username and password
                .httpBasic(Customizer.withDefaults())


                // Configures the session management to be stateless, meaning no sessions will be created or stored
                .sessionManagement(Session -> Session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setUserDetailsService(studentService);
        return provider;
    }

//    userdetilsService help to create hardcore user password and username.
//    but it's not for suitable big application
//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails user1 = User
//                .withDefaultPasswordEncoder()
//                .username("hridoy")
//                .password("hridoy123")
//                .roles("user")
//                .build();
//
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder()
//                .username("srabon")
//                .password("srabon123")
//                .roles("Admin")
//                .build();
//        return new InMemoryUserDetailsManager(user1,user2);
//    }






}
