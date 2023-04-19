package com.alexs.Game_2;

import java.io.*;


public class Read_Write {

        protected void readFIle (String fileName ) {

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {

                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        protected void writeFIle(String fileName,String text) {

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
            {

                bw.write(text );

            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }

        protected void addWriteFIle(String fileName,String text) {

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true)))
            {

                bw.write( "\n"+text);

            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    protected void clearFIle(String fileName) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {

            bw.write("");

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
