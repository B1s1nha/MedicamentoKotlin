package com.example.medicamentoapp.ui.task

import java.time.LocalTime
import java.time.LocalDate
import java.util.*

class TaskItem (
    var name: String,
    var desc: String,
    var dueTime: LocalTime?,
    var completedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()
) {
}