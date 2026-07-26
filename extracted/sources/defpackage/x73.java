package defpackage;

import android.view.View;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x73 extends a79 {
    public final SmallEmptyMediumTextOvalButton v;
    public final AvatarImageView w;
    public final SmallFillOvalButton x;
    public final MyketTextView y;
    public final MyketTextView z;

    public x73(ea1 ea1Var, View view, SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton, AvatarImageView avatarImageView, SmallFillOvalButton smallFillOvalButton, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = smallEmptyMediumTextOvalButton;
        this.w = avatarImageView;
        this.x = smallFillOvalButton;
        this.y = myketTextView;
        this.z = myketTextView2;
    }
}
