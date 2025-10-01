package br.unipar.exAulaSpring.database


import br.unipar.exAulaSpring.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

//Dizendo para o Spring Boot que essa interface é a camada repositória
@Repository
interface PessoasRepository : JpaRepository<Pessoa, Long> {
    //Herança da JPA com o nome da Entidade e o tipo da chave primária
}

