
# Object-Oriented Programming (OOP) Concepts

## 1. Inheritance

Inheritance is a mechanism where a new class inherits properties and behavior (methods) from an existing class. It promotes code reusability.

### Advantages:
- Promotes code reusability.
- Establishes a natural hierarchy between classes.
- Simplifies code maintenance.

### Disadvantages:
- Can lead to tight coupling between base and derived classes.
- Increases the complexity of the codebase.
- Can lead to issues with multiple inheritance.

### Example:
```java
class Animal {
    Animal() {
        System.out.println("An animal is created.");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("A dog is created.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

public class inheritance_single {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
```

In this example, `Dog` inherits from `Animal`, so it can use the `eat` method from `Animal`.

## 2. Polymorphism

Polymorphism allows methods to do different things based on the object it is acting upon, even though they share the same name.

### Advantages:
- Enhances code flexibility and scalability.
- Simplifies code maintenance and readability.
- Promotes the use of interfaces and abstract classes.

### Disadvantages:
- Can make the code more complex to understand.
- May lead to runtime errors if not properly managed.
- Can be less efficient due to dynamic method resolution.

### Compile-Time Polymorphism (Method Overloading)
Method overloading allows a class to have more than one method with the same name, as long as their parameter lists are different.

### Example:
```java
class MathOperations {
    MathOperations() {
        System.out.println("MathOperations object created.");
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Calls add(int, int)
        System.out.println(math.add(2, 3, 4));     // Calls add(int, int, int)
        System.out.println(math.add(2.5, 3.5));    // Calls add(double, double)
    }
}
```

### Runtime Polymorphism (Method Overriding)
Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

### Example:
```java
class Animal {
    Animal() {
        System.out.println("An animal is created.");
    }

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("A dog is created.");
    }

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("A cat is created.");
    }

    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();  // Calls Dog's sound method
        myCat.sound();  // Calls Cat's sound method
    }
}
```

In this example, the `sound` method is overridden in both `Dog` and `Cat` classes.

## 3. Encapsulation

Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods. It helps to protect the data from unauthorized access and modification.

### Advantages:
- Protects the integrity of the data.
- Enhances code maintainability and flexibility.
- Reduces the risk of unintended interactions.

### Disadvantages:
- Can lead to increased code verbosity.
- May introduce performance overhead due to additional method calls.
- Can make the code more complex to understand.

### Example:
```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

In this example, the `Person` class encapsulates the `name` and `age` fields, providing public getter and setter methods to access and modify them.

## 4. Abstraction

Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object. It can be achieved using abstract classes and interfaces.

### Advantages:
- Simplifies code by hiding complex details.
- Promotes code reusability and flexibility.
- Enhances code maintainability and readability.

### Disadvantages:
- Can lead to increased code complexity.
- May introduce performance overhead due to additional layers of abstraction.
- Can make debugging more difficult.

### Example:
```java
abstract class Animal {
    Animal() {
        System.out.println("An animal is created.");
    }

    abstract void sound();
}

class Dog extends Animal {
    Dog() {
        System.out.println("A dog is created.");
    }

    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("A cat is created.");
    }

    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}
```

In this example, `Animal` is an abstract class with an abstract method `sound`. The `Dog` and `Cat` classes provide specific implementations of the `sound` method.