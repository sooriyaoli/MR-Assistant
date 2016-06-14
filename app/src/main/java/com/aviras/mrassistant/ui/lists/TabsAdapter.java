package com.aviras.mrassistant.ui.lists;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aviras.mrassistant.ui.TitleProvider;

/**
 * Adapter for {@link android.support.v4.view.ViewPager}. Will show lists in pages.
 * Created by ashish on 14/6/16.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    private final Context mContext;
    private Fragment[] mFragments;

    public TabsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context.getApplicationContext();
        mFragments = new Fragment[]{};
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mFragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Fragment fr = mFragments[position];
        if (fr instanceof TitleProvider) {
            ((TitleProvider) fr).getTitle(mContext);
        }
        return null;
    }
}
