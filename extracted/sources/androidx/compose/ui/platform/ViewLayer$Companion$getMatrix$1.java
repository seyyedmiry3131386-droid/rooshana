package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements qp2 {
    static {
        new ViewLayer$Companion$getMatrix$1();
    }

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return tx8.a;
    }
}
