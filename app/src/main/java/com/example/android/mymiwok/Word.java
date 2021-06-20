package com.example.android.mymiwok;

//this is a generic class that has 2 data members. one member
// representing the english word and the other is the micok translation for that word

public class Word {
    private String mDefalultTranslayion;
    private String mMiwokTranslation;
    private static final int NOIMAGEPROVIDED=-1;
    private int mImageResourceId = NOIMAGEPROVIDED;
    private int mAudioResourceId;

    public Word(String defalultTranslayion,String iwokTranslation,int AudioResourceId){
        this.mDefalultTranslayion =defalultTranslayion;
        this.mMiwokTranslation =iwokTranslation;
        this.mAudioResourceId=AudioResourceId;
    }
    public Word(String defalultTranslayion,String iwokTranslation,int ImageResourceId,int AudioResourceId){
        this.mDefalultTranslayion =defalultTranslayion;
        this.mMiwokTranslation =iwokTranslation;
        this.mImageResourceId=ImageResourceId;
        this.mAudioResourceId=AudioResourceId;
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

    public boolean hasImage(){
         return mImageResourceId != NOIMAGEPROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
