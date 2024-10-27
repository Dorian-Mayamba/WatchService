package uk.movie.WatchService;

import org.springframework.boot.SpringApplication;

public class TestWatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(WatchServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
