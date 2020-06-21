package com.ncorti.kotlin.template.app.database

import android.provider.BaseColumns

object DBContract {

    /* Inner class that defines the table contents */
    class UserEntry : BaseColumns {
        companion object {
            val TABLE_NAME = "veg"
            val COLUMN_ID = "id"
            val COLUMN_veg = "veg"
            val COLUMN_pref = "pref"
            val COLUMN_price = "price"
            val COLUMN_energy = "energy"
            val COLUMN_carbon = "carbon"
            val COLUMN_water = "water"
        }
    }
}