package CodingInterviewQuestions;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Question1 {

	    public static void main(String[] args) {
	        // Create a HashMap where the city name is the key and the value is a list of students
	        Map<String, List<String>> cityStudentsMap = new HashMap<>();

	        // Adding students and their cities
	        addStudent(cityStudentsMap, "Agra", "Rohan");
	        addStudent(cityStudentsMap, "Delhi", "Priya");
	        addStudent(cityStudentsMap, "Agra", "Simran");
	        addStudent(cityStudentsMap, "Mumbai", "Amit");
	        addStudent(cityStudentsMap, "Delhi", "Anjali");

	        // Print the city and student list
	        for (Map.Entry<String, List<String>> entry : cityStudentsMap.entrySet()) {
	            System.out.println("City: " + entry.getKey() + " - Students: " + entry.getValue());
	        }
	    }

	    // Helper method to add a student to the city in the HashMap
	    private static void addStudent(Map<String, List<String>> map, String city, String studentName) {
	        // If the city is not already in the map, put a new list
	        map.putIfAbsent(city, new ArrayList<>());

	        // Add the student to the list for the city
	        map.get(city).add(studentName);
	    }
	}

