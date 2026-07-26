package androidx.compose.material3.internal;

import androidx.compose.material3.n;
import defpackage.dh4;
import defpackage.g51;
import defpackage.he;
import defpackage.je;
import defpackage.sk;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ je b;
    public /* synthetic */ dh4 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(d dVar, float f, g51 g51Var) {
        super(4, g51Var);
        this.e = dVar;
        this.f = f;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.e, this.f, (g51) obj4);
        anchoredDraggableKt$animateTo$2.b = (je) obj;
        anchoredDraggableKt$animateTo$2.c = (dh4) obj2;
        anchoredDraggableKt$animateTo$2.d = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(tx8.a);
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
                d dVar = this.e;
                float fE = Float.isNaN(dVar.e()) ? 0.0f : dVar.e();
                ref$FloatRef.a = fE;
                sk skVar = ((n) dVar.c.b).c;
                he heVar = new he(jeVar, ref$FloatRef, 0);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (androidx.compose.animation.core.f.a(fE, fD, this.f, skVar, heVar, this) == coroutineSingletons) {
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
