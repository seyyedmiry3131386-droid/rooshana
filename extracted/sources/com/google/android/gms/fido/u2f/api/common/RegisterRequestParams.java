package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rq4;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new up9(15);
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public RegisterRequestParams(Integer num, Double d, Uri uri, ArrayList arrayList, ArrayList arrayList2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        rq4.h("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.d = arrayList;
        this.e = arrayList2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            rq4.h("register request has null appId and no request appId is provided", (uri == null && registerRequest.d == null) ? false : true);
            String str2 = registerRequest.d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            rq4.h("registered key has null appId and no request appId is provided", (uri == null && registeredKey.b == null) ? false : true);
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        rq4.h("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.g = str;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        List list2 = registerRequestParams.e;
        return vy2.w(this.a, registerRequestParams.a) && vy2.w(this.b, registerRequestParams.b) && vy2.w(this.c, registerRequestParams.c) && vy2.w(this.d, registerRequestParams.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && vy2.w(this.f, registerRequestParams.f) && vy2.w(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.A(parcel, 2, this.a);
        uy6.x(parcel, 3, this.b);
        uy6.C(parcel, 4, this.c, i, false);
        uy6.H(parcel, 5, this.d, false);
        uy6.H(parcel, 6, this.e, false);
        uy6.C(parcel, 7, this.f, i, false);
        uy6.D(parcel, 8, this.g, false);
        uy6.K(iJ, parcel);
    }
}
