package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l53 extends a79 {
    public final MyketTextView A;
    public final BuzzProgressImageView B;
    public final MyketTextView C;
    public final MyketTextView D;
    public final MyketImageButton E;
    public final MyketTextView F;
    public final AvatarImageView v;
    public final MyketTextView w;
    public final LinearLayout x;
    public final MyketTextView y;
    public final BuzzProgressImageView z;

    public l53(ea1 ea1Var, View view, AvatarImageView avatarImageView, MyketTextView myketTextView, LinearLayout linearLayout, MyketTextView myketTextView2, BuzzProgressImageView buzzProgressImageView, MyketTextView myketTextView3, BuzzProgressImageView buzzProgressImageView2, MyketTextView myketTextView4, MyketTextView myketTextView5, MyketImageButton myketImageButton, MyketTextView myketTextView6) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = myketTextView;
        this.x = linearLayout;
        this.y = myketTextView2;
        this.z = buzzProgressImageView;
        this.A = myketTextView3;
        this.B = buzzProgressImageView2;
        this.C = myketTextView4;
        this.D = myketTextView5;
        this.E = myketImageButton;
        this.F = myketTextView6;
    }
}
