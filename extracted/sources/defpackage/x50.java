package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes3.dex */
public final class x50 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;

    public /* synthetic */ x50(View view, int i, int i2) {
        this.a = i2;
        this.b = view;
        this.c = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.a) {
            case 0:
                View view = this.b;
                if (f != 1.0f) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i = this.c;
                    layoutParams.height = i - ((int) (i * f));
                    view.requestLayout();
                } else {
                    view.setVisibility(8);
                }
                break;
            default:
                View view2 = this.b;
                view2.getLayoutParams().height = f == 1.0f ? -2 : (int) (this.c * f);
                view2.requestLayout();
                break;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        switch (this.a) {
        }
        return true;
    }
}
