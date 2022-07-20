package moe.wpi.tachiyomi.scripts

import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
fun main(args: Array<String>) {
    val fileName = "tachiyomi_test.proto.gz";
    val backupFile = JvmHelper.getResourceFile(fileName);
    val backupBytes = JvmHelper.gzipDecompress(backupFile);
    val backup = CommonHelper.parseProtoBufBackup(backupBytes);
    println(CommonHelper.viewJsonBackup(backup));
}
