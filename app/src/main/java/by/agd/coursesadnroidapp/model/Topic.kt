package by.agd.coursesadnroidapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResId: Int,
    val coursesCount: Int,
    @DrawableRes val imageResId: Int,
)