package fi.jonij.localjardemothree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fi.jonij.jar.demo.*;

@SpringBootApplication
public class LocaljardemothreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocaljardemothreeApplication.class, args);
		
		// TEST IF LOCAL JAR WORKS
		int sum = Foo.calculateSum(3, 2);
		System.out.println("**************");
		System.out.println(sum);
		System.out.println("**************");
	}

}
