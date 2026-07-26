package androidx.compose.ui.focus;

import defpackage.dp2;
import defpackage.js3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class FocusOwnerImpl$focusSearch$1 extends Lambda implements dp2 {
    public final /* synthetic */ d g;
    public final /* synthetic */ c h;
    public final /* synthetic */ dp2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(d dVar, c cVar, dp2 dp2Var) {
        super(1);
        this.g = dVar;
        this.h = cVar;
        this.i = dp2Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        d dVar = (d) obj;
        if (js3.i(dVar, this.g)) {
            zBooleanValue = false;
        } else {
            if (js3.i(dVar, this.h.c)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = ((Boolean) this.i.invoke(dVar)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
