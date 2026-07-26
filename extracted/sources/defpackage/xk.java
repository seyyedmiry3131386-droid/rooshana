package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements u48 {
    public final mt8 a;
    public final wb5 b;
    public dl c;
    public long d;
    public long e;
    public boolean f;

    public /* synthetic */ xk(mt8 mt8Var, Object obj, dl dlVar, int i) {
        this(mt8Var, obj, (i & 4) != 0 ? null : dlVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.a.a().invoke(this.c);
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return ((s08) this.b).getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + ((s08) this.b).getValue() + ", velocity=" + a() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }

    public xk(mt8 mt8Var, Object obj, dl dlVar, long j, long j2, boolean z) {
        dl dlVarK;
        this.a = mt8Var;
        this.b = g.h(obj);
        if (dlVar != null) {
            dlVarK = tv8.k(dlVar);
        } else {
            dlVarK = (dl) mt8Var.b().invoke(obj);
            dlVarK.d();
        }
        this.c = dlVarK;
        this.d = j;
        this.e = j2;
        this.f = z;
    }
}
