package ru.gosarcho.digitqueryspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gosarcho.digitqueryspring.entity.Affair;

@Repository
public interface AffairRepository extends JpaRepository<Affair, Long> {

}