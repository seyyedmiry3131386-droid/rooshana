package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class r45 extends ViewOutlineProvider {
    public final int a;
    public final float b;

    public r45(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        js3.p(view, "view");
        js3.p(outline, "outline");
        int i = this.a;
        Rect rect = new Rect((-i) / 3, i, (i / 3) + view.getWidth(), view.getHeight());
        outline.setAlpha(1.0f);
        outline.setRoundRect(rect, this.b);
    }
}
