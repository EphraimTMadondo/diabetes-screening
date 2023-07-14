package com.zimttech.diabeticscreening.service.contacts;

import com.zimttech.diabeticscreening.entities.Contact;
import com.zimttech.diabeticscreening.persistence.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;
    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }
}
