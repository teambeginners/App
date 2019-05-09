package com.example.firstapp.models;



public class BestItemModel {

    private int companyLogo;
    String companyName, companyCat, offerShort, cdOffer;

    public BestItemModel(int imageView1, String textView1, String textView2, String textView3, String textView4) {
        this.companyLogo = imageView1;
        this.companyName = textView1;
        this.companyCat = textView2;
        this.offerShort = textView3;
        this.cdOffer = textView4;
    }

    public int getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {
        this.companyLogo = companyLogo;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCat() {
        return companyCat;
    }

    public void setCompanyCat(String companyCat) {
        this.companyCat = companyCat;
    }

    public String getOfferShort() {
        return offerShort;
    }

    public void setOfferShort(String offerShort) {
        this.offerShort = offerShort;
    }

    public String getCdOffer() {
        return cdOffer;
    }

    public void setCdOffer(String cdOffer) {
        this.cdOffer = cdOffer;
    }

}
