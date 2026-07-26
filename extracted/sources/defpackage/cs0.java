package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class cs0 extends Property {
    public static final cs0 a = new cs0(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((es0) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((es0) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}
