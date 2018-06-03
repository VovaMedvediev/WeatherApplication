package com.example.weatherapplication.domain.commands

interface Command<out T> {
    fun execute(): T
}