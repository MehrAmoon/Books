package asmnt.com.amoon.lm.domain.model

import com.google.gson.annotations.SerializedName

data class Isbn(
        @SerializedName("isbn10") var isbn10: String,
        @SerializedName("isbn13") var isbn13: String

)