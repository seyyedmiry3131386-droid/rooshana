package androidx.compose.ui.focus;

import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.de7;
import defpackage.mb5;
import defpackage.sb5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final c a;
    public final AndroidComposeView b;
    public final sb5 c;
    public final sb5 d;
    public boolean e;

    public a(c cVar, AndroidComposeView androidComposeView) {
        this.a = cVar;
        this.b = androidComposeView;
        sb5 sb5Var = de7.a;
        this.c = new sb5();
        this.d = new sb5();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        FocusInvalidationManager$scheduleInvalidation$1 focusInvalidationManager$scheduleInvalidation$1 = new FocusInvalidationManager$scheduleInvalidation$1(0, this, a.class, "invalidateNodes", "invalidateNodes()V", 0);
        mb5 mb5Var = this.b.U0;
        if (mb5Var.c(focusInvalidationManager$scheduleInvalidation$1) < 0) {
            mb5Var.g(focusInvalidationManager$scheduleInvalidation$1);
        }
        this.e = true;
    }
}
