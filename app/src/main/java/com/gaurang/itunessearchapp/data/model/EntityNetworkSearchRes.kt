package com.gaurang.itunessearchapp.data.model


data class EntityNetworkSearchRes(
    var resultCount: Int,
    var results: List<EntityNetworkContent>
) : EntityModel