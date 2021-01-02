package enums;

public enum Gender {

    Female("Woman"),
    Male("Man");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
