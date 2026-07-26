package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.d60;
import defpackage.kr0;
import defpackage.mz6;

/* JADX INFO: loaded from: classes3.dex */
public class CircleIndicator2 extends BaseCircleIndicator {
    public static final /* synthetic */ int l = 0;
    public final kr0 k;

    public CircleIndicator2(Context context) {
        super(context);
        this.k = new kr0(0, this);
    }

    public mz6 getAdapterDataObserver() {
        return this.k;
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new kr0(0, this);
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new kr0(0, this);
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(d60 d60Var) {
    }
}
