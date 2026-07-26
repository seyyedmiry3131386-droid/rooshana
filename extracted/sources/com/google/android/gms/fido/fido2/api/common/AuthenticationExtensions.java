package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new hm9(14);
    public final FidoAppIdExtension a;
    public final zzs b;
    public final UserVerificationMethodExtension c;
    public final zzz d;
    public final zzab e;
    public final zzad f;
    public final zzu g;
    public final zzag h;
    public final GoogleThirdPartyPaymentExtension i;
    public final zzai j;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = zzsVar;
        this.d = zzzVar;
        this.e = zzabVar;
        this.f = zzadVar;
        this.g = zzuVar;
        this.h = zzagVar;
        this.i = googleThirdPartyPaymentExtension;
        this.j = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return vy2.w(this.a, authenticationExtensions.a) && vy2.w(this.b, authenticationExtensions.b) && vy2.w(this.c, authenticationExtensions.c) && vy2.w(this.d, authenticationExtensions.d) && vy2.w(this.e, authenticationExtensions.e) && vy2.w(this.f, authenticationExtensions.f) && vy2.w(this.g, authenticationExtensions.g) && vy2.w(this.h, authenticationExtensions.h) && vy2.w(this.i, authenticationExtensions.i) && vy2.w(this.j, authenticationExtensions.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 2, this.a, i, false);
        uy6.C(parcel, 3, this.b, i, false);
        uy6.C(parcel, 4, this.c, i, false);
        uy6.C(parcel, 5, this.d, i, false);
        uy6.C(parcel, 6, this.e, i, false);
        uy6.C(parcel, 7, this.f, i, false);
        uy6.C(parcel, 8, this.g, i, false);
        uy6.C(parcel, 9, this.h, i, false);
        uy6.C(parcel, 10, this.i, i, false);
        uy6.C(parcel, 11, this.j, i, false);
        uy6.K(iJ, parcel);
    }
}
