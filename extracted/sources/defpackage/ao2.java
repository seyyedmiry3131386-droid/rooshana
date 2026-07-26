package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.StepView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ao2 extends a79 {
    public static final /* synthetic */ int E = 0;
    public final StepView A;
    public final StepView B;
    public final MyketTextView C;
    public final ViewPager2 D;
    public final MyketTextView v;
    public final DialogButtonComponent w;
    public final MyketTextView x;
    public final StepView y;
    public final StepView z;

    public ao2(ea1 ea1Var, View view, MyketTextView myketTextView, DialogButtonComponent dialogButtonComponent, MyketTextView myketTextView2, StepView stepView, StepView stepView2, StepView stepView3, StepView stepView4, MyketTextView myketTextView3, ViewPager2 viewPager2) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = dialogButtonComponent;
        this.x = myketTextView2;
        this.y = stepView;
        this.z = stepView2;
        this.A = stepView3;
        this.B = stepView4;
        this.C = myketTextView3;
        this.D = viewPager2;
    }
}
