package com.gaurang.itunessearchapp.domain.state


sealed class DataState<T>(
    var loading: Boolean,
    var data: T? = null,
    var stateMessage: StateMessage? = null
) {
    class LOADING<T>(
        isLoading: Boolean
    ) : DataState<T>(
        loading = isLoading
    )

    class SUCCESS<T>(
        data: T? = null,
        stateMessage: StateMessage? = null
    ) : DataState<T>(
        loading = false,
        data = data,
        stateMessage = stateMessage
    )

    class ERROR<T>(
        stateMessage: StateMessage
    ) : DataState<T>(
        loading = false,
        stateMessage = stateMessage
    )
}

sealed class MessageType {
    object SUCCESS : MessageType()
    object ERROR : MessageType()
    object INFO : MessageType()
    object NONE : MessageType()
}

data class StateMessage(
    val message: String?,
    val messageType: MessageType
)