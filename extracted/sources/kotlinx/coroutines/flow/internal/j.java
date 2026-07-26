package kotlinx.coroutines.flow.internal;

import defpackage.b47;
import defpackage.bf2;
import defpackage.bp2;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final Object a(g51 g51Var, ze2 ze2Var, bp2 bp2Var, rp2 rp2Var, xe2[] xe2VarArr) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(null, ze2Var, bp2Var, rp2Var, xe2VarArr);
        bf2 bf2Var = new bf2(g51Var.getContext(), g51Var, 0);
        Object objU = b47.u(bf2Var, true, bf2Var, combineKt$combineInternal$2);
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }
}
