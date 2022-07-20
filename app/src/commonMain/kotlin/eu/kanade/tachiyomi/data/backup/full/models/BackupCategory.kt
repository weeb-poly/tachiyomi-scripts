package eu.kanade.tachiyomi.data.backup.full.models

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@ExperimentalSerializationApi
@Serializable
class BackupCategory(
    @ProtoNumber(1) var name: String,
    @ProtoNumber(2) var order: Long = 0,

    // @Deprecated("1.x value not used in 0.x")
    // @ProtoNumber(3) val updateInterval: Int = 0,

    // Bump by 100 to specify this is a 0.x value
    @ProtoNumber(100) var flags: Long = 0,

    // SY specific values
    @ProtoNumber(600) var mangaOrder: List<Long> = emptyList(),

    // J2K Specific values
    @ProtoNumber(800) var mangaSort: Char? = null,
)
