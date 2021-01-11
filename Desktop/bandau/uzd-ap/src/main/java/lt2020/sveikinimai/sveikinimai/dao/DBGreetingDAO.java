package lt2020.sveikinimai.sveikinimai.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lt2020.sveikinimai.sveikinimai.model.Greeting;

public interface DBGreetingDAO extends JpaRepository<Greeting, Long> {

}
