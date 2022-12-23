package br.com.felipjeff.projetoerudio.services;

import br.com.felipjeff.projetoerudio.exceptions.ResourceNotFoundException;
import br.com.felipjeff.projetoerudio.models.Person;
import br.com.felipjeff.projetoerudio.reporitories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person buscarPessoaPorID(Long Id) throws Exception{
        return personRepository.findById(Id).orElseThrow(
                () -> new ResourceNotFoundException("ERRO: Pessoa com Encontrada com o id informado!"));
    }

    public List<Person> buscarTodasAsPessoas() throws Exception{
        return personRepository.findAll();
    }

    public Person salvarPessoa(Person person)throws Exception{
        return personRepository.save(person);
    }

    public Person ApagarPessoaPorID(Long Id)throws Exception{
        var personApagada = buscarPessoaPorID(Id);
        personRepository.deleteById(Id);
        return personApagada;
    }

    public Person AtualizarPessoaPorId(Long id, Person person) throws Exception{
        Person pessoa = buscarPessoaPorID(id);
        pessoa.setLastName(person.getLastName());
        pessoa.setFistName(person.getFistName());
        pessoa.setAddress(person.getAddress());
        pessoa.setGender(person.getGender());
        return personRepository.save(pessoa);
    }


}
