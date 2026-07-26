package ir.mservices.market.version2.ui.recycler.holder;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.is3;
import defpackage.js3;
import defpackage.og5;
import defpackage.qg5;
import defpackage.rj;
import defpackage.rr6;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.v48;
import defpackage.yq6;
import defpackage.z95;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import ir.mservices.market.version2.ui.recycler.holder.a;
import ir.mservices.market.views.MyketCheckBox;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends qg5 {
    public final z95 w;
    public final MyketCheckBox x;
    public ValueAnimator y;

    public a(View view, z95 z95Var) {
        int i;
        Drawable drawableMutate;
        super(view);
        this.w = z95Var;
        View viewFindViewById = view.findViewById(rr6.select_checkbox);
        js3.o(viewFindViewById, "findViewById(...)");
        MyketCheckBox myketCheckBox = (MyketCheckBox) viewFindViewById;
        this.x = myketCheckBox;
        int iOrdinal = y().ordinal();
        if (iOrdinal == 0) {
            i = sj8.b().j;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = sj8.b().c;
        }
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked, R.attr.state_enabled}, is3.q(context, i, sj8.b().l));
        stateListDrawable.addState(new int[]{-16842912, R.attr.state_enabled}, is3.q(context, sj8.b().l, sj8.b().n));
        stateListDrawable.addState(new int[]{-16842910}, is3.q(context, sj8.b().u, sj8.b().u));
        myketCheckBox.setButtonDrawable(stateListDrawable);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), yq6.ic_item_check);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            drawableMutate = null;
        } else {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        }
        myketCheckBox.setButtonIconDrawable(drawableMutate);
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void s(MultiSelectRecyclerData multiSelectRecyclerData) {
        js3.p(multiSelectRecyclerData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MultiSelectViewHolder$onAttach$1(null, multiSelectRecyclerData, this), 3);
        bt2.G(cc7.q(view), null, null, new MultiSelectViewHolder$onAttach$2(null, multiSelectRecyclerData, this), 3);
    }

    public final void B(MultiSelectRecyclerData multiSelectRecyclerData) {
        ValueAnimator valueAnimator;
        js3.p(multiSelectRecyclerData, "data");
        Point pointZ = z();
        MyketCheckBox myketCheckBox = this.x;
        ViewGroup.LayoutParams layoutParams = myketCheckBox.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(pointZ.x);
        ViewGroup.LayoutParams layoutParams2 = myketCheckBox.getLayoutParams();
        js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = pointZ.y;
        rv6 rv6Var = multiSelectRecyclerData.e;
        myketCheckBox.setEnabled(((Boolean) rv6Var.a.getValue()).booleanValue());
        myketCheckBox.setChecked(multiSelectRecyclerData.f);
        boolean z = multiSelectRecyclerData.f;
        v48 v48Var = multiSelectRecyclerData.a;
        final int i = 1;
        if (z == multiSelectRecyclerData.g) {
            if ((myketCheckBox.getVisibility() == 0) == multiSelectRecyclerData.f) {
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 == null || valueAnimator2.isRunning()) {
                    return;
                }
                myketCheckBox.setVisibility((((Boolean) v48Var.getValue()).booleanValue() && multiSelectRecyclerData.f) ? 0 : 8);
                return;
            }
        }
        multiSelectRecyclerData.g = multiSelectRecyclerData.f;
        ValueAnimator valueAnimator3 = this.y;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.y) != null) {
            valueAnimator.cancel();
        }
        if (!((Boolean) v48Var.getValue()).booleanValue() || !multiSelectRecyclerData.f || !((Boolean) rv6Var.a.getValue()).booleanValue()) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y95
                public final /* synthetic */ a b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    switch (i) {
                        case 0:
                            float fFloatValue = ((Float) o40.v(valueAnimator4, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            a aVar = this.b;
                            aVar.x.setScaleX(fFloatValue);
                            aVar.x.setScaleY(fFloatValue);
                            break;
                        default:
                            float fFloatValue2 = ((Float) o40.v(valueAnimator4, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            a aVar2 = this.b;
                            aVar2.x.setScaleX(fFloatValue2);
                            aVar2.x.setScaleY(fFloatValue2);
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new rj(4, this));
            valueAnimatorOfFloat.start();
            this.y = valueAnimatorOfFloat;
            return;
        }
        myketCheckBox.setVisibility(0);
        myketCheckBox.setScaleX(0.0f);
        myketCheckBox.setScaleY(0.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y95
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                switch (i) {
                    case 0:
                        float fFloatValue = ((Float) o40.v(valueAnimator4, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        a aVar = this.b;
                        aVar.x.setScaleX(fFloatValue);
                        aVar.x.setScaleY(fFloatValue);
                        break;
                    default:
                        float fFloatValue2 = ((Float) o40.v(valueAnimator4, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        a aVar2 = this.b;
                        aVar2.x.setScaleX(fFloatValue2);
                        aVar2.x.setScaleY(fFloatValue2);
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.start();
        this.y = valueAnimatorOfFloat2;
    }

    public abstract og5 x();

    public MultiSelectViewHolder$ViewHolderType y() {
        return MultiSelectViewHolder$ViewHolderType.b;
    }

    public abstract Point z();
}
