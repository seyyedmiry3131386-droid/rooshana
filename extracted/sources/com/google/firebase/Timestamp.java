package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new ao6(18);
    public final long a;
    public final int b;

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends PropertyReference1Impl {
        public static final AnonymousClass1 b = new AnonymousClass1();

        public AnonymousClass1() {
            super(Timestamp.class, "seconds", "getSeconds()J", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.mx3
        public final Object get(Object obj) {
            return Long.valueOf(((Timestamp) obj).a);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends PropertyReference1Impl {
        public static final AnonymousClass2 b = new AnonymousClass2();

        public AnonymousClass2() {
            super(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.mx3
        public final Object get(Object obj) {
            return Integer.valueOf(((Timestamp) obj).b);
        }
    }

    public Timestamp(int i, long j) {
        if (i < 0 || i >= 1000000000) {
            throw new IllegalArgumentException(rm7.n(i, "Timestamp nanoseconds out of range: ").toString());
        }
        if (-62135596800L > j || j >= 253402300800L) {
            throw new IllegalArgumentException(bl4.r(j, "Timestamp seconds out of range: ").toString());
        }
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Timestamp timestamp) {
        Timestamp timestamp2 = timestamp;
        js3.p(timestamp2, "other");
        dp2[] dp2VarArr = {AnonymousClass1.b, AnonymousClass2.b};
        for (int i = 0; i < 2; i++) {
            dp2 dp2Var = dp2VarArr[i];
            int iT = bt2.t((Comparable) dp2Var.invoke(this), (Comparable) dp2Var.invoke(timestamp2));
            if (iT != 0) {
                return iT;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        int iT;
        if (obj != this) {
            if (obj instanceof Timestamp) {
                Timestamp timestamp = (Timestamp) obj;
                dp2[] dp2VarArr = {AnonymousClass1.b, AnonymousClass2.b};
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        iT = 0;
                        break;
                    }
                    dp2 dp2Var = dp2VarArr[i];
                    iT = bt2.t((Comparable) dp2Var.invoke(this), (Comparable) dp2Var.invoke(timestamp));
                    if (iT != 0) {
                        break;
                    }
                    i++;
                }
                if (iT == 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.a);
        sb.append(", nanoseconds=");
        return dw1.q(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
