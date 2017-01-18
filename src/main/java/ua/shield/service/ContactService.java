package ua.shield.service;

import ua.shield.entity.Contact;

import java.util.List;

/**
 * Created by sa on 17.01.17.
 */
public interface ContactService {
    List<Contact> findAll();
    List<Contact> findByFirstName(String name);
    Contact findById(Long id);
    void save(Contact contact);
    void delete(Contact contact);
}
