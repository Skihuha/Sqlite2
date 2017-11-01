/**
 * Created by Samson Kihuha on 11/1/2017.
 */

public class Info {
    int id;
    String firstname;
    String lastname;
    int year;
    String created_at;

    // constructors
    public Info() {
    }

    public Info(String firstname, int year) {
        this.firstname = firstname;
        this.year = year;
    }

    public Info(int id, String firstname,String lastname, int year ) {
        this.id = id;
        this.firstname = firstname;
        this.year = year;
        this.lastname = lastname;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setlastname(String lastname) {
        this.firstname = firstname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    // getters
    public long getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }

    public int getYear() {
        return this.year;
    }
}

