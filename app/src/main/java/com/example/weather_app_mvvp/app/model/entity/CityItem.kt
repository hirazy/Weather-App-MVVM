package com.example.weather_app_mvvp.app.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weather_app_mvvp.base.OBase
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("hits")
    var cityItem: List<CityItem>
)


@Entity(tableName = "CITY_ITEM")
data class CityItem(
    @SerializedName("country")
    var country: String? = "",

    @SerializedName("country_code")
    var countryCode: String? = "",

    @SerializedName("is_city")
    var isCity: Boolean? = true,

    @SerializedName("is_country")
    var isCountry: Boolean? = true,

    @SerializedName("administrative")
    var administrative: List<String>? = null,

    @SerializedName("admin_level")
    var adminLevel: Int? = null,

    @SerializedName("postcode")
    var postcode: List<String>? = null,

    @SerializedName("county")
    var county: List<String>? = null,

    @SerializedName("_geoloc")
    var geoloc: Geoloc? = null,

    @SerializedName("importance")
    var importance: Int? = null,

    @SerializedName("objectID")
    var objectID: String? = null,

    @SerializedName("is_suburb")
    var isSuburb: Boolean? = null,

    @SerializedName("locale_names")
    var localeNames: List<String>? = null,

    @PrimaryKey(autoGenerate = false) var id: Int? = null
) : OBase()

data class Geoloc(

    @SerializedName("lng")
    var lng: Double? = null,

    @SerializedName("lat")
    var lat: Double? = null
) : OBase()