# Daftar Hero MLBB

Ini adalah aplikasi daftar hero Mobile Legends: Bang Bang (MLBB) yang dibuat sebagai proyek akhir dari kursus **Membuat Aplikasi Android untuk Pemula** di Dicoding.

## Fitur
- Menampilkan daftar hero MLBB lengkap.
- Menampilkan detail hero seperti nama, role, skill, dan lain-lain.
- Navigasi antar halaman menggunakan `RecyclerView` dan `Intent`.
- Desain antarmuka menggunakan `ConstraintLayout`.

## Teknologi yang Digunakan
- **Bahasa Pemrograman:** Kotlin
- **IDE:** Android Studio
- **Desain Layout:** ConstraintLayout
- **Komponen UI:** RecyclerView, Adapter, Intent
- **Data:** Hero disimpan dalam list statis.

## Cara Instalasi
1. Clone repository ini ke komputer lokal Anda.
2. Buka project ini menggunakan Android Studio.
3. Jalankan aplikasi di emulator atau perangkat Android fisik.

## Struktur Proyek
- **MainActivity.kt**: Menampilkan daftar hero menggunakan `RecyclerView`.
- **DetailActivity.kt**: Menampilkan detail hero ketika salah satu hero di klik.
- **Adapter.kt**: Menghubungkan data hero dengan RecyclerView.
- **model/Hero.kt**: Data class untuk hero.
- **res/layout**: Menyimpan file layout XML untuk tampilan UI.

## Kontribusi
Kontribusi sangat diterima! Jangan ragu untuk melakukan fork, lalu ajukan pull request.

## Lisensi
Aplikasi ini menggunakan lisensi MIT.
