package com.epam.repository;

import com.epam.model.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface AdvertismentCrudRepository extends CrudRepository<Advertisement, Long> {
    List<Advertisement> findByAuthor(@Param("author") String name);

    List<Advertisement> findByAuthorOrderByEmail(@Param("value") String name);
}

//Collections resources support both GET and POST. All other HTTP methods cause a 405 Method Not Allowed