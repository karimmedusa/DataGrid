package ir.home.datagrid;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class DataGridActivity extends Activity {

    private ListView      studentsListView;
    private CustomAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        studentsListView = (ListView) findViewById(R.id.listView);
        List<Student> students = retrieveStudents();
        adapter = new CustomAdapter(this, students);
        studentsListView.setAdapter(adapter);
    }


    private List<Student> retrieveStudents() {

        List<Student> students = new ArrayList<Student>();

        Student newStu = new Student();
        newStu.setUserName("medusa");
        newStu.setId("12");
        newStu.setComment("123456");
        students.add(newStu);

        newStu = new Student();
        newStu.setUserName("ahmadi");
        newStu.setId("14");
        newStu.setComment("asdfdsfgd");
        students.add(newStu);

        newStu = new Student();
        newStu.setUserName("test");
        newStu.setId("16");
        newStu.setComment("wuietrsjdbnvh");
        students.add(newStu);

        return students;
    }

}