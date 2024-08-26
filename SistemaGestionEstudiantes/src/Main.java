public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();

        // Agregar estudiantes
        studentManager.addStudent(new Student(1, "John Doe", 20));
        studentManager.addStudent(new Student(2, "Jane Doe", 22));
        studentManager.addStudent(new Student(3, "Bob Smith", 25));

        // Mostrar lista completa
        System.out.println("Lista completa:");
        studentManager.getAllStudents().forEach(System.out::println);

        // Filtrar estudiantes mayores de 21 años
        System.out.println("Estudiantes mayores de 21 años:");
        studentManager.getAllStudents().stream()
                .filter(student -> student.getAge() > 21)
                .forEach(System.out::println);

        // Ordenar estudiantes por nombre
        System.out.println("Estudiantes ordenados por nombre:");
        studentManager.getAllStudents().stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(System.out::println);

        // Buscar estudiante
        try {
            Student student = studentManager.findStudent(2);
            System.out.println("Estudiante encontrado: " + student);
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Eliminar estudiante
        try {
            studentManager.removeStudent(2);
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar lista actualizada
        System.out.println("Lista actualizada:");
        studentManager.getAllStudents().forEach(System.out::println);
    }
}
