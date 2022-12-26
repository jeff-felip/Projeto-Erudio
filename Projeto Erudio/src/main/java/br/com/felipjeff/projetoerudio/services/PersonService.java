package br.com.felipjeff.projetoerudio.services;

import br.com.felipjeff.projetoerudio.data.vo.v1.PersonVO;
import br.com.felipjeff.projetoerudio.exceptions.ResourceNotFoundException;
import br.com.felipjeff.projetoerudio.mapper.DozerMapper;
import br.com.felipjeff.projetoerudio.models.Person;
import br.com.felipjeff.projetoerudio.reporitories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonVO buscarPessoaPorID(Long Id) throws Exception{

        var Pessoa= personRepository.findById(Id) .orElseThrow(
                () -> new ResourceNotFoundException("ERRO: Pessoa com Encontrada com o id informado!"));
        return DozerMapper.parseObject(Pessoa, PersonVO.class);
    }

    public List<PersonVO> buscarTodasAsPessoas() throws Exception{
        return DozerMapper.parseListObjects(personRepository.findAll(), PersonVO.class);
    }

    public PersonVO salvarPessoa(PersonVO person)throws Exception{
        var entity = DozerMapper.parseObject(person, Person.class);
        return DozerMapper.parseObject(personRepository.save(entity), PersonVO.class);

    }

    public PersonVO ApagarPessoaPorID(Long Id)throws Exception{
        var personApagada = buscarPessoaPorID(Id);
        personRepository.deleteById(Id);
        return personApagada;
    }

    public PersonVO AtualizarPessoaPorId(Long id, PersonVO person) throws Exception{
        PersonVO pessoa = buscarPessoaPorID(id);
        pessoa.setLastName(person.getLastName());
        pessoa.setFirstName(person.getFirstName());
        pessoa.setAddress(person.getAddress());
        pessoa.setGender(person.getGender());
        return salvarPessoa(pessoa);
    }


}
