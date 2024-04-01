package ma.emsi.studentsapp.repository;

import ma.emsi.studentsapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
