package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.pika.PikaEventBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class v76 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new PikaEventBuilder(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PikaEventBuilder[i];
    }
}
