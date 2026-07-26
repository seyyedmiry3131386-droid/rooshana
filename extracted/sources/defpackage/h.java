package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class h implements z89 {
    public int a;
    public boolean b;
    public Object c;

    @Override // defpackage.z89
    public void a(View view) {
        this.b = true;
    }

    @Override // defpackage.z89
    public void b(View view) {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.z89
    public void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.b = false;
    }
}
