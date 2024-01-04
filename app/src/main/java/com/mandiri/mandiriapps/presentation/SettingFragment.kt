package com.mandiri.mandiriapps.presentation

import android.os.Bundle
import android.provider.CalendarContract.Instances
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.mandiri.mandiriapps.databinding.FragmentHomeBinding
import com.mandiri.mandiriapps.databinding.FragmentProfileBinding
import com.mandiri.mandiriapps.databinding.FragmentSettingBinding
import java.util.zip.Inflater

class SettingFragment : Fragment() {
    private var _binding: FragmentSettingBinding? = null
    private val binding get() = _binding!!
//    simbol ! untuk menandakan tidak null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

        binding.vToolbar.tvTitle.text = "Pengaturan"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}