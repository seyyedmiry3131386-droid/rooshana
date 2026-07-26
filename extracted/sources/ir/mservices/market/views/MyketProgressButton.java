package ir.mservices.market.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bt2;
import defpackage.bu6;
import defpackage.cc7;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.sl3;
import defpackage.v89;
import defpackage.z0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public class MyketProgressButton extends FrameLayout {
    public final v89 a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketProgressButton(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    private static /* synthetic */ void getBinding$annotations() {
    }

    public final void a() {
        v89 v89Var = this.a;
        v89Var.z.setBold(true);
        v89Var.x.setBold(true);
    }

    public final CharSequence getText() {
        return this.a.z.getText();
    }

    public final void setAnimation(int i) {
        this.a.v.setAnimation(i);
    }

    public final void setAnimationSize(int i) {
        LottieAnimationView lottieAnimationView = this.a.v;
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        float f = i / 2.0f;
        lottieAnimationView.setPivotX(f);
        lottieAnimationView.setPivotY(f);
        lottieAnimationView.requestLayout();
    }

    public final void setAnimationText(String str) {
        this.a.x.setText(str);
    }

    public final void setButtonBackground(Drawable drawable) {
        this.a.l.setBackground(drawable);
    }

    public final void setDrawablePadding(int i) {
        v89 v89Var = this.a;
        v89Var.z.setCompoundDrawablePadding(i);
        v89Var.x.setPaddingRelative(i, 0, 0, 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        v89 v89Var = this.a;
        v89Var.l.setEnabled(z);
        v89Var.z.setEnabled(z);
    }

    public final void setHeight(int i) {
        this.a.l.getLayoutParams().height = i;
    }

    public void setIcon(Drawable drawable) {
        this.a.z.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconWithCompoundDrawables(Drawable drawable) {
        v89 v89Var = this.a;
        if (drawable != null) {
            drawable.setTintList(v89Var.z.getTextColors());
        }
        v89Var.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final void setIconWithCompoundRelative(Drawable drawable) {
        this.a.z.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public final void setLoadingColor(int i) {
        this.a.y.setIndicatorColor(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.a.l.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            return;
        }
        this.a.l.setOnClickListener(onClickListener);
    }

    public final void setPadding(int i) {
        MyketTextView myketTextView = this.a.z;
        ViewGroup.LayoutParams layoutParams = myketTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(i, 0, i, 0);
        }
        myketTextView.requestLayout();
    }

    public final void setProgressSize(int i) {
        LoadingView loadingView = this.a.y;
        ViewGroup.LayoutParams layoutParams = loadingView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        float f = i / 2.0f;
        loadingView.setPivotX(f);
        loadingView.setPivotY(f);
        loadingView.requestLayout();
    }

    public final void setState(MyketProgressState myketProgressState) {
        js3.p(myketProgressState, "state");
        int iOrdinal = myketProgressState.ordinal();
        v89 v89Var = this.a;
        if (iOrdinal == 0) {
            v89Var.y.d(false);
            MyketTextView myketTextView = v89Var.z;
            js3.o(myketTextView, "myketProgressText");
            myketTextView.setVisibility(0);
            LinearLayout linearLayout = v89Var.w;
            js3.o(linearLayout, "animationLayout");
            linearLayout.setVisibility(8);
            setEnabled(true);
            return;
        }
        if (iOrdinal == 1) {
            v89Var.y.d(true);
            MyketTextView myketTextView2 = v89Var.z;
            js3.o(myketTextView2, "myketProgressText");
            myketTextView2.setVisibility(4);
            LinearLayout linearLayout2 = v89Var.w;
            js3.o(linearLayout2, "animationLayout");
            linearLayout2.setVisibility(8);
            setEnabled(false);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        v89Var.y.d(false);
        MyketTextView myketTextView3 = v89Var.z;
        js3.o(myketTextView3, "myketProgressText");
        myketTextView3.setVisibility(4);
        LinearLayout linearLayout3 = v89Var.w;
        js3.o(linearLayout3, "animationLayout");
        linearLayout3.setVisibility(0);
        LottieAnimationView lottieAnimationView = v89Var.v;
        lottieAnimationView.f();
        bt2.G(cc7.q(lottieAnimationView), null, null, new MyketProgressButton$setState$1$1(lottieAnimationView, this, null), 3);
        setEnabled(true);
    }

    public final void setText(CharSequence charSequence) {
        this.a.z.setText(charSequence);
    }

    public final void setTextColor(int i) {
        v89 v89Var = this.a;
        v89Var.z.setTextColor(i);
        v89Var.x.setTextColor(i);
    }

    public final void setTextSize(float f) {
        v89 v89Var = this.a;
        v89Var.z.setTextSize(0, f);
        v89Var.x.setTextSize(0, f);
    }

    public final void setWidth(int i) {
        this.a.l.getLayoutParams().width = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketProgressButton(Context context, AttributeSet attributeSet, int i) {
        Object next;
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = v89.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        v89 v89Var = (v89) fa1.c(layoutInflaterFrom, js6.view_progress_button, this, true);
        js3.o(v89Var, "inflate(...)");
        this.a = v89Var;
        int[] iArr = bu6.MyketProgressButton;
        js3.o(iArr, "MyketProgressButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        setTextColor(typedArrayObtainStyledAttributes.getColor(bu6.MyketProgressButton_pb_textColor, sj8.b().d));
        setText(typedArrayObtainStyledAttributes.getText(bu6.MyketProgressButton_pb_text));
        setTextSize(typedArrayObtainStyledAttributes.getDimension(bu6.MyketProgressButton_pb_textSize, context.getResources().getDimension(pq6.font_size_large)));
        sl3 sl3Var = MyketProgressState.a;
        int integer = typedArrayObtainStyledAttributes.getInteger(bu6.MyketProgressButton_pb_state, 0);
        sl3Var.getClass();
        Iterator it = ((z0) MyketProgressState.f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((MyketProgressState) next).ordinal() == integer) {
                    break;
                }
            }
        }
        MyketProgressState myketProgressState = (MyketProgressState) next;
        setState(myketProgressState == null ? MyketProgressState.b : myketProgressState);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        js3.p(colorStateList, "textColor");
        v89 v89Var = this.a;
        v89Var.z.setTextColor(colorStateList);
        v89Var.x.setTextColor(colorStateList);
    }

    public /* synthetic */ MyketProgressButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
