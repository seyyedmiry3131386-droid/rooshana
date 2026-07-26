package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ak9 extends ph9 implements dk9 {
    public final boolean p0() {
        Parcel parcelM0 = m0(7, n0());
        int i = jm9.a;
        boolean z = parcelM0.readInt() != 0;
        parcelM0.recycle();
        return z;
    }
}
