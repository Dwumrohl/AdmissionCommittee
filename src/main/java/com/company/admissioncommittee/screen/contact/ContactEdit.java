package com.company.admissioncommittee.screen.contact;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Contact;

@UiController("Contact.edit")
@UiDescriptor("contact-edit.xml")
@EditedEntityContainer("contactDc")
public class ContactEdit extends StandardEditor<Contact> {
}