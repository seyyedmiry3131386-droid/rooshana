package com.google.android.gms.internal.nearby;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.up9;
import io.sentry.android.core.t0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhg> CREATOR = new up9(17);
    public byte[] a;
    public ParcelFileDescriptor b;

    public static void u(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            t0.n("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhg) {
            return Arrays.equals(this.a, ((zzhg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0066: MOVE (r4 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:103), block:B:20:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[PHI: r7
      0x009e: PHI (r7v4 java.io.DataOutputStream) = (r7v3 java.io.DataOutputStream), (r7v5 java.io.DataOutputStream) binds: [B:42:0x00b7, B:37:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzhg.writeToParcel(android.os.Parcel, int):void");
    }
}
