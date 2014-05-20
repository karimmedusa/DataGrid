package ir.home.datagrid;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {

    private Activity              activity;
    private List<Student>         data;
    private static LayoutInflater inflater    = null;

    Student                       tempStudent = null;
    int                           i           = 0;

    static final String           IdCol       = "شماره پرسنلی";
    static final String           UsernameCol = "نام کاربری";
    static final String           CommentCol  = "توضیحات";


    public CustomAdapter(Activity a, List<Student> students) {

        activity = a;

        Student header = new Student();
        students.add(0, header);

        data = students;

        inflater = (LayoutInflater) activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {

        if (data.size() <= 0)
            return 1;
        return data.size();
    }


    @Override
    public Object getItem(int position) {
        return position;
    }


    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;

        if (convertView == null)
            vi = inflater.inflate(R.layout.list_item, null);

        TextView idText = (TextView) vi.findViewById(R.id.idText);
        TextView usernameText = (TextView) vi.findViewById(R.id.usernameText);
        TextView commentText = (TextView) vi.findViewById(R.id.commentText);

        if (data.size() > 0)
        {
            tempStudent = (Student) data.get(position);
            if (position == 0)
            {
                idText.setText(IdCol);
                usernameText.setText(UsernameCol);
                commentText.setText(CommentCol);
                vi.setBackgroundResource(R.drawable.listview_selector_header);
            }
            else
            {
                idText.setText(tempStudent.getId());
                usernameText.setText(tempStudent.getUserName());
                commentText.setText(tempStudent.getComment());

                if (position % 2 == 0)
                {
                    vi.setBackgroundResource(R.drawable.listview_selector_even);
                }
                else
                {
                    vi.setBackgroundResource(R.drawable.listview_selector_odd);
                }
            }

        }
        return vi;
    }
}
