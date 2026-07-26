package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a27;
import defpackage.ap0;
import defpackage.ba9;
import defpackage.gl;
import defpackage.h69;
import defpackage.ks2;
import defpackage.ls2;
import defpackage.mo0;
import defpackage.ms2;
import defpackage.nr6;
import defpackage.q69;
import defpackage.r79;
import defpackage.sk4;
import defpackage.sy7;
import defpackage.te;
import defpackage.wq2;
import defpackage.wr8;
import defpackage.xo0;
import defpackage.yo0;
import defpackage.zo0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ChangeTransform extends Transition {
    public static final String[] K = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final mo0 L = new mo0(float[].class, "nonTranslations", 6);
    public static final mo0 M = new mo0(PointF.class, "translations", 7);
    public static final boolean N = true;
    public final boolean H;
    public final boolean I;
    public final Matrix J;

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = true;
        this.I = true;
        this.J = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.k);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.H = !a27.j(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.I = a27.j(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes.getBoolean(0, true) : true;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void P(wr8 wr8Var) {
        View view = wr8Var.b;
        HashMap map = wr8Var.a;
        if (view.getVisibility() == 8) {
            return;
        }
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new ap0(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.I) {
            Matrix matrix2 = new Matrix();
            ba9.a.C((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(nr6.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(nr6.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        P(wr8Var);
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        P(wr8Var);
        View view = wr8Var.b;
        if (N) {
            return;
        }
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object, ls2] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r8v40, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        int i;
        int i2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        ?? r29;
        Object obj;
        ObjectAnimator objectAnimator;
        int i3;
        ms2 ms2Var;
        boolean z;
        ms2 ms2Var2;
        ?? r3;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        boolean z2;
        Class<ViewGroup> cls;
        ArrayList arrayList2;
        int i4;
        int i5;
        int i6;
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        ls2 ls2Var;
        ks2 ks2Var;
        ?? r10;
        r79 r79Var;
        wr8 wr8VarP;
        if (wr8Var == null) {
            return null;
        }
        View view = wr8Var.b;
        HashMap map = wr8Var.a;
        if (wr8Var2 == null) {
            return null;
        }
        View view2 = wr8Var2.b;
        HashMap map2 = wr8Var2.a;
        if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z3 = this.I && (!(x(viewGroup2) && x(viewGroup3)) ? viewGroup2 == viewGroup3 : !((wr8VarP = p(viewGroup2, true)) == null || viewGroup3 != wr8VarP.b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view2.setTag(nr6.parent_matrix, matrix3);
            Matrix matrix4 = this.J;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            i = 0;
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        } else {
            i = 0;
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = sk4.a;
        }
        if (matrix7 == null) {
            matrix7 = sk4.a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            r29 = 1;
            objectAnimatorOfPropertyValuesHolder = null;
            i2 = 2;
        } else {
            ap0 ap0Var = (ap0) map2.get("android:changeTransform:transforms");
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            WeakHashMap weakHashMap = q69.a;
            h69.o(view2, 0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            zo0 zo0Var = new zo0(view2, fArr);
            gl glVar = new gl(1);
            glVar.b = new float[9];
            float[][] fArr3 = new float[2][];
            fArr3[i] = fArr;
            fArr3[1] = fArr2;
            i2 = 2;
            PropertyValuesHolder propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(L, glVar, fArr3);
            PropertyValuesHolder propertyValuesHolderOfObject2 = PropertyValuesHolder.ofObject(M, (TypeConverter) null, this.z.a(fArr[2], fArr[5], fArr2[2], fArr2[5]));
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
            propertyValuesHolderArr[i] = propertyValuesHolderOfObject;
            propertyValuesHolderArr[1] = propertyValuesHolderOfObject2;
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(zo0Var, propertyValuesHolderArr);
            r29 = 1;
            view2 = view2;
            obj = "android:changeTransform:parentMatrix";
            yo0 yo0Var = new yo0(view2, ap0Var, zo0Var, matrix7, z3, this.H);
            objectAnimatorOfPropertyValuesHolder.addListener(yo0Var);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(yo0Var);
        }
        boolean z4 = N;
        if (z3 && objectAnimatorOfPropertyValuesHolder != null && this.H) {
            Matrix matrix8 = new Matrix((Matrix) map2.get(obj));
            ba9.a.D(viewGroup, matrix8);
            Class<ViewGroup> cls2 = ViewGroup.class;
            if (Build.VERSION.SDK_INT == 28) {
                if (r79.g) {
                    r10 = r29;
                } else {
                    try {
                        if (!r79.e) {
                            try {
                                r79.d = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            r79.e = r29;
                        }
                        Class cls3 = r79.d;
                        Class<?>[] clsArr = new Class[3];
                        clsArr[i] = View.class;
                        clsArr[r29] = cls2;
                        clsArr[i2] = Matrix.class;
                        ?? declaredMethod = cls3.getDeclaredMethod("addGhost", clsArr);
                        r79.f = declaredMethod;
                        declaredMethod.setAccessible(r29);
                    } catch (NoSuchMethodException unused2) {
                    }
                    r10 = 1;
                    r79.g = true;
                }
                Method method = r79.f;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[3];
                        objArr[i] = view2;
                        objArr[r10] = viewGroup;
                        objArr[i2] = matrix8;
                        r79Var = new r79(20, (View) method.invoke(null, objArr));
                    } catch (IllegalAccessException unused3) {
                        r79Var = null;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    ks2Var = r79Var;
                } else {
                    r79Var = null;
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    ks2Var = r79Var;
                }
            } else {
                int i7 = ms2.g;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i8 = ls2.c;
                ls2 ls2Var2 = (ls2) viewGroup.getTag(nr6.ghost_view_holder);
                ms2 ms2Var3 = (ms2) view2.getTag(nr6.ghost_view);
                if (ms2Var3 == null || (ls2Var = (ls2) ms2Var3.getParent()) == ls2Var2) {
                    i3 = i;
                    ms2Var = ms2Var3;
                } else {
                    i3 = ms2Var3.d;
                    ls2Var.removeView(ms2Var3);
                    ms2Var = null;
                }
                if (ms2Var == null) {
                    ms2 ms2Var4 = new ms2(view2);
                    ms2Var4.e = matrix8;
                    if (ls2Var2 == null) {
                        ?? ls2Var3 = new ls2(viewGroup.getContext());
                        ls2Var3.setClipChildren(i);
                        ls2Var3.a = viewGroup;
                        viewGroup.setTag(nr6.ghost_view_holder, ls2Var3);
                        q69.a(ls2Var3, viewGroup);
                        ls2Var3.b = true;
                        r3 = ls2Var3;
                    } else {
                        ViewGroup viewGroup4 = ls2Var2.a;
                        if (!ls2Var2.b) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        viewGroup4.getOverlay().remove(ls2Var2);
                        viewGroup4.getOverlay().add(ls2Var2);
                        r3 = ls2Var2;
                    }
                    ba9.a(r3, r3.getLeft(), r3.getTop(), viewGroup.getWidth() + r3.getLeft(), viewGroup.getHeight() + r3.getTop());
                    ba9.a(ms2Var4, ms2Var4.getLeft(), ms2Var4.getTop(), viewGroup.getWidth() + ms2Var4.getLeft(), viewGroup.getHeight() + ms2Var4.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    ls2.a(ms2Var4.c, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = r3.getChildCount() - 1;
                    int i9 = 0;
                    while (i9 <= childCount) {
                        int i10 = (i9 + childCount) / 2;
                        ls2.a(((ms2) r3.getChildAt(i10)).c, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                        } else {
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int iMin = Math.min(arrayList3.size(), arrayList4.size());
                                int i11 = 1;
                                while (true) {
                                    if (i11 < iMin) {
                                        View view3 = (View) arrayList3.get(i11);
                                        arrayList = arrayList3;
                                        View view4 = (View) arrayList4.get(i11);
                                        if (view3 != view4) {
                                            ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                                            int childCount2 = viewGroup5.getChildCount();
                                            if (view3.getZ() == view4.getZ()) {
                                                arrayList2 = arrayList4;
                                                int i12 = 0;
                                                while (i12 < childCount2) {
                                                    int i13 = childCount2;
                                                    i5 = childCount;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        iIntValue = te.s(viewGroup5, i12);
                                                        i6 = i12;
                                                        i4 = i2;
                                                        cls = cls2;
                                                    } else {
                                                        if (sy7.f) {
                                                            i6 = i12;
                                                        } else {
                                                            i6 = i12;
                                                            try {
                                                                Class<?>[] clsArr2 = new Class[i2];
                                                                Class<?> cls4 = Integer.TYPE;
                                                                clsArr2[0] = cls4;
                                                                clsArr2[1] = cls4;
                                                                Method declaredMethod2 = cls2.getDeclaredMethod("getChildDrawingOrder", clsArr2);
                                                                sy7.e = declaredMethod2;
                                                                declaredMethod2.setAccessible(true);
                                                            } catch (NoSuchMethodException unused4) {
                                                            }
                                                            sy7.f = true;
                                                        }
                                                        Method method2 = sy7.e;
                                                        if (method2 != null) {
                                                            try {
                                                                numValueOf = Integer.valueOf(viewGroup5.getChildCount());
                                                                numValueOf2 = Integer.valueOf(i6);
                                                                cls = cls2;
                                                                i4 = 2;
                                                            } catch (IllegalAccessException | InvocationTargetException unused5) {
                                                                cls = cls2;
                                                                i4 = 2;
                                                            }
                                                            try {
                                                                Object[] objArr2 = new Object[2];
                                                                try {
                                                                    objArr2[0] = numValueOf;
                                                                    objArr2[1] = numValueOf2;
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup5, objArr2)).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                    iIntValue = i6;
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                            }
                                                        } else {
                                                            cls = cls2;
                                                            i4 = 2;
                                                            iIntValue = i6;
                                                        }
                                                    }
                                                    View childAt = viewGroup5.getChildAt(iIntValue);
                                                    if (childAt != view3) {
                                                        if (childAt == view4) {
                                                            break;
                                                        }
                                                        cls2 = cls;
                                                        childCount = i5;
                                                        i2 = i4;
                                                        i12 = i6 + 1;
                                                        childCount2 = i13;
                                                    }
                                                }
                                            } else if (view3.getZ() <= view4.getZ()) {
                                                arrayList2 = arrayList4;
                                                i4 = i2;
                                                cls = cls2;
                                            }
                                        } else {
                                            i11++;
                                            arrayList3 = arrayList;
                                            i2 = i2;
                                            arrayList4 = arrayList4;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        i5 = childCount;
                                        i4 = i2;
                                        cls = cls2;
                                        if (arrayList2.size() == iMin) {
                                            break;
                                        }
                                    }
                                    arrayList2.clear();
                                    arrayList3 = arrayList;
                                    cls2 = cls;
                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                    z4 = z2;
                                    i2 = i4;
                                    arrayList4 = arrayList2;
                                }
                                childCount = i10 - 1;
                                arrayList2.clear();
                                arrayList3 = arrayList;
                                cls2 = cls;
                                objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                z4 = z2;
                                i2 = i4;
                                arrayList4 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList4;
                        i5 = childCount;
                        i4 = i2;
                        cls = cls2;
                        i9 = i10 + 1;
                        childCount = i5;
                        arrayList2.clear();
                        arrayList3 = arrayList;
                        cls2 = cls;
                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                        z4 = z2;
                        i2 = i4;
                        arrayList4 = arrayList2;
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    if (i9 < 0 || i9 >= r3.getChildCount()) {
                        r3.addView(ms2Var4);
                    } else {
                        r3.addView(ms2Var4, i9);
                    }
                    ms2Var4.d = i3;
                    ms2Var2 = ms2Var4;
                } else {
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    ms2Var.e = matrix8;
                    ms2Var2 = ms2Var;
                }
                ms2Var2.d++;
                ks2Var = ms2Var2;
            }
            if (ks2Var != null) {
                ks2Var.c(view, (ViewGroup) map.get("android:changeTransform:parent"));
                Transition transition = this;
                while (true) {
                    TransitionSet transitionSet = transition.k;
                    if (transitionSet == null) {
                        break;
                    }
                    transition = transitionSet;
                }
                xo0 xo0Var = new xo0();
                xo0Var.b = view2;
                xo0Var.c = ks2Var;
                transition.a(xo0Var);
                if (z) {
                    if (view != view2) {
                        ba9.b(view, 0.0f);
                    }
                    ba9.b(view2, 1.0f);
                }
            }
        } else {
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
            if (!z4) {
                viewGroup2.endViewTransition(view);
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return K;
    }
}
