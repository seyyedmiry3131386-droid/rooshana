package com.google.common.math;

import defpackage.gu9;
import defpackage.pa2;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Stats implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        return Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d);
    }

    public final int hashCode() {
        Double dValueOf = Double.valueOf(0.0d);
        return Arrays.hashCode(new Object[]{0L, dValueOf, dValueOf, dValueOf, dValueOf});
    }

    public final String toString() {
        pa2 pa2VarF = gu9.F(this);
        pa2VarF.i("count", String.valueOf(0L));
        return pa2VarF.toString();
    }
}
