package com.udacity.poodlebytes.tourgreenville;

public class DataSchema {

    /**
    @PARAM fields used for each of the venues
    no overloads needed!
     */
    private String mName;
    private String mCategory;
    private String mText;
    private String mAddress;
    private String mPhone;
    private String mMapUrl;
    private String mWebsite;
    private int mImage;

    public DataSchema(  String mName,
                        String mCategory,
                        String mText,
                        String mAddress,
                        String mPhone,
                        String mMapUrl,
                        String mWebsite,
                        int mImage){
            this.mName=mName;
            this.mCategory=mCategory;
            this.mText=mText;
            this.mAddress=mAddress;
            this.mPhone=mPhone;
            this.mMapUrl=mMapUrl;
            this.mWebsite=mWebsite;
            this.mImage = mImage;}


     //GET functions

    public String getName() {
        return mName;
    }

    public String getCategory() {
        return mCategory;
    }

    public String getText() {
        return mText;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getMapUrl() {
        return mMapUrl;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public int getImage() {
        return mImage;
    }
}

