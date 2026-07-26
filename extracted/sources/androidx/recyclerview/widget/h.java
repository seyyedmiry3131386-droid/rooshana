package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b07;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        ((RecyclerView.LayoutParams) view.getLayoutParams()).a.c();
        rect.set(0, 0, 0, 0);
    }

    public void b(Canvas canvas, RecyclerView recyclerView) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView) {
    }
}
