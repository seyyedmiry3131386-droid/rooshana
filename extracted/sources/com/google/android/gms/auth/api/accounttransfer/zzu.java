package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.ix9;
import defpackage.rm7;
import defpackage.uy6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new ix9(4);
    public static final HashMap g;
    public final HashSet a;
    public final int b;
    public final zzw c;
    public final String d;
    public final String e;
    public final String f;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse$Field(7, false, 7, false, "package", 4, null));
    }

    public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i;
        this.c = zzwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(rm7.n(fastJsonResponse$Field.g, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            uy6.I(parcel, 1, 4);
            parcel.writeInt(this.b);
        }
        if (hashSet.contains(2)) {
            uy6.C(parcel, 2, this.c, i, true);
        }
        if (hashSet.contains(3)) {
            uy6.D(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            uy6.D(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            uy6.D(parcel, 5, this.f, true);
        }
        uy6.K(iJ, parcel);
    }
}
