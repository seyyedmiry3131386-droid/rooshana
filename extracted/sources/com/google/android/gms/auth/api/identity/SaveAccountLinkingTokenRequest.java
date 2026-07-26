package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new nj9(3);
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.d;
        return size == list2.size() && list.containsAll(list2) && vy2.w(this.a, saveAccountLinkingTokenRequest.a) && vy2.w(this.b, saveAccountLinkingTokenRequest.b) && vy2.w(this.c, saveAccountLinkingTokenRequest.c) && vy2.w(this.e, saveAccountLinkingTokenRequest.e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.F(parcel, 4, this.d);
        uy6.D(parcel, 5, this.e, false);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f);
        uy6.K(iJ, parcel);
    }
}
