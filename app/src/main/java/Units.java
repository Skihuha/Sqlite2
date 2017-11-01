/**
 * Created by Samson Kihuha on 11/1/2017.
 */

public class Units {
        int unit_id;
        String unit_name;
        String course_name;
        int year;
        String created_at;

        // constructors
        public Units() {
        }

        public Units(String course_name, int year) {
            this.course_name = course_name;
            this.year = year;
        }

        public Units(int unit_id, String course_name,String unit_name, int year ) {
            this.unit_id = unit_id;
            this.course_name = course_name;
            this.year = year;
            this.unit_name = unit_name;
        }

        // setters
        public void setCourse_id(int course_id) {
            this.unit_id = unit_id;
        }

        public void setCourse_name(String course_name) {
            this.course_name = course_name;
        }

        public void setUnit_name(String unit_name) {
            this.unit_name = unit_name;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setCreatedAt(String created_at){
            this.created_at = created_at;
        }

        // getters
        public long getUnit_Id() {
            return this.unit_id;
        }

        public String getCourse_name() {
            return this.course_name;
        }
        public String getUnit_name() {
            return this.unit_name;
        }

        public int getYear() {
            return this.year;
        }
}
