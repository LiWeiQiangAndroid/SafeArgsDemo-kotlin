package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            //未采用safe args的传递方式
           /* var bundle = Bundle();
            bundle.putString("type","AAAAAAA")
            bundle.putInt("age",30)
            findNavController().navigate(R.id.SecondFragment,bundle)*/


            //通过safe args完成参数传递

//            val navDestination = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
//            findNavController().navigate(navDestination)

            var bundles = FirstFragmentArgs("我是FirstFragment传过来的,",30).toBundle()
            findNavController().navigate(R.id.SecondFragment,bundles)
        }
    }
}