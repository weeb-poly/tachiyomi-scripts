package eu.kanade.tachiyomisy.data.backup.full.models.metadata

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@ExperimentalSerializationApi
@Serializable
data class BackupSearchTitle(
    @ProtoNumber(1) var title: String,
    @ProtoNumber(2) var type: Int,
)
