package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bu6;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.x14;
import defpackage.yq6;
import ir.mservices.market.social.welcome.StepState;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class StepView extends FrameLayout {
    public final x14 a;
    public final LayerDrawable b;
    public final LayerDrawable c;
    public final LayerDrawable d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public static LayerDrawable a(StepView stepView, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        Drawable drawable = null;
        Integer num5 = (i & 1) != 0 ? null : num;
        Integer num6 = (i & 4) != 0 ? null : num3;
        Integer num7 = (i & 8) != 0 ? null : num4;
        int i2 = (i & 16) != 0 ? 255 : 50;
        int dimensionPixelSize = stepView.getResources().getDimensionPixelSize(pq6.space_32);
        int dimensionPixelSize2 = stepView.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize3 = stepView.getResources().getDimensionPixelSize(pq6.space_8);
        ArrayList arrayList = new ArrayList();
        if (num6 != null) {
            int iIntValue = num6.intValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setAlpha(i2);
            gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
            arrayList.add(gradientDrawable);
        }
        int iIntValue2 = num2.intValue();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(iIntValue2);
        gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
        arrayList.add(gradientDrawable2);
        if (num5 != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(1);
            gradientDrawable3.setColor(num5.intValue());
            gradientDrawable3.setSize(dimensionPixelSize, dimensionPixelSize);
            arrayList.add(gradientDrawable3);
        }
        if (num7 != null) {
            Drawable drawable2 = ContextCompat.getDrawable(stepView.getContext(), num7.intValue());
            if (drawable2 != null) {
                drawable2.setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
                drawable = drawable2;
            }
            if (drawable != null) {
                arrayList.add(drawable);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
        if (num6 != null) {
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
        }
        layerDrawable.setLayerInset(arrayList.size() - 2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        if (num7 != null) {
            layerDrawable.setLayerInset(arrayList.size() - 1, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            return layerDrawable;
        }
        layerDrawable.setLayerInset(arrayList.size() - 1, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        return layerDrawable;
    }

    public final void setState(StepState stepState) {
        js3.p(stepState, "stepState");
        int i = sj8.b().c;
        int iOrdinal = stepState.ordinal();
        x14 x14Var = this.a;
        if (iOrdinal == 0) {
            x14Var.v.setImageDrawable(this.d);
            x14Var.x.setBackgroundColor(i);
            x14Var.w.setBackgroundColor(i);
        } else if (iOrdinal == 1) {
            x14Var.v.setImageDrawable(this.b);
            x14Var.x.setBackgroundColor(i);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            x14Var.v.setImageDrawable(this.c);
        }
    }

    public final void setTitle(String str) {
        MyketTextView myketTextView = this.a.y;
        if (str == null) {
            str = "";
        }
        myketTextView.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = x14.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        x14 x14Var = (x14) fa1.c(layoutInflaterFrom, js6.layout_step, this, true);
        js3.o(x14Var, "inflate(...)");
        View view = x14Var.w;
        View view2 = x14Var.x;
        this.a = x14Var;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bu6.StepView, i, 0);
        try {
            try {
                LayerDrawable layerDrawableA = a(this, Integer.valueOf(sj8.b().l), Integer.valueOf(sj8.b().v), null, null, 28);
                this.c = layerDrawableA;
                LayerDrawable layerDrawableA2 = a(this, Integer.valueOf(sj8.b().l), Integer.valueOf(sj8.b().c), Integer.valueOf(sj8.b().c), null, 8);
                this.b = layerDrawableA2;
                this.d = a(this, null, Integer.valueOf(sj8.b().c), null, Integer.valueOf(yq6.ic_check_profile), 21);
                String string = typedArrayObtainStyledAttributes.getString(bu6.StepView_sv_name);
                boolean z = typedArrayObtainStyledAttributes.getBoolean(bu6.StepView_sv_isFirst, false);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(bu6.StepView_sv_isLast, false);
                view2.setVisibility(z ? 4 : 0);
                view.setVisibility(z2 ? 4 : 0);
                x14Var.v.setImageDrawable(z ? layerDrawableA2 : layerDrawableA);
                view2.setBackgroundColor(sj8.b().v);
                view.setBackgroundColor(sj8.b().v);
                setTitle(string);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public /* synthetic */ StepView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
