package ma.emsi.studentsapp;

import ma.emsi.studentsapp.entities.Product;
import ma.emsi.studentsapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsAppApplication implements CommandLineRunner {
	@Autowired
	public ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		productRepository.save(new Product(null,"computer",6000,6));
		productRepository.save(new Product(null,"printer",4000,4));
		productRepository.save(new Product(null,"smart phone",7000,3));



		Product p=new Product();
		p.setName("Computer");
		p.setPrice(500);
		p.setQuantity(6);
		productRepository.save(p);



		// Gestion Hopital

	}
}
