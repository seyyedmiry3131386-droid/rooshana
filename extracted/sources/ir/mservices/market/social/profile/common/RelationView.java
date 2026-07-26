package ir.mservices.market.social.profile.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.c5;
import defpackage.cd;
import defpackage.f37;
import defpackage.fa1;
import defpackage.g37;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import defpackage.pq6;
import defpackage.qt5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sl6;
import defpackage.u91;
import ir.mservices.market.social.profile.data.Relation;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class RelationView extends Hilt_RelationView {
    public static final /* synthetic */ int h = 0;
    public c5 c;
    public Relation d;
    public String e;
    public qt5 f;
    public final sl6 g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelationView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    public final void a() {
        boolean z = true;
        boolean zT = m88.T(getAccountManager().h.e(), this.e, true);
        sl6 sl6Var = this.g;
        if (zT) {
            SmallFillOvalButton smallFillOvalButton = sl6Var.v;
            js3.o(smallFillOvalButton, "highState");
            smallFillOvalButton.setVisibility(8);
            SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = sl6Var.w;
            js3.o(smallEmptyMediumTextOvalButton, "lowState");
            smallEmptyMediumTextOvalButton.setVisibility(8);
            z = false;
        } else {
            SmallFillOvalButton smallFillOvalButton2 = sl6Var.v;
            MyketProgressState myketProgressState = MyketProgressState.b;
            smallFillOvalButton2.setState(myketProgressState);
            sl6Var.w.setState(myketProgressState);
            int i = f37.a[this.d.ordinal()];
            if (i == 1) {
                sl6Var.w.setText(getResources().getString(rs6.following));
                SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = sl6Var.w;
                js3.o(smallEmptyMediumTextOvalButton2, "lowState");
                smallEmptyMediumTextOvalButton2.setVisibility(0);
                SmallFillOvalButton smallFillOvalButton3 = sl6Var.v;
                js3.o(smallFillOvalButton3, "highState");
                smallFillOvalButton3.setVisibility(8);
            } else if (i == 2) {
                sl6Var.v.setText(getResources().getString(rs6.requested));
                sl6Var.v.b(sj8.b().c);
                sl6Var.v.setBgColor(sj8.b().e);
                sl6Var.v.setButtonTextColor(sj8.b().i);
                SmallFillOvalButton smallFillOvalButton4 = sl6Var.v;
                js3.o(smallFillOvalButton4, "highState");
                smallFillOvalButton4.setVisibility(0);
                SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton3 = sl6Var.w;
                js3.o(smallEmptyMediumTextOvalButton3, "lowState");
                smallEmptyMediumTextOvalButton3.setVisibility(8);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sl6Var.v.setText(getResources().getString(rs6.follow));
                sl6Var.v.b(sj8.b().d);
                sl6Var.v.setBgColor(sj8.b().c);
                sl6Var.v.setButtonTextColor(sj8.b().d);
                SmallFillOvalButton smallFillOvalButton5 = sl6Var.v;
                js3.o(smallFillOvalButton5, "highState");
                smallFillOvalButton5.setVisibility(0);
                SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton4 = sl6Var.w;
                js3.o(smallEmptyMediumTextOvalButton4, "lowState");
                smallEmptyMediumTextOvalButton4.setVisibility(8);
            }
        }
        setVisibility(z ? 0 : 8);
    }

    public final String getAccountKey() {
        return this.e;
    }

    public final c5 getAccountManager() {
        c5 c5Var = this.c;
        if (c5Var != null) {
            return c5Var;
        }
        js3.V("accountManager");
        throw null;
    }

    public final sl6 getBinding() {
        return this.g;
    }

    public final qt5 getOnRelationClickListener() {
        return this.f;
    }

    public final Relation getRelation() {
        return this.d;
    }

    public final void setAccountKey(String str) {
        this.e = str;
    }

    public final void setAccountManager(c5 c5Var) {
        js3.p(c5Var, "<set-?>");
        this.c = c5Var;
    }

    public final void setOnRelationClickListener(qt5 qt5Var) {
        this.f = qt5Var;
    }

    public final void setRelation(Relation relation) {
        js3.p(relation, "<set-?>");
        this.d = relation;
    }

    public final void setWrapContent(boolean z) {
        getLayoutParams().width = z ? -1 : getResources().getDimensionPixelSize(pq6.relation_view_width);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = (c5) ((u91) ((g37) e())).a.L.get();
        }
        this.d = Relation.NONE;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = sl6.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        sl6 sl6Var = (sl6) fa1.c(layoutInflaterFrom, js6.profile_relation_view, this, true);
        js3.o(sl6Var, "inflate(...)");
        this.g = sl6Var;
        cd cdVar = new cd(28, this);
        SmallFillOvalButton smallFillOvalButton = sl6Var.v;
        smallFillOvalButton.setTextSize(context.getResources().getDimension(pq6.font_size_medium));
        smallFillOvalButton.setBgColor(sj8.b().c);
        smallFillOvalButton.setButtonTextColor(sj8.b().d);
        smallFillOvalButton.setOnClickListener(cdVar);
        smallFillOvalButton.setVisibility(0);
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = sl6Var.w;
        smallEmptyMediumTextOvalButton.setColor(sj8.b().c);
        smallEmptyMediumTextOvalButton.setButtonTextColor(sj8.b().c);
        smallEmptyMediumTextOvalButton.setOnClickListener(cdVar);
        smallEmptyMediumTextOvalButton.setVisibility(4);
    }
}
