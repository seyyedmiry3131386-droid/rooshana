package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new hm9(4);
    public final UvmEntries a;
    public final zzf b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final zzh d;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.a = uvmEntries;
        this.b = zzfVar;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return vy2.w(this.a, authenticationExtensionsClientOutputs.a) && vy2.w(this.b, authenticationExtensionsClientOutputs.b) && vy2.w(this.c, authenticationExtensionsClientOutputs.c) && vy2.w(this.d, authenticationExtensionsClientOutputs.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.K(iJ, parcel);
    }
}
