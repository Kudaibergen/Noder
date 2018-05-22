package com.akai.noder.app.ui.main;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.akai.noder.app.R;
import com.akai.noder.app.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity
        implements ContractMainView,  NavigationView.OnNavigationItemSelectedListener, TabLayout.OnTabSelectedListener {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private ViewPager mViewPager;
    private FloatingActionButton mFab;

    @Inject ContractMainPresenter<ContractMainView> mPresenter;

    @Inject FragmentPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        setup();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        mDrawerLayout.closeDrawers();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0: mFab.setOnClickListener(fabListenerPersonalClick);
                return;
            case 1: mFab.setOnClickListener(fabListenerSecretClick);
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    View.OnClickListener fabListenerPersonalClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mPresenter.fabPersonalClick();
        }
    };

    View.OnClickListener fabListenerSecretClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mPresenter.fabSecretClick();
        }
    };

    @Override
    protected void setup() {
        init();
        setSupportActionBar(mToolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_nav_menu);
        }

        mNavigationView.setNavigationItemSelectedListener(this);
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(mTabLayout.getTabCount());
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(this);
    }

    @Override
    protected void init() {
        mToolbar = findViewById(R.id.toolbar);
        mTabLayout = findViewById(R.id.tab_layout);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mFab = findViewById(R.id.fab);
        mNavigationView = findViewById(R.id.nav_view);
        mViewPager = findViewById(R.id.view_pager);
    }
}
