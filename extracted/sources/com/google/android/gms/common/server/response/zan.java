package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.t61;
import defpackage.th9;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new th9(18);
    public final int a;
    public final HashMap b;
    public final String c;

    public zan(int i, String str, ArrayList arrayList) {
        this.a = i;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.b;
            ArrayList arrayList2 = zalVar.c;
            HashMap map2 = new HashMap();
            rq4.n(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) arrayList2.get(i3);
                map2.put(zamVar.b, zamVar.c);
            }
            map.put(str2, map2);
        }
        this.b = map;
        rq4.n(str);
        this.c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map3.get((String) it2.next())).j = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = this.b;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                t61.y(sb, "  ", str2, ": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.b;
        for (String str : map.keySet()) {
            arrayList.add(new zal((Map) map.get(str), str));
        }
        uy6.H(parcel, 2, arrayList, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.K(iJ, parcel);
    }
}
