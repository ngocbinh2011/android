package au.edu.swin.sdmd.myapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Model(val image: String, var name: String, val detail: String, val rate: Float, var date: String) : Parcelable{
}