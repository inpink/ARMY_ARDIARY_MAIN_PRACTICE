package com.example.mainui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mainui.databinding.FragmentListDefaultBinding
import kotlinx.android.synthetic.main.activity_list.*
import android.content.Context
import android.content.Intent

// nTODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListDefaultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListDefaultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 1. 뷰 바인딩 설정
        val binding = FragmentListDefaultBinding.inflate(inflater, container, false)

        // 2. 바인딩으로 TextView 등에 접근
        binding.myTextView.text = "바인딩이 잘 되었어요!!"

        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_list_default, container, false)
    }

    /*companion object {
        *
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListDefaultFragment.

        // nTODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListDefaultFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}