package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class hv9 extends ph9 {
    public final kg3 p0(dr5 dr5Var, String str, int i, dr5 dr5Var2) {
        Parcel parcelN0 = n0();
        jm9.b(parcelN0, dr5Var);
        parcelN0.writeString(str);
        parcelN0.writeInt(i);
        jm9.b(parcelN0, dr5Var2);
        Parcel parcelM0 = m0(2, parcelN0);
        kg3 kg3VarP0 = dr5.p0(parcelM0.readStrongBinder());
        parcelM0.recycle();
        return kg3VarP0;
    }

    public final kg3 q0(dr5 dr5Var, String str, int i, dr5 dr5Var2) {
        Parcel parcelN0 = n0();
        jm9.b(parcelN0, dr5Var);
        parcelN0.writeString(str);
        parcelN0.writeInt(i);
        jm9.b(parcelN0, dr5Var2);
        Parcel parcelM0 = m0(3, parcelN0);
        kg3 kg3VarP0 = dr5.p0(parcelM0.readStrongBinder());
        parcelM0.recycle();
        return kg3VarP0;
    }
}
