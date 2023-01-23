package app.zimablue.retrofitcrypto.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
//    @SerializedName("currency") Bunlarin yorum satiri olmasinin nedeni kotlinde ismini degistirmiyorsak yazmamiza gerek kalmamasidir.
    val currency: String,
//    @SerializedName("price")
    val price: String


)