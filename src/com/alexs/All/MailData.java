package com.alexs.All;

public class MailData {
    private String name;
    private String secondName;
    private String mail;
    private String postCode;

    MailData(String name,String secondName, String mail, String postCode) {
        this.name = name;
        this.secondName = secondName;
        this.mail = mail;
        this.postCode = postCode;
    }
    public String toString() {
        return  "\n"
                +name +" "
                +secondName +"\n"
                +mail +"\n"
                +postCode;
    }
}
