package com.example.android.mymiwok;

//this is a generic class that has 2 data members. one member
// representing the english word and the other is the micok translation for that word

public class Word {
    private String mDefalultTranslayion;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word(String defalultTranslayion,String iwokTranslation){
        this.mDefalultTranslayion =defalultTranslayion;
        this.mMiwokTranslation =iwokTranslation;
    }
    public Word(String defalultTranslayion,String iwokTranslation,int ImageResourceId){
        this.mDefalultTranslayion =defalultTranslayion;
        this.mMiwokTranslation =iwokTranslation;
        this.mImageResourceId=ImageResourceId;
    }

    public  void setmDefalultTranslayion (String defalultTranslayion){
        this.mDefalultTranslayion =defalultTranslayion;
    }

    public String getmDefalultTranslayion(){
        return mDefalultTranslayion;
    }

    public void setmMiwokTranslation(String miwokTranslation){
        this.mMiwokTranslation=miwokTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public void setmImageResourceId(int image){
        this.mImageResourceId=image;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
