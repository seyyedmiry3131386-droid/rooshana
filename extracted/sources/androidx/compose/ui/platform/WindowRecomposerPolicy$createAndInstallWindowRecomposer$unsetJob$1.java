package androidx.compose.ui.platform;

import android.view.View;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ur6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {228}, m = "invokeSuspend", v = 1)
final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ androidx.compose.runtime.k b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(androidx.compose.runtime.k kVar, View view, g51 g51Var) {
        super(2, g51Var);
        this.b = kVar;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        androidx.compose.runtime.k kVar = this.b;
        View view = this.c;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (kVar.M(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            if (s.b(view) == kVar) {
                view.setTag(ur6.androidx_compose_ui_view_composition_context, null);
            }
            return tx8.a;
        } finally {
            if (s.b(view) == kVar) {
                view.setTag(ur6.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
