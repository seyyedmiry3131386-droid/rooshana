package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class p02 extends is3 {
    public final o02 u;

    public p02(TextView textView) {
        this.u = new o02(textView);
    }

    @Override // defpackage.is3
    public final void J(boolean z) {
        if (zz1.d()) {
            this.u.J(z);
        }
    }

    @Override // defpackage.is3
    public final void K(boolean z) {
        boolean zD = zz1.d();
        o02 o02Var = this.u;
        if (zD) {
            o02Var.K(z);
        } else {
            o02Var.w = z;
        }
    }

    @Override // defpackage.is3
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return !zz1.d() ? transformationMethod : this.u.Q(transformationMethod);
    }

    @Override // defpackage.is3
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return !zz1.d() ? inputFilterArr : this.u.p(inputFilterArr);
    }

    @Override // defpackage.is3
    public final boolean x() {
        return this.u.w;
    }
}
