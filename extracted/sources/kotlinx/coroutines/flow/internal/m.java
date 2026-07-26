package kotlinx.coroutines.flow.internal;

import defpackage.ct2;
import defpackage.g51;
import defpackage.is3;
import defpackage.qp2;
import defpackage.tx8;
import defpackage.w61;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ze2 {
    public final w61 a;
    public final Object b;
    public final qp2 c;

    public m(ze2 ze2Var, w61 w61Var) {
        this.a = w61Var;
        this.b = is3.M(w61Var);
        this.c = new UndispatchedContextCollector$emitRef$1(ze2Var, null);
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        Object objC = ct2.C(this.a, obj, this.b, this.c, g51Var);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }
}
