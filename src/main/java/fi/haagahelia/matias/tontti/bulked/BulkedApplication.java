package fi.haagahelia.matias.tontti.bulked;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.matias.tontti.bulked.domain.Food;
import fi.haagahelia.matias.tontti.bulked.domain.FoodRepository;

@SpringBootApplication
public class BulkedApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkedApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(FoodRepository repository) {
		return (args) -> {
			repository.save(new Food("Mozzarellapizza", 700, 30, 70, 50));
			repository.save(new Food("Big Mac", 600, 30, 60, 40));
		};
	}
}
