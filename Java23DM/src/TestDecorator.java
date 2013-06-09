/**
 * 8.装饰模式（Decorator） 以对客户透明的方式来扩展对象的功能。 用户根据功能需求随意选取组成对象的成分，通过方法的链式调用来实现。 可以给对象动态的增加功能，比继承灵活性更大。
 * @author Administrator
 *
 */
public class TestDecorator {  
  
public static void main(String[] args) {  
  
Teacher t1=new SimpleTeacher();  
  
Teacher t2=new CppTeacher(t1);  
  
Teacher t3=new JavaTeacher(t2);  
  
t3.teach();  
  
//t.teach();  
  
}  
  
}  
  
  
  
abstract class Teacher{  
  
public abstract void teach();  
  
}  
  
class SimpleTeacher extends Teacher{  
  
public void teach(){  
  
System.out.println("Good Good Study, Day Day Up");  
  
}  
  
}  
  
class JavaTeacher extends Teacher{  
  
Teacher teacher;  
  
public JavaTeacher(Teacher t){  
  
this.teacher=t;  
  
}  
  
public void teach(){  
  
teacher.teach();  
  
System.out.println("Teach Java");  
  
}  
  
}  
  
class CppTeacher extends Teacher{  
  
Teacher teacher;  
  
public CppTeacher(Teacher t){  
  
this.teacher=t;  
  
}  
  
public void teach(){  
  
teacher.teach();  
  
System.out.println("Teach C++");  
  
}  
  
}   