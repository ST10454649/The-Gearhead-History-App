package com.example.thegearheadhistoryapp

import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    @Composable
    fun CreateFromParcel(parcel: Parcel) {
        return Row {
            MainActivity(parcel = parcel)
        }
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(source: Parcel?): MainActivity {
            TODO("Not yet implemented")
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

