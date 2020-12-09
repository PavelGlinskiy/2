package by.course;

public class Schedule {
    private String timePeriod;
    private String lessonName;
    private String lessonDay;

    public Schedule(){}

    public Schedule(String timePeriod, String lessonName, String lessonDay) {
        this.timePeriod = timePeriod;
        this.lessonName = lessonName;
        this.lessonDay = lessonDay;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonDay() {
        return lessonDay;
    }

    public void setLessonDay(String lessonDay) {
        this.lessonDay = lessonDay;
    }
}
