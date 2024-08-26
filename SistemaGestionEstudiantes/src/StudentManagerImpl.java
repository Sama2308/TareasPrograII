import java.util.List;

public class StudentManagerImpl implements StudentManager {
    private final GenericList<Student> studentList = new GenericList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) throws StudentNotFoundException {
        Student student = findStudent(id);
        if (student != null) {
            studentList.remove(student);
        } else {
            throw new StudentNotFoundException("Student not found with id: " + id);
        }
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        Student student = studentList.find(id);
        if (student == null) {
            throw new StudentNotFoundException("Student not found with id: " + id);
        }
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList.getAll();
    }
}
