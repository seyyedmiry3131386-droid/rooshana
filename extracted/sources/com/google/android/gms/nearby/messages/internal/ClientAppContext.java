package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.hm9;
import defpackage.rm7;
import defpackage.rq4;
import defpackage.t61;
import defpackage.uy6;
import io.sentry.android.core.t0;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new hm9(17);
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;

    public ClientAppContext(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = i;
        rq4.n(str);
        this.b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Locale locale = Locale.US;
            t0.m("NearbyMessages", "ClientAppContext: 0P identifier(" + str2 + ") without 0P prefix(0p:)");
            str2 = "0p:".concat(str2);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    public static final ClientAppContext u(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(1, 0, str, str2, null, z);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        String str = clientAppContext.b;
        String str2 = this.b;
        if (!(TextUtils.isEmpty(str2) ? TextUtils.isEmpty(str) : str2.equals(str))) {
            return false;
        }
        String str3 = clientAppContext.c;
        String str4 = this.c;
        if (!(TextUtils.isEmpty(str4) ? TextUtils.isEmpty(str3) : str4.equals(str3)) || this.d != clientAppContext.d) {
            return false;
        }
        String str5 = clientAppContext.f;
        String str6 = this.f;
        return (TextUtils.isEmpty(str6) ? TextUtils.isEmpty(str5) : str6.equals(str5)) && this.e == clientAppContext.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        StringBuilder sbT = rm7.t("{realClientPackageName: ", this.b, ", zeroPartyIdentifier: ", this.c, ", useRealClientApiKey: ");
        t61.z(sbT, this.d, ", apiKey: ", this.f, ", callingContext: ");
        return dw1.k(this.e, "}", sbT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.D(parcel, 6, this.f, false);
        uy6.K(iJ, parcel);
    }
}
