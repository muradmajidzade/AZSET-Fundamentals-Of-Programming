package Homework01;

public class Program {
    private String title;
    private int credits;
    private String courseLanguage;
    private String location;

    public Program(String title, int credits, String courseLanguage, String location) {
        this.title = title;
        this.credits = credits;
        this.courseLanguage = courseLanguage;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String ftitle) {
        this.title = ftitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int fcredits) {
        this.credits = fcredits;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String fcourseLanguage) {
        this.courseLanguage = fcourseLanguage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String flocation) {
        this.location = flocation;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Credits: " + credits + ", Language: " + courseLanguage + ", Location: " + location;
    }

    public String getDisplayName() {
        return title + " (at Campus " + location + ")";
    }
}
