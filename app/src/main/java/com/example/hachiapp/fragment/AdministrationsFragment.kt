package com.example.hachiapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hachiapp.HomeActivity
import com.example.hachiapp.R
import kotlinx.android.synthetic.main.fragment_administrations.*


class AdministrationsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_administrations, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        item.setOnClickListener {
            onClickItem()
        }
    }

    private fun onClickItem() {
        val parentActivity = activity as HomeActivity
        val frTran = parentActivity.supportFragmentManager.beginTransaction()
        frTran.replace(R.id.contentFragment, ServiceDetailsFragment.newInstance())
        frTran.commit()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AdministrationsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            AdministrationsFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}