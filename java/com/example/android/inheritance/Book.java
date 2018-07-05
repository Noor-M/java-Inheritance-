package com.example.android.inheritance;

import android.util.Log;
//discreptions are clea
public class Book {
    String author;
    int numberOfBooks;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void info(){
        setAuthor("shakespeare");
        String authorName = getAuthor();
        Log.d("infoOne", "info:" + authorName + " is the author ");


    }

    public void info(int number){
        setAuthor("shakespeare");
        setNumberOfBooks(number);
        int bookNumber=getNumberOfBooks();
        String authorName = getAuthor();
        Log.d("infoTwo", "info: "+authorName+" is the author and we have "+ bookNumber +"books");

    }



}
