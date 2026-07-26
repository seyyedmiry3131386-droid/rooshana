package ir.mservices.market.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bp2;
import defpackage.fa1;
import defpackage.js3;
import defpackage.js6;
import defpackage.na5;
import defpackage.ob4;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.views.MultiSelectTitleView;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiSelectTitleView extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public int q;
    public int r;
    public bp2 s;
    public bp2 t;
    public final na5 u;

    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            js3.p(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiSelectTitleView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final int getItemCount() {
        return this.q;
    }

    public final int getMaxItemCount() {
        return this.r;
    }

    public final bp2 getOnMultiSelectCancel() {
        return this.s;
    }

    public final bp2 getOnMultiSelectRemove() {
        return this.t;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            setItemCount(0);
            setMaxItemCount(0);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setItemCount(savedState.a);
            setMaxItemCount(savedState.b);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.q;
        savedState.b = this.r;
        return savedState;
    }

    public final void setItemCount(int i) {
        this.q = i;
        t();
    }

    public final void setMaxItemCount(int i) {
        this.r = i;
        t();
    }

    public final void setOnMultiSelectCancel(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.s = bp2Var;
    }

    public final void setOnMultiSelectRemove(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.t = bp2Var;
    }

    public final void t() {
        String string;
        na5 na5Var = this.u;
        MyketTextView myketTextView = na5Var.x;
        int i = this.q;
        myketTextView.setTextColor(i == 0 ? sj8.b().n : i == this.r ? sj8.b().A : sj8.b().A);
        MyketTextView myketTextView2 = na5Var.w;
        int i2 = this.q;
        if (i2 == 0) {
            string = "";
        } else if (i2 == this.r) {
            string = getResources().getString(rs6.remove_all_items);
            js3.o(string, "getString(...)");
        } else {
            string = getResources().getString(rs6.selected_item, Integer.valueOf(this.q));
            js3.o(string, "getString(...)");
        }
        myketTextView2.setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        this.s = new ob4(25);
        this.t = new ob4(25);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = na5.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 1;
        na5 na5Var = (na5) fa1.c(layoutInflaterFrom, js6.multiselect_title_view, this, true);
        js3.o(na5Var, "inflate(...)");
        this.u = na5Var;
        setSaveEnabled(true);
        setVisibility(8);
        ImageView imageView = na5Var.v;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        final int i3 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: v95
            public final /* synthetic */ MultiSelectTitleView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                MultiSelectTitleView multiSelectTitleView = this.b;
                switch (i4) {
                    case 0:
                        int i5 = MultiSelectTitleView.v;
                        multiSelectTitleView.setMaxItemCount(0);
                        multiSelectTitleView.setItemCount(0);
                        multiSelectTitleView.s.invoke();
                        break;
                    default:
                        int i6 = MultiSelectTitleView.v;
                        multiSelectTitleView.setItemCount(0);
                        multiSelectTitleView.t.invoke();
                        break;
                }
            }
        });
        na5Var.x.setOnClickListener(new View.OnClickListener(this) { // from class: v95
            public final /* synthetic */ MultiSelectTitleView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                MultiSelectTitleView multiSelectTitleView = this.b;
                switch (i4) {
                    case 0:
                        int i5 = MultiSelectTitleView.v;
                        multiSelectTitleView.setMaxItemCount(0);
                        multiSelectTitleView.setItemCount(0);
                        multiSelectTitleView.s.invoke();
                        break;
                    default:
                        int i6 = MultiSelectTitleView.v;
                        multiSelectTitleView.setItemCount(0);
                        multiSelectTitleView.t.invoke();
                        break;
                }
            }
        });
    }
}
