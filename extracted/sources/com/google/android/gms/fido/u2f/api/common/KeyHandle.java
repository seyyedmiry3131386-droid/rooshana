package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.dw1;
import defpackage.hm9;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new hm9(23);
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, byte[] bArr, String str, ArrayList arrayList) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = arrayList;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        List list = keyHandle.d;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        String string = list == null ? Ssh2PublicKeyAlgorithmName.NULL : list.toString();
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(strEncodeToString);
        sb.append(", version: ");
        sb.append(this.c);
        sb.append(", transports: ");
        return dw1.s(sb, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.w(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c.a, false);
        uy6.H(parcel, 4, this.d, false);
        uy6.K(iJ, parcel);
    }
}
