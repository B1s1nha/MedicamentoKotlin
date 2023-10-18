package com.example.medicamentoapp.ui.task

interface TaskItemClickListener
{
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}