package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ui2 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final DialogButtonComponent v;
    public final View w;
    public final RecyclerView x;
    public final DialogHeaderComponent y;

    public ui2(ea1 ea1Var, View view, DialogButtonComponent dialogButtonComponent, View view2, RecyclerView recyclerView, DialogHeaderComponent dialogHeaderComponent) {
        super(0, view, ea1Var);
        this.v = dialogButtonComponent;
        this.w = view2;
        this.x = recyclerView;
        this.y = dialogHeaderComponent;
    }
}
