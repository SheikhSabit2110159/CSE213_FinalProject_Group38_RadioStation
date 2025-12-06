package radiostation.user7and8;

public class DevelopPrograms {
    private String programidea;

    public DevelopPrograms(String programidea) {
        this.programidea = programidea;
    }

    public String getProgramidea() {
        return programidea;
    }

    public void setProgramidea(String programidea) {
        this.programidea = programidea;
    }

    @Override
    public String toString() {
        return "DevelopPrograms{" +
                "programidea='" + programidea + '\'' +
                '}';
    }
}
