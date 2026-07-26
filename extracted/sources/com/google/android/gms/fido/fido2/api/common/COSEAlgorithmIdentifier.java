package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();
    public final Enum a;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public COSEAlgorithmIdentifier(a aVar) {
        this.a = (Enum) aVar;
    }

    public static COSEAlgorithmIdentifier a(int i) throws UnsupportedAlgorithmIdentifierException {
        a aVar;
        if (i == -262) {
            aVar = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] rSAAlgorithmArrValues = RSAAlgorithm.values();
            int length = rSAAlgorithmArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                        if (eC2Algorithm.a == i) {
                            aVar = eC2Algorithm;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(bl4.q(i, "Algorithm with COSE value ", " not supported"));
                }
                RSAAlgorithm rSAAlgorithm = rSAAlgorithmArrValues[i2];
                if (rSAAlgorithm.a == i) {
                    aVar = rSAAlgorithm;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
