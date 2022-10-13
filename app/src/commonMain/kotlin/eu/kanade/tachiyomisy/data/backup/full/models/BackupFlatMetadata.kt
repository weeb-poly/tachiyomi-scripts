package eu.kanade.tachiyomisy.data.backup.full.models

import eu.kanade.tachiyomisy.data.backup.full.models.metadata.BackupSearchMetadata
import eu.kanade.tachiyomisy.data.backup.full.models.metadata.BackupSearchTag
import eu.kanade.tachiyomisy.data.backup.full.models.metadata.BackupSearchTitle

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

/*
* SY flat metadata backup class
 */
@ExperimentalSerializationApi
@Serializable
data class BackupFlatMetadata(
    @ProtoNumber(1) var searchMetadata: BackupSearchMetadata,
    @ProtoNumber(2) var searchTags: List<BackupSearchTag> = emptyList(),
    @ProtoNumber(3) var searchTitles: List<BackupSearchTitle> = emptyList(),
)