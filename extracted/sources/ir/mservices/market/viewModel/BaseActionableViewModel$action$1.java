package ir.mservices.market.viewModel;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r50;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseActionableViewModel$action$1", f = "BaseActionableViewModel.kt", l = {17}, m = "invokeSuspend", v = 1)
final class BaseActionableViewModel$action$1 extends SuspendLambda implements qp2 {
    public Object[] a;
    public a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final /* synthetic */ r50[] g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActionableViewModel$action$1(r50[] r50VarArr, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.g = r50VarArr;
        this.h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseActionableViewModel$action$1(this.g, this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseActionableViewModel$action$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0046). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.f
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            int r1 = r8.e
            int r3 = r8.d
            int r4 = r8.c
            ir.mservices.market.viewModel.a r5 = r8.b
            java.lang.Object[] r6 = r8.a
            r50[] r6 = (defpackage.r50[]) r6
            kotlin.b.b(r9)
            goto L46
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.b.b(r9)
            r50[] r9 = r8.g
            int r1 = r9.length
            r3 = 0
            ir.mservices.market.viewModel.a r4 = r8.h
            r6 = r9
            r5 = r4
            r4 = r3
        L2d:
            if (r3 >= r1) goto L48
            r9 = r6[r3]
            kotlinx.coroutines.flow.i r7 = r5.t
            r8.a = r6
            r8.b = r5
            r8.c = r4
            r8.d = r3
            r8.e = r1
            r8.f = r2
            java.lang.Object r9 = r7.emit(r9, r8)
            if (r9 != r0) goto L46
            return r0
        L46:
            int r3 = r3 + r2
            goto L2d
        L48:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.viewModel.BaseActionableViewModel$action$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
