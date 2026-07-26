package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ds9;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new ds9(15);
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        rq4.n(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        rq4.n(uri);
        rq4.h("origin scheme must be non-empty", uri.getScheme() != null);
        rq4.h("origin authority must be non-empty", uri.getAuthority() != null);
        this.b = uri;
        rq4.h("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return vy2.w(this.a, browserPublicKeyCredentialCreationOptions.a) && vy2.w(this.b, browserPublicKeyCredentialCreationOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 2, this.a, i, false);
        uy6.C(parcel, 3, this.b, i, false);
        uy6.w(parcel, 4, this.c, false);
        uy6.K(iJ, parcel);
    }
}
