package ao.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages =
{
    "ao.library.configs",
    "ao.library.controllers",
    "ao.library.mappers",
    "ao.library.repositories",
    "ao.library.services"
})
@EnableJpaRepositories(basePackages = "ao.library.repositories")
@SpringBootApplication
public class LibraryApiApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(LibraryApiApplication.class, args);
    }

}
