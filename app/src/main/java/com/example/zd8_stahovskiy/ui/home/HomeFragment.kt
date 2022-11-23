package com.example.zd8_stahovskiy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.zd8_stahovskiy.R
import com.example.zd8_stahovskiy.databinding.FragmentHomeBinding




class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var textViews: TextView
    private lateinit var iv1:ImageView
    private lateinit var Info:Button

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val textView: TextView = binding.textHome
        //homeViewModel.text.observe(viewLifecycleOwner) {
            //   textView.text = it
        //}
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}