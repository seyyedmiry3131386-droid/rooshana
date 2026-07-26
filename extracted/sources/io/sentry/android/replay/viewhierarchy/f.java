package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import defpackage.dp2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final Rect f;
    public ArrayList g;

    public f(int i, int i2, float f, int i3, f fVar, boolean z, boolean z2, boolean z3, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = z3;
        this.f = rect;
    }

    public final void a(dp2 dp2Var) {
        ArrayList arrayList;
        if (!((Boolean) dp2Var.invoke(this)).booleanValue() || (arrayList = this.g) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(dp2Var);
        }
    }
}
