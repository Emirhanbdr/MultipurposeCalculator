package com.emirhan.multipurposecalculator.view

import android.app.DirectAction
import androidx.navigation.NavAction
import androidx.navigation.NavDirections

data class hesapMakinesiData(
    val fragmentName: String,
    val action: NavDirections
)
