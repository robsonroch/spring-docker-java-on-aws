package br.com.robson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.robson.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}