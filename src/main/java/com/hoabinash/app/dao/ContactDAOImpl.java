package com.hoabinash.app.dao;

import java.util.List;
import com.hoabinash.app.model.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by abastola on 5/23/14.
 */
@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }
    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
    }
}
