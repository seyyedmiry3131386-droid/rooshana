package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;
import androidx.compose.foundation.gestures.o;

/* JADX INFO: loaded from: classes.dex */
public final class ch7 implements rg7 {
    public final /* synthetic */ o a;
    public final /* synthetic */ dh7 b;

    public ch7(o oVar, dh7 dh7Var) {
        this.a = oVar;
        this.b = dh7Var;
    }

    @Override // defpackage.rg7
    public final float f(float f) {
        float fAbs = Math.abs(f);
        o oVar = this.a;
        if (fAbs != 0.0f && !((Boolean) oVar.h.invoke()).booleanValue()) {
            throw new FlingCancellationException();
        }
        return oVar.d(oVar.g(this.b.a(2, oVar.e(oVar.h(f)))));
    }
}
