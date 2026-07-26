package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d86 extends a79 {
    public final ImageView v;
    public final ImageView w;
    public final MyketEditText x;
    public final ConstraintLayout y;

    public d86(ea1 ea1Var, View view, ImageView imageView, ImageView imageView2, MyketEditText myketEditText, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = imageView;
        this.w = imageView2;
        this.x = myketEditText;
        this.y = constraintLayout;
    }
}
