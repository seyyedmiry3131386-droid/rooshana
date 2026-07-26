package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ao6;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new ao6(29);
    public final int a;
    public final int b;
    public final int c;
    public final Scope[] d;

    public zaaa(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.G(parcel, 4, this.d, i);
        uy6.K(iJ, parcel);
    }
}
