package com.uty.mylistview.model

import com.uty.mylistview.R

object FoodData {
    private val foodName = arrayOf(
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
        "Tari Saman adalah sebuah tarian Suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat.\n.",
        ".",
        ".",
        "Burger adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan ditengahnya diisi dengan patty yang biasanya di ambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombay. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard. Beberapa varian burger juga dilengkapi dengan keju, asinan, serta bahan pelengkap lain seperti sosis dan ham.",
        "Pizza adalah sejenis roti bundar, pipih yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella atau “keju pizza”.",
        "Cireng adalah jenis makanan ringan yang berasal dari daerah Sunda. Cireng ini dibuat dengan cara menggoreng campuran adonan yang bahan utamanya adalah tepung kanji atau tepung tapioka.",
        "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.",
        "Lotek adalah makanan khas jawa barat yang banyak dijual disekitaran jalan. Lotek merupakan makanan yang mudah untuk dijangkau baik dalam segi harga maupun rasa karena lotek adalah makanan yang dikategorikan murah tetapi memiliki rasa yang enak.",
        "Lontong adalah makanan khas Indonesia yang berkembang di masyarakat Jawa, terbuat dari beras yang dibungkus dalam daun pisang dan dikukus di atas air mendidih selama beberapa jam dan jika air hampir habis dituangkan air lagi demikian berulang sampai beberapa kali. Lontong umumnya disajikan dengan sate, rujak, atau gulai kambing.",
        "Pecel adalah makanan khas Kota Madiun Jawa Timur Indonesia yang terbuat dari rebusan sayuran berupa bayam, tauge, kacang panjang, kemangi, daun turi, krai (sejenis mentimun) atau sayuran lainnya yang dihidangkan dengan disiram sambal pecel.")

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
        R.drawable.taritortot)

    val listFood: ArrayList<Food>
        get() {
            var list :ArrayList<mantap> = arrayListOf<Food>()
            for (position: Int in foodName.indices){
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = poster[position]
                list.add(food)
            }
            return list
        }
}