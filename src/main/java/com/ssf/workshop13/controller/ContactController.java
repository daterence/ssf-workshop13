package com.ssf.workshop13.controller;

import com.ssf.workshop13.model.Contact;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);

    @GetMapping("/contact")
    public String showGenerateForm(Model model) {
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact";
    }
    @PostMapping("/contact")
    public String GenerateContact(@ModelAttribute Contact contact, Model model) {
        logger.info("From the form, name is: " + contact.getName());
        logger.info("From the form, phone number is: " + contact.getPhoneNo());
        logger.info("From the form, email address is: " + contact.getEmailAdd());

        String name = contact.getName();
        String phoneNo = contact.getPhoneNo();
        String emailAdd = contact.getEmailAdd();
        model.addAttribute("name", name);
        model.addAttribute("phoneNo", phoneNo);
        model.addAttribute("emailAdd", emailAdd);

        return "contact";
    }
}
