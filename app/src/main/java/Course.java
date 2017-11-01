/**
 * Created by Samson Kihuha on 11/1/2017.
 */

public class Course {
    int course_id;
    String course_name;
    String school;
    int year;
    String created_at;

    // constructors
    public Course() {
    }

    public Course(String course_name, int year) {
        this.course_name = course_name;
        this.year = year;
    }

    public Course(int course_id, String course_name,String school, int year ) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.year = year;
        this.school = school;
    }

    // setters
    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    // getters
    public long getcourse_Id() {
        return this.course_id;
    }

    public String getCourse_name() {
        return this.course_name;
    }
    public String getSchool() {
        return this.school;
    }

    public int getYear() {
        return this.year;
    }
}

