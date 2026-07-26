package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
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
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new ix9(6);
    public static final HashMap h;
    public final HashSet a;
    public final int b;
    public final String c;
    public final int d;
    public final byte[] e;
    public final PendingIntent f;
    public final DeviceMetaData g;

    static {
        HashMap map = new HashMap();
        h = map;
        map.put("accountType", new FastJsonResponse$Field(7, false, 7, false, "accountType", 2, null));
        map.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final /* synthetic */ Map a() {
        return h;
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
            return Integer.valueOf(this.d);
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
            uy6.D(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            uy6.I(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            uy6.w(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            uy6.C(parcel, 5, this.f, i, true);
        }
        if (hashSet.contains(6)) {
            uy6.C(parcel, 6, this.g, i, true);
        }
        uy6.K(iJ, parcel);
    }
}
