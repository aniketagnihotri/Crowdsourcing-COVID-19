package org.indigo.databaseoperations;

/*
 * Class for holding the details for BusinessData.
 */
public class BusinessData {

    private String id;
    private boolean sponsored;
    private int numReviews;
    private double rating;
    private boolean claimed;
    private String user;
    private String businessResponse;
    private String dateTime;

    public BusinessData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isSponsored() {
        return sponsored;
    }

    public void setSponsored(boolean sponsored) {
        this.sponsored = sponsored;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBusinessResponse() {
        return businessResponse;
    }

    public void setBusinessResponse(String businessResponse) {
        this.businessResponse = businessResponse;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}
