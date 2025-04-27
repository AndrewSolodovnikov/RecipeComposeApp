package com.sol.entry_form

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    val id: Int,
    val login: String,
    val password: String,
): Parcelable