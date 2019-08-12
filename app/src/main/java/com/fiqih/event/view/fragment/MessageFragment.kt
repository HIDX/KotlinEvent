package com.fiqih.event.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fiqih.event.R

class MessageFragment:Fragment(){
    private var mTitle:String? = null

    companion object {
        fun getInstance(title: String): MessageFragment {
            val fragment = MessageFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false)
    }
}