package br.com.felipjeff.projetoerudio.controllers;
import br.com.felipjeff.projetoerudio.exceptions.ResourceNotFoundException;
import br.com.felipjeff.projetoerudio.models.Person;
import br.com.felipjeff.projetoerudio.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public Person findPeronById(@PathVariable Long id)throws Exception{
        return personService.buscarPessoaPorID(id);
    }

    @GetMapping("/person")
    public List<Person> findAllPerson()throws Exception {
        return personService.buscarTodasAsPessoas();
    }

    @PostMapping("/person")
    public Person SavePerson(@RequestBody Person person)throws Exception{
        return personService.salvarPessoa(person);
    }

    @DeleteMapping("/person/{id}")
    public Person DeletePersonById(@PathVariable Long id)throws Exception{
        return personService.ApagarPessoaPorID(id);
    }

    @PutMapping("/person/{id}")
    public Person UpdatePersonByid(@PathVariable Long id, @RequestBody Person person) throws Exception{
        return personService.AtualizarPessoaPorId(id, person);
    }


}
