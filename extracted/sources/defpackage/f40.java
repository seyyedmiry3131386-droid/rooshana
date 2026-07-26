package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class f40 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public f40(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f40(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        js3.p(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f40(ck5 ck5Var) {
        this(ck5Var.c, ck5Var.d, ck5Var.b, ck5Var.a, ck5Var.e);
        js3.p(ck5Var, "navigationEvent");
    }
}
