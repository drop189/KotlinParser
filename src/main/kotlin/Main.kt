package org.example

import org.jsoup.Jsoup

fun main() {
    val doc = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    ).get()
    val quotes = doc.select("article")
    for (quote in quotes) {
        println("${quote.text()}\n")
    }
}