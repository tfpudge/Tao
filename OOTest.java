public class OOTest{
	public static void main(String[] args){
		Student s = new Student();
		String stu = "这是str引用";
		System.out.println(s.name);
	}
}
class Student{
	int num;
	String name;
}