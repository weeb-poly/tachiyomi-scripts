package moe.wpi.tachiyomi.scripts

import java.io.File
import java.io.FileInputStream
import java.util.zip.GZIPInputStream

class JvmHelper {
    companion object {
        fun getResourceFile(resourcePath: String): File {
            return File(ClassLoader.getSystemResource(resourcePath).file);
        }

        fun gzipDecompress(file: File): ByteArray {
            return GZIPInputStream(FileInputStream(file)).use { it.readBytes() };
        }
    }
}
