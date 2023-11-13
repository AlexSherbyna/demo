package ua.alex.SpringStudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.alex.SpringStudents.model.Student;
import ua.alex.SpringStudents.repository.InMemoryStudentDAO;
import ua.alex.SpringStudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
