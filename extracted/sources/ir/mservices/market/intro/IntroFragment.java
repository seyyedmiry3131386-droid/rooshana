package ir.mservices.market.intro;

import android.R;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.b;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.at2;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d56;
import defpackage.f12;
import defpackage.fa1;
import defpackage.fl2;
import defpackage.g27;
import defpackage.ij5;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.li1;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.yq2;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.intro.IntroAction;
import ir.mservices.market.intro.IntroFragment;
import ir.mservices.market.views.BigFillRectangleButton;
import ir.mservices.market.views.SmallEmptyLargeTextOvalButton;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class IntroFragment extends Hilt_IntroFragment {
    public static final /* synthetic */ int Z0 = 0;
    public d56 V0;
    public fl2 W0;
    public final o79 X0;
    public li1 Y0;

    public IntroFragment() {
        final IntroFragment$special$$inlined$viewModels$default$1 introFragment$special$$inlined$viewModels$default$1 = new IntroFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.intro.IntroFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) introFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(IntroViewModel.class), new bp2() { // from class: ir.mservices.market.intro.IntroFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.intro.IntroFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.intro.IntroFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_intro);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = fl2.F;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        fl2 fl2Var = (fl2) fa1.c(layoutInflater, js6.fragment_intro, viewGroup, false);
        this.W0 = fl2Var;
        js3.m(fl2Var);
        View view = fl2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        li1 li1Var = this.Y0;
        if (li1Var != null) {
            li1Var.g(null);
        }
        this.W0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
        clickEventBuilder.b("intro_back_p" + (k1() + 1));
        clickEventBuilder.a();
        return super.e1();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        super.f0();
        li1 li1Var = this.Y0;
        if (li1Var != null) {
            li1Var.g(null);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        f12 f12Var = new f12(1, 1);
        fl2 fl2Var = this.W0;
        js3.m(fl2Var);
        ProgressBar progressBar = fl2Var.A;
        js3.o(progressBar, "step1");
        o1(progressBar);
        fl2 fl2Var2 = this.W0;
        js3.m(fl2Var2);
        ProgressBar progressBar2 = fl2Var2.B;
        js3.o(progressBar2, "step2");
        o1(progressBar2);
        fl2 fl2Var3 = this.W0;
        js3.m(fl2Var3);
        ProgressBar progressBar3 = fl2Var3.C;
        js3.o(progressBar3, "step3");
        o1(progressBar3);
        fl2 fl2Var4 = this.W0;
        js3.m(fl2Var4);
        ProgressBar progressBar4 = fl2Var4.D;
        js3.o(progressBar4, "step4");
        o1(progressBar4);
        fl2 fl2Var5 = this.W0;
        js3.m(fl2Var5);
        BigFillRectangleButton bigFillRectangleButton = fl2Var5.y;
        bigFillRectangleButton.setText(bigFillRectangleButton.getResources().getString(rs6.intro_start));
        final int i = 0;
        bigFillRectangleButton.setOnClickListener(new View.OnClickListener(this) { // from class: ns3
            public final /* synthetic */ IntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                IntroFragment introFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("intro_done");
                        clickEventBuilder.a();
                        introFragment.m1();
                        break;
                    case 1:
                        int i4 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("intro_skip_p" + (introFragment.k1() + 1));
                        clickEventBuilder2.a();
                        introFragment.m1();
                        break;
                    case 2:
                        int i5 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.PreviousStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("intro_previous_p" + (introFragment.k1() - 1));
                        clickEventBuilder3.a();
                        break;
                    default:
                        int i6 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.NextStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("intro_next_p" + (introFragment.k1() + 1));
                        clickEventBuilder4.a();
                        break;
                }
            }
        });
        fl2 fl2Var6 = this.W0;
        js3.m(fl2Var6);
        SmallEmptyLargeTextOvalButton smallEmptyLargeTextOvalButton = fl2Var6.x;
        smallEmptyLargeTextOvalButton.setText(smallEmptyLargeTextOvalButton.getResources().getString(rs6.intro_start));
        smallEmptyLargeTextOvalButton.setTextColor(sj8.b().c);
        final int i2 = 1;
        smallEmptyLargeTextOvalButton.setOnClickListener(new View.OnClickListener(this) { // from class: ns3
            public final /* synthetic */ IntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                IntroFragment introFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("intro_done");
                        clickEventBuilder.a();
                        introFragment.m1();
                        break;
                    case 1:
                        int i4 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("intro_skip_p" + (introFragment.k1() + 1));
                        clickEventBuilder2.a();
                        introFragment.m1();
                        break;
                    case 2:
                        int i5 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.PreviousStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("intro_previous_p" + (introFragment.k1() - 1));
                        clickEventBuilder3.a();
                        break;
                    default:
                        int i6 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.NextStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("intro_next_p" + (introFragment.k1() + 1));
                        clickEventBuilder4.a();
                        break;
                }
            }
        });
        fl2 fl2Var7 = this.W0;
        js3.m(fl2Var7);
        ViewPager2 viewPager2 = fl2Var7.E;
        viewPager2.setAdapter(f12Var);
        viewPager2.setUserInputEnabled(false);
        fl2 fl2Var8 = this.W0;
        js3.m(fl2Var8);
        final int i3 = 2;
        fl2Var8.w.setOnClickListener(new View.OnClickListener(this) { // from class: ns3
            public final /* synthetic */ IntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                IntroFragment introFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("intro_done");
                        clickEventBuilder.a();
                        introFragment.m1();
                        break;
                    case 1:
                        int i4 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("intro_skip_p" + (introFragment.k1() + 1));
                        clickEventBuilder2.a();
                        introFragment.m1();
                        break;
                    case 2:
                        int i5 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.PreviousStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("intro_previous_p" + (introFragment.k1() - 1));
                        clickEventBuilder3.a();
                        break;
                    default:
                        int i6 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.NextStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("intro_next_p" + (introFragment.k1() + 1));
                        clickEventBuilder4.a();
                        break;
                }
            }
        });
        fl2 fl2Var9 = this.W0;
        js3.m(fl2Var9);
        final int i4 = 3;
        fl2Var9.v.setOnClickListener(new View.OnClickListener(this) { // from class: ns3
            public final /* synthetic */ IntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i4;
                IntroFragment introFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("intro_done");
                        clickEventBuilder.a();
                        introFragment.m1();
                        break;
                    case 1:
                        int i42 = IntroFragment.Z0;
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("intro_skip_p" + (introFragment.k1() + 1));
                        clickEventBuilder2.a();
                        introFragment.m1();
                        break;
                    case 2:
                        int i5 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.PreviousStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("intro_previous_p" + (introFragment.k1() - 1));
                        clickEventBuilder3.a();
                        break;
                    default:
                        int i6 = IntroFragment.Z0;
                        introFragment.l1().r(IntroAction.NextStep.INSTANCE);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("intro_next_p" + (introFragment.k1() + 1));
                        clickEventBuilder4.a();
                        break;
                }
            }
        });
        p1();
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new IntroFragment$onViewCreated$6(this, f12Var, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new IntroFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new IntroFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new IntroFragment$onViewCreated$9(this, null));
    }

    public final int k1() {
        return ((Number) l1().B.a.getValue()).intValue();
    }

    public final IntroViewModel l1() {
        return (IntroViewModel) this.X0.getValue();
    }

    public final void m1() {
        ij5 ij5VarY;
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            d56 d56Var = this.V0;
            if (d56Var == null) {
                js3.V("permissionHelper");
                throw null;
            }
            if (d56Var.b(fragmentActivityF, 3)) {
                fragmentActivityF.finish();
                return;
            }
            d dVar = this;
            while (true) {
                if (dVar == null) {
                    View view = this.J;
                    if (view == null) {
                        throw new IllegalStateException("Fragment " + this + " does not have a NavController set");
                    }
                    ij5VarY = at2.Y(view);
                } else {
                    if (dVar instanceof NavHostFragment) {
                        ij5VarY = ((NavHostFragment) dVar).z0();
                        break;
                    }
                    d dVar2 = dVar.J().A;
                    if (dVar2 instanceof NavHostFragment) {
                        ij5VarY = ((NavHostFragment) dVar2).z0();
                        break;
                    }
                    dVar = dVar.y;
                }
            }
            ij5VarY.c(rr6.notification, null, null);
        }
    }

    public final void n1(int i, int i2) {
        ProgressBar progressBar;
        if (i == 0) {
            fl2 fl2Var = this.W0;
            js3.m(fl2Var);
            progressBar = fl2Var.A;
        } else if (i == 1) {
            fl2 fl2Var2 = this.W0;
            js3.m(fl2Var2);
            progressBar = fl2Var2.B;
        } else if (i == 2) {
            fl2 fl2Var3 = this.W0;
            js3.m(fl2Var3);
            progressBar = fl2Var3.C;
        } else {
            if (i != 3) {
                return;
            }
            fl2 fl2Var4 = this.W0;
            js3.m(fl2Var4);
            progressBar = fl2Var4.D;
        }
        js3.m(progressBar);
        progressBar.setProgress(i2);
    }

    public final void o1(ProgressBar progressBar) {
        float dimension = K().getDimension(pq6.space_4) / 2.0f;
        float[] fArr = {dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(sj8.b().v);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(sj8.b().n);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, new ClipDrawable(shapeDrawable2, 8388611, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        progressBar.setProgressDrawable(layerDrawable);
    }

    public final void p1() {
        li1 li1Var = this.Y0;
        if (li1Var != null) {
            li1Var.g(null);
        }
        this.Y0 = bt2.G(b.a(this), null, null, new IntroFragment$startCoroutineAnimation$1(this, null), 3);
    }
}
