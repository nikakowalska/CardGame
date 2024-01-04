package pl.dicedev.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

}
//com.game wykracza poza obszar dzialania @componentScan
//wazne ---- umieszczenie wszyystkiego wewnatrz glownego pakietu czyli tu pl.dicedev.game