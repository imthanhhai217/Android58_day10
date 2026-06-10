package com.devpro.android58_day10.example.ex2

class Task(val id:String,  title:String) {
    var title:String = title
        private set

    private var isCompleted: Boolean = false

    fun markDone(){
        TODO("Mark task as completed")
    }

    fun isComplete(): Boolean = TODO("Check if task is completed")
}