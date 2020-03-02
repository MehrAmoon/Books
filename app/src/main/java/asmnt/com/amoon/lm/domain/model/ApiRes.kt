package asmnt.com.amoon.lm.domain.model

import com.google.gson.annotations.SerializedName

data class ApiRes (
        @SerializedName("status") val status: String,
        @SerializedName("copyright") val copyright: String,
        @SerializedName("num_results") val num_results: String,
        @SerializedName("last_modified") val last_modified: String?,
        @SerializedName("results") val results: Results

)