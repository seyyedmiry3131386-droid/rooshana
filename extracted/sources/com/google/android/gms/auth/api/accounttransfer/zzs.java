package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.ix9;
import defpackage.rm7;
import defpackage.uy6;
import defpackage.wv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new ix9(0);
    public static final wv g;
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        wv wvVar = new wv(0);
        g = wvVar;
        wvVar.put("registered", FastJsonResponse$Field.u(2, "registered"));
        wvVar.put("in_progress", FastJsonResponse$Field.u(3, "in_progress"));
        wvVar.put("success", FastJsonResponse$Field.u(4, "success"));
        wvVar.put("failed", FastJsonResponse$Field.u(5, "failed"));
        wvVar.put("escrowed", FastJsonResponse$Field.u(6, "escrowed"));
    }

    public zzs(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Map a() {
        return g;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        switch (fastJsonResponse$Field.g) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException(rm7.n(fastJsonResponse$Field.g, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean d(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.F(parcel, 2, this.b);
        uy6.F(parcel, 3, this.c);
        uy6.F(parcel, 4, this.d);
        uy6.F(parcel, 5, this.e);
        uy6.F(parcel, 6, this.f);
        uy6.K(iJ, parcel);
    }
}
