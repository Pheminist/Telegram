package com.example.telegram.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.telegram.R
import com.example.telegram.databinding.FragmentChatsBinding

/**
 * A simple [Fragment] subclass.
 */
class ChatsFragment : Fragment() {

    private lateinit var mBinding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding=FragmentChatsBinding.inflate(layoutInflater)
        return mBinding.root
    }

}
