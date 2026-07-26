package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.lu6;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public void setHasDecor(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.a, getPaddingRight(), z2 ? getPaddingBottom() : this.b);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lu6.RecycleListView);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lu6.RecycleListView_paddingBottomNoButtons, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lu6.RecycleListView_paddingTopNoTitle, -1);
    }
}
