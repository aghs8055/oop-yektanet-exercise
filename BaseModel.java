public abstract class BaseModel {
    private int id;
    private int clicks;
    private int views;

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

    public abstract void describeMe();
}