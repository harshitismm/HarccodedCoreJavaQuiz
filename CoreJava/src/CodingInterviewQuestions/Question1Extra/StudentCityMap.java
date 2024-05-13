package CodingInterviewQuestions.Question1Extra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentCityMap {
    public static void main(String[] args) {
        // Create a HashMap where the city name is the key and the value is a list of Student objects
        Map<String, List<Student>> cityStudentsMap = new HashMap<>();

        // Adding students and their cities
        addStudent(cityStudentsMap, "Agra", new Student("Rohan"));
        addStudent(cityStudentsMap, "Delhi", new Student("Priya"));
        addStudent(cityStudentsMap, "Agra", new Student("Simran"));
        addStudent(cityStudentsMap, "Mumbai", new Student("Amit"));
        addStudent(cityStudentsMap, "Delhi", new Student("Anjali"));

        // Print the city and student list
        for (Map.Entry<String, List<Student>> entry : cityStudentsMap.entrySet()) {
            System.out.println("City: " + entry.getKey() + " - Students: " + entry.getValue());
        }
    }

    // Helper method to add a student to the city in the HashMap
    private static void addStudent(Map<String, List<Student>> map, String city, Student student) {
        // If the city is not already in the map, put a new list
        map.putIfAbsent(city, new ArrayList<>());

        // Add the student to the list for the city
        map.get(city).add(student);
    }
}
