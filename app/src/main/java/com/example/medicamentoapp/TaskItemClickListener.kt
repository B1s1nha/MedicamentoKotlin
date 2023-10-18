package com.example.medicamentoapp

import com.example.medicamentoapp.TaskItem

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}