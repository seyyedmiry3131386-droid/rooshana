package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.bn6;
import defpackage.ur6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final bn6 d;
    public int e;

    public RippleContainer(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new bn6(3);
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.e = 1;
        setTag(ur6.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
