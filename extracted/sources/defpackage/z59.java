package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z59 extends a79 {
    public final View A;
    public final View v;
    public final ConstraintLayout w;
    public final DefaultTimeBar x;
    public final ImageView y;
    public final ImageView z;

    public z59(ea1 ea1Var, View view, View view2, ConstraintLayout constraintLayout, DefaultTimeBar defaultTimeBar, ImageView imageView, ImageView imageView2, View view3) {
        super(0, view, ea1Var);
        this.v = view2;
        this.w = constraintLayout;
        this.x = defaultTimeBar;
        this.y = imageView;
        this.z = imageView2;
        this.A = view3;
    }
}
