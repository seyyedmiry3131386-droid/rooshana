package androidx.compose.foundation.lazy.layout;

import defpackage.bs3;
import defpackage.dp2;
import defpackage.s34;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final Object a(int i) {
        bs3 bs3VarH = ((s34) this).a.h(i);
        Object objInvoke = ((dp2) bs3VarH.c.d).invoke(Integer.valueOf(i - bs3VarH.a));
        return objInvoke == null ? new DefaultLazyKey(i) : objInvoke;
    }
}
