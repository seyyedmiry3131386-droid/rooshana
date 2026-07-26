package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new sk9(0);
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AttestationConveyancePreference j;
    public final AuthenticationExtensions k;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        rq4.n(publicKeyCredentialRpEntity);
        this.a = publicKeyCredentialRpEntity;
        rq4.n(publicKeyCredentialUserEntity);
        this.b = publicKeyCredentialUserEntity;
        rq4.n(bArr);
        this.c = bArr;
        rq4.n(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.g = authenticatorSelectionCriteria;
        this.h = num;
        this.i = tokenBinding;
        if (str != null) {
            try {
                this.j = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.j = null;
        }
        this.k = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.d;
        List list3 = publicKeyCredentialCreationOptions.f;
        if (vy2.w(this.a, publicKeyCredentialCreationOptions.a) && vy2.w(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && vy2.w(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && vy2.w(this.g, publicKeyCredentialCreationOptions.g) && vy2.w(this.h, publicKeyCredentialCreationOptions.h) && vy2.w(this.i, publicKeyCredentialCreationOptions.i) && vy2.w(this.j, publicKeyCredentialCreationOptions.j) && vy2.w(this.k, publicKeyCredentialCreationOptions.k))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 2, this.a, i, false);
        uy6.C(parcel, 3, this.b, i, false);
        uy6.w(parcel, 4, this.c, false);
        uy6.H(parcel, 5, this.d, false);
        uy6.x(parcel, 6, this.e);
        uy6.H(parcel, 7, this.f, false);
        uy6.C(parcel, 8, this.g, i, false);
        uy6.A(parcel, 9, this.h);
        uy6.C(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        uy6.D(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.a, false);
        uy6.C(parcel, 12, this.k, i, false);
        uy6.K(iJ, parcel);
    }
}
