package radiostation.user7and8;

public class WriteScript {
    private String scripttitle, script;

    public WriteScript(String scripttitle, String script) {
        this.scripttitle = scripttitle;
        this.script = script;
    }

    public String getScripttitle() {
        return scripttitle;
    }

    public void setScripttitle(String scripttitle) {
        this.scripttitle = scripttitle;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "WriteScript{" +
                "scripttitle='" + scripttitle + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
}
