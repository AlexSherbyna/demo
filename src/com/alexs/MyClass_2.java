package com.alexs;

 public  class   MyClass_2 extends AbClass  {
     private int a;

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     public void function_1(){
       if (a < 1500 || a > 1999) System.out.println("Fail_1");
       else {
           System.out.println(a/100+1);
           System.out.println("Vek");
       }
    }

}


  /*  void myClass_2_fun () {

        if ((a1 + a2 + a3 != 180) || (a1 == 0) || (a2 == 0) || (a3 == 0)) System.out.println("Not triangle");
         else   System.out.println("Triangle");
    }
    void show (String msg) {

        System.out.println( msg +" "+(a1+a2+a3));
    }
    void how(int a) {
        b4 = 1;
        arr[0] = a/100;
        arr[1] = (a/10)%10;
        arr[2] = a%10;
        if (arr[0] == arr[1]){
            if (arr[1] != arr[2])  b4+=1;
        } else  b4+=1;

        if (arr[0] != arr[2]) b4+=1;
        System.out.println("Число "+getA()+" содержит "+ b4+" разных  цифр");
    }
    void how( String msg) {
        super.drob_3();
        if(arr[0] != 0 &&(getA()%arr[0])== 0) System.out.println(msg + "Число делиться на " + arr[0]);
        if(arr[1] != 0 && (getA()%arr[1])== 0) System.out.println(msg + "Число делиться на " + arr[1]);
        if(arr[2] != 0 && (getA()%arr[2])== 0) System.out.println(msg + "Число делиться на " + arr[2]);
    }*/


