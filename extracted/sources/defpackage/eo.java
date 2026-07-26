package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class eo extends z67 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ ko g;

    public eo(ko koVar, int i, int i2, WeakReference weakReference) {
        this.g = koVar;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    @Override // defpackage.z67
    public final void k(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            typeface = jo.a(typeface, i, (this.e & 2) != 0);
        }
        ko koVar = this.g;
        if (koVar.m) {
            koVar.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new fo(textView, typeface, koVar.j));
                } else {
                    textView.setTypeface(typeface, koVar.j);
                }
            }
        }
    }

    @Override // defpackage.z67
    public final void j(int i) {
    }
}
