package com.sandeep.retrofit.model;

/**
 * Created by sandeep on 24/5/16.
 */
public class ContactsModel {
    public Contacts contacts;

    public class Contacts {
        public String id;
        public String name;
        public String email;
        public String address;
        public String gender;
        public Phone phone;
    }

    public class Phone {
        public String mobile;
        public String home;
        public String office;
    }
}
