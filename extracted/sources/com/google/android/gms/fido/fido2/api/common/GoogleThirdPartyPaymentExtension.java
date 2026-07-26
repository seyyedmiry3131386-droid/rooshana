package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new nj9(24);
    public final boolean a;

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.a == ((GoogleThirdPartyPaymentExtension) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
