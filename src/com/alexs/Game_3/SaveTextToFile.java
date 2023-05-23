package com.alexs.Game_3;

import java.io.*;

public class SaveTextToFile  implements SaveText {

    Game_3_Model game_3_model;
    Game_3_View game_3_view ;

    public SaveTextToFile(Game_3_Model game_3_model, Game_3_View game_3_view) {
        this.game_3_model = game_3_model;
        this.game_3_view = game_3_view;
    }

    @Override
    public void saveText(String fileName,String text) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true)))
        {
            bw.write( "\n" +game_3_view.saveTextToFile(Dialog.USERNUMBER) +" " +game_3_model.getUserNumber() +" " +text  );
        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
