package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new th9(20);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
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
        uy6.I(parcel, 4, 8);
        parcel.writeLong(this.d);
        uy6.I(parcel, 5, 8);
        parcel.writeLong(this.e);
        uy6.D(parcel, 6, this.f, false);
        uy6.D(parcel, 7, this.g, false);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.h);
        uy6.I(parcel, 9, 4);
        parcel.writeInt(this.i);
        uy6.K(iJ, parcel);
    }
}
