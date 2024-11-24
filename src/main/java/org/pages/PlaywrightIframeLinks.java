package org.pages;

public enum PlaywrightIframeLinks {


    GITHUB("https://github.com/microsoft/playwright");
    private String link;

    PlaywrightIframeLinks(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return link;
    }


}
