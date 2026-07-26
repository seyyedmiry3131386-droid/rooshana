package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class d02 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile d02 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new i28(cls, charSequence) : super.newEditable(charSequence);
    }
}
