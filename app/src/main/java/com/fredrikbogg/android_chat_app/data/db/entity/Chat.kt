package com.fredrikbogg.android_chat_app.data.db.entity

import com.google.firebase.database.PropertyName


/**read it */
data class Chat(
    @get:PropertyName("lastMessage") @set:PropertyName("lastMessage") var lastMessage: Message = Message(),
    @get:PropertyName("info") @set:PropertyName("info") var info: ChatInfo = ChatInfo()
)

/**read it*/
data class ChatInfo(
    @get:PropertyName("id") @set:PropertyName("id") var id: String = ""
)