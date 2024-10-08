package com.RTT._971.springCruddDemo.repository;

import com.RTT._971.springCruddDemo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@RepositoryRestResource(path= "tutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
        // Tutorial → Entity type and Long --> primary key
{
    //   findByPublished is a custom method()
    List<Tutorial> findByPublished(boolean published);
}


