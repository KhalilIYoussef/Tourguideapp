package khaliliyoussef.tourguideapp.model;

public class Location {
    private String mName;
    private String mAddress;
    private String mHours;
    private String mPhoneNumber;
    private String mDescription;
    private int mImageId ;




    public Location(String name, String address, String hours, String phoneNumber, String description) {
        mName = name;
        mAddress = address;
        mHours = hours;
        mPhoneNumber = phoneNumber;
        mDescription = description;
    }

    public Location(String name, String address, String hours, String phoneNumber, String description, int imageId) {
        mName = name;
        mAddress = address;
        mHours = hours;
        mPhoneNumber = phoneNumber;
        mDescription = description;
        mImageId = imageId;
    }


    public String getLocationName() {
        return mName;
    }
    public String getLocationAddress() {
        return mAddress;
    }
    public String getLocationHours() {
        return mHours;
    }
    public String getPhoneNumber() {
        return mPhoneNumber;
    }
    public String getDescription() {
        return mDescription;
    }
//    public boolean hasImage() {
//        return mImageId ;
//    }
    public int getImageResourceId() {
        return mImageId;
    }
}
