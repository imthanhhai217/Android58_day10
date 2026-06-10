package com.devpro.android58_day10.example.ex2

class TaskServices(private val notificationSender: NotificationSender) {
    private val listTask = mutableListOf<Task>()

    fun createTask(user: User, id: String, title: String):Boolean {
        TODO("implement")
    }

    fun markDone(id:String): Boolean{
        TODO("implement")
    }

    fun listOpenTask(): List<Task>{
        TODO("implement")
    }
}