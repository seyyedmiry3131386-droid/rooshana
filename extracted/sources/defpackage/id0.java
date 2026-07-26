package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes.dex */
public final class id0 {
    public RenderEffect a;
    public final float b;
    public final float c;

    public id0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectC = zc.c(this.b, this.c);
        this.a = renderEffectC;
        return renderEffectC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        return this.b == id0Var.b && this.c == id0Var.c;
    }

    public final int hashCode() {
        return dw1.g(this.c, Float.floatToIntBits(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=Clamp)";
    }
}
