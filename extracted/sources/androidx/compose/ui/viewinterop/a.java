package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cl4;
import defpackage.ct2;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.es3;
import defpackage.h31;
import defpackage.js3;
import defpackage.tx8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements cl4 {
    public final /* synthetic */ AndroidViewHolder a;
    public final /* synthetic */ androidx.compose.ui.node.h b;

    public a(AndroidViewHolder androidViewHolder, androidx.compose.ui.node.h hVar) {
        this.a = androidViewHolder;
        this.b = hVar;
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        js3.m(layoutParams);
        androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.j(androidViewHolder, 0, i, layoutParams.height));
        return androidViewHolder.getMeasuredWidth();
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        final AndroidViewHolder androidViewHolder = this.a;
        if (androidViewHolder.getChildCount() == 0) {
            return el4Var.D(h31.j(j), h31.i(j), kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                @Override // defpackage.dp2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return tx8.a;
                }
            });
        }
        if (h31.j(j) != 0) {
            androidViewHolder.getChildAt(0).setMinimumWidth(h31.j(j));
        }
        if (h31.i(j) != 0) {
            androidViewHolder.getChildAt(0).setMinimumHeight(h31.i(j));
        }
        int iJ = h31.j(j);
        int iH = h31.h(j);
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        js3.m(layoutParams);
        int iJ2 = AndroidViewHolder.j(androidViewHolder, iJ, iH, layoutParams.width);
        int i = h31.i(j);
        int iG = h31.g(j);
        ViewGroup.LayoutParams layoutParams2 = androidViewHolder.getLayoutParams();
        js3.m(layoutParams2);
        androidViewHolder.measure(iJ2, AndroidViewHolder.j(androidViewHolder, i, iG, layoutParams2.height));
        int measuredWidth = androidViewHolder.getMeasuredWidth();
        int measuredHeight = androidViewHolder.getMeasuredHeight();
        final androidx.compose.ui.node.h hVar = this.b;
        return el4Var.D(measuredWidth, measuredHeight, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ct2.f(androidViewHolder, hVar);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        js3.m(layoutParams);
        androidViewHolder.measure(iMakeMeasureSpec, AndroidViewHolder.j(androidViewHolder, 0, i, layoutParams.height));
        return androidViewHolder.getMeasuredWidth();
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        js3.m(layoutParams);
        androidViewHolder.measure(AndroidViewHolder.j(androidViewHolder, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return androidViewHolder.getMeasuredHeight();
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        AndroidViewHolder androidViewHolder = this.a;
        ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
        js3.m(layoutParams);
        androidViewHolder.measure(AndroidViewHolder.j(androidViewHolder, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return androidViewHolder.getMeasuredHeight();
    }
}
