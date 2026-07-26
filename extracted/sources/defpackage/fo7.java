package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class fo7 implements ze2 {
    public final wn7 a;

    public fo7(rk6 rk6Var) {
        this.a = rk6Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        Object objC = this.a.c(g51Var, obj);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }
}
