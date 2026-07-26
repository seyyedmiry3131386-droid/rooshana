package ir.mservices.market.views;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import ir.mservices.market.views.MyketMultiRadio;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        MyketMultiRadio.Item item = new MyketMultiRadio.Item();
        item.a = parcel.readString();
        item.b = parcel.readParcelable(MyketMultiRadio.Item.class.getClassLoader());
        item.c = parcel.readString();
        item.d = parcel.readString();
        item.e = parcel.readString();
        item.f = parcel.readString();
        item.g = Boolean.valueOf(parcel.readByte() == 1);
        item.h = Boolean.valueOf(parcel.readByte() == 1);
        return item;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MyketMultiRadio.Item[i];
    }
}
