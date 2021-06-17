package com.example.android.mymiwok;

//this is a generic class that has 2 data members. one member
// representing the english word and the other is the micok translation for that word

public class Word {
    private String mDefalultTranslayion;
    private String mMiwokTranslation;

    public Word(String defalultTranslayion,String miwokTranslation){
        this.mDefalultTranslayion =defalultTranslayion;
        this.mMiwokTranslation =miwokTranslation;
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

}
