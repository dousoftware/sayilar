package com;

public class sayilar {
    public static void main(String[] args) {

        // 0'la 100 arasindaki sayılarda
        //5'e bölünenleri X
        //3'e bölünenleri Y
        // 3'e ve 5'e bölünmeyen sayıların kendisini ekrana yazdıran program
        for (int x = 0; x < 100; x++ ){
            if (x%5==0 ) {
                System.out.println("X");
            }else{
                System.out.println(x);
            }
        }for (int y = 0; y <100; y++){
            if (y%3==0){
                System.out.println("Y");
            }else{
                System.out.println(y);
            }
        }
    }
}


