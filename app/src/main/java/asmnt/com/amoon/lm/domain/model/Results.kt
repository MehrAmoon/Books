package asmnt.com.amoon.lm.domain.model

import com.google.gson.annotations.SerializedName

data class Results(
        @SerializedName("list_name") val list_name: String,
        @SerializedName("list_name_encoded") val list_name_encoded: String,
        @SerializedName("bestsellers_date") val bestsellers_date: String,
        @SerializedName("published_date") val published_date: String,
        @SerializedName("published_date_description") val published_date_description: String,
        @SerializedName("next_published_date") var next_published_date: String,
        @SerializedName("previous_published_date") var previous_published_date: String,
        @SerializedName("display_name") var display_name: String,
        @SerializedName("normal_list_ends_at") var normal_list_ends_at: Int,
        @SerializedName("updated") var updated: String,
        @SerializedName("books") var books: List<Book>,
        @SerializedName("corrections") var corrections: List<Any>
)
