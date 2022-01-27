import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Lecturer {

    public String lecturerName();
    public String  lecturerCourse();
    boolean isActive();
}