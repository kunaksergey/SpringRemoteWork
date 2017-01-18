package ua.shield.service;

import org.springframework.data.repository.CrudRepository;
import ua.shield.entity.Contact;

import java.util.List;

/**
 * Created by sa on 17.01.17.
 */
public interface ContactRepository extends CrudRepository<Contact,Long>{
    List<Contact> findByFirstName(String name);
}
