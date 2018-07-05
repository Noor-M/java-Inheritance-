package com.example.android.inheritance;

public class ScienceFictionBook extends Book {
    ScienceFictionBook(){
        info(10);
    }


    @Override
    public void info(int number) {
        super.info(number);
    }
}
