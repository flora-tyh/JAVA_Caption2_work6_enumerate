public enum  Sex {
    Male("女"),
    Female("男");

    private String value;

    private Sex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
