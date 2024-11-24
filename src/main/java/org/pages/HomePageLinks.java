package org.pages;

public enum HomePageLinks {


    IFRAMES("iframes");

    private String link;

    HomePageLinks(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return link;
    }


}
