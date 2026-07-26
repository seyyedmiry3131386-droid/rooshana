package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.hm9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new hm9(28);
    public final int a;
    public final ProtocolVersion b;
    public final byte[] c;
    public final String d;

    public RegisterRequest(int i, String str, String str2, byte[] bArr) {
        this.a = i;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = bArr;
            this.d = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        String str = registerRequest.d;
        if (!Arrays.equals(this.c, registerRequest.c) || this.b != registerRequest.b) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.c) + 31) * 31) + this.b.hashCode();
        String str = this.d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b.a, false);
        uy6.w(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.d, false);
        uy6.K(iJ, parcel);
    }
}
