package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.o40;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        try {
            for (Transport transport : Transport.values()) {
                if (string.equals(transport.a)) {
                    return transport;
                }
            }
            if (string.equals("hybrid")) {
                return Transport.HYBRID;
            }
            throw new Transport.UnsupportedTransportException(o40.y("Transport ", string, " not supported"));
        } catch (Transport.UnsupportedTransportException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
