package com.alexs.Game_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game_4_Model {

    private int userNumber;
    private String userName;
    private String path = "D:\\Programming\\Demo\\src\\com\\alexs\\Game_4\\Resources\\UserData";

    Scanner scanner = new Scanner(System.in);
    List<Integer> listNumbers = new LinkedList<>();


    public Game_4_Model() {
    }

    protected void generateNumbers() {
        for (int i = userNumber; i <= userNumber + 18; i++) {
            listNumbers.add(i);
        }
    }

    protected void setUserNumber() {
            userNumber = scanner.nextInt();
    }

    protected void setUserName() {
            userName = scanner.nextLine();
    }

    protected void saveUserData() throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true)))
        {
            bw.write( "\n" +getUserName() +" " +"№" +getUserNumber() +" " +listNumbers);
        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    protected String getUserName() {
        return userName;
    }

    protected int getUserNumber() {
        return userNumber;
    }

    protected void closeScanner() {
        scanner.close();

    }

}
