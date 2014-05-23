package com.hoabinash.app.dao;

/**
 * Created by abastola on 5/23/14.
 */
import java.util.List;
import com.hoabinash.app.model.Contact;

public interface ContactDAO {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
