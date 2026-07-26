package defpackage;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class bs0 extends Property {
    public static final bs0 a = new bs0(ds0.class, "circularReveal");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((es0) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((es0) obj).setRevealInfo((ds0) obj2);
    }
}
