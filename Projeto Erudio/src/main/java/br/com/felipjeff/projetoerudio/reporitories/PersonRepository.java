package br.com.felipjeff.projetoerudio.reporitories;

import br.com.felipjeff.projetoerudio.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long>{

}
