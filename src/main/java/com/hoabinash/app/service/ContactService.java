package com.hoabinash.app.service;

import java.util.List;
import com.hoabinash.app.model.Contact;

/**
 * Created by abastola on 5/23/14.
 */

public interface ContactService {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
