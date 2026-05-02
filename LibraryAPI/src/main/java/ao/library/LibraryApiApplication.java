package ao.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ao.library.repositories")
public class LibraryApiApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(LibraryApiApplication.class, args);
    }

}
