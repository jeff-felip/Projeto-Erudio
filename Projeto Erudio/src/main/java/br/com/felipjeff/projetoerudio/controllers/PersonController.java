package br.com.felipjeff.projetoerudio.controllers;
import br.com.felipjeff.projetoerudio.data.vo.v1.PersonVO;
import br.com.felipjeff.projetoerudio.models.Person;
import br.com.felipjeff.projetoerudio.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "api/person/v1/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public PersonVO findPeronById(@PathVariable Long id)throws Exception{
        return personService.buscarPessoaPorID(id);
    }

    @GetMapping(value = "api/person/v1",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<PersonVO> findAllPerson()throws Exception {
        return personService.buscarTodasAsPessoas();
    }

    @PostMapping(value = "api/person/v1",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public PersonVO SavePerson(@RequestBody PersonVO person)throws Exception{
        return personService.salvarPessoa(person);
    }

    @DeleteMapping(value = "api/person/v1/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public PersonVO DeletePersonById(@PathVariable Long id)throws Exception{
        return personService.ApagarPessoaPorID(id);
    }

    @PutMapping(value = "api/person/v1/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public PersonVO UpdatePersonByid(@PathVariable Long id, @RequestBody PersonVO person) throws Exception{
        return personService.AtualizarPessoaPorId(id, person);
    }


}
