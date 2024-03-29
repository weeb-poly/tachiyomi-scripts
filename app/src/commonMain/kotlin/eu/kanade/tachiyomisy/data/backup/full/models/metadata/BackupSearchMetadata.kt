package eu.kanade.tachiyomisy.data.backup.full.models.metadata

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@ExperimentalSerializationApi
@Serializable
data class BackupSearchMetadata(
    @ProtoNumber(1) var uploader: String? = null,
    @ProtoNumber(2) var extra: String,
    @ProtoNumber(3) var indexedExtra: String? = null,
    @ProtoNumber(4) var extraVersion: Int,
)
