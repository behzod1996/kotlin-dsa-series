package main.kotlin.utils

fun Int?.isNotEmpty(): Boolean {
    return this != null
}

fun Int?.isNullOrEmpty(): Boolean {
    return this == null
}