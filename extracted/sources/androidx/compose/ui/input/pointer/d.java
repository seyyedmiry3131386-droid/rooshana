package androidx.compose.ui.input.pointer;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.ah0;
import defpackage.fh6;
import defpackage.hx4;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final hx4 a(hx4 hx4Var, AndroidViewHolder androidViewHolder) {
        fh6 fh6Var = new fh6();
        fh6Var.b = new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder);
        ah0 ah0Var = new ah0();
        ah0 ah0Var2 = fh6Var.c;
        if (ah0Var2 != null) {
            ah0Var2.b = null;
        }
        fh6Var.c = ah0Var;
        ah0Var.b = fh6Var;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(ah0Var);
        return hx4Var.d(fh6Var);
    }
}
