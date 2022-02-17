/* Author: Alec Soudry
 * Date Written: 2/16/22
 * This portion of the application creates the Student class and accompanying variables, creating both a default 
 * constructor as well as using the 'this' constructor call to invoke the current class constructor. Then using multiple
 * set and get methods to retrieve values from the class and store them. Finally, using the ToString function to
 * return the output from the StudentArray as a string.
 */

public class Student {
	
        private String firstName;
        private String lastName;
        private String ID;
        private String major;
        private float GPA;
        
        public Student() {
        	this.firstName = "FNU";
            this.lastName = "LNU";
            this.ID = "M000000000";
            this.major = "Undeclared";
            this.GPA = 0;
        }
        
        public Student(String firstName, String lastName, String ID, String major, float GPA) {
        		super();
                this.firstName = firstName;
                this.lastName = lastName;
                this.ID = ID;
                this.major = major;
                this.GPA = GPA;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public String getMajor() {
        	return major;
        }
        public void setMajor(String major) {
        	this.major = major;
        }
        public float
        getGPA() {
                return GPA;
        }

        public void setGPA(float GPA) {
                this.GPA = GPA;
        }
        
        @Override
        public String toString() {
        		return lastName + ", " + firstName + " " + ID;
        }
}

