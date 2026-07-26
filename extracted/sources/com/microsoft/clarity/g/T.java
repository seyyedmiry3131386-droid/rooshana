package com.microsoft.clarity.g;

import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class T {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;

    public T(String str, long j, long j2, long j3, long j4, boolean z, String str2) {
        js3.p(str, "url");
        js3.p(str2, "installVersion");
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t = (T) obj;
        return js3.i(this.a, t.a) && this.b == t.b && this.c == t.c && this.d == t.d && this.e == t.e && this.f == t.f && js3.i(this.g, t.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        long j2 = this.c;
        int i = (((int) (j2 ^ (j2 >>> 32))) + ((((int) (j ^ (j >>> 32))) + iHashCode) * 31)) * 31;
        long j3 = this.d;
        long j4 = this.e;
        int i2 = (((int) ((j4 >>> 32) ^ j4)) + ((((int) (j3 ^ (j3 >>> 32))) + i) * 31)) * 31;
        boolean z = this.f;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.g.hashCode() + ((i2 + r1) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferrerDetails(url=");
        sb.append(this.a);
        sb.append(", clickTime=");
        sb.append(this.b);
        sb.append(", appInstallTime=");
        sb.append(this.c);
        sb.append(", serverClickTime=");
        sb.append(this.d);
        sb.append(", serverAppInstallTime=");
        sb.append(this.e);
        sb.append(", instantExperienceLaunched=");
        sb.append(this.f);
        sb.append(", installVersion=");
        return bl4.y(sb, this.g, ')');
    }
}
