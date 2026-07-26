package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new ds9(7);
    public final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, ArrayList arrayList, String str2) {
        this.a = i;
        rq4.k(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = arrayList;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && vy2.w(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && vy2.w(this.f, tokenData.f) && vy2.w(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.B(parcel, 3, this.c);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.F(parcel, 6, this.f);
        uy6.D(parcel, 7, this.g, false);
        uy6.K(iJ, parcel);
    }
}
