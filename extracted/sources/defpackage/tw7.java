package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tw7 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final MyketTextView v;
    public final ImageView w;
    public final SmallFillOvalButton x;
    public final ConstraintLayout y;

    public tw7(ea1 ea1Var, View view, MyketTextView myketTextView, ImageView imageView, SmallFillOvalButton smallFillOvalButton, ConstraintLayout constraintLayout) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = imageView;
        this.x = smallFillOvalButton;
        this.y = constraintLayout;
    }
}
