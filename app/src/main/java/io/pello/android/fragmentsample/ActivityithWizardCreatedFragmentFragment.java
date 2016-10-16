package io.pello.android.fragmentsample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class ActivityithWizardCreatedFragmentFragment extends Fragment {

    public ActivityithWizardCreatedFragmentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_activityith_wizard_created_fragment, container, false);
    }
}
