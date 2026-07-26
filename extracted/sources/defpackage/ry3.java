package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.android.core.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ry3 extends rx3 {
    public float w;
    public float e = 0.1f;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public RectF i = new RectF();
    public RectF j = new RectF();
    public HashMap k = new HashMap();
    public String l = null;
    public int m = -1;
    public String n = null;
    public String o = null;
    public int p = -1;
    public int q = -1;
    public View r = null;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public float v = Float.NaN;
    public boolean x = false;

    public ry3() {
        this.d = new HashMap();
    }

    public static void j(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.rx3
    public final void a(HashMap map) {
        throw null;
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rx3 clone() {
        ry3 ry3Var = new ry3();
        super.c(this);
        ry3Var.l = this.l;
        ry3Var.m = this.m;
        ry3Var.n = this.n;
        ry3Var.o = this.o;
        ry3Var.p = this.p;
        ry3Var.q = this.q;
        ry3Var.r = this.r;
        ry3Var.e = this.e;
        ry3Var.s = this.s;
        ry3Var.t = this.t;
        ry3Var.u = this.u;
        ry3Var.v = this.v;
        ry3Var.w = this.w;
        ry3Var.x = this.x;
        ry3Var.i = this.i;
        ry3Var.j = this.j;
        ry3Var.k = this.k;
        return ry3Var;
    }

    @Override // defpackage.rx3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.KeyTrigger);
        SparseIntArray sparseIntArray = qy3.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = qy3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    t0.d("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.c1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 10:
                    this.x = typedArrayObtainStyledAttributes.getBoolean(index, this.x);
                    break;
                case 11:
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.h = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 13:
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 14:
                    this.g = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.View r11, float r12) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry3.h(android.view.View, float):void");
    }

    public final void i(View view, String str) {
        Method method;
        String lowerCase = str;
        if (lowerCase == null) {
            return;
        }
        if (!lowerCase.startsWith(".")) {
            if (this.k.containsKey(lowerCase)) {
                method = (Method) this.k.get(lowerCase);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(lowerCase, null);
                    this.k.put(lowerCase, method);
                } catch (NoSuchMethodException unused) {
                    this.k.put(lowerCase, null);
                    t0.d("KeyTrigger", "Could not find method \"" + lowerCase + "\"on class " + view.getClass().getSimpleName() + " " + vy2.F(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                t0.d("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + vy2.F(view));
                return;
            }
        }
        boolean z = lowerCase.length() == 1;
        if (!z) {
            lowerCase = lowerCase.substring(1).toLowerCase(Locale.ROOT);
        }
        String str2 = lowerCase;
        for (String str3 : this.d.keySet()) {
            String lowerCase2 = str3.toLowerCase(Locale.ROOT);
            if (z || lowerCase2.matches(str2)) {
                w21 w21Var = (w21) this.d.get(str3);
                if (w21Var != null) {
                    Class<?> cls = view.getClass();
                    String str4 = w21Var.b;
                    String strN = !w21Var.a ? dw1.n("set", str4) : str4;
                    try {
                        int iOrdinal = w21Var.c.ordinal();
                        Class<?> cls2 = Integer.TYPE;
                        Class<?> cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strN, cls2).invoke(view, Integer.valueOf(w21Var.d));
                                break;
                            case 1:
                                cls.getMethod(strN, cls3).invoke(view, Float.valueOf(w21Var.e));
                                break;
                            case 2:
                                cls.getMethod(strN, cls2).invoke(view, Integer.valueOf(w21Var.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strN, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(w21Var.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strN, CharSequence.class).invoke(view, w21Var.f);
                                break;
                            case 5:
                                cls.getMethod(strN, Boolean.TYPE).invoke(view, Boolean.valueOf(w21Var.g));
                                break;
                            case 6:
                                cls.getMethod(strN, cls3).invoke(view, Float.valueOf(w21Var.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbN = t61.n(" Custom Attribute \"", str4, "\" not found on ");
                        sbN.append(cls.getName());
                        t0.e("TransitionLayout", sbN.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        t0.e("TransitionLayout", cls.getName() + " must have a method " + strN, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbN2 = t61.n(" Custom Attribute \"", str4, "\" not found on ");
                        sbN2.append(cls.getName());
                        t0.e("TransitionLayout", sbN2.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // defpackage.rx3
    public final void d(HashSet hashSet) {
    }
}
