package com.example.thegearheadhistoryapp

import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Parcelable {

                override fun describeContents(): Int {
                    TODO("Not yet implemented")
                }

                override fun writeToParcel(dest: Parcel, flags: Int) {
                    TODO("Not yet implemented")
                }

                companion object CREATOR : Parcelable.Creator<MainActivity> {
                    override fun createFromParcel(parcel: Parcel): MainActivity {
                        return MainActivity()
                    }

                    override fun newArray(size: Int): Array<MainActivity?> {
                        return arrayOfNulls(size)
                    }
                }


            }





