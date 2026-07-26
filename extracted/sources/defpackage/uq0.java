package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class uq0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                xq0 xq0Var = ((Chip) this.b).e;
                if (xq0Var == null) {
                    outline.setAlpha(0.0f);
                } else {
                    xq0Var.getOutline(outline);
                }
                break;
            default:
                dt7 dt7Var = (dt7) this.b;
                if (dt7Var.c != null && !dt7Var.d.isEmpty()) {
                    RectF rectF = dt7Var.d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, dt7Var.g);
                    break;
                }
                break;
        }
    }
}
