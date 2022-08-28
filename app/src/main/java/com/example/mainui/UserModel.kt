package com.example.mainui

import android.graphics.Bitmap
import com.google.gson.annotations.SerializedName

data class UserModel(
    var diaryid: Int,
    var writer: Int,
    var date: String,
    var title: String,
    var content: String,
    var avatarBitmap: Bitmap //없는거불러와도됨
)