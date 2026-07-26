package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new nj9(6);
    public final SignInPassword a;
    public final String b;
    public final int c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        rq4.n(signInPassword);
        this.a = signInPassword;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return vy2.w(this.a, savePasswordRequest.a) && vy2.w(this.b, savePasswordRequest.b) && this.c == savePasswordRequest.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.K(iJ, parcel);
    }
}
