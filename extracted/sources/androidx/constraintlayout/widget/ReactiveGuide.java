package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eu6;
import defpackage.pu7;
import defpackage.qu7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements pu7 {
    public int a;
    public boolean b;
    public int c;
    public boolean d;

    public ReactiveGuide(Context context) {
        super(context);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == eu6.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.b = typedArrayObtainStyledAttributes.getBoolean(index, this.b);
                } else if (index == eu6.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                } else if (index == eu6.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.a != -1) {
            ConstraintLayout.getSharedValues().a(this.a, this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.c;
    }

    public int getAttributeId() {
        return this.a;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.c = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference> hashSet;
        qu7 sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.a;
        if (i2 != -1 && (hashSet = (HashSet) sharedValues.a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference weakReference : hashSet) {
                pu7 pu7Var = (pu7) weakReference.get();
                if (pu7Var == null || pu7Var == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.a = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = false;
        this.c = 0;
        this.d = true;
        super.setVisibility(8);
        a(attributeSet);
    }
}
