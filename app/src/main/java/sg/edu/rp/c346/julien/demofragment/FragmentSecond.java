package sg.edu.rp.c346.julien.demofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentSecond extends Fragment {
    Button btnAddText;
    TextView tvFrag2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tvFrag2 = view.findViewById(R.id.tvFrag2);
        btnAddText = view.findViewById(R.id.btnAddTextFrag2);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvFrag2.getText().toString() + "\n" + "New Data";
                tvFrag2.setText(data);
            }
        });
        return view;
    }
}