package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import defpackage.a18;
import defpackage.ag8;
import defpackage.b7;
import defpackage.di;
import defpackage.dp2;
import defpackage.g51;
import defpackage.gi;
import defpackage.hi;
import defpackage.ii;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ue2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {181}, m = "invokeSuspend", v = 1)
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ ag8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(a aVar, ag8 ag8Var, g51 g51Var) {
        super(1, g51Var);
        this.b = aVar;
        this.c = ag8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a18] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.Handler] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        gi giVar;
        a aVar = this.b;
        a18 a18Var = aVar.e;
        View view = aVar.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                hi hiVar = new hi();
                ag8 ag8Var = this.c;
                gi giVar2 = new gi(hiVar, new di(aVar, ag8Var, 0), new di(aVar, ag8Var, 1), view);
                dp2 dp2Var = aVar.b;
                if (dp2Var != null && (giVar = (gi) dp2Var.invoke(giVar2)) != null) {
                    giVar2 = giVar;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler2 = view.getHandler();
                if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                    ii iiVar = aVar.i;
                    if (iiVar == null) {
                        iiVar = new ii(aVar, giVar2, hiVar, 0);
                        aVar.i = iiVar;
                    }
                    view.post(iiVar);
                } else {
                    ActionMode actionModeStartActionMode = view.startActionMode(new ue2(giVar2), 1);
                    if (actionModeStartActionMode == null) {
                        return tx8Var;
                    }
                    aVar.h = actionModeStartActionMode;
                }
                this.a = 1;
                Object objL = hiVar.a.l(this);
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
                kotlin.b.b(obj);
            }
            if (Looper.myLooper() != (handler != 0 ? handler.getLooper() : null)) {
                Runnable b7Var = aVar.j;
                if (b7Var == null) {
                    b7Var = new b7(2, aVar);
                    aVar.j = b7Var;
                }
                view.post(b7Var);
            } else {
                ActionMode actionMode = aVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            ii iiVar2 = aVar.i;
            if (iiVar2 != null) {
                view.removeCallbacks(iiVar2);
            }
            aVar.h = null;
            return tx8Var;
        } finally {
            a18Var.a();
            Looper looperMyLooper2 = Looper.myLooper();
            handler = view.getHandler();
            if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                Runnable b7Var2 = aVar.j;
                if (b7Var2 == null) {
                    b7Var2 = new b7(2, aVar);
                    aVar.j = b7Var2;
                }
                view.post(b7Var2);
            } else {
                ActionMode actionMode2 = aVar.h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            ii iiVar3 = aVar.i;
            if (iiVar3 != null) {
                view.removeCallbacks(iiVar3);
            }
            aVar.h = null;
        }
    }
}
