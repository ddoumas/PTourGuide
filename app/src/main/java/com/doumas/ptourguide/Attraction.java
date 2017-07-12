package com.doumas.ptourguide;


public class Attraction {

    /**
     * String resource ID for the title of the attraction
     */
    private int mTitleAttraction;

    /**
     * String resource ID for the description of the attraction
     */
    private int mDescriptionAttraction;

    /**
     * Image resource ID for the attraction
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Attraction(int titleAttraction, int descriptionAttraction, int imageResourceId) {
        mTitleAttraction = titleAttraction;
        mDescriptionAttraction = descriptionAttraction;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the title of the attraction.
     */
    public int getTitleAttraction() {
        return mTitleAttraction;
    }

    /**
     * Get the string resource ID for the description of the attraction.
     */
    public int getDescriptionAttraction() {
        return mDescriptionAttraction;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction;
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

