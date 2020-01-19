package com.hanifa.marketfood1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;

public class Menu_Daftar_Makanan extends AppCompatActivity {
    ListView lvItem;
    EditText Edtcari;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= findViewById(R.id.listView1);
        Edtcari     = findViewById(R.id.editText1);


        Gambar		= new int[]{
                R.mipmap.ayam_bakar,
                R.mipmap.ayam_geprek,
                R.mipmap.mie_ayam,
                R.mipmap.tumis_bunga_pepaya,
                R.mipmap.bakso,
                R.mipmap.nasi_goreng,
                R.mipmap.rawon,
                R.mipmap.soto,
                R.mipmap.martabak,
                R.mipmap.es_campur,
                R.mipmap.es_dawet,
                R.mipmap.es_kelapa};

        NamaItem 	= new String[]{
                "Ayam Bakar Madu",
                "Ayam Geprek",
                "Mie Ayam",
                "Sayur Tumis Pepaya",
                "Bakso",
                "Nasi Goreng",
                "Rawon",
                "Soto",
                "Martabak Manis",
                "Es Campur",
                "Es Dawet",
                "Es Kelapa Muda"};

        HargaItem 	= new String[]{
                "Rp. 35.000",
                "Rp. 15.000",
                "Rp. 10.000",
                "Rp. 20.000",
                "Rp. 25.000",
                "Rp. 13.000",
                "Rp. 20.000",
                "Rp. 25.000",
                "Rp. 17.000",
                "Rp. 15.000",
                "Rp. 7.000",
                "Rp. 13.000"};

        Deskripsi 	= new String[]{
                "Ayam Bakar Madu. Adalah makanan olahan yang berasal dari bahan utama berupa ayam yang dibakar dengan bumbu madu",

                "Ayam Geprek adalah sajian makanan ayam goreng tepung dengan cara digeprek/ditumbuk dengan ulekan " +
                        "bersamaan dengan sambalnya hingga daging menjadi rata. Makanan khas kota Yogyakarta ini " +
                        "memang sudah dikenal oleh banyak masyarakat. Berbahan dasar ayam yang " +
                        "dilumuri tepung membuatnya menjadi ”crunchy”.",

                "Mie ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mie kuning direbus mendidih kemudian " +
                        "ditaburi saos kecap khusus beserta daging ayam dan sayuran. " +
                        "Mie Ayam terkadang ditambahi dengan bakso, pangsit dan jamur. ",

                "Sayur tumis pepaya merupakan makanan khas daerah NTT, dimana sayur ini tidak memiliki " +
                        "rasa pahit namun sangat nikmat dan manis bila disantap dengan ikan panggang " +
                        "atau menu makanan lainnya yang berkuah",

                "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia." +
                        " Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan " +
                        "tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.",

                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin," +
                        " biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, " +
                        "seperti telur, ayam, dan kerupuk. Ada pula nasi goreng jenis lain " +
                        "yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.",

                "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. " +
                        "Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat " +
                        "Jawa Tengah sebelah timur (daerah Surakarta).",

                "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari " +
                        "kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, " +
                        "tetapi ada pula yang menggunakan daging kambing.",

                " Martabak Manis adalah makanan terbuat dr adonan terigu, telur, gula, " +
                        "yg ditaburi bubuk kacang tanah dan cokelat, kemudian dipanggang dan dilipat",

                "Es campur adalah salah satu minuman khas Indonesia yang cara membuat nya dengan mencampurkan berbagai " +
                        "jenis bahan dalam sirup manis. Bahan yang dijadikan bahan biasanya berasa manis atau masam. " +
                        "Es campur dapat dijumpai di berbagai daerah di Indonesia dengan rasa dan bahan yang berbeda.",

                "Es Dawet merupakan minuman khas Jawa yang terbuat dari tepung beras ataupun tepung beras ketan, " +
                        "disajikan dengan es parut serta gula merah cair dan santan. Rasa minuman ini manis dan gurih.",

                "Es kelapa muda atau es degan (Inggris: young coconut ice) adalah minuman segar penyejuk dahaga yang " +
                        "terbuat dari daging dan air kelapa yang masih muda. Es kelapa muda merupakan minuman yang " +
                        "berasal dari Indonesia yang banyak digemari oleh orang-orang.",

        };

        //Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",
                "+6283852364205",

        };

        Lat  = new String[]{
                "-7.718647",
                "-7.703324",
                "-7.703324",
                "-7.703324",
                "-7.718647",
                "-7.718647",
                "-7.718647",
                "-7.718647",
                "-7.718647",
                "-7.718647",
                "-7.718647",
                "-7.718647"
        };

        Long  = new String[]{
                "112.722284",
                "112.728211",
                "112.722281",
                "112.722281",
                "112.722281",
                "112.722281",
                "112.722284",
                "112.722284",
                "112.722284",
                "112.722284",
                "112.722284",
                "112.722284"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

        Edtcari.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                String text = Edtcari.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);
                showToastMessage();
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                //TODO Auto-generated method stub
            }
            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                //TODO Auto-generated method stub
            }
        });

    }

    void showToastMessage(){
        Toast.makeText(this, "Pencarian dilakukan", Toast.LENGTH_SHORT).show();
    }

}
