package androidx.window.layout;

import android.app.Activity;
import defpackage.ae9;
import defpackage.bg9;
import defpackage.le9;
import defpackage.sg4;
import defpackage.ug1;
import defpackage.up1;
import defpackage.vs8;
import defpackage.xe2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements le9 {
    public final ae9 b;

    public a(bg9 bg9Var, ae9 ae9Var, vs8 vs8Var) {
        this.b = ae9Var;
    }

    public final xe2 a(Activity activity2) {
        b bVar = new b(new WindowInfoTrackerImpl$windowLayoutInfo$2(this, activity2, null), EmptyCoroutineContext.a, -2, BufferOverflow.a);
        ug1 ug1Var = up1.a;
        return d.t(bVar, sg4.a);
    }
}
