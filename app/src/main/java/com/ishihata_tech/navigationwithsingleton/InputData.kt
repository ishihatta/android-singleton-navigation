package com.ishihata_tech.navigationwithsingleton

class InputData private constructor() {
    companion object {
        private var instance: InputData? = null

        fun getInstance(): InputData = instance ?: InputData().also { instance = it }
    }

    var name: String = ""
    var email: String = ""
}