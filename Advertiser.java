public class Advertiser extends BaseModel {
    private String name;
    private static int totalClick;

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incClicks() {
        super.incClicks();
        totalClick++;
    }

    public static int getTotalClick() {
        return totalClick;
    }

    public void describeMe() {
        System.out.println("This class contains fields and methods for system advertisers.");
    }

    public static void help() {
        System.out.println("id: This unique field keep the id of advertiser in a int variable.\n" +
                "name: This field is name of advertiser and sort in String.\n" +
                "clicks: This field save the count of clicks of advertiser.\n" +
                "viwes: This field keep the count of views of advertiser.");
    }
}