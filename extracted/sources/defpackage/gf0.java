package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import ir.mservices.market.feedback.FeedbackTransactionDialogFragment;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends bf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bf0
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.bf0
    public final void c(int i, View view) {
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                if (i == 5) {
                    ((if0) obj).cancel();
                }
                break;
            case 1:
                int i4 = BottomSheetDragHandleView.m;
                ((BottomSheetDragHandleView) obj).d(i);
                break;
            default:
                da2 da2Var = ((FeedbackTransactionDialogFragment) obj).h1;
                js3.m(da2Var);
                ImageView imageView = da2Var.v;
                if (i == 3) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setStartOffset(50L);
                    alphaAnimation.setDuration(200L);
                    imageView.setAnimation(alphaAnimation);
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                break;
        }
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }
}
