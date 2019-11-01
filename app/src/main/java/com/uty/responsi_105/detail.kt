package com.uty.mylistview.model


import com.uty.responsi_105.R
import com.uty.responsi_105.tari

object detail {
    private val tariName = arrayOf(
        "tariaceh",
        "taribali",
        "taribetawi",
        "tarijogja",
        "tarikalimantan",
        "tarilampung",
        "tarimandau",
        "taripapua",
        "taripiring",
        "taritortor")

    private val detail = arrayOf(
        "Tari Saman adalah sebuah tarian Suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat.",
        "Tari Kecak biasa disebut Tari Cak atau tari api. Tarian ini merupakan tarian pertunjukkan hiburan masal yang menggambarkan seni peran dan tidak diiringi oleh alat musik atau gamelan.",
        "Tari Kecak biasa disebut Tari Cak atau tari api. Tarian ini merupakan tarian pertunjukkan hiburan masal yang menggambarkan seni peran dan tidak diiringi oleh alat musik atau gamelan.",
        "Tari Serimpi merupakan Tarian yang cukup populer di Yogyakarta.",
        "Tarian ini menceritakan tentang kehidupan dari burung Enggang. Burung Enggang merupakan burung yang sangat diagungkan oleh suku Dayak.",
        "Tarian yang sudah sangat popular dikalangan masyarakat Lampung itu sendiri, menjadi tarian pertama yang berada di Lampung.",
        "Tari Mandau adalah salah satu kesenian tari tradisional suku Dayak, yang menampilkan atraksi dalam memainkan Mandau sebagai property tarianya.",
        "Tari Musyoh merupakan salah satu tarian sakral asal Papua, dan tarian ini diadakan jika ada sanak saudara ataupun warga yang mengalami kecelakaan maut dan diperkirakan arwahnya tidak tenang.",
        "Tari piring atau tari piriang dalam bahasa Minangkabau adalah tarian tradisional Minangkabau yang melibatkan atraksi piring.",
        "Tari Tor Tor Merupakan sebuah tarian perayaan yang sudah ada sejak ratusan tahun yang lalu. Tarian ini berasa dari Batak Toba, Sumatera Utara.")

    private val poster = intArrayOf(
        R.drawable.tariaceh,
        R.drawable.taribali,
        R.drawable.taribetawi,
        R.drawable.tarijogja,
        R.drawable.tarikalimantan,
        R.drawable.tarilampung,
        R.drawable.tarimandau,
        R.drawable.taripapua,
        R.drawable.taripiring,
        R.drawable.taritortor)

    val listtari: ArrayList<tari>
        get() {
            var list: ArrayList<tari> = arrayListOf<tari>()
            for (position: Int in detail.indices) {
                val tari = tari()
                tari.name = tariName [position]
                tari.detail = detail[position]
                tari.poster = poster[position]
                list.add(tari)
            }
            return list
        }
}