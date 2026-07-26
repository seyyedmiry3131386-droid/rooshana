package com.google.android.gms.internal.nearby;

import android.util.Pair;
import defpackage.o40;

/* JADX INFO: loaded from: classes.dex */
final class zzpn extends zzpl {
    public final Pair a;

    public zzpn(Pair pair) {
        this.a = pair;
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final Object a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzpn) {
            return this.a.equals(((zzpn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return o40.y("Optional.of(", this.a.toString(), ")");
    }
}
