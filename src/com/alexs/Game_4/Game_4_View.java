package com.alexs.Game_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Game_4_View {
    BufferedReader reader = new BufferedReader(new FileReader("D:\\Programming\\Demo\\src\\com\\alexs\\Game_4\\Resources\\Data"));

    public Game_4_View() throws FileNotFoundException {
    }

    protected void showNumberList(List list) {
        System.out.println(list.toString());
    }

    protected void showText(String filter) throws IOException {

        while (reader.ready()) {
            String str = reader.readLine();
            if (str.contains(filter)) {
                System.out.println(str.replaceFirst(filter,"")
                                      .trim());
                break;
            }
        }
    }
    protected void closeReader() throws IOException {
        reader.close();

    }


}
