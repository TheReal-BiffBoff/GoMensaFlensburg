package systems.go.gomensa.Interface;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import systems.go.gomensa.R;

public class MensaFragment extends Fragment {

    ScrollView dishList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.mensa_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
    }

    private final String TAG = "Dish Fragment";
}
