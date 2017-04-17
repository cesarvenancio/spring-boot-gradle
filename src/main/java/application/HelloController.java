package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloController {

    private final JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Test!";
    }
    
    @RequestMapping("/facebook")
    public String indexFacebookAccess() {
        return "Greetings Facebook!";
    }
    
    @RequestMapping("/unauthenticated")
    public String unauthenticated() {
      return "Not authenticated";
    }
    
    @RequestMapping("/github")
    public String indexGithubAccess() {
        return "Greetings Github!";
    }

    @Autowired
    public HelloController(JdbcTemplate jdbcTemplate){
    	this.jdbcTemplate = jdbcTemplate;
    }


}
