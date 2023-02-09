package com.example.StudentLibrary;

public class UpdateBookPage {
    private int id;
    private int pages;

    public UpdateBookPage(){

    }
    public UpdateBookPage(int id,int pages){
        this.id=id;
        this.pages=pages;
    }
    public int getId() {
        return id;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }
}
