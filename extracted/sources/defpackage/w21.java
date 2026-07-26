package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import io.sentry.android.core.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w21 {
    public boolean a = false;
    public String b;
    public ConstraintAttribute$AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public w21(w21 w21Var, Object obj) {
        this.b = w21Var.b;
        this.c = w21Var.c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), eu6.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == eu6.CustomAttribute_attributeName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == eu6.CustomAttribute_methodName) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == eu6.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.f;
            } else if (index == eu6.CustomAttribute_customColorValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.c;
            } else if (index == eu6.CustomAttribute_customColorDrawableValue) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.d;
            } else {
                int i2 = eu6.CustomAttribute_customPixelDimension;
                ConstraintAttribute$AttributeType constraintAttribute$AttributeType2 = ConstraintAttribute$AttributeType.g;
                if (index == i2) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == eu6.CustomAttribute_customDimension) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == eu6.CustomAttribute_customFloatValue) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.b;
                } else if (index == eu6.CustomAttribute_customIntegerValue) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.a;
                } else if (index == eu6.CustomAttribute_customStringValue) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.e;
                } else if (index == eu6.CustomAttribute_customReference) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.h;
                }
                constraintAttribute$AttributeType = constraintAttribute$AttributeType2;
            }
        }
        if (string != null && objValueOf != null) {
            w21 w21Var = new w21();
            w21Var.b = string;
            w21Var.c = constraintAttribute$AttributeType;
            w21Var.a = z;
            w21Var.f(objValueOf);
            map.put(string, w21Var);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            w21 w21Var = (w21) map.get(str);
            String strN = !w21Var.a ? dw1.n("set", str) : str;
            try {
                int iOrdinal = w21Var.c.ordinal();
                Class<?> cls2 = Float.TYPE;
                Class<?> cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strN, cls3).invoke(view, Integer.valueOf(w21Var.d));
                        break;
                    case 1:
                        cls.getMethod(strN, cls2).invoke(view, Float.valueOf(w21Var.e));
                        break;
                    case 2:
                        cls.getMethod(strN, cls3).invoke(view, Integer.valueOf(w21Var.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strN, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(w21Var.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strN, CharSequence.class).invoke(view, w21Var.f);
                        break;
                    case 5:
                        cls.getMethod(strN, Boolean.TYPE).invoke(view, Boolean.valueOf(w21Var.g));
                        break;
                    case 6:
                        cls.getMethod(strN, cls2).invoke(view, Float.valueOf(w21Var.e));
                        break;
                    case 7:
                        cls.getMethod(strN, cls3).invoke(view, Integer.valueOf(w21Var.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbN = t61.n(" Custom Attribute \"", str, "\" not found on ");
                sbN.append(cls.getName());
                t0.e("TransitionLayout", sbN.toString(), e);
            } catch (NoSuchMethodException e2) {
                t0.e("TransitionLayout", cls.getName() + " must have a method " + strN, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbN2 = t61.n(" Custom Attribute \"", str, "\" not found on ");
                sbN2.append(cls.getName());
                t0.e("TransitionLayout", sbN2.toString(), e3);
            }
        }
    }

    public final float a() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
            case 6:
                return this.e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i = (this.h >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
