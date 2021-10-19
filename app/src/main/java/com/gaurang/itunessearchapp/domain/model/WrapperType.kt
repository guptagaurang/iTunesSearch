package com.gaurang.itunessearchapp.domain.model


enum class WrapperType(val value: String) {
    UNKNOWN("");

    companion object {
        private val map = values().associateBy(WrapperType::value)
        fun fromString(type: String?) = type?.let { map[type] } ?: UNKNOWN
    }
}