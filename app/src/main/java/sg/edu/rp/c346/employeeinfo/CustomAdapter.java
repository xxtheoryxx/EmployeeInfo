package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15055494 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeItem> empList;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        empList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){


        if (convertView == null){
            LayoutInflater inflater
                    = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvTitle = convertView.findViewById(R.id.textViewTitle);
        TextView tvSalary = convertView.findViewById(R.id.textViewSalary);
        EmployeeItem currentItem = empList.get(position);
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(String.valueOf(currentItem.getSalary()));
        return convertView;
    }
}
