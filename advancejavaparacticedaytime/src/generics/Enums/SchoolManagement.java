package generics.Enums;

public class SchoolManagement {

    //Task: Write the student and teacher deletion program for school management
//Define the role for the user (ADMIN, TEACHER, STUDENT) and give permission to delete according to the role.
//student delete authorization (ADMIN,TEACHER)
//teacher delete authorization ADMIN


    public static void main(String[] args) {

        Student student= new Student("Serhan Ebubechir");
        Teacher teacher = new Teacher("Musleh");

        User user1= new User("ALi",Role.ROLE_ADMIN);
        User user2= new User("Tuba",Role.ROLE_TEACHER);
        User user3= new User("Enes",Role.ROLE_STUDENT);

        deleteStudent(student,user1);
        deleteStudent(student,user2);
        deleteStudent(student,user3);

        deleteTeacher(teacher,user1);
        deleteTeacher(teacher,user2);



    }

    public static void deleteStudent(Student std,User user){
    if (user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){

        System.out.println("Student is deleted successfully by " +user.getRole().getName());
    }else {
        System.out.println(user.getRole().getName() + " is not permitted to delete students  ");
     }
    }

    public static void deleteTeacher(Teacher teacher,User user){
        if (user.getRole().equals(Role.ROLE_ADMIN)){

            System.out.println("Teacher is deleted successfully by " +user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName() + " is not permitted to delete Teacher  ");
        }
    }



}


