package com.example.hachiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import com.example.hachiapp.fragment.AdministrationsFragment
import com.example.hachiapp.fragment.FooterFragment
import com.example.hachiapp.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        this.supportActionBar?.hide()
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.footerFragment, FooterFragment.newInstance())
            add(R.id.contentFragment, HomeFragment.newInstance())
        }
    }
}