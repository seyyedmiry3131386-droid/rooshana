package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class fa9 extends ea9 {
    @Override // defpackage.ea9
    public final void A(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.ea9
    public final void B(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ea9
    public final void C(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ea9
    public final void D(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.b47
    public final float h(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.b47
    public final void s(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.ea9, defpackage.b47
    public final void t(int i, View view) {
        view.setTransitionVisibility(i);
    }
}
