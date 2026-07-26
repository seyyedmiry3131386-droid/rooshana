package com.google.android.gms.internal.measurement;

import defpackage.rm7;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzll extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzll(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbS = rm7.s(j, "Pos: ", ", limit: ");
        sbS.append(j2);
        sbS.append(", len: ");
        sbS.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbS.toString()), indexOutOfBoundsException);
    }

    public zzll(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
