package br.com.felipjeff.projetoerudio.controllers;
import br.com.felipjeff.projetoerudio.data.vo.v1.PersonVO;
import br.com.felipjeff.projetoerudio.models.Person;
import br.com.felipjeff.projetoerudio.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("api/person/v1/{id}")
    public PersonVO findPeronById(@PathVariable Long id)throws Exception{
        return personService.buscarPessoaPorID(id);
    }

    @GetMapping("api/person/v1")
    public List<PersonVO> findAllPerson()throws Exception {
        return personService.buscarTodasAsPessoas();
    }

    @PostMapping("api/person/v1")
    public PersonVO SavePerson(@RequestBody PersonVO person)throws Exception{
        return personService.salvarPessoa(person);
    }

    @DeleteMapping("api/person/v1/{id}")
    public PersonVO DeletePersonById(@PathVariable Long id)throws Exception{
        return personService.ApagarPessoaPorID(id);
    }

    @PutMapping("api/person/v1/{id}")
    public PersonVO UpdatePersonByid(@PathVariable Long id, @RequestBody PersonVO person) throws Exception{
        return personService.AtualizarPessoaPorId(id, person);
    }


}
