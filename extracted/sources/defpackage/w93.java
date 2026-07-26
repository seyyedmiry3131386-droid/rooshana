package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w93 extends a79 {
    public final ConstraintLayout v;
    public final AvatarImageView w;
    public final MyketTextView x;
    public final SmallEmptyMediumTextOvalButton y;

    public w93(ea1 ea1Var, View view, ConstraintLayout constraintLayout, AvatarImageView avatarImageView, MyketTextView myketTextView, SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = avatarImageView;
        this.x = myketTextView;
        this.y = smallEmptyMediumTextOvalButton;
    }
}
