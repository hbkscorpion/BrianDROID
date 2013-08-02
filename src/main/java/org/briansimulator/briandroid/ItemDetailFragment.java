package org.briansimulator.briandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_SIM_ID = "sim_id";

    /**
     * The Simulations name this fragment is presenting.
     */
    private String simulationName;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        simulationName = (String)getArguments().get(ARG_SIM_ID);
        int duration = Toast.LENGTH_LONG;
        Activity context = getActivity();
        Toast toast = Toast.makeText(context, simulationName, duration);
        toast.show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_simulation_detail, container, false);
        //View simView = inflater.inflate(R.layout.activity_simulation, container, false);
        //TextView statusView = (TextView) simView.findViewById(R.id.statusText);
        if (simulationName != null) {
            TextView statusView = (TextView) rootView.findViewById(R.id.item_detail);
        //    statusView.setText(simulationName);
        } else {
         //   statusView.setText("ERROR while loading simulation.");
        }


        return rootView;
    }


}