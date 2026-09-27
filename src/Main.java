public static void main(String[] args) {
    Program course = new Program("Computer Science", 10, "German", "Azerbaijan");
    Program course2 = new Program("Step IT", 12, "Russian", "Ukraine");

    System.out.println(course);
    System.out.println(course2);

    System.out.println("===========================================");

    System.out.println(course.getDisplayName());
    System.out.println(course2.getDisplayName());

    System.out.println("===========================================");

    course.setLocation("USA");
    course2.setCourseLanguage("Norvegian");

    System.out.println("New Location: " + course.getLocation());
    System.out.println("New Language: " + course2.getCourseLanguage());
}
