package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ju4;
import defpackage.nt4;
import defpackage.ot4;
import defpackage.sk6;
import defpackage.vt4;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements nt4, ju4, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public ot4 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.nt4
    public final boolean a(vt4 vt4Var) {
        return this.a.q(vt4Var, null, 0);
    }

    @Override // defpackage.ju4
    public final void b(ot4 ot4Var) {
        this.a = ot4Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vt4) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        sk6 sk6VarD = sk6.D(context, attributeSet, b, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(sk6VarD.v(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(sk6VarD.v(1));
        }
        sk6VarD.G();
    }
}
