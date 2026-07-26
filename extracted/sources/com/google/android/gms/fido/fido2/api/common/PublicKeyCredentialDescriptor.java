package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzau;
import defpackage.m91;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType a;
    public final byte[] b;
    public final List c;

    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzau.j(2, m91.f, m91.g);
        CREATOR = new sk9(3);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        rq4.n(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            rq4.n(bArr);
            this.b = bArr;
            this.c = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.c;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !Arrays.equals(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        this.a.getClass();
        uy6.D(parcel, 2, "public-key", false);
        uy6.w(parcel, 3, this.b, false);
        uy6.H(parcel, 4, this.c, false);
        uy6.K(iJ, parcel);
    }
}
