// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.example.kotlin_modern_kakao_book_api.`data`.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.text.buildString

public class BookJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<Book>() {
  private val options: JsonReader.Options = JsonReader.Options.of("authors", "contents", "datetime",
      "isbn", "price", "publisher", "sale_price", "status", "thumbnail", "title", "translators",
      "url")

  private val listOfStringAdapter: JsonAdapter<List<String>> =
      moshi.adapter(Types.newParameterizedType(List::class.java, String::class.java), emptySet(),
      "authors")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "contents")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "price")

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("Book").append(')') }

  public override fun fromJson(reader: JsonReader): Book {
    var authors: List<String>? = null
    var contents: String? = null
    var datetime: String? = null
    var isbn: String? = null
    var price: Int? = null
    var publisher: String? = null
    var salePrice: Int? = null
    var status: String? = null
    var thumbnail: String? = null
    var title: String? = null
    var translators: List<String>? = null
    var url: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> authors = listOfStringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("authors",
            "authors", reader)
        1 -> contents = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("contents",
            "contents", reader)
        2 -> datetime = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("datetime",
            "datetime", reader)
        3 -> isbn = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("isbn", "isbn",
            reader)
        4 -> price = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("price", "price",
            reader)
        5 -> publisher = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("publisher",
            "publisher", reader)
        6 -> salePrice = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("salePrice",
            "sale_price", reader)
        7 -> status = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("status",
            "status", reader)
        8 -> thumbnail = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("thumbnail",
            "thumbnail", reader)
        9 -> title = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("title", "title",
            reader)
        10 -> translators = listOfStringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("translators", "translators", reader)
        11 -> url = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("url", "url",
            reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return Book(
        authors = authors ?: throw Util.missingProperty("authors", "authors", reader),
        contents = contents ?: throw Util.missingProperty("contents", "contents", reader),
        datetime = datetime ?: throw Util.missingProperty("datetime", "datetime", reader),
        isbn = isbn ?: throw Util.missingProperty("isbn", "isbn", reader),
        price = price ?: throw Util.missingProperty("price", "price", reader),
        publisher = publisher ?: throw Util.missingProperty("publisher", "publisher", reader),
        salePrice = salePrice ?: throw Util.missingProperty("salePrice", "sale_price", reader),
        status = status ?: throw Util.missingProperty("status", "status", reader),
        thumbnail = thumbnail ?: throw Util.missingProperty("thumbnail", "thumbnail", reader),
        title = title ?: throw Util.missingProperty("title", "title", reader),
        translators = translators ?: throw Util.missingProperty("translators", "translators",
            reader),
        url = url ?: throw Util.missingProperty("url", "url", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: Book?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("authors")
    listOfStringAdapter.toJson(writer, value_.authors)
    writer.name("contents")
    stringAdapter.toJson(writer, value_.contents)
    writer.name("datetime")
    stringAdapter.toJson(writer, value_.datetime)
    writer.name("isbn")
    stringAdapter.toJson(writer, value_.isbn)
    writer.name("price")
    intAdapter.toJson(writer, value_.price)
    writer.name("publisher")
    stringAdapter.toJson(writer, value_.publisher)
    writer.name("sale_price")
    intAdapter.toJson(writer, value_.salePrice)
    writer.name("status")
    stringAdapter.toJson(writer, value_.status)
    writer.name("thumbnail")
    stringAdapter.toJson(writer, value_.thumbnail)
    writer.name("title")
    stringAdapter.toJson(writer, value_.title)
    writer.name("translators")
    listOfStringAdapter.toJson(writer, value_.translators)
    writer.name("url")
    stringAdapter.toJson(writer, value_.url)
    writer.endObject()
  }
}
