package ua.mytestprojects.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mytestprojects.springapp.entity.BaseEntity;

import java.io.Serializable;

public interface BaseRepository <T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID> {
    void delete(T entity);
}
