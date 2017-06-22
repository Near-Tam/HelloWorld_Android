package test.helloworld;

/**
 * Created by tanzhiyuan on 14/03/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    public static List<String> getAllTeachers() {
        List<String> teachers = new ArrayList<String>();
        teachers.add("张海霞");
        teachers.add("陈江");
        teachers.add("叶蔚");

        return teachers;
    }
}
