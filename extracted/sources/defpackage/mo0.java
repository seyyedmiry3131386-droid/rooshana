package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mo0 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo0(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return Float.valueOf(((pr0) obj).h);
            case 9:
                return Float.valueOf(((pr0) obj).i);
            case 10:
                return Float.valueOf(((rr0) obj).h);
            case 11:
                return Float.valueOf(((rr0) obj).i);
            case 12:
                return Float.valueOf(((cw1) obj).b());
            case 13:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 14:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 15:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 16:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 17:
                return Float.valueOf(((h74) obj).h);
            case 18:
                return Float.valueOf(((j74) obj).i);
            case 19:
                return Float.valueOf(((wa4) obj).b);
            case 20:
                return Float.valueOf(((SwitchCompat) obj).z);
            case 21:
                return Float.valueOf(ba9.a.h((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qo0 qo0Var = (qo0) obj;
                PointF pointF = (PointF) obj2;
                qo0Var.getClass();
                qo0Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                qo0Var.b = iRound;
                int i = qo0Var.f + 1;
                qo0Var.f = i;
                if (i == qo0Var.g) {
                    ba9.a(qo0Var.e, qo0Var.a, iRound, qo0Var.c, qo0Var.d);
                    qo0Var.f = 0;
                    qo0Var.g = 0;
                }
                break;
            case 1:
                qo0 qo0Var2 = (qo0) obj;
                PointF pointF2 = (PointF) obj2;
                qo0Var2.getClass();
                qo0Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                qo0Var2.d = iRound2;
                int i2 = qo0Var2.g + 1;
                qo0Var2.g = i2;
                if (qo0Var2.f == i2) {
                    ba9.a(qo0Var2.e, qo0Var2.a, qo0Var2.b, qo0Var2.c, iRound2);
                    qo0Var2.f = 0;
                    qo0Var2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                ba9.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                ba9.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                ba9.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                y97.j((ImageView) obj, (Matrix) obj2);
                break;
            case 6:
                zo0 zo0Var = (zo0) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, zo0Var.c, 0, fArr.length);
                zo0Var.a();
                break;
            case 7:
                zo0 zo0Var2 = (zo0) obj;
                PointF pointF6 = (PointF) obj2;
                zo0Var2.getClass();
                zo0Var2.d = pointF6.x;
                zo0Var2.e = pointF6.y;
                zo0Var2.a();
                break;
            case 8:
                pr0 pr0Var = (pr0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                pr0Var.h = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                w82 w82Var = pr0Var.e;
                ArrayList arrayList = (ArrayList) pr0Var.b;
                mw1 mw1Var = (mw1) arrayList.get(0);
                float f = pr0Var.h * 1520.0f;
                mw1Var.a = (-20.0f) + f;
                mw1Var.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    mw1Var.b = (w82Var.getInterpolation(y.i(i3, pr0.k[i4], 667)) * 250.0f) + mw1Var.b;
                    mw1Var.a = (w82Var.getInterpolation(y.i(i3, pr0.l[i4], 667)) * 250.0f) + mw1Var.a;
                }
                float f2 = mw1Var.a;
                float f3 = mw1Var.b;
                mw1Var.a = (((f3 - f2) * pr0Var.i) + f2) / 360.0f;
                mw1Var.b = f3 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float fI = y.i(i3, pr0.m[i5], 333);
                        if (fI <= 0.0f || fI >= 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + pr0Var.g;
                            int[] iArr = pr0Var.f.e;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((mw1) arrayList.get(0)).c = zu.a(w82Var.getInterpolation(fI), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((mm3) pr0Var.a).invalidateSelf();
                break;
            case 9:
                ((pr0) obj).i = ((Float) obj2).floatValue();
                break;
            case 10:
                rr0 rr0Var = (rr0) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                rr0Var.h = fFloatValue2;
                int i7 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = rr0Var.e;
                ArrayList arrayList2 = (ArrayList) rr0Var.b;
                mw1 mw1Var2 = (mw1) arrayList2.get(0);
                float f4 = rr0Var.h * 1080.0f;
                int[] iArr2 = rr0.l;
                float interpolation = 0.0f;
                for (int i8 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(y.i(i7, i8, 500)) * 90.0f;
                }
                mw1Var2.g = f4 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(y.i(i7, 0, 3000)) - timeInterpolator.getInterpolation(y.i(i7, 3000, 3000));
                mw1Var2.a = 0.0f;
                float[] fArr2 = rr0.m;
                float fP0 = yq2.p0(fArr2[0], fArr2[1], interpolation2);
                mw1Var2.b = fP0;
                float f5 = rr0Var.i;
                if (f5 > 0.0f) {
                    mw1Var2.b = (1.0f - f5) * fP0;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        float fI2 = y.i(i7, iArr2[i9], 100);
                        if (fI2 < 0.0f || fI2 > 1.0f) {
                            i9++;
                        } else {
                            int i10 = i9 + rr0Var.g;
                            int[] iArr3 = rr0Var.f.e;
                            int length3 = i10 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((mw1) arrayList2.get(0)).c = zu.a(timeInterpolator.getInterpolation(fI2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((mm3) rr0Var.a).invalidateSelf();
                break;
            case 11:
                ((rr0) obj).i = ((Float) obj2).floatValue();
                break;
            case 12:
                cw1 cw1Var = (cw1) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (cw1Var.i != fFloatValue3) {
                    cw1Var.i = fFloatValue3;
                    cw1Var.invalidateSelf();
                }
                break;
            case 13:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 14:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case 15:
                View view6 = (View) obj;
                view6.setPaddingRelative(((Float) obj2).intValue(), view6.getPaddingTop(), view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 16:
                View view7 = (View) obj;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 17:
                h74 h74Var = (h74) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                h74Var.h = fFloatValue4;
                ArrayList arrayList3 = (ArrayList) h74Var.b;
                ((mw1) arrayList3.get(0)).a = 0.0f;
                float fI3 = y.i((int) (fFloatValue4 * 333.0f), 0, 667);
                mw1 mw1Var3 = (mw1) arrayList3.get(0);
                mw1 mw1Var4 = (mw1) arrayList3.get(1);
                w82 w82Var2 = h74Var.d;
                float interpolation3 = w82Var2.getInterpolation(fI3);
                mw1Var4.a = interpolation3;
                mw1Var3.b = interpolation3;
                mw1 mw1Var5 = (mw1) arrayList3.get(1);
                mw1 mw1Var6 = (mw1) arrayList3.get(2);
                float interpolation4 = w82Var2.getInterpolation(fI3 + 0.49925038f);
                mw1Var6.a = interpolation4;
                mw1Var5.b = interpolation4;
                ((mw1) arrayList3.get(2)).b = 1.0f;
                if (h74Var.g && ((mw1) arrayList3.get(1)).b < 1.0f) {
                    ((mw1) arrayList3.get(2)).c = ((mw1) arrayList3.get(1)).c;
                    ((mw1) arrayList3.get(1)).c = ((mw1) arrayList3.get(0)).c;
                    ((mw1) arrayList3.get(0)).c = h74Var.e.e[h74Var.f];
                    h74Var.g = false;
                }
                ((mm3) h74Var.a).invalidateSelf();
                break;
            case 18:
                j74 j74Var = (j74) obj;
                float fFloatValue5 = ((Float) obj2).floatValue();
                j74Var.i = fFloatValue5;
                int i11 = (int) (fFloatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = j74Var.e;
                ArrayList arrayList4 = (ArrayList) j74Var.b;
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    mw1 mw1Var7 = (mw1) arrayList4.get(i12);
                    int[] iArr4 = j74.l;
                    int i13 = i12 * 2;
                    int i14 = iArr4[i13];
                    int[] iArr5 = j74.k;
                    mw1Var7.a = at2.R(interpolatorArr[i13].getInterpolation(y.i(i11, i14, iArr5[i13])), 0.0f, 1.0f);
                    int i15 = i13 + 1;
                    mw1Var7.b = at2.R(interpolatorArr[i15].getInterpolation(y.i(i11, iArr4[i15], iArr5[i15])), 0.0f, 1.0f);
                }
                if (j74Var.h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((mw1) it.next()).c = j74Var.f.e[j74Var.g];
                    }
                    j74Var.h = false;
                }
                ((mm3) j74Var.a).invalidateSelf();
                break;
            case 19:
                wa4 wa4Var = (wa4) obj;
                wa4Var.b = ((Float) obj2).floatValue();
                float f6 = wa4Var.a - 1;
                float f7 = wa4Var.c - f6;
                float f8 = ((int) (r14 * 650.0f)) / 650.0f;
                if (f8 == 1.0f) {
                    f8 = 0.0f;
                }
                wa4Var.h.c = ((f7 * 90.0f) + ((f8 * 50.0f) + (f6 * 140.0f))) % 360.0f;
                xa4 xa4Var = wa4Var.g;
                if (xa4Var != null) {
                    xa4Var.invalidateSelf();
                }
                break;
            case 20:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 21:
                ba9.b((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
