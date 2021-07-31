package com.hind.githubusers.presentation.utils

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.hind.githubusers.presentation.utils.IntUtils.toShortHand

object BindingAdapters {

    /**
     * Binding adapter for ImageView to load images from url.
     * @param view ImageView to load image to.
     * @param url URL to load image from.
     * @param placeHolder Image to show if cannot download image.
     */
    @JvmStatic
    @BindingAdapter(value = ["imageUrl", "placeholder"], requireAll = false)
    fun setImageUrl(view: ImageView, url: String?, placeHolder: Drawable?) {
        if (url == null) {
            view.setImageDrawable(placeHolder);
        } else {
            Glide
                .with(view.context)
                .load(url)
                .apply {
                    when(view.scaleType){
                        ImageView.ScaleType.FIT_CENTER -> fitCenter()
                        ImageView.ScaleType.CENTER_CROP -> centerCrop()
                        ImageView.ScaleType.CENTER_INSIDE -> centerInside()
                        else -> fitCenter()
                    }
                }
                .error(placeHolder)
                .into(view)
        }
    }

    /**
     * Binding adapter to set view visibility from boolean values.
     * @param view View to set visibility for.
     * @param value Visibility state true -> Visible and false -> Invisible
     */
    @JvmStatic
    @BindingAdapter("android:visibility")
    fun setVisibility(view: View, value: Boolean) {
        view.visibility = if (value) View.VISIBLE else View.GONE
    }

    /**
     * Binding adapter to set view text from boolean values.
     * @param view TextView to set text to.
     * @param value
     */
    @JvmStatic
    @BindingAdapter("android:text")
    fun setText(view: TextView, value: Int) {
        view.text = value.toShortHand()
    }

}