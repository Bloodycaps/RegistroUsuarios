/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author blakc
 */
public class Docentes {

    private String name;
    private int idNumber;
    private int age;
    private String faculty;
    private String program;

    public Docentes(String name, int idNumber, int age, String faculty, String program) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.faculty = faculty;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public String getProgram(){
        return program;
    }
    

}
