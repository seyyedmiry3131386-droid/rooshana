package ir.mservices.market.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cd;
import defpackage.cs1;
import defpackage.dp3;
import defpackage.dv2;
import defpackage.e71;
import defpackage.ea7;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.js6;
import defpackage.o4;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.q39;
import defpackage.qp2;
import defpackage.qq1;
import defpackage.r82;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s82;
import defpackage.sj8;
import defpackage.t82;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u91;
import defpackage.w91;
import defpackage.xe2;
import defpackage.xp;
import defpackage.yl5;
import defpackage.yq6;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FastDownloadView extends Hilt_FastDownloadView {
    public static final /* synthetic */ int q = 0;
    public ps1 c;
    public ir.mservices.market.version2.manager.a d;
    public dp3 e;
    public dv2 f;
    public yl5 g;
    public ir.mservices.market.version2.manager.install.a h;
    public final DownloadProgressBar i;
    public final SmallEmptyMediumTextOvalButton j;
    public s82 k;
    public Integer l;
    public Integer m;
    public Integer n;
    public boolean o;
    public final l p;

    /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1", f = "FastDownloadView.kt", l = {293}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1", f = "FastDownloadView.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00311 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ FastDownloadView b;

            /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$1, reason: invalid class name and collision with other inner class name */
            @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$1", f = "FastDownloadView.kt", l = {295}, m = "invokeSuspend", v = 1)
            final class C00321 extends SuspendLambda implements qp2 {
                public int a;
                public final /* synthetic */ FastDownloadView b;
                public final /* synthetic */ r82 c;

                /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$1$1", f = "FastDownloadView.kt", l = {}, m = "invokeSuspend", v = 1)
                final class C00331 extends SuspendLambda implements qp2 {
                    public final /* synthetic */ FastDownloadView a;
                    public final /* synthetic */ r82 b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00331(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                        super(2, g51Var);
                        this.a = fastDownloadView;
                        this.b = r82Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final g51 create(Object obj, g51 g51Var) {
                        return new C00331(this.a, this.b, g51Var);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        C00331 c00331 = (C00331) create((AppDownloadInfo) obj, (g51) obj2);
                        tx8 tx8Var = tx8.a;
                        c00331.invokeSuspend(tx8Var);
                        return tx8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                        kotlin.b.b(obj);
                        int i = FastDownloadView.q;
                        this.a.c(this.b);
                        return tx8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00321(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                    super(2, g51Var);
                    this.b = fastDownloadView;
                    this.c = r82Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    return new C00321(this.b, this.c, g51Var);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00321) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    int i = this.a;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        FastDownloadView fastDownloadView = this.b;
                        yl5 neneDownloadRepository = fastDownloadView.getNeneDownloadRepository();
                        r82 r82Var = this.c;
                        String str = r82Var.b;
                        js3.o(str, "getPackageName(...)");
                        xe2 xe2VarB = neneDownloadRepository.b(str);
                        C00331 c00331 = new C00331(fastDownloadView, r82Var, null);
                        this.a = 1;
                        if (d.f(xe2VarB, c00331, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return tx8.a;
                }
            }

            /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$2, reason: invalid class name */
            @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$2", f = "FastDownloadView.kt", l = {301}, m = "invokeSuspend", v = 1)
            final class AnonymousClass2 extends SuspendLambda implements qp2 {
                public int a;
                public final /* synthetic */ FastDownloadView b;
                public final /* synthetic */ r82 c;

                /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$2$1, reason: invalid class name and collision with other inner class name */
                @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$2$1", f = "FastDownloadView.kt", l = {}, m = "invokeSuspend", v = 1)
                final class C00341 extends SuspendLambda implements qp2 {
                    public final /* synthetic */ FastDownloadView a;
                    public final /* synthetic */ r82 b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00341(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                        super(2, g51Var);
                        this.a = fastDownloadView;
                        this.b = r82Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final g51 create(Object obj, g51 g51Var) {
                        return new C00341(this.a, this.b, g51Var);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        C00341 c00341 = (C00341) create((cs1) obj, (g51) obj2);
                        tx8 tx8Var = tx8.a;
                        c00341.invokeSuspend(tx8Var);
                        return tx8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                        kotlin.b.b(obj);
                        int i = FastDownloadView.q;
                        this.a.c(this.b);
                        return tx8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                    super(2, g51Var);
                    this.b = fastDownloadView;
                    this.c = r82Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    return new AnonymousClass2(this.b, this.c, g51Var);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    int i = this.a;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        FastDownloadView fastDownloadView = this.b;
                        yl5 neneDownloadRepository = fastDownloadView.getNeneDownloadRepository();
                        r82 r82Var = this.c;
                        String str = r82Var.b;
                        js3.o(str, "getPackageName(...)");
                        xe2 xe2VarA = neneDownloadRepository.a(str);
                        C00341 c00341 = new C00341(fastDownloadView, r82Var, null);
                        this.a = 1;
                        if (d.f(xe2VarA, c00341, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return tx8.a;
                }
            }

            /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$3, reason: invalid class name */
            @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$3", f = "FastDownloadView.kt", l = {306}, m = "invokeSuspend", v = 1)
            final class AnonymousClass3 extends SuspendLambda implements qp2 {
                public int a;
                public final /* synthetic */ FastDownloadView b;
                public final /* synthetic */ r82 c;

                /* JADX INFO: renamed from: ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$3$2, reason: invalid class name */
                @tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$3$2", f = "FastDownloadView.kt", l = {}, m = "invokeSuspend", v = 1)
                final class AnonymousClass2 extends SuspendLambda implements qp2 {
                    public final /* synthetic */ FastDownloadView a;
                    public final /* synthetic */ r82 b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                        super(2, g51Var);
                        this.a = fastDownloadView;
                        this.b = r82Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final g51 create(Object obj, g51 g51Var) {
                        return new AnonymousClass2(this.a, this.b, g51Var);
                    }

                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
                        tx8 tx8Var = tx8.a;
                        anonymousClass2.invokeSuspend(tx8Var);
                        return tx8Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                        kotlin.b.b(obj);
                        int i = FastDownloadView.q;
                        this.a.c(this.b);
                        return tx8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(FastDownloadView fastDownloadView, r82 r82Var, g51 g51Var) {
                    super(2, g51Var);
                    this.b = fastDownloadView;
                    this.c = r82Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    return new AnonymousClass3(this.b, this.c, g51Var);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                    int i = this.a;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        FastDownloadView fastDownloadView = this.b;
                        r82 r82Var = this.c;
                        xp xpVar = new xp(fastDownloadView.getInstallQueue().b, r82Var, 6);
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fastDownloadView, r82Var, null);
                        this.a = 1;
                        if (d.f(xpVar, anonymousClass2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return tx8.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00311(FastDownloadView fastDownloadView, g51 g51Var) {
                super(2, g51Var);
                this.b = fastDownloadView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00311 c00311 = new C00311(this.b, g51Var);
                c00311.a = obj;
                return c00311;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00311 c00311 = (C00311) create((r82) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00311.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                r82 r82Var = (r82) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                FastDownloadView fastDownloadView = this.b;
                bt2.G(cc7.q(fastDownloadView), null, null, new C00321(fastDownloadView, r82Var, null), 3);
                bt2.G(cc7.q(fastDownloadView), null, null, new AnonymousClass2(fastDownloadView, r82Var, null), 3);
                bt2.G(cc7.q(fastDownloadView), null, null, new AnonymousClass3(fastDownloadView, r82Var, null), 3);
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FastDownloadView.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                FastDownloadView fastDownloadView = FastDownloadView.this;
                o4 o4Var = new o4(fastDownloadView.p, 9);
                C00311 c00311 = new C00311(fastDownloadView, null);
                this.a = 1;
                if (d.f(o4Var, c00311, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastDownloadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        int i = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            w91 w91Var = ((u91) ((t82) e())).a;
            this.c = (ps1) w91Var.w.get();
            this.d = (ir.mservices.market.version2.manager.a) w91Var.D.get();
            this.e = (dp3) w91Var.v.get();
            this.f = (dv2) w91Var.q.get();
            this.g = (yl5) w91Var.D0.get();
            this.h = (ir.mservices.market.version2.manager.install.a) w91Var.x.get();
        }
        this.o = true;
        this.p = ja1.b(null);
        View.inflate(context, js6.download_state_view, this);
        View viewFindViewById = findViewById(rr6.btn_download);
        js3.o(viewFindViewById, "findViewById(...)");
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = (SmallEmptyMediumTextOvalButton) viewFindViewById;
        this.j = smallEmptyMediumTextOvalButton;
        smallEmptyMediumTextOvalButton.setProgressSize(smallEmptyMediumTextOvalButton.getResources().getDimensionPixelOffset(pq6.small_rate_size));
        smallEmptyMediumTextOvalButton.setLoadingColor(sj8.b().c);
        Integer num = this.l;
        smallEmptyMediumTextOvalButton.setTextColor(num != null ? num.intValue() : sj8.b().c);
        smallEmptyMediumTextOvalButton.setOutlineProvider(null);
        smallEmptyMediumTextOvalButton.a();
        smallEmptyMediumTextOvalButton.setOnClickListener(new cd(10, this));
        View viewFindViewById2 = findViewById(rr6.progress_bar);
        js3.n(viewFindViewById2, "null cannot be cast to non-null type ir.mservices.market.views.DownloadProgressBar");
        DownloadProgressBar downloadProgressBar = (DownloadProgressBar) viewFindViewById2;
        this.i = downloadProgressBar;
        int i2 = DownloadProgressBar.c;
        downloadProgressBar.b(0, new qq1(i));
        downloadProgressBar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().e, PorterDuff.Mode.MULTIPLY));
    }

    private final Drawable getBorderBackground() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_height) / 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.border_size);
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.c(dimensionPixelSize);
        ea7Var.d(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.m = dimensionPixelSize2;
        ea7Var.i = sj8.b().c;
        ea7Var.n = sj8.b().t;
        ea7Var.o = false;
        ea7Var.j = false;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        return ea7Var.a();
    }

    private final Drawable getSolidBackground() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.small_button_height) / 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.border_size);
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.c(dimensionPixelSize);
        ea7Var.d(dimensionPixelSize);
        Integer num = this.n;
        ea7Var.h = num != null ? num.intValue() : dimensionPixelSize2;
        Integer num2 = this.n;
        if (num2 != null) {
            dimensionPixelSize2 = num2.intValue();
        }
        ea7Var.m = dimensionPixelSize2;
        ea7Var.i = sj8.b().c;
        ea7Var.n = sj8.b().t;
        Integer num3 = this.m;
        ea7Var.b = num3 != null ? num3.intValue() : sj8.b().l;
        ea7Var.k = this.m != null ? sj8.b().t : sj8.b().l;
        ea7Var.j = true;
        ea7Var.o = true;
        ea7Var.p = Ripple.a(sj8.b().O, sj8.b().c);
        return ea7Var.a();
    }

    public final String a(int i) {
        String string = getResources().getString(i);
        js3.o(string, "getString(...)");
        return string;
    }

    public final void b(int i, String str) {
        if (i != -1) {
            boolean z = this.o;
            DownloadProgressBar downloadProgressBar = this.i;
            if (z) {
                downloadProgressBar.b(i, new defpackage.d(str, this, 22));
            } else {
                downloadProgressBar.b(i, new qq1(1));
                this.o = true;
            }
            if (downloadProgressBar.getVisibility() == 8) {
                downloadProgressBar.setVisibility(0);
            }
        }
    }

    public final void c(r82 r82Var) {
        Drawable drawable;
        ir.mservices.market.version2.manager.a appManager = getAppManager();
        String str = r82Var.b;
        String str2 = r82Var.e;
        js3.o(str, "getPackageName(...)");
        int i = r82Var.f;
        boolean z = r82Var.a;
        ForceUpdateDto forceUpdateDto = r82Var.l;
        AppDownloadFlowStatus appDownloadFlowStatusD = appManager.d(str, i, z, forceUpdateDto);
        DownloadProgressBar downloadProgressBar = this.i;
        downloadProgressBar.setVisibility(8);
        AppDownloadFlowStatus appDownloadFlowStatus = AppDownloadFlowStatus.f;
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = this.j;
        if (appDownloadFlowStatusD == appDownloadFlowStatus) {
            smallEmptyMediumTextOvalButton.setState(MyketProgressState.c);
        } else {
            smallEmptyMediumTextOvalButton.setState(MyketProgressState.b);
        }
        setBackground(getSolidBackground());
        smallEmptyMediumTextOvalButton.setButtonBackground(getBorderBackground());
        smallEmptyMediumTextOvalButton.setEnabled(true);
        smallEmptyMediumTextOvalButton.setIcon(null);
        Integer num = this.l;
        smallEmptyMediumTextOvalButton.setTextColor(num != null ? num.intValue() : sj8.b().c);
        AppDownloadInfo appDownloadInfoI = getDownloadManager().i(str, null);
        if (!this.o && appDownloadFlowStatusD != AppDownloadFlowStatus.d) {
            this.o = true;
        }
        switch (appDownloadFlowStatusD.ordinal()) {
            case 0:
                smallEmptyMediumTextOvalButton.setTextColor(sj8.b().u);
                smallEmptyMediumTextOvalButton.setEnabled(false);
                smallEmptyMediumTextOvalButton.setText(a(rs6.compatibility_error));
                setEnabled(false);
                return;
            case 1:
                if (TextUtils.isEmpty(str2)) {
                    smallEmptyMediumTextOvalButton.setText(a(rs6.download_app));
                    return;
                } else {
                    smallEmptyMediumTextOvalButton.setText(str2);
                    return;
                }
            case 2:
                if (forceUpdateDto == null || !js3.i(getInstallManager().d(str, i, Long.valueOf(forceUpdateDto.getFileLength())), Boolean.TRUE)) {
                    smallEmptyMediumTextOvalButton.setText(a(rs6.update_app));
                    return;
                }
                Resources resources = getResources();
                js3.o(resources, "getResources(...)");
                int i2 = yq6.ic_gift;
                try {
                    drawable = q39.a(resources, i2, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i2, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                smallEmptyMediumTextOvalButton.setIconWithCompoundDrawables(drawable);
                smallEmptyMediumTextOvalButton.setText(a(rs6.force_update_gift));
                return;
            case 3:
                smallEmptyMediumTextOvalButton.setText(a(rs6.stop_app));
                smallEmptyMediumTextOvalButton.setTextColor(sj8.b().c);
                b(appDownloadInfoI != null ? appDownloadInfoI.getPercent() : -1, appDownloadInfoI != null ? appDownloadInfoI.getPackageName() : null);
                return;
            case 4:
                Integer num2 = this.l;
                smallEmptyMediumTextOvalButton.setTextColor(num2 != null ? num2.intValue() : sj8.b().c);
                smallEmptyMediumTextOvalButton.setText(a(rs6.install_app));
                return;
            case 5:
                downloadProgressBar.setVisibility(0);
                b(100, appDownloadInfoI != null ? appDownloadInfoI.getPackageName() : null);
                smallEmptyMediumTextOvalButton.setText("");
                return;
            case 6:
                boolean z2 = !getInstallManager().K(str) || NearbyRepository.SERVICE_ID.equalsIgnoreCase(str);
                if (z2) {
                    smallEmptyMediumTextOvalButton.setTextColor(sj8.b().u);
                    setEnabled(false);
                }
                smallEmptyMediumTextOvalButton.setEnabled(!z2);
                smallEmptyMediumTextOvalButton.setText(a(rs6.run_app));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ir.mservices.market.version2.manager.a getAppManager() {
        ir.mservices.market.version2.manager.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        js3.V("appManager");
        throw null;
    }

    public final ps1 getDownloadManager() {
        ps1 ps1Var = this.c;
        if (ps1Var != null) {
            return ps1Var;
        }
        js3.V("downloadManager");
        throw null;
    }

    public final dv2 getGraphicUtils() {
        dv2 dv2Var = this.f;
        if (dv2Var != null) {
            return dv2Var;
        }
        js3.V("graphicUtils");
        throw null;
    }

    public final dp3 getInstallManager() {
        dp3 dp3Var = this.e;
        if (dp3Var != null) {
            return dp3Var;
        }
        js3.V("installManager");
        throw null;
    }

    public final ir.mservices.market.version2.manager.install.a getInstallQueue() {
        ir.mservices.market.version2.manager.install.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        js3.V("installQueue");
        throw null;
    }

    public final yl5 getNeneDownloadRepository() {
        yl5 yl5Var = this.g;
        if (yl5Var != null) {
            return yl5Var;
        }
        js3.V("neneDownloadRepository");
        throw null;
    }

    public final Integer getSolidBackgroundColor() {
        return this.m;
    }

    public final Integer getStrokeSize() {
        return this.n;
    }

    public final Integer getTextColor() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bt2.G(cc7.q(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.o = false;
        this.i.setVisibility(8);
        super.onDetachedFromWindow();
    }

    public final void setAppManager(ir.mservices.market.version2.manager.a aVar) {
        js3.p(aVar, "<set-?>");
        this.d = aVar;
    }

    public final void setData(r82 r82Var, s82 s82Var) {
        l lVar;
        Object value;
        js3.p(r82Var, "data");
        do {
            lVar = this.p;
            value = lVar.getValue();
        } while (!lVar.n(value, r82Var));
        this.k = s82Var;
        c(r82Var);
    }

    public final void setDownloadManager(ps1 ps1Var) {
        js3.p(ps1Var, "<set-?>");
        this.c = ps1Var;
    }

    public final void setGraphicUtils(dv2 dv2Var) {
        js3.p(dv2Var, "<set-?>");
        this.f = dv2Var;
    }

    public final void setInstallManager(dp3 dp3Var) {
        js3.p(dp3Var, "<set-?>");
        this.e = dp3Var;
    }

    public final void setInstallQueue(ir.mservices.market.version2.manager.install.a aVar) {
        js3.p(aVar, "<set-?>");
        this.h = aVar;
    }

    public final void setMatchParent(boolean z) {
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = this.j;
        if (z) {
            getLayoutParams().width = -1;
            smallEmptyMediumTextOvalButton.getLayoutParams().width = -1;
        } else {
            getLayoutParams().width = -2;
            smallEmptyMediumTextOvalButton.getLayoutParams().width = getResources().getDimensionPixelOffset(pq6.download_button_min_width);
        }
    }

    public final void setNeneDownloadRepository(yl5 yl5Var) {
        js3.p(yl5Var, "<set-?>");
        this.g = yl5Var;
    }

    public final void setSolidBackgroundColor(Integer num) {
        this.m = num;
    }

    public final void setStrokeSize(Integer num) {
        this.n = num;
    }

    public final void setTextColor(Integer num) {
        this.l = num;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FastDownloadView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
