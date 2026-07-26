package defpackage;

import androidx.compose.foundation.gestures.c;

/* JADX INFO: loaded from: classes.dex */
public final class xg1 implements rg7 {
    public final /* synthetic */ c a;

    public xg1(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.rg7
    public final float f(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        c cVar = this.a;
        float fFloatValue = ((Number) cVar.a.invoke(Float.valueOf(f))).floatValue();
        ((s08) cVar.e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((s08) cVar.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
