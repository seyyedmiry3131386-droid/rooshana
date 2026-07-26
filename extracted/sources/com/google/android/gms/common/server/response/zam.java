package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new th9(16);
    public final int a;
    public final String b;
    public final FastJsonResponse$Field c;

    public zam(int i, String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.a = i;
        this.b = str;
        this.c = fastJsonResponse$Field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.K(iJ, parcel);
    }

    public zam(String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.a = 1;
        this.b = str;
        this.c = fastJsonResponse$Field;
    }
}
