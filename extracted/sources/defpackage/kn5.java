package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kn5 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final DialogButtonComponent v;
    public final DialogHeaderComponent w;
    public final ConstraintLayout x;
    public final RecyclerView y;

    public kn5(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, DialogHeaderComponent dialogHeaderComponent, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = dialogHeaderComponent;
        this.x = constraintLayout;
        this.y = recyclerView;
    }
}
