package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bl4;
import defpackage.fr5;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = fr5.b;
    public static final ApiMetadata d;
    public final ComplianceOptions a;
    public final boolean b;
    public boolean c;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.c = false;
        d = apiMetadata;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.a = complianceOptions;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return vy2.w(this.a, apiMetadata.a) && this.c == apiMetadata.c && this.b == apiMetadata.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return bl4.z(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
