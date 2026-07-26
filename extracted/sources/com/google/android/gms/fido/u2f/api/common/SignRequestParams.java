package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rq4;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new uq9(20);
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, ArrayList arrayList, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        rq4.h("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.e = arrayList;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            rq4.h("registered key has null appId and no request appId is provided", (registeredKey.b == null && uri == null) ? false : true);
            String str2 = registeredKey.b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        rq4.h("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        List list = signRequestParams.e;
        if (vy2.w(this.a, signRequestParams.a) && vy2.w(this.b, signRequestParams.b) && vy2.w(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d)) {
            List list2 = this.e;
            if (list2.containsAll(list) && list.containsAll(list2) && vy2.w(this.f, signRequestParams.f) && vy2.w(this.g, signRequestParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.A(parcel, 2, this.a);
        uy6.x(parcel, 3, this.b);
        uy6.C(parcel, 4, this.c, i, false);
        uy6.w(parcel, 5, this.d, false);
        uy6.H(parcel, 6, this.e, false);
        uy6.C(parcel, 7, this.f, i, false);
        uy6.D(parcel, 8, this.g, false);
        uy6.K(iJ, parcel);
    }
}
