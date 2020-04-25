package info.motodell.trasem.activities;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import info.motodell.trasem.R;
import info.motodell.trasem.fragments.InstructionsHelpFragment;
import info.motodell.trasem.fragments.WelcomeFragment;

public class MainSlideHelpActivity extends AppCompatActivity {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 2;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager2 mPager;
    private LinearLayout slidePage;
    private TextView[] slidePoints;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_slide_help);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = findViewById(R.id.vp2_main_slide_help_pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        mPager.setAdapter(pagerAdapter);

        slidePage = findViewById(R.id.ll_main_slide_help_page);
        addSlidePoints();
        mPager.registerOnPageChangeCallback(viewCallback);
    }

    public void addSlidePoints() {
        slidePoints = new TextView[NUM_PAGES];
        for (int i = 0; i < slidePoints.length; i++) {
            slidePoints[i] = new TextView(this);
            slidePoints[i].setText(Html.fromHtml("&#8226;"));
            slidePoints[i].setTextSize(35);
            slidePoints[i].setTextColor(getResources().getColor(R.color.light_gray9d));
            slidePage.addView(slidePoints[i]);
        }
    }

    ViewPager2.OnPageChangeCallback viewCallback = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
        public void onPageSelected(int position) {
            for (int i = 0; i < slidePoints.length; i++) {
                if (position == i){
                    slidePoints[position].setTextColor(getResources().getColor(R.color.aqua_green));
                } else {
                    slidePoints[i].setTextColor(getResources().getColor(R.color.light_gray9d));
                }
            }
        }
    };

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private static class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        private ScreenSlidePagerAdapter(FragmentActivity fa) {
            super(fa);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return ScreenSlidePagerAdapter.newInstance(position + 1);
        }

        private static Fragment newInstance(int sectionNumber) {
            Fragment fragment = null;

            switch (sectionNumber){
                case 1: fragment = new WelcomeFragment(); break;
                case 2: fragment = new InstructionsHelpFragment(); break;
            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }

}
