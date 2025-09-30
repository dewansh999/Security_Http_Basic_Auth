package in.expedia.security;



import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/contact", "/swagger-ui.html").permitAll()
						.anyRequest().authenticated()
			)
				.httpBasic(withDefaults())
				.formLogin(withDefaults());
		return http.build();
	}
}
