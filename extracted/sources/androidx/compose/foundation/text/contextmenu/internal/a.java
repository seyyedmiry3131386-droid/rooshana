package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.l;
import defpackage.a18;
import defpackage.ag8;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.ei;
import defpackage.ii;
import defpackage.jg8;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class a implements jg8 {
    public final View a;
    public final dp2 b;
    public final bp2 c;
    public final l d = new l();
    public final a18 e = new a18(new ei(this, 0));
    public final ei f = new ei(this, 1);
    public final ei g = new ei(this, 2);
    public ActionMode h;
    public ii i;
    public Runnable j;

    public a(View view, dp2 dp2Var, bp2 bp2Var) {
        this.a = view;
        this.b = dp2Var;
        this.c = bp2Var;
    }

    @Override // defpackage.jg8
    public final Object a(ag8 ag8Var, SuspendLambda suspendLambda) {
        Object objB = this.d.b(MutatePriority.a, new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this, ag8Var, null), suspendLambda);
        return objB == CoroutineSingletons.a ? objB : tx8.a;
    }
}
