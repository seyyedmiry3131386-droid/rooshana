package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import defpackage.dg7;
import defpackage.f89;
import defpackage.i89;
import defpackage.kz5;
import defpackage.pz5;
import defpackage.qz5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@f89
public class PagerTitleStrip extends ViewGroup {
    public static final int[] o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] p = {R.attr.textAllCaps};
    public ViewPager a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public int e;
    public float f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public final pz5 k;
    public WeakReference l;
    public int m;
    public int n;

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        qz5 qz5Var = new qz5();
        qz5Var.a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(qz5Var);
    }

    public final void a(kz5 kz5Var, kz5 kz5Var2) {
        pz5 pz5Var = this.k;
        if (kz5Var != null) {
            kz5Var.a.unregisterObserver(pz5Var);
            this.l = null;
        }
        if (kz5Var2 != null) {
            kz5Var2.a.registerObserver(pz5Var);
            this.l = new WeakReference(kz5Var2);
        }
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            this.e = -1;
            this.f = -1.0f;
            b(viewPager.getCurrentItem(), kz5Var2);
            requestLayout();
        }
    }

    public final void b(int i, kz5 kz5Var) {
        if (kz5Var != null) {
            ((dg7) kz5Var).h.size();
        }
        this.i = true;
        TextView textView = this.b;
        textView.setText((CharSequence) null);
        TextView textView2 = this.c;
        textView2.setText((CharSequence) null);
        int i2 = i + 1;
        TextView textView3 = this.d;
        textView3.setText((CharSequence) null);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.e = i;
        if (!this.j) {
            c(this.f, i, false);
        }
        this.i = false;
    }

    public void c(float f, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.e) {
            b(i, this.a.getAdapter());
        } else if (!z && f == this.f) {
            return;
        }
        this.j = true;
        TextView textView = this.b;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.c;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.d;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i11, textView2.getMeasuredHeight() + i12), textView3.getMeasuredHeight() + i13);
        int i14 = this.h & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                i5 = paddingTop + i13;
                textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
                int iMin = Math.min(paddingLeft, (i9 - this.g) - measuredWidth);
                textView.layout(iMin, i3, iMin + measuredWidth, textView.getMeasuredHeight() + i3);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.g);
                textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f = f;
                this.j = false;
            }
            i2 = (height - paddingBottom) - iMax2;
        }
        i3 = i11 + i2;
        i4 = i2 + i12;
        i5 = i2 + i13;
        textView2.layout(i9, i4, i10, textView2.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.g) - measuredWidth);
        textView.layout(iMin2, i3, iMin2 + measuredWidth, textView.getMeasuredHeight() + i3);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.g);
        textView3.layout(iMax32, i5, iMax32 + measuredWidth3, textView3.getMeasuredHeight() + i5);
        this.f = f;
        this.j = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        kz5 adapter = viewPager.getAdapter();
        pz5 pz5Var = this.k;
        viewPager.T = pz5Var;
        if (viewPager.U == null) {
            viewPager.U = new ArrayList();
        }
        viewPager.U.add(pz5Var);
        this.a = viewPager;
        WeakReference weakReference = this.l;
        a(weakReference != null ? (kz5) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.a;
            i89 i89Var = viewPager2.T;
            viewPager2.T = null;
            ArrayList arrayList = viewPager2.U;
            if (arrayList != null) {
                arrayList.remove(this.k);
            }
            this.a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            float f = this.f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c(f, this.e, true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.b.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.c;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.h = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.m = i;
        int i2 = (i << 24) | (this.n & 16777215);
        this.b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.n = i;
        this.c.setTextColor(i);
        int i2 = (this.m << 24) | (this.n & 16777215);
        this.b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.b.setTextSize(i, f);
        this.c.setTextSize(i, f);
        this.d.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.g = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1.0f;
        this.k = new pz5(this);
        TextView textView = new TextView(context);
        this.b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
            textView3.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.n = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, p);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(textView);
            setSingleLineAllCaps(textView2);
            setSingleLineAllCaps(textView3);
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
