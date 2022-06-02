 class StudentFactory {

    public static Hyperion getHyperion(String studentName) {
        if (studentName == null) {
            return null;
        }
        if (studentName.equalsIgnoreCase("Susan")) {
            return new Student1();
        }
        if (studentName.equalsIgnoreCase("Michael")) {
            return new Student2();
        }
        if (studentName.equalsIgnoreCase("Saoirse")) {
            return new Student3();
        }
return null;
    }
}
