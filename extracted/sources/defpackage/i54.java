package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i54 extends a79 {
    public final AvatarImageView v;
    public final MyketTextView w;
    public final ImageView x;
    public final ImageView y;
    public final MyketTextView z;

    public i54(ea1 ea1Var, View view, AvatarImageView avatarImageView, MyketTextView myketTextView, ImageView imageView, ImageView imageView2, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = avatarImageView;
        this.w = myketTextView;
        this.x = imageView;
        this.y = imageView2;
        this.z = myketTextView2;
    }
}
