package asmnt.com.amoon.lm.mock


import asmnt.com.amoon.lm.domain.model.*
import java.sql.Array
import java.util.ArrayList


object Mocks {

    fun createBooks(): ApiRes {

        lateinit var apiRes : ApiRes
        lateinit var result: Results
        val cor = arrayListOf<Any>()
        val books = ArrayList<Book>()
        val isbn = ArrayList<Isbn>()
        val buy_links = ArrayList<BuyLink>()

        apiRes=ApiRes(
                "OK", "Copyright (c) 2020 The New York Times Company.  All Rights Reserved.",
                "15", "2019-08-29T20:54:03-04:00", result
            )

        result = Results(
            "Combined Print and E-Book Fiction", "combined-print-and-e-book-fiction",
            "2019-08-17", "2019-09-01", "", "2019-09-08",
            "2019-08-25", "Combined Print & E-Book Fiction", 15, "WEEKLY",
            books, cor
        )
        isbn.add(Isbn("0735219095", "9780735219090"))
        buy_links.add(
            (BuyLink(
                "Amazon",
                "https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20"
            ))
        )

        books.add(
            Book(
                1,
                1,
                49,
                0,
                0,
                "0735219095",
                "9780735219090",
                "Putnam",
                "0735219095",
                0,
                "WHERE THE CRAWDADS SING",
                "Delia Owens",
                "by Delia Owens",
                "",
                "https://s1.nyt.com/du/books/images/9780735219090.jpg",
                328,
                495,
                "https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20",
                "",
                "",
                "",
                "",
                "",
                isbn,
                buy_links,
                ""
            )
        )

        books.add(
            Book(
                2,
                1,
                2,
                0,
                0,
                "0735219095",
                "9780735219090",
                "Putnam",
                "0735219095",
                0,
                "WHERE THE CRAWDADS SING",
                " Owens",
                "by Delia ",
                "",
                "https://s1.nyt.com/du/books/images/9780735219090.jpg",
                328,
                495,
                "https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20",
                "",
                "",
                "",
                "",
                "",
                isbn,
                buy_links,
                ""
            )
        )

        books.add(
            Book(
                3,
                1,
                10,
                0,
                0,
                "0735219095",
                "9780735219090",
                "Putnam",
                "0735219095",
                0,
                "WHERE THE CRAWDADS SING",
                "Delia ",
                "by  Owens",
                "",
                "https://s1.nyt.com/du/books/images/9780735219090.jpg",
                328,
                495,
                "https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20",
                "",
                "",
                "",
                "",
                "",
                isbn,
                buy_links,
                ""
            )
        )
        return apiRes
    }

}