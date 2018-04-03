package cl.xamaztian.shrinkquizz1;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }

    public static PartyFragment newInstance() {
        return new PartyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = view.findViewById(R.id.partyRg);
        Button button = view.findViewById(R.id.partyBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1) {
                    RadioButton radioButton = radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    showDialog(answer);
                } else {
                    Toast.makeText(getContext(), "Debes seleccionar una opción", Toast.LENGTH_SHORT).show();
                }

                Log.d("RADIO GROUP", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            }
        });
    }

    private void showDialog(String answer) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Nivel de Fiesta");
        alertDialog.setMessage(new PartyResult(answer).score());
        alertDialog.setPositiveButton("Yeah", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        alertDialog.show();
    }
}
