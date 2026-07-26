package defpackage;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2;
import kotlinx.coroutines.flow.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class nf2 implements xe2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xe2[] b;
    public final /* synthetic */ SuspendLambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public nf2(xe2[] xe2VarArr, sp2 sp2Var) {
        this.b = xe2VarArr;
        this.c = (SuspendLambda) sp2Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sp2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, tp2] */
    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        switch (this.a) {
            case 0:
                Object objA = j.a(g51Var, ze2Var, i30.d, new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(null, this.c), this.b);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA2 = j.a(g51Var, ze2Var, i30.d, new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2(null, this.c), this.b);
                if (objA2 != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nf2(xe2[] xe2VarArr, tp2 tp2Var) {
        this.b = xe2VarArr;
        this.c = (SuspendLambda) tp2Var;
    }
}
