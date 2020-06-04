package com.example.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResource_id=NO_IMAGE;

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    private int  mAudioResourceId;
    private final static int NO_IMAGE=-1;

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int AudioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mAudioResourceId=AudioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResource_id,int AudioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResource_id=imageResource_id;
        this.mAudioResourceId=AudioResourceId;

    }

    public int getImageResource_id() {
        return imageResource_id;
    }

    public void setImageResource_id(int imageResource_id) {
        this.imageResource_id = imageResource_id;
    }

    public boolean hasImage(){
        return NO_IMAGE!=imageResource_id;

    }


}

