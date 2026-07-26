package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k13 extends a79 {
    public final RelativeLayout v;
    public final RecyclerView w;

    public k13(ea1 ea1Var, View view, RelativeLayout relativeLayout, RecyclerView recyclerView) {
        super(0, view, ea1Var);
        this.v = relativeLayout;
        this.w = recyclerView;
    }
}
