package com.alexs.Game_2;
import java.util.Scanner;

public class Game_2_Controler {

    Scanner scanner = new Scanner(System.in);

    private Game_2_Model gameModel;
    private Game_2_View gameView;
    private Read_Write read_write;
    private int userNumber;

    public  Game_2_Controler (Game_2_Model game_2_model, Game_2_View game_2_view, Read_Write read_write) {
        this.gameModel = game_2_model;
        this.gameView = game_2_view;
        this.read_write = read_write;
    }

    protected void gameStart() {

        gameView.showText(Dialog.SELECT);

        userNumber = scanner.nextInt();

        gameModel.lastNumberUser(userNumber);
        gameModel.cycle();
        gameView.showText(Dialog.START);
        gameView.showList(gameModel.arrayList);
        gameView.showText(Dialog.END);
        System.out.println("");


        read_write.addWriteFIle("D:\\Programming\\Demo\\src\\com\\alexs\\Game_2\\Resources\\filename.txt",gameModel.arrayList.toString());

        read_write.readFIle("D:\\Programming\\Demo\\src\\com\\alexs\\Game_2\\Resources\\filename.txt");


   }
}

