package net.altunyay.rickandmortyandroid.utils.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageFromURL")
fun ImageView.setImage(url: String?) {
    url?.let { Picasso.get().load(it).into(this) }
}