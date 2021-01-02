package enums;

public enum Gender {

    FEMALE("Woman"),
    MALE("Man");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
