package com.gaurang.itunessearchapp.data.mapper


interface MapperEntity<Entity, DomainModel> {
    fun mapFromNetworkEntity(entity: Entity): DomainModel
    fun mapToNetworkEntity(domainModel: DomainModel): Entity
}