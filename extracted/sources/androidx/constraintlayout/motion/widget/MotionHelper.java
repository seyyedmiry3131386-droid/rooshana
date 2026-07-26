package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eu6;
import defpackage.vy4;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements vy4 {
    public boolean j;
    public boolean k;
    public float l;
    public View[] m;

    public MotionHelper(Context context) {
        super(context);
        this.j = false;
        this.k = false;
    }

    public float getProgress() {
        return this.l;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MotionHelper_onShow) {
                    this.j = typedArrayObtainStyledAttributes.getBoolean(index, this.j);
                } else if (index == eu6.MotionHelper_onHide) {
                    this.k = typedArrayObtainStyledAttributes.getBoolean(index, this.k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void r(MotionLayout motionLayout, HashMap map) {
    }

    public void setProgress(View view, float f) {
    }

    public void setProgress(float f) {
        this.l = f;
        int i = 0;
        if (this.b > 0) {
            this.m = j((ConstraintLayout) getParent());
            while (i < this.b) {
                setProgress(this.m[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        this.k = false;
        k(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = false;
        this.k = false;
        k(attributeSet);
    }

    public void a(int i) {
    }
}
