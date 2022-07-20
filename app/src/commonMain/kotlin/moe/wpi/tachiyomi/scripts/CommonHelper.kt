package moe.wpi.tachiyomi.scripts

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.protobuf.ProtoBuf
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToString

import eu.kanade.tachiyomi.data.backup.full.models.Backup

@ExperimentalSerializationApi
class CommonHelper {
    companion object {
        fun parseProtoBufBackup(backupBytes: ByteArray): Backup {
            return ProtoBuf.decodeFromByteArray<Backup>(backupBytes);
        }

        fun viewJsonBackup(backupObj: Backup): String {
            return Json.encodeToString<Backup>(backupObj);
        }
    }
}
