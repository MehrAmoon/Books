package asmnt.com.amoon.lm.domain.model

import com.google.gson.annotations.SerializedName

data class Book(
        @SerializedName("rank") var rank: Int,
        @SerializedName("rank_last_week") var rank_last_week: Int,
        @SerializedName("weeks_on_list") var weeks_on_list: Int,
        @SerializedName("asterisk") var asterisk: Int,
        @SerializedName("dagger") var dagger: Int,
        @SerializedName("primary_isbn10") var primary_isbn10: String,
        @SerializedName("primary_isbn13") var primary_isbn13: String,
        @SerializedName("publisher") var publisher: String,
        @SerializedName("description") var description: String,
        @SerializedName("price") var price: Int,
        @SerializedName("title") var title: String,
        @SerializedName("author") var author: String,
        @SerializedName("contributor") var contributor: String,
        @SerializedName("contributor_note") var contributor_note: String,
        @SerializedName("book_image") var book_image: String,
        @SerializedName("book_image_width") var book_image_width: Int,
        @SerializedName("book_image_height") var book_image_height: Int,
        @SerializedName("amazon_product_url") var amazon_product_url: String,
        @SerializedName("age_group") var age_group: String,
        @SerializedName("book_review_link") var book_review_link: String,
        @SerializedName("first_chapter_link") var first_chapter_link: String,
        @SerializedName("sunday_review_link") var sunday_review_link: String,
        @SerializedName("article_chapter_link") var article_chapter_link: String,
        @SerializedName("isbns") var isbns: List<Isbn>,
        @SerializedName("buy_links") var buy_links: List<BuyLink>,
        @SerializedName("book_uri") var book_uri: String


)
