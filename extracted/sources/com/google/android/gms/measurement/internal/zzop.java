package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzop implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        while (true) {
            ArrayList arrayList = null;
            while (parcel.dataPosition() < iJ) {
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    cc7.E(i, parcel);
                } else {
                    int iC = cc7.C(i, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iC == 0) {
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = parcel.readInt();
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList2.add(Integer.valueOf(parcel.readInt()));
                    }
                    parcel.setDataPosition(iDataPosition + iC);
                    arrayList = arrayList2;
                }
            }
            cc7.p(iJ, parcel);
            return new zzoo(arrayList);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoo[i];
    }
}
