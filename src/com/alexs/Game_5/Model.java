package com.alexs.Game_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Model {
    private final int countNumbers = 25;
    private int userNumber = 0;
    private int iterator = 2;
    private int countStart = 1;


    ArrayList<Integer> bufferList = new ArrayList();
    //Path path = Paths.get("CountProgram.txt");
    File countProgram = new File("D:\\Programming\\Demo\\src\\com\\alexs\\Game_5\\Resources\\CountProgram.txt");
    File newFile = new File("D:\\Programming\\Demo\\src\\com\\alexs\\Game_5\\Resources\\"
                                   + "Program start "
                                   + getCountNumbersProgram()
                                   +".txt");

    Scanner scanner = new Scanner(System.in);

    protected void countStartProgram() {
        loadCountStart();
        System.out.println(getCountNumbersProgram());
        countStart ++;
        saveCountStart();
    }

    protected int getCountNumbersProgram() {
        loadCountStart();
        return countStart ;
    }

    protected void saveCountStart() {
        try (FileWriter bw = new FileWriter(countProgram)) {
            bw.write(countStart);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     protected void loadCountStart() {
        try (FileReader br = new FileReader(countProgram)) {
            if(countProgram.length() != 0) {
                countStart = br.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void generateNumbers()  {
        chekNumberSign();
        chekUserNumber();

        for (int j = 0; j < countNumbers; j++) {
            bufferList.add(userNumber);
            userNumber += iterator;
        }
        writeList(bufferList);
    }

    protected void setUserNumber() {
        userNumber = scanner.nextInt();
    }

    private void chekUserNumber() {
        if(userNumber % 2 == 0) {
            userNumber += 1;
        } else {
            userNumber +=2;
        }
    }

    private void chekNumberSign() {
        if(userNumber < 0) {
            iterator *= -1;
        }
    }

    private void writeList(List list)  {
        try (FileWriter fileWriter = new FileWriter(newFile))
        {
            fileWriter.write("\n" +list);
        }  catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
