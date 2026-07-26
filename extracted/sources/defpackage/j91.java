package defpackage;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j91 extends k91 {
    @Override // defpackage.fk4
    public final void g(Canvas canvas) {
        if (this.H.s.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.H.s);
        } else {
            canvas.clipRect(this.H.s, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
