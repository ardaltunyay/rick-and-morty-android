package net.altunyay.rickandmortyandroid.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import net.altunyay.rickandmortyandroid.databinding.FragmentHomeBinding
import net.altunyay.rickandmortyandroid.utils.base.BaseFragment

class HomeFragment : BaseFragment() {

    private var binding: FragmentHomeBinding? = null
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        return binding?.root
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}