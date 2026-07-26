package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.c;
import defpackage.bz4;
import defpackage.dn0;
import defpackage.eu6;
import defpackage.q6;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public final ArrayList n;
    public int o;
    public MotionLayout p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public Carousel(Context context) {
        super(context);
        this.n = new ArrayList();
        this.o = 0;
        this.q = -1;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new q6(4, this);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, defpackage.vy4
    public final void a(int i) {
        int i2 = this.o;
        if (i == this.v) {
            this.o = i2 + 1;
        } else if (i == this.u) {
            this.o = i2 - 1;
        }
        if (!this.r) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.o;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        c cVar;
        c cVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            ArrayList arrayList = this.n;
            arrayList.clear();
            for (int i = 0; i < this.b; i++) {
                arrayList.add(motionLayout.k(this.a[i]));
            }
            this.p = motionLayout;
            if (this.y == 2) {
                bz4 bz4VarA = motionLayout.A(this.t);
                if (bz4VarA != null && (cVar2 = bz4VarA.l) != null) {
                    cVar2.c = 5;
                }
                bz4 bz4VarA2 = this.p.A(this.s);
                if (bz4VarA2 == null || (cVar = bz4VarA2.l) == null) {
                    return;
                }
                cVar.c = 5;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.clear();
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.Carousel_carousel_firstView) {
                    this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                } else if (index == eu6.Carousel_carousel_backwardTransition) {
                    this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                } else if (index == eu6.Carousel_carousel_forwardTransition) {
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                } else if (index == eu6.Carousel_carousel_emptyViewsBehavior) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, this.x);
                } else if (index == eu6.Carousel_carousel_previousState) {
                    this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                } else if (index == eu6.Carousel_carousel_nextState) {
                    this.v = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                } else if (index == eu6.Carousel_carousel_touchUp_dampeningFactor) {
                    this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                } else if (index == eu6.Carousel_carousel_touchUpMode) {
                    this.y = typedArrayObtainStyledAttributes.getInt(index, this.y);
                } else if (index == eu6.Carousel_carousel_touchUp_velocityThreshold) {
                    this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                } else if (index == eu6.Carousel_carousel_infinite) {
                    this.r = typedArrayObtainStyledAttributes.getBoolean(index, this.r);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setInfinite(boolean z) {
        this.r = z;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new ArrayList();
        this.o = 0;
        this.q = -1;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new q6(4, this);
        s(context, attributeSet);
    }

    public void setAdapter(dn0 dn0Var) {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new ArrayList();
        this.o = 0;
        this.q = -1;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = 0.9f;
        this.x = 4;
        this.y = 1;
        this.z = 2.0f;
        new q6(4, this);
        s(context, attributeSet);
    }
}
