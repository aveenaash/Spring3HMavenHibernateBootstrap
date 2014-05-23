package com.hoabinash.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoabinash.app.dao.ContactDAO;
import com.hoabinash.app.model.Contact;

/**
 * Created by abastola on 5/23/14.
 */

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }
    @Transactional
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }
    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}