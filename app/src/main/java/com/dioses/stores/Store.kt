package com.dioses.stores

data class Store(
    var id: Long = 0,
    var name: String,
    var phone: String = "",
    var webSite: String = "",
    var favorite: Boolean = false
)
