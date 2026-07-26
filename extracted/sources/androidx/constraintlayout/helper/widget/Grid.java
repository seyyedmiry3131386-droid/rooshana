package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import defpackage.eu6;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {
    public final HashSet A;
    public int[] B;
    public View[] l;
    public ConstraintLayout m;
    public int n;
    public int o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public float v;
    public float w;
    public int x;
    public int y;
    public boolean[][] z;

    public Grid(Context context) {
        super(context);
        this.y = 0;
        this.A = new HashSet();
    }

    public static int[][] B(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public static float[] C(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.y;
            if (i >= this.n * this.p) {
                return -1;
            }
            int iX = x(i);
            int iW = w(this.y);
            boolean[] zArr = this.z[iX];
            if (zArr[iW]) {
                zArr[iW] = false;
                z = true;
            }
            this.y++;
        }
        return i;
    }

    public static void s(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.H = -1.0f;
        layoutParams.f = -1;
        layoutParams.e = -1;
        layoutParams.g = -1;
        layoutParams.h = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public static void t(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.I = -1.0f;
        layoutParams.j = -1;
        layoutParams.i = -1;
        layoutParams.k = -1;
        layoutParams.l = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public final View A() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.m.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public final void D() {
        int i;
        int i2 = this.o;
        if (i2 != 0 && (i = this.q) != 0) {
            this.n = i2;
            this.p = i;
            return;
        }
        int i3 = this.q;
        if (i3 > 0) {
            this.p = i3;
            this.n = ((this.b + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.n = i2;
            this.p = ((this.b + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.b) + 1.5d);
            this.n = iSqrt;
            this.p = ((this.b + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.u;
    }

    public int getColumns() {
        return this.q;
    }

    public float getHorizontalGaps() {
        return this.v;
    }

    public int getOrientation() {
        return this.x;
    }

    public String getRowWeights() {
        return this.t;
    }

    public int getRows() {
        return this.o;
    }

    public String getSkips() {
        return this.s;
    }

    public String getSpans() {
        return this.r;
    }

    public float getVerticalGaps() {
        return this.w;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.Grid);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.Grid_grid_rows) {
                    this.o = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == eu6.Grid_grid_columns) {
                    this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == eu6.Grid_grid_spans) {
                    this.r = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.Grid_grid_skips) {
                    this.s = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.Grid_grid_rowWeights) {
                    this.t = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.Grid_grid_columnWeights) {
                    this.u = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.Grid_grid_orientation) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.Grid_grid_horizontalGaps) {
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == eu6.Grid_grid_verticalGaps) {
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == eu6.Grid_grid_validateInputs) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == eu6.Grid_grid_useRtl) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            D();
            y();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = (ConstraintLayout) getParent();
        v(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.l) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.u;
        if (str2 == null || !str2.equals(str)) {
            this.u = str;
            v(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.q != i) {
            this.q = i;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= 0.0f && this.v != f) {
            this.v = f;
            v(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.x != i) {
            this.x = i;
            v(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.t;
        if (str2 == null || !str2.equals(str)) {
            this.t = str;
            v(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.o != i) {
            this.o = i;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.s;
        if (str2 == null || !str2.equals(str)) {
            this.s = str;
            v(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.r;
        if (str == null || !str.contentEquals(charSequence)) {
            this.r = charSequence.toString();
            v(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= 0.0f && this.w != f) {
            this.w = f;
            v(true);
            invalidate();
        }
    }

    public final void u(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = this.B;
        layoutParams.e = iArr[i2];
        layoutParams.i = iArr[i];
        layoutParams.h = iArr[(i2 + i4) - 1];
        layoutParams.l = iArr[(i + i3) - 1];
        view.setLayoutParams(layoutParams);
    }

    public final void v(boolean z) {
        int i;
        int i2;
        int[][] iArrB;
        int[][] iArrB2;
        if (this.m == null || this.n < 1 || this.p < 1) {
            return;
        }
        HashSet hashSet = this.A;
        if (z) {
            for (int i3 = 0; i3 < this.z.length; i3++) {
                int i4 = 0;
                while (true) {
                    boolean[][] zArr = this.z;
                    if (i4 < zArr[0].length) {
                        zArr[i3][i4] = true;
                        i4++;
                    }
                }
            }
            hashSet.clear();
        }
        this.y = 0;
        int iMax = Math.max(this.n, this.p);
        View[] viewArr = this.l;
        if (viewArr == null) {
            this.l = new View[iMax];
            int i5 = 0;
            while (true) {
                View[] viewArr2 = this.l;
                if (i5 >= viewArr2.length) {
                    break;
                }
                viewArr2[i5] = A();
                i5++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i6 = 0; i6 < iMax; i6++) {
                View[] viewArr4 = this.l;
                if (i6 < viewArr4.length) {
                    viewArr3[i6] = viewArr4[i6];
                } else {
                    viewArr3[i6] = A();
                }
            }
            int i7 = iMax;
            while (true) {
                View[] viewArr5 = this.l;
                if (i7 >= viewArr5.length) {
                    break;
                }
                this.m.removeView(viewArr5[i7]);
                i7++;
            }
            this.l = viewArr3;
        }
        this.B = new int[iMax];
        int i8 = 0;
        while (true) {
            View[] viewArr6 = this.l;
            if (i8 >= viewArr6.length) {
                break;
            }
            this.B[i8] = viewArr6[i8].getId();
            i8++;
        }
        int id = getId();
        int iMax2 = Math.max(this.n, this.p);
        float[] fArrC = C(this.n, this.t);
        if (this.n == 1) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.l[0].getLayoutParams();
            t(this.l[0]);
            layoutParams.i = id;
            layoutParams.l = id;
            this.l[0].setLayoutParams(layoutParams);
        } else {
            int i9 = 0;
            while (true) {
                i = this.n;
                if (i9 >= i) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.l[i9].getLayoutParams();
                t(this.l[i9]);
                if (fArrC != null) {
                    layoutParams2.I = fArrC[i9];
                }
                if (i9 > 0) {
                    layoutParams2.j = this.B[i9 - 1];
                } else {
                    layoutParams2.i = id;
                }
                if (i9 < this.n - 1) {
                    layoutParams2.k = this.B[i9 + 1];
                } else {
                    layoutParams2.l = id;
                }
                if (i9 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.v;
                }
                this.l[i9].setLayoutParams(layoutParams2);
                i9++;
            }
            while (i < iMax2) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.l[i].getLayoutParams();
                t(this.l[i]);
                layoutParams3.i = id;
                layoutParams3.l = id;
                this.l[i].setLayoutParams(layoutParams3);
                i++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.n, this.p);
        float[] fArrC2 = C(this.p, this.u);
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.l[0].getLayoutParams();
        if (this.p == 1) {
            s(this.l[0]);
            layoutParams4.e = id2;
            layoutParams4.h = id2;
            this.l[0].setLayoutParams(layoutParams4);
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.p;
                if (i10 >= i2) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) this.l[i10].getLayoutParams();
                s(this.l[i10]);
                if (fArrC2 != null) {
                    layoutParams5.H = fArrC2[i10];
                }
                if (i10 > 0) {
                    layoutParams5.f = this.B[i10 - 1];
                } else {
                    layoutParams5.e = id2;
                }
                if (i10 < this.p - 1) {
                    layoutParams5.g = this.B[i10 + 1];
                } else {
                    layoutParams5.h = id2;
                }
                if (i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.v;
                }
                this.l[i10].setLayoutParams(layoutParams5);
                i10++;
            }
            while (i2 < iMax3) {
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) this.l[i2].getLayoutParams();
                s(this.l[i2]);
                layoutParams6.e = id2;
                layoutParams6.h = id2;
                this.l[i2].setLayoutParams(layoutParams6);
                i2++;
            }
        }
        String str = this.s;
        if (str != null && !str.trim().isEmpty() && (iArrB2 = B(this.s)) != null) {
            for (int i11 = 0; i11 < iArrB2.length; i11++) {
                int iX = x(iArrB2[i11][0]);
                int iW = w(iArrB2[i11][0]);
                int[] iArr = iArrB2[i11];
                if (!z(iX, iW, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.r;
        if (str2 != null && !str2.trim().isEmpty() && (iArrB = B(this.r)) != null) {
            int[] iArr2 = this.a;
            View[] viewArrJ = j(this.m);
            for (int i12 = 0; i12 < iArrB.length; i12++) {
                int iX2 = x(iArrB[i12][0]);
                int iW2 = w(iArrB[i12][0]);
                int[] iArr3 = iArrB[i12];
                if (!z(iX2, iW2, iArr3[1], iArr3[2])) {
                    break;
                }
                View view = viewArrJ[i12];
                int[] iArr4 = iArrB[i12];
                u(view, iX2, iW2, iArr4[1], iArr4[2]);
                hashSet.add(Integer.valueOf(iArr2[i12]));
            }
        }
        View[] viewArrJ2 = j(this.m);
        for (int i13 = 0; i13 < this.b; i13++) {
            if (!hashSet.contains(Integer.valueOf(this.a[i13]))) {
                int nextPosition = getNextPosition();
                int iX3 = x(nextPosition);
                int iW3 = w(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    u(viewArrJ2[i13], iX3, iW3, 1, 1);
                }
            }
        }
    }

    public final int w(int i) {
        return this.x == 1 ? i / this.n : i % this.p;
    }

    public final int x(int i) {
        return this.x == 1 ? i % this.n : i / this.p;
    }

    public final void y() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.n, this.p);
        this.z = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean z(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.z;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = 0;
        this.A = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = 0;
        this.A = new HashSet();
    }
}
