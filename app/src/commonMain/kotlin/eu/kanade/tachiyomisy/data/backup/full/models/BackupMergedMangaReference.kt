package eu.kanade.tachiyomisy.data.backup.full.models

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

/*
* SY merged manga backup class
 */
@ExperimentalSerializationApi
@Serializable
data class BackupMergedMangaReference(
    @ProtoNumber(1) var isInfoManga: Boolean,
    @ProtoNumber(2) var getChapterUpdates: Boolean,
    @ProtoNumber(3) var chapterSortMode: Int,
    @ProtoNumber(4) var chapterPriority: Int,
    @ProtoNumber(5) var downloadChapters: Boolean,
    @ProtoNumber(6) var mergeUrl: String,
    @ProtoNumber(7) var mangaUrl: String,
    @ProtoNumber(8) var mangaSourceId: Long,
)
