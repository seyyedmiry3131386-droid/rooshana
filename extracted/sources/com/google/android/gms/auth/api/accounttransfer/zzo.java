package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.ds9;
import defpackage.rm7;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new ds9(25);
    public static final HashMap f;
    public final HashSet a;
    public final int b;
    public final ArrayList c;
    public final int d;
    public final zzs e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put("progress", new FastJsonResponse$Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.a = hashSet;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = zzsVar;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return f;
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
            uy6.H(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            uy6.I(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            uy6.C(parcel, 4, this.e, i, true);
        }
        uy6.K(iJ, parcel);
    }
}
