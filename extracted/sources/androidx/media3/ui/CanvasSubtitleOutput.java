package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fb8;
import defpackage.ym0;
import defpackage.za8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements fb8 {
    public final ArrayList a;
    public List b;
    public int c;
    public float d;
    public ym0 e;
    public float f;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0;
        this.d = 0.0533f;
        this.e = ym0.g;
        this.f = 0.08f;
    }

    @Override // defpackage.fb8
    public final void a(List list, ym0 ym0Var, float f, int i, float f2) {
        this.b = list;
        this.e = ym0Var;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new za8(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0468  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }
}
