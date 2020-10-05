package com.example.piggybank.UI.Fragments.MovementsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.piggybank.R
import kotlinx.android.synthetic.main.register_entry_fragment.*

class RegisterEntryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.register_entry_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       addEntry?.setOnClickListener(View.OnClickListener {
           findNavController().navigate(R.id.entry_to_movements)
       })

    }

    companion object {
        @JvmStatic
        fun newInstance(): RegisterEntryFragment {
            val fragment = RegisterEntryFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}