package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sn8 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final MyketTextView A;
    public final AvatarImageView v;
    public final ImageView w;
    public final MyketTextView x;
    public final ConstraintLayout y;
    public final MyketTextView z;

    public sn8(ea1 ea1Var, View view, AvatarImageView avatarImageView, ImageView imageView, MyketTextView myketTextView, ConstraintLayout constraintLayout, MyketTextView myketTextView2, MyketTextView myketTextView3) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = imageView;
        this.x = myketTextView;
        this.y = constraintLayout;
        this.z = myketTextView2;
        this.A = myketTextView3;
    }
}
