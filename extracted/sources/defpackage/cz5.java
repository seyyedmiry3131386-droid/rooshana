package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz5 implements ze2, zp2 {
    public final /* synthetic */ pw7 a;

    public cz5(pw7 pw7Var) {
        this.a = pw7Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        Object objC = this.a.b.c(g51Var, (a06) obj);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ze2) && (obj instanceof zp2)) {
            return getFunctionDelegate().equals(((zp2) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, pw7.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
