package com.epam.repository;

import com.epam.model.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementCrudRepository extends CrudRepository<Advertisement, Long> {

    List<Advertisement> findAllByOrderByIdDesc();

}