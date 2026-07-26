package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends is3 {
    public final int u;

    public ek4(int i) {
        this.u = i;
    }

    @Override // defpackage.is3
    public final void L(Object obj, float f) {
        fk4 fk4Var = (fk4) obj;
        float[] fArr = fk4Var.C;
        if (fArr != null) {
            int i = this.u;
            if (fArr[i] != f) {
                fArr[i] = f;
                qs3 qs3Var = fk4Var.E;
                if (qs3Var != null) {
                    float fI = fk4Var.i();
                    MaterialButton materialButton = (MaterialButton) qs3Var.b;
                    int i2 = (int) (fI * 0.11f);
                    if (materialButton.x != i2) {
                        materialButton.x = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                fk4Var.invalidateSelf();
            }
        }
    }

    @Override // defpackage.is3
    public final float v(Object obj) {
        float[] fArr = ((fk4) obj).C;
        if (fArr != null) {
            return fArr[this.u];
        }
        return 0.0f;
    }
}
