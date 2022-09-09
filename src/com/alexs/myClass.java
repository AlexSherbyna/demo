package com.alexs;



public class myClass {
    private Integer a;
    private Integer b;
    private Integer c;
    private String tableResolt[][];


    public myClass(){
        tableResolt = new String[11][3];
        this.namePlayers();
    }


    public void  setTableResolt(String tableResolt[][]) {
        this.tableResolt = tableResolt;
    }



    public void setA(int a1) {this.a = a1;}
    public int getA() {
        return a;
    }
    public void setB(int b1) {this.b = b1;}
    public int getB() {
        return b;
    }
    public void setС(int c1) {this.c = c1;}
    public int getC() {
        return c;
    }

    public void namePlayers(){
        tableResolt[0][0] = "Game ";
        tableResolt[0][1] = "P1 ";
        tableResolt[0][2] = "P2 ";
    }

   public String[][] getTableResolt(){
        return tableResolt;
   }


}
