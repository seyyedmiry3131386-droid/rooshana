package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import defpackage.aq5;
import defpackage.bq5;
import defpackage.br2;
import defpackage.bu6;
import defpackage.ck4;
import defpackage.cq5;
import defpackage.dp2;
import defpackage.dq5;
import defpackage.dw1;
import defpackage.fu;
import defpackage.kh2;
import defpackage.rm7;
import defpackage.zp5;

/* JADX INFO: loaded from: classes3.dex */
public class NumberPickerView extends View implements br2 {
    public int A;
    public CharSequence[] A0;
    public int B;
    public CharSequence[] B0;
    public int C;
    public HandlerThread C0;
    public int D;
    public zp5 D0;
    public String E;
    public zp5 E0;
    public String F;
    public bq5 F0;
    public String G;
    public aq5 G0;
    public String H;
    public int H0;
    public float I;
    public int I0;
    public float J;
    public int J0;
    public float K;
    public float K0;
    public float L;
    public float L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public int N0;
    public boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public boolean Q;
    public float Q0;
    public boolean R;
    public float R0;
    public boolean S;
    public float S0;
    public boolean T;
    public int T0;
    public ck4 U;
    public int U0;
    public VelocityTracker V;
    public int V0;
    public final Paint W;
    public int W0;
    public int X0;
    public fu a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final TextPaint x0;
    public int y;
    public final Paint y0;
    public int z;
    public String[] z0;

    public NumberPickerView(Context context) {
        super(context);
        if (!isInEditMode()) {
            n();
        }
        this.c = -13421773;
        this.d = -695533;
        this.e = -695533;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = -695533;
        this.p = 2;
        this.q = 0;
        this.r = 0;
        this.s = 3;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.x0 = new TextPaint();
        this.y0 = new Paint();
        this.H0 = 0;
        this.K0 = 0.0f;
        this.L0 = 0.0f;
        this.M0 = false;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        k(context);
    }

