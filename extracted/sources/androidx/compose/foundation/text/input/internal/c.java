package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.g;
import defpackage.g51;
import defpackage.js3;
import defpackage.l08;
import defpackage.tx8;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final boolean a;
    public final AtomicReference b = new AtomicReference(null);
    public final l08 c = g.d(0.0f);

    public c(boolean z) {
        this.a = z;
    }

    public final Object a(g51 g51Var) {
        Object objV = js3.v(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }
}
