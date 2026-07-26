package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.bd9;
import defpackage.fb8;
import defpackage.j29;
import defpackage.l81;
import defpackage.s17;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements fb8 {
    public final CanvasSubtitleOutput a;
    public final bd9 b;
    public List c;
    public ym0 d;
    public float e;
    public int f;
    public float g;

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.EMPTY_LIST;
        this.d = ym0.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.a = canvasSubtitleOutput;
        bd9 bd9Var = new bd9(context, attributeSet);
        this.b = bd9Var;
        bd9Var.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(bd9Var);
    }

    @Override // defpackage.fb8
    public final void a(List list, ym0 ym0Var, float f, int i, float f2) {
        this.d = ym0Var;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            l81 l81Var = (l81) list.get(i2);
            if (l81Var.d != null) {
                arrayList.add(l81Var);
            } else {
                arrayList2.add(l81Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, ym0Var, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float f2 = s17.f(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (f2 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(f2 / getContext().getResources().getDisplayMetrics().density)};
        String str = j29.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0542 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