    public static void a(NumberPickerView numberPickerView, int i, int i2, Object obj) {
        bq5 bq5Var;
        BirthdayPicker birthdayPicker;
        dp2 dp2Var;
        numberPickerView.p(0);
        if (i != i2 && ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (bq5Var = numberPickerView.F0) != null && (dp2Var = (birthdayPicker = (BirthdayPicker) bq5Var).g) != null)) {
            dp2Var.invoke(birthdayPicker.getDate());
        }
        numberPickerView.B = i2;
        if (numberPickerView.R) {
            numberPickerView.R = false;
            numberPickerView.c(numberPickerView.getPickedIndexRelativeToRaw() - numberPickerView.t, false);
            numberPickerView.N = false;
            numberPickerView.postInvalidate();
        }
    }

    public static int d(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int f(CharSequence[] charSequenceArr, TextPaint textPaint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int iMax = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                iMax = Math.max(i(charSequence, textPaint), iMax);
            }
        }
        return iMax;
    }

    public static Message g(Object obj, int i, int i2, int i3) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        return messageObtain;
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.F;
        str.getClass();
        switch (str) {
            case "middle":
                return TextUtils.TruncateAt.MIDDLE;
            case "end":
                return TextUtils.TruncateAt.END;
            case "start":
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    public static float h(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    public static int i(CharSequence charSequence, Paint paint) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return (int) (paint.measureText(charSequence.toString()) + 0.5f);
    }

    public static int q(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void b() {
        int iFloor = (int) Math.floor(this.V0 / this.P0);
        this.T0 = iFloor;
        this.U0 = -(this.V0 - (iFloor * this.P0));
    }

    public final void c(int i, boolean z) {
        int i2 = i - ((this.s - 1) / 2);
        this.T0 = i2;
        int oneRecycleSize = getOneRecycleSize();
        if (oneRecycleSize <= 0) {
            i2 = 0;
        } else if (z && (i2 = i2 % oneRecycleSize) < 0) {
            i2 += oneRecycleSize;
        }
        this.T0 = i2;
        int i3 = this.P0;
        if (i3 == 0) {
            this.O = true;
        } else {
            this.V0 = i2 * i3;
            b();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.P0 != 0 && ((OverScroller) this.U.b).computeScrollOffset()) {
            this.V0 = ((OverScroller) this.U.b).getCurrY();
            b();
            postInvalidate();
        }
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.a == null) {
            this.a = new fu(this);
        }
        return this.a.e();
    }

    public String getContentByCurrValue() {
        return this.z0[getValue() - this.v];
    }

    public String[] getDisplayedValues() {
        return this.z0;
    }

    public int getMaxValue() {
        return this.w;
    }

    public int getMinValue() {
        return this.v;
    }

    public int getOneRecycleSize() {
        return (this.u - this.t) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.U0;
        if (i == 0) {
            return j(this.V0);
        }
        int i2 = this.P0;
        return i < (-i2) / 2 ? j(this.V0 + i2 + i) : j(this.V0 + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.z0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.v;
    }

    public boolean getWrapSelectorWheel() {
        return this.N;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.N && this.Q;
    }

    public final int j(int i) {
        int i2 = this.P0;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int i4 = (this.s / 2) + (i / i2);
        int oneRecycleSize = getOneRecycleSize();
        boolean z = this.N && this.Q;
        if (oneRecycleSize > 0) {
            if (z) {
                i3 = i4 % oneRecycleSize;
                if (i3 < 0) {
                    i3 += oneRecycleSize;
                }
            } else {
                i3 = i4;
            }
        }
        if (i3 >= 0 && i3 < getOneRecycleSize()) {
            return i3 + this.t;
        }
        StringBuilder sbR = rm7.r(i3, "getWillPickIndexByGlobalY illegal index : ", " getOneRecycleSize() : ");
        sbR.append(getOneRecycleSize());
        sbR.append(" mWrapSelectorWheel : ");
        sbR.append(this.N);
        throw new IllegalArgumentException(sbR.toString());
    }

    public final void k(Context context) {
        ck4 ck4Var = new ck4(15, false);
        ck4Var.b = new OverScroller(context);
        this.U = ck4Var;
        this.C = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.D = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f == 0) {
            this.f = q(14.0f, context);
        }
        if (this.g == 0) {
            this.g = q(16.0f, context);
        }
        if (this.h == 0) {
            this.h = q(14.0f, context);
        }
        if (this.k == 0) {
            this.k = d(8.0f, context);
        }
        if (this.l == 0) {
            this.l = d(8.0f, context);
        }
        int i = this.o;
        Paint paint = this.W;
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.p);
        int i2 = this.c;
        TextPaint textPaint = this.x0;
        textPaint.setColor(i2);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setTypeface((Typeface) kh2.b.a.b);
        int i3 = this.e;
        Paint paint2 = this.y0;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(align);
        paint2.setTextSize(this.h);
        int i4 = this.s;
        if (i4 % 2 == 0) {
            this.s = i4 + 1;
        }
        if (this.t == -1 || this.u == -1) {
            if (this.z0 == null) {
                this.z0 = new String[]{"0"};
            }
            u();
            if (this.t == -1) {
                this.t = 0;
            }
            if (this.u == -1) {
                this.u = this.z0.length - 1;
            }
            setMinAndMaxShowIndex(this.t, this.u, false);
        }
        m();
    }

    public final void l(Context context, AttributeSet attributeSet) {
        String[] strArr;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.NumberPickerView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == bu6.NumberPickerView_npv_ShowCount) {
                this.s = typedArrayObtainStyledAttributes.getInt(index, 3);
            } else if (index == bu6.NumberPickerView_npv_DividerColor) {
                this.o = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == bu6.NumberPickerView_npv_DividerHeight) {
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == bu6.NumberPickerView_npv_DividerMarginLeft) {
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == bu6.NumberPickerView_npv_DividerMarginRight) {
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == bu6.NumberPickerView_npv_TextArray) {
                CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(index);
                if (textArray == null) {
                    strArr = null;
                } else {
                    String[] strArr2 = new String[textArray.length];
                    for (int i2 = 0; i2 < textArray.length; i2++) {
                        strArr2[i2] = textArray[i2].toString();
                    }
                    strArr = strArr2;
                }
                this.z0 = strArr;
            } else if (index == bu6.NumberPickerView_npv_TextColorNormal) {
                this.c = typedArrayObtainStyledAttributes.getColor(index, -13421773);
            } else if (index == bu6.NumberPickerView_npv_TextColorSelected) {
                this.d = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == bu6.NumberPickerView_npv_TextColorHint) {
                this.e = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == bu6.NumberPickerView_npv_TextSizeNormal) {
                this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, q(14.0f, context));
            } else if (index == bu6.NumberPickerView_npv_TextSizeSelected) {
                this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, q(16.0f, context));
            } else if (index == bu6.NumberPickerView_npv_TextSizeHint) {
                this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, q(14.0f, context));
            } else if (index == bu6.NumberPickerView_npv_MinValue) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == bu6.NumberPickerView_npv_MaxValue) {
                this.u = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == bu6.NumberPickerView_npv_WrapSelectorWheel) {
                this.N = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == bu6.NumberPickerView_npv_ShowDivider) {
                this.M = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == bu6.NumberPickerView_npv_HintText) {
                this.E = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == bu6.NumberPickerView_npv_AlternativeHint) {
                this.H = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == bu6.NumberPickerView_npv_EmptyItemHint) {
                this.G = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == bu6.NumberPickerView_npv_MarginStartOfHint) {
                this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, d(8.0f, context));
            } else if (index == bu6.NumberPickerView_npv_MarginEndOfHint) {
                this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, d(8.0f, context));
            } else if (index == bu6.NumberPickerView_npv_ItemPaddingVertical) {
                this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, d(2.0f, context));
            } else if (index == bu6.NumberPickerView_npv_ItemPaddingHorizontal) {
                this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, d(5.0f, context));
            } else if (index == bu6.NumberPickerView_npv_AlternativeTextArrayWithMeasureHint) {
                this.A0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == bu6.NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint) {
                this.B0 = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == bu6.NumberPickerView_npv_RespondChangeOnDetached) {
                this.S = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == bu6.NumberPickerView_npv_RespondChangeInMainThread) {
                this.T = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == bu6.NumberPickerView_npv_TextEllipsize) {
                this.F = typedArrayObtainStyledAttributes.getString(index);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.C0 = handlerThread;
        handlerThread.start();
        this.D0 = new zp5(this, this.C0.getLooper());
        this.E0 = new zp5(this);
    }

    public final void n() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((dq5) e()).getClass();
    }

    public final int o(int i) {
        if (!this.N || !this.Q) {
            int i2 = this.J0;
            if (i < i2) {
                return i2;
            }
            int i3 = this.I0;
            if (i > i3) {
                return i3;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.C0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            m();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        BirthdayPicker birthdayPicker;
        dp2 dp2Var;
        super.onDetachedFromWindow();
        this.C0.quit();
        this.E0.removeCallbacksAndMessages(null);
        this.D0.removeCallbacksAndMessages(null);
        if (this.P0 == 0) {
            return;
        }
        if (!((OverScroller) this.U.b).isFinished()) {
            ((OverScroller) this.U.b).abortAnimation();
            this.V0 = ((OverScroller) this.U.b).getCurrY();
            b();
            int i = this.U0;
            if (i != 0) {
                int i2 = this.P0;
                if (i < (-i2) / 2) {
                    this.V0 = this.V0 + i2 + i;
                } else {
                    this.V0 += i;
                }
                b();
            }
            p(0);
        }
        int iJ = j(this.V0);
        if (iJ != this.B && this.S) {
            try {
                bq5 bq5Var = this.F0;
                if (bq5Var != null && (dp2Var = (birthdayPicker = (BirthdayPicker) bq5Var).g) != null) {
                    dp2Var.invoke(birthdayPicker.getDate());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.B = iJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int i = this.s / 2;
        for (int i2 = 0; i2 < this.s + 1; i2++) {
            float f = (this.P0 * i2) + this.U0;
            int i3 = this.T0 + i2;
            int oneRecycleSize = getOneRecycleSize();
            boolean z = this.N && this.Q;
            if (oneRecycleSize <= 0) {
                i3 = 0;
            } else if (z && (i3 = i3 % oneRecycleSize) < 0) {
                i3 += oneRecycleSize;
            }
            float fAbs = 1.0f - (Math.abs(f - (this.P0 * i)) / ((1 + i) * this.P0));
            int i4 = this.c;
            int i5 = this.d;
            int i6 = (((int) ((((((-16777216) & i5) >>> 24) - r11) * fAbs) + ((i4 & (-16777216)) >>> 24))) << 24) | (((int) (((((16711680 & i5) >>> 16) - r13) * fAbs) + ((i4 & 16711680) >>> 16))) << 16) | (((int) (((((65280 & i5) >>> 8) - r15) * fAbs) + ((i4 & 65280) >>> 8))) << 8) | ((int) ((((i5 & 255) - r8) * fAbs) + (i4 & 255)));
            float f2 = this.f;
            float f3 = dw1.f(this.g, f2, fAbs, f2);
            float f4 = this.J;
            float f5 = dw1.f(this.K, f4, fAbs, f4);
            TextPaint textPaint = this.x0;
            textPaint.setColor(i6);
            textPaint.setTextSize(f3);
            if (i3 >= 0 && i3 < getOneRecycleSize()) {
                CharSequence charSequenceEllipsize = this.z0[i3 + this.t];
                if (this.F != null) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, getWidth() - (this.n * 2), getEllipsizeType());
                }
                canvas2.drawText(charSequenceEllipsize.toString(), this.S0, f + (this.P0 / 2) + f5, textPaint);
            } else if (!TextUtils.isEmpty(this.G)) {
                canvas2.drawText(this.G, this.S0, f + (this.P0 / 2) + f5, textPaint);
            }
        }
        if (this.M) {
            float paddingLeft = getPaddingLeft() + this.q;
            float f6 = this.Q0;
            float paddingRight = (this.N0 - getPaddingRight()) - this.r;
            float f7 = this.Q0;
            Paint paint = this.W;
            canvas2.drawLine(paddingLeft, f6, paddingRight, f7, paint);
            canvas2 = canvas;
            canvas2.drawLine(getPaddingLeft() + this.q, this.R0, (this.N0 - getPaddingRight()) - this.r, this.R0, paint);
        }
        if (TextUtils.isEmpty(this.E)) {
            return;
        }
        canvas2.drawText(this.E, this.S0 + ((this.x + this.i) / 2) + this.k, ((this.Q0 + this.R0) / 2.0f) + this.L, this.y0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        s(false);
        int mode = View.MeasureSpec.getMode(i);
        this.W0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(this.z, (((this.n * 2) + Math.max(this.i, this.j) + (Math.max(this.i, this.j) != 0 ? this.k : 0) + (Math.max(this.i, this.j) == 0 ? 0 : this.l)) * 2) + Math.max(this.x, this.A));
            size = mode == Integer.MIN_VALUE ? Math.min(paddingRight, size) : paddingRight;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        this.X0 = mode2;
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop() + (((this.m * 2) + this.y) * this.s);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingBottom, size2) : paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSizeChanged(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.NumberPickerView.onSizeChanged(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.NumberPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        if (this.H0 == i) {
            return;
        }
        this.H0 = i;
        aq5 aq5Var = this.G0;
        if (aq5Var != null) {
            aq5Var.a(this);
        }
    }

    public final void r() {
        ck4 ck4Var = this.U;
        if (ck4Var == null || ((OverScroller) ck4Var.b).isFinished()) {
            return;
        }
        ck4 ck4Var2 = this.U;
        ((OverScroller) ck4Var2.b).startScroll(0, ((OverScroller) ck4Var2.b).getCurrY(), 0, 0, 1);
        ((OverScroller) this.U.b).abortAnimation();
        postInvalidate();
    }

    public final void s(boolean z) {
        TextPaint textPaint = this.x0;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(this.g);
        this.x = f(this.z0, textPaint);
        this.z = f(this.A0, textPaint);
        this.A = f(this.B0, textPaint);
        textPaint.setTextSize(this.h);
        this.j = i(this.H, textPaint);
        textPaint.setTextSize(textSize);
        float textSize2 = textPaint.getTextSize();
        textPaint.setTextSize(this.g);
        this.y = (int) (((double) (textPaint.getFontMetrics().bottom - textPaint.getFontMetrics().top)) + 0.5d);
        textPaint.setTextSize(textSize2);
        if (z) {
            if (this.W0 == Integer.MIN_VALUE || this.X0 == Integer.MIN_VALUE) {
                this.E0.sendEmptyMessage(3);
            }
        }
    }

    public void setDisplayedValues(String[] strArr, boolean z) {
        setDisplayedValuesAndPickedIndex(strArr, 0, z);
    }

    public void setDisplayedValuesAndPickedIndex(String[] strArr, int i, boolean z) {
        r();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "pickedIndex should not be negative, now pickedIndex is "));
        }
        this.z0 = strArr;
        u();
        s(true);
        t();
        if (this.z0 == null) {
            this.z0 = new String[]{"0"};
        }
        u();
        this.t = 0;
        this.u = this.z0.length - 1;
        this.B = i;
        c(i, this.N && this.Q);
        if (z) {
            this.D0.sendMessageDelayed(g(null, 1, 0, 0), 0L);
            postInvalidate();
        }
    }

    public void setDividerColor(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        this.W.setColor(i);
        postInvalidate();
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            this.I = ViewConfiguration.getScrollFriction() / f;
        } else {
            throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
        }
    }

    public void setHintText(String str) {
        String str2 = this.E;
        if (str2 == null ? str == null : str2.equals(str)) {
            return;
        }
        this.E = str;
        Paint paint = this.y0;
        this.L = h(paint.getFontMetrics());
        this.i = i(this.E, paint);
        this.E0.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.y0.setColor(i);
        postInvalidate();
    }

    public void setMaxValue(int i) {
        String[] strArr = this.z0;
        if (strArr == null) {
            throw new NullPointerException("mDisplayedValues should not be null");
        }
        int i2 = this.v;
        if ((i - i2) + 1 > strArr.length) {
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.v) + 1) + " and mDisplayedValues.length is " + this.z0.length);
        }
        this.w = i;
        int i3 = this.t;
        int i4 = (i - i2) + i3;
        this.u = i4;
        setMinAndMaxShowIndex(i3, i4);
        t();
    }

    public void setMinAndMaxShowIndex(int i, int i2) {
        setMinAndMaxShowIndex(i, i2, true);
    }

    public void setMinValue(int i) {
        this.v = i;
        this.t = 0;
        t();
    }

    public void setNormalTextColor(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        postInvalidate();
    }

    public void setOnScrollListener(aq5 aq5Var) {
        this.G0 = aq5Var;
    }

    public void setOnValueChangedListener(bq5 bq5Var) {
        this.F0 = bq5Var;
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i < 0 || i >= getOneRecycleSize()) {
            return;
        }
        this.B = this.t + i;
        c(i, this.N && this.Q);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.t;
        if (i2 <= -1 || i2 > i || i > this.u) {
            return;
        }
        this.B = i;
        c(i - i2, this.N && this.Q);
        postInvalidate();
    }

    public void setSelectedTextColor(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        postInvalidate();
    }

    public void setValue(int i) {
        int i2 = this.v;
        if (i < i2) {
            throw new IllegalArgumentException(rm7.n(i, "should not set a value less than mMinValue, value is "));
        }
        if (i > this.w) {
            throw new IllegalArgumentException(rm7.n(i, "should not set a value greater than mMaxValue, value is "));
        }
        setPickedIndexRelativeToRaw(i - i2);
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.N != z) {
            if (z) {
                this.N = true;
                u();
                postInvalidate();
            } else {
                if (this.H0 != 0) {
                    this.R = true;
                    return;
                }
                c(getPickedIndexRelativeToRaw() - this.t, false);
                this.N = false;
                postInvalidate();
            }
        }
    }

    public final void t() {
        this.I0 = 0;
        this.J0 = (-this.s) * this.P0;
        if (this.z0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.s;
            int i2 = this.P0;
            this.I0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.J0 = (-(i / 2)) * i2;
        }
    }

    public final void u() {
        this.Q = this.z0.length > this.s;
    }

    public void setDisplayedValues(String[] strArr) {
        zp5 zp5Var = this.D0;
        if (zp5Var != null) {
            zp5Var.removeMessages(1);
        }
        r();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if ((this.w - this.v) + 1 > strArr.length) {
            StringBuilder sb = new StringBuilder("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is ");
            sb.append((this.w - this.v) + 1);
            sb.append(" newDisplayedValues.length is ");
            throw new IllegalArgumentException(dw1.k(strArr.length, ", you need to set MaxValue and MinValue before setDisplayedValues(String[])", sb));
        }
        this.z0 = strArr;
        u();
        s(true);
        this.B = this.t;
        c(0, this.N && this.Q);
        postInvalidate();
        this.E0.sendEmptyMessage(3);
    }

    public void setMinAndMaxShowIndex(int i, int i2, boolean z) {
        if (i > i2) {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
        String[] strArr = this.z0;
        if (strArr == null) {
            throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "minShowIndex should not be less than 0, now minShowIndex is "));
        }
        if (i > strArr.length - 1) {
            throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.z0.length - 1) + " minShowIndex is " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(rm7.n(i2, "maxShowIndex should not be less than 0, now maxShowIndex is "));
        }
        if (i2 > strArr.length - 1) {
            throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.z0.length - 1) + " maxShowIndex is " + i2);
        }
        this.t = i;
        this.u = i2;
        if (z) {
            this.B = i;
            c(0, this.N && this.Q);
            postInvalidate();
        }
    }

    public void setOnValueChangedListenerRelativeToRaw(cq5 cq5Var) {
    }

    public NumberPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            n();
        }
        this.c = -13421773;
        this.d = -695533;
        this.e = -695533;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = -695533;
        this.p = 2;
        this.q = 0;
        this.r = 0;
        this.s = 3;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.x0 = new TextPaint();
        this.y0 = new Paint();
        this.H0 = 0;
        this.K0 = 0.0f;
        this.L0 = 0.0f;
        this.M0 = false;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        l(context, attributeSet);
        k(context);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            n();
        }
        this.c = -13421773;
        this.d = -695533;
        this.e = -695533;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = -695533;
        this.p = 2;
        this.q = 0;
        this.r = 0;
        this.s = 3;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 150;
        this.D = 8;
        this.I = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = true;
        this.N = true;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = false;
        this.T = true;
        this.W = new Paint();
        this.x0 = new TextPaint();
        this.y0 = new Paint();
        this.H0 = 0;
        this.K0 = 0.0f;
        this.L0 = 0.0f;
        this.M0 = false;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        l(context, attributeSet);
        k(context);
    }
}
