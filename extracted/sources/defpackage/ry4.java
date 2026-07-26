package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

/* JADX INFO: loaded from: classes.dex */
public final class ry4 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ MotionLabel b;

    public /* synthetic */ ry4(MotionLabel motionLabel, int i) {
        this.a = i;
        this.b = motionLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                MotionLabel motionLabel = this.b;
                outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r9, r10) * motionLabel.f) / 2.0f);
                break;
            default:
                MotionLabel motionLabel2 = this.b;
                outline.setRoundRect(0, 0, motionLabel2.getWidth(), motionLabel2.getHeight(), motionLabel2.g);
                break;
        }
    }
}
