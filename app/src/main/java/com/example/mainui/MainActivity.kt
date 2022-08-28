package com.example.mainui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navi_header.*
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var my_btn : ImageButton = findViewById<ImageButton>(R.id.my_diary_btn)
        var map_btn : ImageView = findViewById<ImageView>(R.id.Button11)

        val retrofit = Retrofit.Builder().baseUrl(" http://3.39.158.43:8088/")
            .addConverterFactory(GsonConverterFactory.create()).build();
        val service = retrofit.create(INetworkService::class.java);

       /* // 문자열 요청
       val url: String = "http://3.39.158.43:8088/"


        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> {
                Log.d("kkang", "server data : $it")
            },
            Response.ErrorListener { error ->
                Log.d("kkang", "error......$error")
            })
        val queue = Volley.newRequestQueue(this)
        queue.add(stringRequest)


        //json 배열 요청
        val url: String = "http://3.39.158.43:8088/"


        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET,
            url,
            null,
            Response.Listener<JSONArray> { response ->
                Log.d("kkang","success!!! $response.length()")
                /*for (i in 0 until response.length()) {
                    val jsonObject = response[i] as JSONObject
                    val title = jsonObject.getString("title")
                    val date = jsonObject.getString("date")
                    Log.d("kkang", "$title, $date")
                }*/
            },
            Response.ErrorListener { error -> Log.d("kkang", "error......$error") }
        )

        val queue = Volley.newRequestQueue(this)
        queue.add(jsonArrayRequest)
*/


        my_btn.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)

        }

        map_btn.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            Log.d("test","맵 버튼 클릭")

        }
        camera_btn.setOnClickListener{
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        right_btn.setOnClickListener{
            thread(start=true){

            }
        }


    }
}