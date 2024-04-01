package ma.emsi.studentsapp;

import ma.emsi.studentsapp.entities.Product;
import ma.emsi.studentsapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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

		List<Product> products = productRepository.findAll();
		products.forEach(p->{
					System.out.println(p.toString());


				});
		//Recherche
		Product prod1=productRepository.findById(Long.valueOf(1)).get();
		System.out.println("Prod 1 : "+ prod1.getName());
		System.out.println("Prod 1 : Price : "+ prod1.getPrice());

		//Maj
		Product produit1 = productRepository.findById(Long.valueOf(1)).orElse(null);
		if (produit1 != null) {
			// Modifier les propriétés du produit
			prod1.setName("Ordinateur");
			prod1.setPrice(1000);
			prod1.setQuantity(200);

			// Enregistrer les modifications
			productRepository.save(prod1);

			// Afficher les informations mises à jour
			System.out.println("Prod 1 (après modification) : " + produit1.toString());
			System.out.println("Prod 1 (après modification) : Price : " + produit1.getPrice());
		}
		else {
			System.out.println("Produit introuvable.");
		}


		//Suppression
		Product produit4 = productRepository.findById(Long.valueOf(4)).orElse(null);
		if(produit4 != null){
			System.out.println("Le produit 4 va etre supprimé");
			productRepository.deleteById(produit4.getId());
			System.out.println("Le produit 4 est supprimé");
		}
		else System.out.println("Le produit 4 est introuvable");


	}


		


}

