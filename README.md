# 第一部分：继承与组合基础
## Question01
这是本题的源代码：[Name](src\main\java\type\Name.java)

## Question02
```java
package main.java.type;

public class Person {
    private Name name;
    private int age;
    private Gender gender;

    public Person() {
        this(0, Gender.MALE, new Name());
    }

    public Person(int age, Gender gender, Name name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("Hi, how is it going?");
    }

    public void tale(String topic) {
        System.out.println("Let's talk about " + topic);
    }

    public void chatWith(Person person, String topic) {
        System.out.printf("%s to %s: Let's talk about %s\n", this.name, person.name, topic);
    }
}

```
这是本题的源代码（最终版）：[Person](src\main\java\type\Person.java)

## Question03
- 可以访问
- 不能访问
- 会改变。均可以访问
- 不会改变（q1：可以访问，q2：不能访问）

## Question04
这是本题的源代码：[Student(最终版)](src\main\java\instance\Student.java)

## Question05
这是本题的源代码：[Teacher(最终版)](src\main\java\instance\Teacher.java)

## Question06
这是本题的源代码：[Test(已修改)](src\test\java\instance_test\Test01.java)
```java
package test.java.instance_test;

import main.java.instance.*;
import main.java.type.*;

public class Test01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Student(20, Gender.FEMALE, new Name("Alice", "Smith"), "Computer Science");
        people[1] = new Teacher(45, Gender.MALE, new Name("Bob", "Johnson"), "Mathematics");
        people[2] = new Person(30, Gender.FEMALE, new Name("Carol", "Williams"));
        for (Person person : people) {
            person.talk();
        }
    }
}
```
运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\instance_test\Test01.java

java -cp .\out test.java.instance_test.Test01

Hi, how is your homework going?
Hi, how is your paper going?
Hi, how is it going?
```
结论：输出结果均不同

## Question07
这是本题的源代码：[Test](src\test\java\instance_test\Test02.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\instance_test\Test02.java

java -cp .\out test.java.instance_test.Test02

Hi, how is your homework going?
Let's talk about Math
```
原因：Student没有重新带参的 `talk(String)` 方法，执行 `person.talk("Math");` 时，调用的是父类的带参的 `talk` 方法。
## Question08
这是本题的源代码：
- [PersonFactory](src\main\java\group\PersonFactory.java)
- [Test](src\test\java\group_test\Test01.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\group_test\Test01.java

java -cp .\out test.java.group_test.Test01

Michael Brown, 22, MALE, Major: Major4
John Miller, 24, FEMALE, Major: Major1
Sarah Miller, 23, MALE, Major: Major1
Emily Smith, 40, FEMALE, Subject: Subject2
Sarah Smith, 20, MALE, Major: Major3
```
## Question09
这是本题的源代码：
- [Discussion](src\main\java\group\Discussion.java)
- [Test](src\test\java\group_test\Test02.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\group_test\Test02.java

java -cp .\out test.java.group_test.Test02

Emily Smith to Michael Brown: Let's talk about Java
Emily Smith to Sarah Smith: Let's talk about Java
Emily Smith to Alex Johnson: Let's talk about Java
Emily Smith to Sarah Smith: Let's talk about Java
```
## Question10
这是本题的源代码：
- [ElderTeacher](src\main\java\instance\ElderTeacher.java)
- [Test](src/test/java/instance_test/Test03.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\instance_test\Test03.java

java -cp .\out test.java.instance_test.Test03

1421795058
1421795058
1421795058
1421795058
1421795058
```
内存地址均相同
## Question11
这是本题的源代码：
- [Person](src\main\java\type\Person.java)
- [Student](src\main\java\instance\Student.java)
- [Teacher](src\main\java\instance\Teacher.java)
- [Test(错误，已修改)](src\test\java\instance_test\Test01.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\test\java\instance_test\Test01.java

src\test\java\instance_test\Test01.java:11: 错误: Person是抽象的; 无法实例化
        people[2] = new Person(30, Gender.FEMALE, new Name("Carol", "Williams"));
                    ^
1 个错误
```
## Question12
这是本题的源代码：
- [Person](src\main\java\type\Person.java)
- [Student(错误，已修改)](src\main\java\instance\Student.java)

运行结果：
```cmd
javac -d .\out -sourcepath .\src src\main\java\instance\Student.java

src\main\java\instance\Student.java:29: 错误: Student中的breathe()无法覆盖Person中的breathe()
    public void breathe() {
                ^
  被覆盖的方法为final
1 个错误
```
## Question13
这是本题的源代码：
- [Person](src\main\java\type\Person.java)
- [Student](src\main\java\instance\Student.java)

运行结果：
- 能通过
- 能通过。`Java` 允许子类重写方法时返回原类型或原类型的子类
- 不能。`Object` 不是原类型或原类型的子类
- 不能。`int` 不是原类型或原类型的子类
## Question14
这是本题的源代码：
- [Role](src\main\java\type\Role.java)
- [Person](src\main\java\type\Person.java)

问题：
1. 组合
2.  - 避免脆弱的基类问题：当父类被修改时，所有子类的行为可能被无意中改变，导致系统变得脆弱
    - 加运行时行为的灵活性
    - 保持类的粒度与单一职责
3. 组合

这是本题的源代码：
- [Address](src\main\java\type\Address.java)
- [Person](src\main\java\type\Person.java)

问题：
1. 不能
2. 不应该
3. 组合