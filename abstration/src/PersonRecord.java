public record PersonRecord(String name, int age) {
    public PersonRecord {
        if (age <= 0) throw new IllegalArgumentException("Age cannot be negative");
    }
}
