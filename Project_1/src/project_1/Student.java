package project_1;

public class Student {
    int[] id = new int[100];
    String[] name = new String[100];
    String[] intake = new String[100];
    String[] section = new String[100];

    protected int getId(String name) {
        int matchedId = -1;
        for (int i = 0; i < this.name.length; i++) {
            if (name.equalsIgnoreCase(this.name[i])) {
                matchedId = i;
                break;
            }
        }
        return matchedId;
    }

    protected String getName(int index) {
        return name[index];
    }

    protected String getIntake(int index) {
        return intake[index];
    }

    protected String getSection(int index) {
        return section[index];
    }
    
    protected void setInfo(int id, String name, String intake, String section){
        this.id[id] = id;
        this.name[id] = name;
        this.intake[id] = intake;
        this.section[id] = section;
    }
    
}
