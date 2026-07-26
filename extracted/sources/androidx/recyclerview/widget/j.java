package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b69;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b69 {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.b69
    public final int a(View view) {
        return (view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.b69
    public final int b() {
        return this.a.G();
    }

    @Override // defpackage.b69
    public final int c() {
        k kVar = this.a;
        return kVar.o - kVar.D();
    }

    @Override // defpackage.b69
    public final View d(int i) {
        return this.a.v(i);
    }

    @Override // defpackage.b69
    public final int e(View view) {
        return view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }
}
