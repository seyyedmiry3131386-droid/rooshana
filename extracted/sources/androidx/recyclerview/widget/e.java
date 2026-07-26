package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends vz1 {
    @Override // defpackage.vz1
    public final int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((k) this.b).getClass();
        return view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // defpackage.vz1
    public final int e(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((k) this.b).getClass();
        return k.B(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // defpackage.vz1
    public final int f(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((k) this.b).getClass();
        return k.A(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // defpackage.vz1
    public final int g(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        ((k) this.b).getClass();
        return (view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // defpackage.vz1
    public final int h() {
        return ((k) this.b).n;
    }

    @Override // defpackage.vz1
    public final int i() {
        k kVar = (k) this.b;
        return kVar.n - kVar.F();
    }

    @Override // defpackage.vz1
    public final int j() {
        return ((k) this.b).F();
    }

    @Override // defpackage.vz1
    public final int k() {
        return ((k) this.b).l;
    }

    @Override // defpackage.vz1
    public final int l() {
        return ((k) this.b).m;
    }

    @Override // defpackage.vz1
    public final int m() {
        return ((k) this.b).E();
    }

    @Override // defpackage.vz1
    public final int n() {
        k kVar = (k) this.b;
        return (kVar.n - kVar.E()) - kVar.F();
    }

    @Override // defpackage.vz1
    public final int o(View view) {
        k kVar = (k) this.b;
        Rect rect = (Rect) this.c;
        kVar.K(rect, view);
        return rect.right;
    }

    @Override // defpackage.vz1
    public final int p(View view) {
        k kVar = (k) this.b;
        Rect rect = (Rect) this.c;
        kVar.K(rect, view);
        return rect.left;
    }

    @Override // defpackage.vz1
    public final void q(int i) {
        ((k) this.b).P(i);
    }
}
