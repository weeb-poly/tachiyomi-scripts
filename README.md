# Tachiyomi Scripts

I made this so I could make changes to Tachiyomi Backup Files (ProtoBuf) programmatically. This also handles data made by forks.

Here's a list of changes made:

- Modified the models to remove dependencies on the Android API and the Tachiyomi App
- Merged the schema of all Tachiyomi forks
  - Tachiyomi forks make changes to the original models instead of storing data in separate linked models
  - Kotlin doesn't allow us to extend `data sealed` to add properties
  - `kotlinx.serialization` doesn't handle polymorphism nicely
- Modified the code in an attempt to make it JVM independent
  - `kotlinx.serialization` is platform independent in theory
  - Kotlin/Native should work once File I/O is implemented and integrated wih `platform.zlib`. This requires manual memory management, since it's basically C code at this point.
  - Kotlin/Js doesn't wrap the "Stream API" and "Compression Streams API". This means that we can't build for web platforms.
  - Kotlin/Wasm would need to have I/O wrappers when the compiler goes public.

This should handle backup files made by:

- Tachiyomi (0.13.5)
- Neko (2.9.4)
- TachiyomiJ2K (1.5.5)
- TachiyomiAZ (8.7.0)
- TachiyomiSY (1.8.4)

I'm sharing this under the off chance that someone else might find it useful.
