package com.ishihata_tech.navigationwithsingleton

import javax.inject.Inject

class InputDataImpl @Inject constructor() : InputData {
    override var name: String = ""
    override var email: String = ""
}