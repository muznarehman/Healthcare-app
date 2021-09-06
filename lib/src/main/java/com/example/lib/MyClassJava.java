package com.example.lib;

import java.util.ArrayList;

import static java.lang.StrictMath.ceil;

public class MyClassJava {


    public static void Method_Example(int score){
        if(score>=80){
            System.out.println("Congrats!! your grade is A");
        }
        else if(score>=70 && score<=79){
            System.out.println("Congrats!! your grade is B");

        }
        else if(score>=50 && score<=69){
            System.out.println("Congrats!! your grade is C");
        }
        else
        {
            System.out.println("sorry, you got an F");
        }
    }
    public static void main(String[] args){

        /*ngjbnfgf
        hmtmht
         */
        Method_Example(75);
        Method_Example(25);
        Method_Example(90);


    }
}