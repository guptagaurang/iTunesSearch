package com.gaurang.itunessearchapp.domain.model


enum class Kind(val value: String) {

    UNKNOWN("");

    companion object {
        private val map = values().associateBy(Kind::value)
        fun fromString(type: String?) = type?.let { map[type] } ?: UNKNOWN
    }
}
