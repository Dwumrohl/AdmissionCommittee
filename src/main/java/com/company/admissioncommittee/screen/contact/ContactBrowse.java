package com.company.admissioncommittee.screen.contact;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Contact;

@UiController("Contact.browse")
@UiDescriptor("contact-browse.xml")
@LookupComponent("contactsTable")
public class ContactBrowse extends StandardLookup<Contact> {
}