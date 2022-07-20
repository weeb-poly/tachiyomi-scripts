package eu.kanade.tachiyomi.data.backup.full.models

import eu.kanade.tachiyomisy.data.backup.full.models.BackupSavedSearch

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

/*
 * Contains Models from:
 * - Tachiyomi (0.13.5)
 * - Neko (2.9.4)
 * - TachiyomiJ2K (1.5.5)
 * - TachiyomiAZ (8.7.0)
 * - TachiyomiSY (1.8.4)
 */

@ExperimentalSerializationApi
@Serializable
data class Backup(
    @ProtoNumber(1) val backupManga: List<BackupManga>,
    @ProtoNumber(2) var backupCategories: List<BackupCategory> = emptyList(),

    // Bump by 100 to specify this is a 0.x value
    @ProtoNumber(100) var backupBrokenSources: List<BrokenBackupSource> = emptyList(),
    @ProtoNumber(101) var backupSources: List<BackupSource> = emptyList(),

    // SY specific values
    @ProtoNumber(600) var backupSavedSearches: List<BackupSavedSearch> = emptyList(),
)
