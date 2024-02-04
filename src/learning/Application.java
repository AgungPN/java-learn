package learning;

import learning.classes.*;
import learning.classes.exception.Validation;
import learning.classes.exception.ValidationException;
import learning.constract.GrandParent;
import learning.enums.Gender;
import learning.enums.Level;
import learning.records.LoginRequest;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Application {  // setiap file hanya boleh berisi 1 class public saja dan harus sama dengan nama file
  public static void main(String[] args) {
    Constructor constructor = new Constructor("Agung Prasetyo Nugroho", 29);

//        =================================
//        INHERITANCE (pewarisan, inheritance property and method)
    inheritance();

//        =================================
//    POLYMORPHISM (berubah bentuk, change object from parent to child)
    polymorphism();

//    POLYMORPHISM in property
    polymorphismInProperty();

//        =================================
//    inner class
    innerClass();

//        =================================
//    STATIC
    staticKeyword();

//        =================================
//    toString()
    System.out.println("\n===========================");
    System.out.println(new OverrideMethod(null));

//        =================================
//    equals() and hashCode()
    equalsAndHashCode();

//        =================================
//   record
    recordClass();

//        =================================
//   learning.enums
    enums();

//        =================================
//   exception
    exception();

//        =================================
//  annotation
//  berfungsi untuk menambahkan informasi seperti @override
  }

  //  =========================================================================================================================
//  =========================================================================================================================
  static void inheritance() {
    System.out.println("\n===========================");
    Child child = new Child(null);
    child.sayHello("Agung Prasetyo Nugroho");
    child.sayHelloParent();
  }

  static void polymorphism() {
    System.out.println("\n===========================");
    GrandParent grandParent = new Parent(null);
    grandParent.sayHello("Agung PN");
    grandParent = new Child(null);
    grandParent.sayHello("Agung PN");
  }

  static void polymorphismInProperty() {
    System.out.println("\n===========================");
    sayHello(new Parent("AGUNG PRASETYO NUGROHO"));
    sayHello(new Child("AGUNG PRASETYO NUGROHO"));
  }

  static void sayHello(GrandParent grandParent) {
    System.out.println("\n===========================");
    grandParent.sayHello(grandParent.getName());
    if ( grandParent instanceof Child ) { // check if object class equals with 'instanceof'
      System.out.println("THIS IS CHILD");
    } else if ( grandParent instanceof Parent ) {
      Parent parent = (Parent) grandParent;  // optional
      System.out.println("THIS IS PARENT");
    }
  }

  static void innerClass() {
    System.out.println("\n===========================");
    InnerClass innerClass = new InnerClass("Agung PN");
    InnerClass.Inside inside = innerClass.new Inside();  // to access class inside we must make object from outer class first
    inside.getNameInside();
    inside.sayOutsideWithInside();
  }

  static void staticKeyword() {
    System.out.println("\n===========================");
    System.out.println(Static.KEYWORD);
    System.out.println("Classes.Static.FREE_MEMORY = " + Static.FREE_MEMORY);
    Static.sayStatic();
    Static staticKeyword = new Static();
    staticKeyword.nonStatic();
  }

  static void equalsAndHashCode() {
    System.out.println("\n===========================");
    OverrideMethod compare1 = new OverrideMethod("Agung PN");
    OverrideMethod compare2 = new OverrideMethod("Agung PN");
    // kalau queals() tidak di override maka akan false (karena yg dicek hanyalah lokasi memori)
    System.out.println("bandingkan compare1 dengan compare2: " + compare1.equals(compare2));
    compare1.primitiveCompare();
    compare2.objectCompare();

    System.out.println(compare2.hashCode() == compare1.hashCode());  // akan sangat berguna pada materi learning.collection
  }

  static void recordClass() {
    System.out.println("\n===========================");
    LoginRequest loginRequest = new LoginRequest("672021077@student.uksw.edu", "password");
    System.out.println(loginRequest);
    System.out.println(loginRequest.email()); // getter menggunakan nama field
  }

  static void enums() {
    System.out.println("\n===========================");
    System.out.println(Gender.MALE);
    System.out.println(Level.HARD.getDescription());
//    =======================
    String maleString = Gender.MALE.name();  // convert enum to string
    Gender gender = Gender.valueOf("MALE"); // convert string to enum
//    Gender genderNotFound = Gender.valueOf("male"); // error, male not found (case sensitive)
    Gender[] genders = Gender.values();
    for (var value : genders) {
      System.out.println(value);
    }
  }

  static void exception() {
    System.out.println("\n===========================");
    LoginRequest loginRequest = new LoginRequest(null, null);
/*
    try {
      Validation.validate(loginRequest);
    } catch (ValidationException e) {
      System.out.println(e.getMessage());
    } catch (NullPointerException e){
      System.out.println("null pointer: "+e.getMessage());
    }
*/
    try {
      Validation.validate(loginRequest);
    } catch (ValidationException | NullPointerException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();  // print error detail
    }
  }
}
