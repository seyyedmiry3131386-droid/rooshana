package androidx.compose.foundation.interaction;

import defpackage.ab5;
import defpackage.e71;
import defpackage.g51;
import defpackage.ig2;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend", v = 1)
final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ab5 b;
    public final /* synthetic */ wb5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(ab5 ab5Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = ab5Var;
        this.c = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
        b.b(obj);
        ArrayList arrayList = new ArrayList();
        i iVar = this.b.a;
        ig2 ig2Var = new ig2(arrayList, this.c, 1);
        this.a = 1;
        iVar.a(ig2Var, this);
        return coroutineSingletons;
    }
}
