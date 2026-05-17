package Entrevista_JAVA.demo.repository;

import Entrevista_JAVA.demo.entity.EntityEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RepositoryEstabelecimento extends JpaRepository<EntityEstabelecimento, UUID> {
    Optional<EntityEstabelecimento> findByCnpj(String cnpj);
}
