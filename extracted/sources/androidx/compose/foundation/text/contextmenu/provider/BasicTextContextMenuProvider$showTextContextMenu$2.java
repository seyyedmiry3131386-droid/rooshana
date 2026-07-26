package androidx.compose.foundation.text.contextmenu.provider;

import defpackage.dp2;
import defpackage.g51;
import defpackage.ha0;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ha0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(a aVar, ha0 ha0Var, g51 g51Var) {
        super(1, g51Var);
        this.b = aVar;
        this.c = ha0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ha0 ha0Var = this.c;
        wb5 wb5Var = this.b.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                b.b(obj);
                ((s08) wb5Var).setValue(ha0Var);
                this.a = 1;
                Object objL = ha0Var.b.l(this);
                if (objL != coroutineSingletons) {
                    objL = tx8Var;
                }
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8Var;
        } finally {
            ((s08) wb5Var).setValue(null);
        }
    }
}
