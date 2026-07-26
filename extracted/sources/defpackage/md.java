package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class md extends a79 {
    public final Object v;
    public final View w;

    public /* synthetic */ md(ea1 ea1Var, View view, View view2, View view3) {
        super(0, view, ea1Var);
        this.v = view2;
        this.w = view3;
    }

    public md(ea1 ea1Var, View view, v83 v83Var, ConstraintLayout constraintLayout) {
        super(1, view, ea1Var);
        this.v = v83Var;
        this.w = constraintLayout;
    }
}
