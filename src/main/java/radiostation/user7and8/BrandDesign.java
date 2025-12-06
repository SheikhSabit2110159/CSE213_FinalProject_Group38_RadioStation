package radiostation.user7and8;

public class BrandDesign {
    private String logofile, logoshape, themecolor,tagline;

    public BrandDesign(String logofile, String logoshape, String themecolor, String tagline) {
        this.logofile = logofile;
        this.logoshape = logoshape;
        this.themecolor = themecolor;
        this.tagline = tagline;
    }

    public String getLogofile() {
        return logofile;
    }

    public void setLogofile(String logofile) {
        this.logofile = logofile;
    }

    public String getLogoshape() {
        return logoshape;
    }

    public void setLogoshape(String logoshape) {
        this.logoshape = logoshape;
    }

    public String getThemecolor() {
        return themecolor;
    }

    public void setThemecolor(String themecolor) {
        this.themecolor = themecolor;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @Override
    public String toString() {
        return "BrandDesign{" +
                "logofile='" + logofile + '\'' +
                ", logoshape='" + logoshape + '\'' +
                ", themecolor='" + themecolor + '\'' +
                ", tagline='" + tagline + '\'' +
                '}';
    }
}
