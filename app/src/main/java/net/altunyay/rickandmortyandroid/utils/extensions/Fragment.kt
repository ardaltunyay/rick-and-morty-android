package net.altunyay.rickandmortyandroid.utils.extensions

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(requireContext(), message, duration).show()
}