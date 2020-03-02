package asmnt.com.amoon.lm.domain.model

import com.google.gson.annotations.SerializedName

data class BuyLink(
        @SerializedName("name") var name: String,
        @SerializedName("url") var url: String
)