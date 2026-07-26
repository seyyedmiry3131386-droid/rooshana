package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j92 extends a79 {
    public final ImageView v;
    public final MyketTextView w;
    public final ConstraintLayout x;

    public j92(ea1 ea1Var, View view, ImageView imageView, ConstraintLayout constraintLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = myketTextView;
        this.x = constraintLayout;
    }
}
