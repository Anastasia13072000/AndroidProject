package com.example.androidapplication

import androidx.lifecycle.ViewModel
import com.example.algo.Point
import com.example.algo.Points


class MyViewModel : ViewModel() {
    private var listsOfPoints = ArrayList<ArrayList<Point>>()
    private var currentPoints = 0
    private var currentLists = -1
    private var lineSegments = ArrayList<Point>()
    private var shapes = Points(arrayListOf(), arrayListOf())
    public var mode: Int = 0

    fun getLists(): ArrayList<ArrayList<Point>> {
        return listsOfPoints
    }

    private fun loadLists(a: ArrayList<ArrayList<Point>>) {
        listsOfPoints = a
    }
}