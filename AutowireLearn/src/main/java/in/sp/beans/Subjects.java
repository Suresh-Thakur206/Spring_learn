package in.sp.beans;

import java.util.List;

public class Subjects {
    private List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        subjects = subjects;
    }

    @Override
    public String toString() {
        return subjects.toString();
    }
}
