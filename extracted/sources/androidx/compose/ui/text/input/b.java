package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.bp2;
import defpackage.hl5;
import defpackage.js3;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final View a;
    public final Object b = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // defpackage.bp2
        public final Object invoke() {
            Object systemService = this.g.a.getContext().getSystemService("input_method");
            js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });
    public final hl5 c;

    public b(View view) {
        this.a = view;
        this.c = new hl5(view);
    }
}
