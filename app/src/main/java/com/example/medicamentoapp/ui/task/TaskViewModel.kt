package com.example.medicamentoapp.ui.task

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalTime
import java.util.UUID

class TaskViewModel: ViewModel() {
    var taskItems = MutableLiveData<MutableList<TaskItem>?>()
    init {
        taskItems.value = mutableListOf()
    }
    fun addTaskItem(newTask: TaskItem){
        val list = taskItems.value
        list!!.add(newTask)
        taskItems.postValue(list)
    }
    fun updateTaskItem(id: UUID, name: String, desc: String, dueTime: LocalTime?) {
        val list = taskItems.value
        val task = list!!.find { it.id == id} !!
        task.desc = desc
        task.name = name
        task.dueTime = dueTime
        taskItems.postValue(list)
    }
    fun setCompleted(newTask: TaskItem) {
        val list = taskItems.value
        var task = list!!.find {it.id == taskItem.id} !!
        if (task.completedDate == null)
            task.completesDate = LocalDate.now()
        taskItems.postValue(list)
    }
}