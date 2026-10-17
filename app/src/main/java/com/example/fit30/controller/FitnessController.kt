package com.example.fit30.controller

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.fit30.entity.FitnessDay
import com.example.fit30.service.FitnessService

/**
 * Controller layer. It extends ViewModel so the state survives screen rotation.
 */
class FitnessController : ViewModel() {

    private val service = FitnessService()

    val days: List<FitnessDay> = service.getAllDays()

    var completedDays by mutableStateOf<Set<Int>>(emptySet())
        private set

    val progress: Float
        get() = completedDays.size / days.size.toFloat()

    fun isCompleted(day: Int): Boolean = day in completedDays

    fun toggleCompleted(day: Int) {
        completedDays = if (day in completedDays) completedDays - day else completedDays + day
    }
}
