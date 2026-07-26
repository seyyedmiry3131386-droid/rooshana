package androidx.compose.foundation.text.contextmenu.modifier;

import defpackage.bt2;
import defpackage.jg8;
import defpackage.kg8;
import defpackage.li1;
import defpackage.pg8;
import defpackage.un3;
import defpackage.y97;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public pg8 a;
    public ToolbarHandlerState b;

    public final void a() {
        jg8 jg8Var;
        if (this.b == ToolbarHandlerState.a) {
            un3.c("ToolbarRequester is not initialized.");
        }
        pg8 pg8Var = this.a;
        if (pg8Var == null || !pg8Var.n) {
            return;
        }
        li1 li1Var = pg8Var.u;
        if ((li1Var == null || !li1Var.b()) && (jg8Var = (jg8) y97.t(pg8Var, kg8.b)) != null) {
            pg8Var.u = bt2.G(pg8Var.o0(), null, CoroutineStart.d, new TextContextMenuToolbarHandlerNode$show$1(pg8Var, jg8Var, null), 1);
        }
    }
}
