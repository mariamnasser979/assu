package com.example.assu;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAccessorAdapter extends FragmentPagerAdapter {
    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                StartFragmentForDoctorSubject  startFragment = new StartFragmentForDoctorSubject();
                return startFragment;
            case 1:
                LecturesFragmentForDoctorSubject  lecturesFragment = new LecturesFragmentForDoctorSubject();
                return lecturesFragment;
            case 2:
                AssignmentsFragmentForDoctorSubject  assignmentsFragment = new  AssignmentsFragmentForDoctorSubject ();
                return assignmentsFragment;
            default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0:
                return "Start";
            case 1:
                return "Lectures";
            case 2:
                return "Assignments";
            default:
                return null;
        }

    }
}
