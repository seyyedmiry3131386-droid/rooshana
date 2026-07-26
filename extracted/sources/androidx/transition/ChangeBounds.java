package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a27;
import defpackage.ba9;
import defpackage.mo0;
import defpackage.no0;
import defpackage.nr6;
import defpackage.oo0;
import defpackage.po0;
import defpackage.qo0;
import defpackage.sy7;
import defpackage.ty6;
import defpackage.vr8;
import defpackage.wq2;
import defpackage.wr8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final mo0 J;
    public static final mo0 K;
    public static final mo0 L;
    public static final mo0 M;
    public static final mo0 N;
    public final boolean H;
    public static final String[] I = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ty6 O = new ty6();

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        J = new mo0(cls, str, 0);
        String str2 = "bottomRight";
        K = new mo0(cls, str2, 1);
        L = new mo0(cls, str2, 2);
        M = new mo0(cls, str, 3);
        N = new mo0(cls, "position", 4);
    }

    public ChangeBounds() {
        this.H = false;
    }

    public final void P(wr8 wr8Var) {
        View view = wr8Var.b;
        HashMap map = wr8Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.H) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        P(wr8Var);
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        Rect rect;
        P(wr8Var);
        if (!this.H || (rect = (Rect) wr8Var.b.getTag(nr6.transition_clip)) == null) {
            return;
        }
        wr8Var.a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        int i;
        int i2;
        int i3;
        int i4;
        ObjectAnimator objectAnimatorOfObject;
        int i5;
        Rect rect;
        Animator animator;
        Animator animatorOfObject;
        Animator animator2;
        if (wr8Var == null) {
            return null;
        }
        HashMap map = wr8Var.a;
        if (wr8Var2 == null) {
            return null;
        }
        HashMap map2 = wr8Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = wr8Var2.b;
        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
        int i6 = rect2.left;
        int i7 = rect3.left;
        int i8 = rect2.top;
        int i9 = rect3.top;
        int i10 = rect2.right;
        int i11 = rect3.right;
        int i12 = rect2.bottom;
        int i13 = rect3.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i = 0;
        } else {
            i = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i18 = i;
        if (i18 <= 0) {
            return null;
        }
        boolean z = this.H;
        mo0 mo0Var = N;
        if (z) {
            ba9.a(view, i6, i8, i6 + Math.max(i14, i16), i8 + Math.max(i15, i17));
            if (i6 == i7 && i8 == i9) {
                i2 = i12;
                i4 = i7;
                i3 = i11;
                objectAnimatorOfObject = null;
            } else {
                i2 = i12;
                i3 = i11;
                i4 = i7;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, mo0Var, (TypeConverter) null, this.z.a(i6, i8, i7, i9));
            }
            boolean z2 = rect4 == null;
            if (z2) {
                i5 = 0;
                rect = new Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
                rect = rect4;
            }
            int i19 = rect5 == null ? 1 : i5;
            Rect rect6 = i19 != 0 ? new Rect(i5, i5, i16, i17) : rect5;
            if (rect.equals(rect6)) {
                animator = null;
            } else {
                view.setClipBounds(rect);
                Object[] objArr = new Object[2];
                objArr[i5] = rect;
                objArr[1] = rect6;
                Animator animatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", O, objArr);
                oo0 oo0Var = new oo0(view, rect, z2, rect6, i19, i6, i8, i10, i2, i4, i9, i3, i13);
                animatorOfObject2.addListener(oo0Var);
                a(oo0Var);
                animator = animatorOfObject2;
            }
            boolean z3 = vr8.a;
            animator2 = animator;
            if (objectAnimatorOfObject == null) {
                animatorOfObject = animator2;
            } else if (animator == null) {
                animatorOfObject = objectAnimatorOfObject;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject, animator);
                animatorOfObject = animatorSet;
            }
        } else {
            ba9.a(view, i6, i8, i10, i12);
            if (i18 != 2) {
                animatorOfObject = (i6 == i7 && i8 == i9) ? ObjectAnimator.ofObject(view, L, (TypeConverter) null, this.z.a(i10, i12, i11, i13)) : ObjectAnimator.ofObject(view, M, (TypeConverter) null, this.z.a(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorOfObject = ObjectAnimator.ofObject(view, mo0Var, (TypeConverter) null, this.z.a(i6, i8, i7, i9));
            } else {
                qo0 qo0Var = new qo0(view);
                ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(qo0Var, J, (TypeConverter) null, this.z.a(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(qo0Var, K, (TypeConverter) null, this.z.a(i10, i12, i11, i13));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                animatorSet2.addListener(new no0(qo0Var));
                animator2 = animatorSet2;
                animatorOfObject = animator2;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            sy7.n(viewGroup4, true);
            q().a(new po0(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return I;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.h);
        boolean z = a27.j((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.H = z;
    }
}
