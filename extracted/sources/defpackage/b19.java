package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.social.mynet.view.UserInfoTagsView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b19 extends a79 {
    public final UserInfoTagsView A;
    public final AvatarImageView v;
    public final FrameLayout w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final View z;

    public b19(ea1 ea1Var, View view, AvatarImageView avatarImageView, FrameLayout frameLayout, MyketTextView myketTextView, MyketTextView myketTextView2, View view2, UserInfoTagsView userInfoTagsView) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = frameLayout;
        this.x = myketTextView;
        this.y = myketTextView2;
        this.z = view2;
        this.A = userInfoTagsView;
    }
}
