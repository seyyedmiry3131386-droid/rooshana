package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.th9;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new th9(19);
    public final int a;
    public final String b;
    public final ArrayList c;

    public zal(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.H(parcel, 3, this.c, false);
        uy6.K(iJ, parcel);
    }

    public zal(Map map, String str) {
        ArrayList arrayList;
        this.a = 1;
        this.b = str;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList2.add(new zam(str2, (FastJsonResponse$Field) map.get(str2)));
            }
            arrayList = arrayList2;
        }
        this.c = arrayList;
    }
}
