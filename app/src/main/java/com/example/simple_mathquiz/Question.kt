package com.example.simple_mathquiz

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)