package com.acerolla.bouquiniste.data.advert.entity;

import com.acerolla.bouquiniste.data.utils.db.DbHelper;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Evgeniy Solovev
 * Date: 25.05.2018
 * Email: solevur@gmail.com
 */
@DatabaseTable(tableName = DbHelper.TABLE_ADVERTS)
public class AdvertData {

    @DatabaseField(id = true, columnName = "id")
    private int mId;

    @DatabaseField(columnName = "title")
    private String mTitle;

    @DatabaseField(columnName = "author")
    private String mAuthor;

    @DatabaseField(columnName = "description")
    private String mDescription;

    @DatabaseField(columnName = "price")
    private float mPrice;

    @DatabaseField(columnName = "phone")
    private String mPhone;

    @DatabaseField(columnName = "status")
    private String mStatus;

    @DatabaseField(columnName = "category_id")
    private int mCategoryId;

    @DatabaseField(columnName = "user_id")
    private int mUserId;

    @DatabaseField(columnName = "image")
    private String mImage;

    @DatabaseField(columnName = "is_favorite")
    private boolean mFavorite;

    @DatabaseField(columnName = "location")
    private String mLocation;

    public AdvertData() {

    }

    public AdvertData(int id, String title, String author, String description, float price, String phone, String status, int categoryId, String image, boolean isFavorite, String location) {
        mId = id;
        mTitle = title;
        mAuthor = author;
        mDescription = description;
        mPrice = price;
        mPhone = phone;
        mStatus = status;
        mCategoryId = categoryId;
        mImage = image;
        mFavorite = isFavorite;
        mLocation = location;
    }

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDescription() {
        return mDescription;
    }

    public float getPrice() {
        return mPrice;
    }

    public String getPhone() {
        return mPhone;
    }

    public String getStatus() {
        return mStatus;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public int getUserId() {
        return mUserId;
    }

    public String getImage() {
        return mImage;
    }

    public boolean isFavorite() {
        return mFavorite;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public void setmCategoryId(int mCategoryId) {
        this.mCategoryId = mCategoryId;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public void setmFavorite(boolean mFavorite) {
        this.mFavorite = mFavorite;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }
}
