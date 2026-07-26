package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.nj9;
import defpackage.o40;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new nj9(14);
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final String i;
    public final long j;
    public final int k;
    public final String l;
    public final float m;
    public final long n;
    public final boolean o;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, ArrayList arrayList, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i3;
        this.h = arrayList;
        this.i = str2;
        this.j = j2;
        this.k = i4;
        this.l = str4;
        this.m = f;
        this.n = j3;
        this.o = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int U() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String l0() {
        List list = this.h;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        String str = this.d;
        int length = String.valueOf(str).length();
        int i = this.g;
        int length2 = String.valueOf(i).length() + length + 2;
        int length3 = String.valueOf(strJoin).length();
        int i2 = this.k;
        int length4 = String.valueOf(i2).length() + length2 + 1 + length3 + 1;
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        int length5 = str2.length() + length4 + 1 + 1;
        String str3 = this.l;
        if (str3 == null) {
            str3 = "";
        }
        int length6 = str3.length() + length5 + 1;
        float f = this.m;
        int length7 = String.valueOf(f).length() + length6 + 1;
        String str4 = this.f;
        String str5 = str4 != null ? str4 : "";
        int length8 = str5.length() + length7 + 1;
        boolean z = this.o;
        StringBuilder sb = new StringBuilder(length8 + String.valueOf(z).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        o40.I("\t", str2, "\t", str3, sb);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long u() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 8);
        parcel.writeLong(this.b);
        uy6.D(parcel, 4, this.d, false);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.g);
        uy6.F(parcel, 6, this.h);
        uy6.I(parcel, 8, 8);
        parcel.writeLong(this.j);
        uy6.D(parcel, 10, this.e, false);
        uy6.I(parcel, 11, 4);
        parcel.writeInt(this.c);
        uy6.D(parcel, 12, this.i, false);
        uy6.D(parcel, 13, this.l, false);
        uy6.I(parcel, 14, 4);
        parcel.writeInt(this.k);
        uy6.I(parcel, 15, 4);
        parcel.writeFloat(this.m);
        uy6.I(parcel, 16, 8);
        parcel.writeLong(this.n);
        uy6.D(parcel, 17, this.f, false);
        uy6.I(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
