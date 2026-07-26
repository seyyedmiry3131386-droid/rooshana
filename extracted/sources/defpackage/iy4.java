package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionButton;

/* JADX INFO: loaded from: classes.dex */
public final class iy4 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ MotionButton b;

    public /* synthetic */ iy4(MotionButton motionButton, int i) {
        this.a = i;
        this.b = motionButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                MotionButton motionButton = this.b;
                outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), (Math.min(r9, r10) * motionButton.d) / 2.0f);
                break;
            default:
                MotionButton motionButton2 = this.b;
                outline.setRoundRect(0, 0, motionButton2.getWidth(), motionButton2.getHeight(), motionButton2.e);
                break;
        }
    }
}
