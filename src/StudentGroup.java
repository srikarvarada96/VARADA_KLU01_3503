/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author klu
 */
import java.util.Date;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
                        }
	@Override
	public void setStudents(Student[] students) {
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
	int len=students.length;	
            
            for(int i=index;i<len;i++){
                students[i+1]=students[i];
            }
            students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
                int length=students.length;
                for(int i=0;i<length;i++){
                    students[i+1]=students[i];
                }
                students[0]=student;
	}

	@Override
	public void addLast(Student student) {
        int len=students.length+1;
        
          students[len]=student;
        
	}

	@Override
	public void add(Student student, int index) {
		int len=students.length;
                for(int i=index;i<len;i++){
                    students[i+1]=students[i];
                }
                students[index]=student;
	}

	@Override
	public void remove(int index) {
		int len=students.length;
                for(int i=index;i<len;i++){
                    students[i]=students[i+1];
                }
	}

	@Override
	public void remove(Student student) {
        int len=students.length;
        int temp=0;
        for(int i=0;i<len;i++){
            if(students[i]==student){
                temp=i;
        }
	}
        for(int i=temp;i<len;i++){
            students[i]=students[i+1];
        }
        }
	@Override
	public void removeFromIndex(int index) {
        int len=students.length;
        for(int i=index;i<len;i++){
            students[i]=null;
        }
	}

	@Override
	public void removeFromElement(Student student) {
		int len=students.length;
                int temp=0;
                for(int i=0;i<len;i++){
                    if(students[i]==student){
                        temp=i;
                    }
                }
                for(int i=temp+1;i<len;i++){
                    students[i]=null;
	}
        }
	@Override
	public void removeToIndex(int index) {
		int len=students.length;
                for(int i=0;i<index;i++){
                    students[i]=null;
                }
                
	}

	@Override
	public void removeToElement(Student student) {
		for(int i=0;students[i]!=student;i++){
                    students[i]=null;
                }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		int k=0;
              Student[]  arr=null;
            int len=students.length;
            for(int i=0;i<len;i++){
            if(students[i].getBirthDate().compareTo(date)==0){
                arr[k]=students[i];
                k++;
            }
            }
		return arr;
	}
        
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		int k=0;
            
                Student[] arr=null;
                int len=students.length;
                for(int i=0;i<len;i++){
                if((students[i].getBirthDate().compareTo(firstDate)>=0)&&(students[i].getBirthDate().compareTo(lastDate)<0)){
                    arr[k]=students[i];
                    k++;
                }
                
                
                }
		return arr;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		int len=students.length;
                for(int i=0;i<len;i++){
                
                
                
                }
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int len=students.length;
                int max=0;
                for(int i=0;i<len;i++){
                    if(students[i].getAvgMark()>students[i+1].getAvgMark()){
                        max=i;
                }
                }
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}