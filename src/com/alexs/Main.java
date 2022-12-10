package com.alexs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

       // new Fors();
        ArrayList<MailData> ar = new ArrayList<MailData>(50);
        LinkedList<MailData> md;



//        md.add(new MailData("Ola","Fing","ola@google.com","1259"));
//        md.add(new MailData("Faa","Gint","Faa@google.com","3289"));

        ar.add(new MailData("Ola","Fing","ola@google.com","1259"));
        ar.add(new MailData("Faa","Gint","Faa@google.com","3289"));
        ar.add(new MailData("rfraa","asdasdGint","asdadFaa@google.com","32289"));

        md = new LinkedList<MailData>(ar);
        System.out.println(md);
        System.out.println(md.size());


        System.out.println(ar);
        System.out.println(ar.size());





       
//        System.out.println(System.nanoTime());
//        ProcessBuilder p = new ProcessBuilder("calc");
//        try {
//            p.start();
//        } catch (Exception e){
//            System.out.println("Fail");
//        }


    }
}

