package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q99 extends u99 {
    public final /* synthetic */ int k;

    @Override // defpackage.u99
    public final boolean d(float f, long j, wx3 wx3Var, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, wx3Var, view));
                break;
            case 1:
                view.setElevation(b(f, j, wx3Var, view));
                break;
            case 2:
                view.setRotation(b(f, j, wx3Var, view));
                break;
            case 3:
                view.setRotationX(b(f, j, wx3Var, view));
                break;
            case 4:
                view.setRotationY(b(f, j, wx3Var, view));
                break;
            case 5:
                view.setScaleX(b(f, j, wx3Var, view));
                break;
            case 6:
                view.setScaleY(b(f, j, wx3Var, view));
                break;
            case 7:
                view.setTranslationX(b(f, j, wx3Var, view));
                break;
            case 8:
                view.setTranslationY(b(f, j, wx3Var, view));
                break;
            default:
                view.setTranslationZ(b(f, j, wx3Var, view));
                break;
        }
        return this.h;
    }
}
