package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m23 extends a79 {
    public final AppIconView v;
    public final MyketTextView w;
    public final ConstraintLayout x;
    public final SmallEmptyMediumTextOvalButton y;

    public m23(ea1 ea1Var, View view, AppIconView appIconView, MyketTextView myketTextView, ConstraintLayout constraintLayout, SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton) {
        super(0, view, ea1Var);
        this.v = appIconView;
        this.w = myketTextView;
        this.x = constraintLayout;
        this.y = smallEmptyMediumTextOvalButton;
    }
}
