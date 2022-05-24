package kg.geektech.beappbbb.ui.service.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.glide(url : String) {
    Glide.with(this).load(url).into(this)
}