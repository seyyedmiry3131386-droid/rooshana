package androidx.compose.material3;

import defpackage.dh4;
import defpackage.g51;
import defpackage.he;
import defpackage.je;
import defpackage.sc2;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
final class SheetState$animateTo$2 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ je b;
    public /* synthetic */ dh4 c;
    public /* synthetic */ SheetValue d;
    public final /* synthetic */ n e;
    public final /* synthetic */ float f;
    public final /* synthetic */ sc2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$animateTo$2(n nVar, float f, sc2 sc2Var, g51 g51Var) {
        super(4, g51Var);
        this.e = nVar;
        this.f = f;
        this.g = sc2Var;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.f;
        sc2 sc2Var = this.g;
        SheetState$animateTo$2 sheetState$animateTo$2 = new SheetState$animateTo$2(this.e, f, sc2Var, (g51) obj4);
        sheetState$animateTo$2.b = (je) obj;
        sheetState$animateTo$2.c = (dh4) obj2;
        sheetState$animateTo$2.d = (SheetValue) obj3;
        return sheetState$animateTo$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            je jeVar = this.b;
            float fD = this.c.d(this.d);
            if (!Float.isNaN(fD)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                n nVar = this.e;
                float fE = Float.isNaN(nVar.d.e()) ? 0.0f : nVar.d.e();
                ref$FloatRef.a = fE;
                he heVar = new he(jeVar, ref$FloatRef, 1);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (androidx.compose.animation.core.f.a(fE, fD, this.f, this.g, heVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
