package Lab4;

import java.util.Objects;

public class SalePerson implements Comparable<SalePerson>{
    private final String firstName;
    private final String lastName;
    private final int totalSales;
    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return lastName + "," + firstName + " : " + totalSales;
    }

    public boolean equals(SalePerson o) {
        return Objects.equals(o.firstName, this.firstName) && Objects.equals(o.lastName, this.firstName);
    }
    public int compareTo(SalePerson o) {
        if(o.totalSales > this.totalSales) return -1;
        else if (o.totalSales == this.totalSales) {
            return o.lastName.compareTo(this.lastName);
        }
        else return 1;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }
}
