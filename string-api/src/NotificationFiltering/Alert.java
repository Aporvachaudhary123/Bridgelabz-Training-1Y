package NotificationFiltering;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return type + " : " + message;
    }
}
