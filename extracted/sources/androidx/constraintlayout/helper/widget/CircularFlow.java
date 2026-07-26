package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import defpackage.eu6;
import io.sentry.android.core.t0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    public static int v;
    public static float w;
    public ConstraintLayout l;
    public int m;
    public float[] n;
    public int[] o;
    public int p;
    public int q;
    public String r;
    public String s;
    public Float t;
    public Integer u;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.q = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                s(str.substring(i).trim());
                return;
            } else {
                s(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.p = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                t(str.substring(i).trim());
                return;
            } else {
                t(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.n, this.q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.o, this.p);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.m = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == eu6.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.r = string;
                    setAngles(string);
                } else if (index == eu6.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.s = string2;
                    setRadius(string2);
                } else if (index == eu6.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, w));
                    this.t = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == eu6.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, v));
                    this.u = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.r;
        if (str != null) {
            this.n = new float[1];
            setAngles(str);
        }
        String str2 = this.s;
        if (str2 != null) {
            this.o = new int[1];
            setRadius(str2);
        }
        Float f = this.t;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.u;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.l = (ConstraintLayout) getParent();
        for (int i = 0; i < this.b; i++) {
            View viewK = this.l.k(this.a[i]);
            if (viewK != null) {
                int i2 = v;
                float f2 = w;
                int[] iArr = this.o;
                HashMap map = this.i;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.u;
                    if (num2 == null || num2.intValue() == -1) {
                        t0.d("CircularFlow", "Added radius to view with id: " + ((String) map.get(Integer.valueOf(viewK.getId()))));
                    } else {
                        this.p++;
                        if (this.o == null) {
                            this.o = new int[1];
                        }
                        int[] radius = getRadius();
                        this.o = radius;
                        radius[this.p - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.n;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.t;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        t0.d("CircularFlow", "Added angle to view with id: " + ((String) map.get(Integer.valueOf(viewK.getId()))));
                    } else {
                        this.q++;
                        if (this.n == null) {
                            this.n = new float[1];
                        }
                        float[] angles = getAngles();
                        this.n = angles;
                        angles[this.q - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewK.getLayoutParams();
                layoutParams.r = f2;
                layoutParams.p = this.m;
                layoutParams.q = i2;
                viewK.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    public final void s(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.c == null || (fArr = this.n) == null) {
            return;
        }
        if (this.q + 1 > fArr.length) {
            this.n = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.n[this.q] = Integer.parseInt(str);
        this.q++;
    }

    public void setDefaultAngle(float f) {
        w = f;
    }

    public void setDefaultRadius(int i) {
        v = i;
    }

    public final void t(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.c) == null || (iArr = this.o) == null) {
            return;
        }
        if (this.p + 1 > iArr.length) {
            this.o = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.o[this.p] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.p++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
