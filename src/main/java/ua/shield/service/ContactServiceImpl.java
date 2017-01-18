package ua.shield.service;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.shield.entity.Contact;

import java.util.List;

/**
 * Created by sa on 17.01.17.
 */
@Service("contactService")
@Transactional
@Repository
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public List<Contact> findAll() {
        return Lists.newArrayList(contactRepository.findAll());
    }

    @Override
    public List<Contact> findByFirstName(String name) {
        return contactRepository.findByFirstName(name);
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findOne(id);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);

    }

    @Override
    public void delete(Contact contact) {
        contactRepository.delete(contact);
    }
}
