package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bg7;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ScreenshotView extends AppCompatImageView implements br2 {
    public fu d;
    public final boolean e;

    public Hilt_ScreenshotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.e) {
            return;
        }
        this.e = true;
        ((ScreenshotView) this).f = (d04) ((u91) ((bg7) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.d == null) {
            this.d = new fu(this);
        }
        return this.d.e();
    }
}
