package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes.dex */
final class zzph extends zzpl {
    public static final zzph a = new zzph();

    private zzph() {
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.nearby.zzpl
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
