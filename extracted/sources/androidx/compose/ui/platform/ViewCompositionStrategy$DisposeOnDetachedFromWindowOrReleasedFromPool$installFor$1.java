package androidx.compose.ui.platform;

import defpackage.bp2;
import defpackage.js3;
import defpackage.mg;
import defpackage.t69;
import defpackage.tx8;
import defpackage.zh6;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends Lambda implements bp2 {
    public final /* synthetic */ AbstractComposeView g;
    public final /* synthetic */ mg h;
    public final /* synthetic */ t69 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, mg mgVar, t69 t69Var) {
        super(0);
        this.g = abstractComposeView;
        this.h = mgVar;
        this.i = t69Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        mg mgVar = this.h;
        AbstractComposeView abstractComposeView = this.g;
        abstractComposeView.removeOnAttachStateChangeListener(mgVar);
        int i = zh6.a;
        t69 t69Var = this.i;
        js3.p(t69Var, "listener");
        zh6.b(abstractComposeView).a.remove(t69Var);
        return tx8.a;
    }
}
