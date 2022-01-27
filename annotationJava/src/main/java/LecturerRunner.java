
@Lecturer(lecturerName="Albert Einstein", lecturerCourse="Physics", isActive = true)
public class LecturerRunner {

    public static void main(String[] args) {
        Lecturer lecturerAnnotation=LecturerRunner.class.getAnnotation(Lecturer.class);
        System.out.println(lecturerAnnotation.lecturerName());
        System.out.println(lecturerAnnotation.lecturerCourse());

    }
}