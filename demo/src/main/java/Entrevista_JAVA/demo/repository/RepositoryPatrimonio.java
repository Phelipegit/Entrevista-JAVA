package Entrevista_JAVA.demo.repository;

import Entrevista_JAVA.demo.entity.EntityPatrimonio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryPatrimonio extends JpaRepository<EntityPatrimonio, UUID> {
}
