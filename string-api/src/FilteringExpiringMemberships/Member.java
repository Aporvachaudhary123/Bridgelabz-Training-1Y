package FilteringExpiringMemberships;

import java.time.LocalDate;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " - Expiry: " + expiryDate;
    }
}
