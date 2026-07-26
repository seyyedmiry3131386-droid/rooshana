package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends is3 {
    public final /* synthetic */ int u;

    public /* synthetic */ cy1(int i) {
        this.u = i;
    }

    @Override // defpackage.is3
    public final void L(Object obj, float f) {
        switch (this.u) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setScaleX(f);
                break;
            case 2:
                ((View) obj).setScaleY(f);
                break;
            case 3:
                ((View) obj).setRotation(f);
                break;
            case 4:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }

    @Override // defpackage.is3
    public final float v(Object obj) {
        switch (this.u) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
