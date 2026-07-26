package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.social.mynet.view.HeaderInfoItemView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r63 extends a79 {
    public final MyketTextView A;
    public final ConstraintLayout B;
    public final AvatarImageView v;
    public final MyketTextView w;
    public final HeaderInfoItemView x;
    public final HeaderInfoItemView y;
    public final HeaderInfoItemView z;

    public r63(ea1 ea1Var, View view, AvatarImageView avatarImageView, MyketTextView myketTextView, HeaderInfoItemView headerInfoItemView, HeaderInfoItemView headerInfoItemView2, HeaderInfoItemView headerInfoItemView3, MyketTextView myketTextView2, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = myketTextView;
        this.x = headerInfoItemView;
        this.y = headerInfoItemView2;
        this.z = headerInfoItemView3;
        this.A = myketTextView2;
        this.B = constraintLayout;
    }
}
