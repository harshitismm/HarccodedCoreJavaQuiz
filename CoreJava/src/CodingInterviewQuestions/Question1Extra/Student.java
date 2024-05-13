package CodingInterviewQuestions.Question1Extra;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

// Define the Student class
class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // String representation of Student object
    @Override
    public String toString() {
        return name;
    }
}
