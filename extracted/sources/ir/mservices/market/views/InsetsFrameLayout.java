package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.js3;
import defpackage.mq3;
import defpackage.ok4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class InsetsFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        js3.p(windowInsets, "insets");
        Iterator it = ok4.Z(0, getChildCount()).iterator();
        while (it.hasNext()) {
            getChildAt(((mq3) it).nextInt()).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsetsFrameLayout(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
