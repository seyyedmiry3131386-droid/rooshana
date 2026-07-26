package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import ir.mservices.market.views.DialogButtonLayout;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hm1 extends a79 {
    public static final /* synthetic */ int A = 0;
    public final DialogButtonLayout v;
    public final DialogHeaderComponent w;
    public final MyketTextView x;
    public final LinearLayout y;
    public final LinearProgressIndicator z;

    public hm1(ea1 ea1Var, View view, DialogButtonLayout dialogButtonLayout, DialogHeaderComponent dialogHeaderComponent, MyketTextView myketTextView, LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator) {
        super(0, view, ea1Var);
        this.v = dialogButtonLayout;
        this.w = dialogHeaderComponent;
        this.x = myketTextView;
        this.y = linearLayout;
        this.z = linearProgressIndicator;
    }
}
