package com.company;



//sending mediafiles
public class YandexFacade {
    private WebSpider_subsystem webSpider=new WebSpider_subsystem();
    private Links_subsystem links=new Links_subsystem();

    public void search() {
        webSpider.scanWebPages();
        webSpider.indexing();
        links.findInfo();
        links.showHyperlinks();
    }

    public YandexFacade() {
    }
}
