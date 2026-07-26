package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class kx9 extends ph9 implements qx9 {
    @Override // defpackage.qx9
    public final int c() {
        Parcel parcelM0 = m0(2, n0());
        int i = parcelM0.readInt();
        parcelM0.recycle();
        return i;
    }

    @Override // defpackage.qx9
    public final kg3 i() {
        Parcel parcelM0 = m0(1, n0());
        kg3 kg3VarP0 = dr5.p0(parcelM0.readStrongBinder());
        parcelM0.recycle();
        return kg3VarP0;
    }
}
