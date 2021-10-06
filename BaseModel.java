public class BaseModel {
    private int id;
    private int clicks;
    private int views;

    public BaseModel() {
        this.clicks = 0;
        this.views = 0;
    }

    public BaseModel(int id) {
        this.id = id;
        this.clicks = 0;
        this.views = 0;
    }

    public void incClicks() {
        this.clicks++;
    }

    public void incViews() {
        this.views++;
    }

    public int getClicks() {
        return this.clicks;
    }

    public int getViews() {
        return this.views;
    }

    public void describeMe() {
        System.out.println("This class is the base model for Ad and Advertiser classes.");
    }
}
