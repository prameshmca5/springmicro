package repository;

import entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {

	Contacts findByName(String name);

	void deleteById(int id);
}
