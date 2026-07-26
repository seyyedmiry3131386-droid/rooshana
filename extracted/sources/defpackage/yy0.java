package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class yy0 extends ClickableSpan {
    public final r74 a;

    public yy0(r74 r74Var) {
        this.a = r74Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.getClass();
    }
}
