package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.hm9;
import defpackage.o40;
import defpackage.rm7;
import defpackage.uy6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Strategy> CREATOR = new hm9(25);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[PHI: r8
      0x000b: PHI (r8v2 int) = (r8v0 int), (r8v1 int) binds: [B:3:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Strategy(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto Le
        Lb:
            r1.g = r8
            goto L19
        Le:
            if (r3 == r0) goto L17
            r8 = 3
            if (r3 == r8) goto L14
            goto Lb
        L14:
            r1.g = r0
            goto L19
        L17:
            r1.g = r2
        L19:
            r1.d = r5
            r1.e = r6
            if (r6 == 0) goto L27
            r1.f = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.c = r2
            goto L38
        L27:
            r1.c = r4
            r3 = -1
            if (r7 == r3) goto L36
            if (r7 == 0) goto L36
            if (r7 == r2) goto L36
            r2 = 6
            if (r7 == r2) goto L36
            r1.f = r7
            goto L38
        L36:
            r1.f = r3
        L38:
            r1.h = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.a == strategy.a && this.g == strategy.g && this.c == strategy.c && this.d == strategy.d && this.f == strategy.f && this.h == strategy.h;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.g) * 31) + this.c) * 31) + this.d) * 31) + this.f) * 31) + this.h;
    }

    public final String toString() {
        String strN;
        String strN2;
        int i = this.d;
        String strN3 = i != 0 ? i != 1 ? rm7.n(i, "UNKNOWN:") : "EARSHOT" : "DEFAULT";
        int i2 = this.f;
        if (i2 == -1) {
            strN = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i2 & 2) > 0) {
                arrayList.add("BLE");
            }
            strN = arrayList.isEmpty() ? rm7.n(i2, "UNKNOWN:") : arrayList.toString();
        }
        int i3 = this.g;
        if (i3 == 3) {
            strN2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i3 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i3 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            strN2 = arrayList2.isEmpty() ? rm7.n(i3, "UNKNOWN:") : arrayList2.toString();
        }
        int i4 = this.h;
        String strN4 = i4 != 0 ? i4 != 1 ? rm7.n(i4, "UNKNOWN: ") : "ALWAYS_ON" : "DEFAULT";
        StringBuilder sb = new StringBuilder("Strategy{ttlSeconds=");
        sb.append(this.c);
        sb.append(", distanceType=");
        sb.append(strN3);
        sb.append(", discoveryMedium=");
        o40.I(strN, ", discoveryMode=", strN2, ", backgroundScanMode=", sb);
        return dw1.s(sb, strN4, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.c);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.d);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.f);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.g);
        uy6.I(parcel, 7, 4);
        parcel.writeInt(this.h);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
