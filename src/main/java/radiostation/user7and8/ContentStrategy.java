package radiostation.user7and8;

public class ContentStrategy {
    private String targetedaudience,campaigntype,strategysummary;

    public ContentStrategy(String targetedaudience, String campaigntype, String strategysummary) {
        this.targetedaudience = targetedaudience;
        this.campaigntype = campaigntype;
        this.strategysummary = strategysummary;
    }

    public String getTargetedaudience() {
        return targetedaudience;
    }

    public void setTargetedaudience(String targetedaudience) {
        this.targetedaudience = targetedaudience;
    }

    public String getCampaigntype() {
        return campaigntype;
    }

    public void setCampaigntype(String campaigntype) {
        this.campaigntype = campaigntype;
    }

    public String getStrategysummary() {
        return strategysummary;
    }

    public void setStrategysummary(String strategysummary) {
        this.strategysummary = strategysummary;
    }

    @Override
    public String toString() {
        return "ContentStrategy{" +
                "targetedaudience='" + targetedaudience + '\'' +
                ", campaigntype='" + campaigntype + '\'' +
                ", strategysummary='" + strategysummary + '\'' +
                '}';
    }
}
