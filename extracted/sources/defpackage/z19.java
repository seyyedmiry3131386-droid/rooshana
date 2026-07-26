package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z19 extends a79 {
    public final AvatarImageView v;
    public final FrameLayout w;
    public final View x;
    public final MyketTextView y;

    public z19(ea1 ea1Var, View view, AvatarImageView avatarImageView, FrameLayout frameLayout, View view2, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = frameLayout;
        this.x = view2;
        this.y = myketTextView;
    }
}
