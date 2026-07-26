package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q98 extends a79 {
    public final MyketTextView A;
    public final ConstraintLayout B;
    public final BuzzProgressImageView C;
    public final MyketTextView D;
    public final MyketImageButton E;
    public final MyketTextView F;
    public final ImageView G;
    public final AvatarImageView v;
    public final MyketTextView w;
    public final MyketTextView x;
    public final MyketTextView y;
    public final BuzzProgressImageView z;

    public q98(ea1 ea1Var, View view, AvatarImageView avatarImageView, MyketTextView myketTextView, MyketTextView myketTextView2, MyketTextView myketTextView3, BuzzProgressImageView buzzProgressImageView, MyketTextView myketTextView4, ConstraintLayout constraintLayout, BuzzProgressImageView buzzProgressImageView2, MyketTextView myketTextView5, MyketImageButton myketImageButton, MyketTextView myketTextView6, ImageView imageView) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = myketTextView;
        this.x = myketTextView2;
        this.y = myketTextView3;
        this.z = buzzProgressImageView;
        this.A = myketTextView4;
        this.B = constraintLayout;
        this.C = buzzProgressImageView2;
        this.D = myketTextView5;
        this.E = myketImageButton;
        this.F = myketTextView6;
        this.G = imageView;
    }
}
