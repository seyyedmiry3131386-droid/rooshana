package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MovieNewTagView;
import ir.mservices.market.views.MyketRadioButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wu6 extends a79 {
    public static final /* synthetic */ int B = 0;
    public final MyketTextView A;
    public final SmallBoldTextButton v;
    public final FrameLayout w;
    public final MyketRadioButton x;
    public final MyketTextView y;
    public final MovieNewTagView z;

    public wu6(ea1 ea1Var, View view, SmallBoldTextButton smallBoldTextButton, FrameLayout frameLayout, MyketRadioButton myketRadioButton, MyketTextView myketTextView, MovieNewTagView movieNewTagView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = smallBoldTextButton;
        this.w = frameLayout;
        this.x = myketRadioButton;
        this.y = myketTextView;
        this.z = movieNewTagView;
        this.A = myketTextView2;
    }
}
