package defpackage;

import androidx.compose.animation.core.c;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class jn3 implements u48 {
    public Float a;
    public Float b;
    public final wb5 c;
    public xe8 d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ c h;

    public jn3(c cVar, Float f, Float f2, in3 in3Var) {
        mt8 mt8Var = c26.h;
        this.h = cVar;
        this.a = f;
        this.b = f2;
        this.c = g.h(f);
        this.d = new xe8(in3Var, mt8Var, this.a, this.b, null);
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return ((s08) this.c).getValue();
    }
}
