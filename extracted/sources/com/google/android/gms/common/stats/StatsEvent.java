package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract int U();

    public abstract String l0();

    public final String toString() {
        long jU = u();
        int iU = U();
        String strL0 = l0();
        int length = String.valueOf(jU).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(iU).length() + 3 + strL0.length());
        sb.append(jU);
        sb.append("\t");
        sb.append(iU);
        return dw1.s(sb, "\t-1", strL0);
    }

    public abstract long u();
}
