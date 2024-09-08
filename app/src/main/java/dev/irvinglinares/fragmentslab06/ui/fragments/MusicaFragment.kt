package dev.irvinglinares.fragmentslab06.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.irvinglinares.fragmentslab06.R

/**
 * A simple [Fragment] subclass.
 * Use the [MusicaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_musica, container, false)
    }
}