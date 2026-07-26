package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b69;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b69 {
    public final /* synthetic */ k a;

    public i(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.b69
    public final int a(View view) {
        return (view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.b69
    public final int b() {
        return this.a.E();
    }

    @Override // defpackage.b69
    public final int c() {
        k kVar = this.a;
        return kVar.n - kVar.F();
    }

    @Override // defpackage.b69
    public final View d(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.b69
    public final int e(View view) {
        return view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }
}
