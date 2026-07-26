package ir.mservices.market.views;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.at2;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.de;
import defpackage.dq4;
import defpackage.e71;
import defpackage.ea7;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g51;
import defpackage.gd2;
import defpackage.gn4;
import defpackage.gp6;
import defpackage.js3;
import defpackage.js6;
import defpackage.kp4;
import defpackage.li1;
import defpackage.mz3;
import defpackage.na7;
import defpackage.pq6;
import defpackage.pz3;
import defpackage.qn4;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.sq4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uv1;
import defpackage.w50;
import defpackage.wu8;
import defpackage.xv4;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.views.MiniPlayerView;
import ir.myket.player.provider.service.PlaybackService;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MiniPlayerView extends ConstraintLayout implements pz3 {
    public static final /* synthetic */ int t = 0;
    public final Object q;
    public boolean r;
    public final xv4 s;

    /* JADX INFO: renamed from: ir.mservices.market.views.MiniPlayerView$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.views.MiniPlayerView$3", f = "MiniPlayerView.kt", l = {96}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.views.MiniPlayerView$3$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.views.MiniPlayerView$3$1", f = "MiniPlayerView.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ MiniPlayerView b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MiniPlayerView miniPlayerView, g51 g51Var) {
                super(2, g51Var);
                this.b = miniPlayerView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((dq4) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                dq4 dq4Var = (dq4) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                String str = dq4Var != null ? dq4Var.a : null;
                MiniPlayerView miniPlayerView = this.b;
                miniPlayerView.setVisibleByMediaItem(str);
                if (dq4Var != null) {
                    miniPlayerView.z(dq4Var);
                }
                return tx8.a;
            }
        }

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MiniPlayerView.this.new AnonymousClass3(g51Var);
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
                MiniPlayerView miniPlayerView = MiniPlayerView.this;
                rv6 rv6Var = miniPlayerView.getMediaSessionController().e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(miniPlayerView, null);
                this.a = 1;
                if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.views.MiniPlayerView$4, reason: invalid class name */
    @tb1(c = "ir.mservices.market.views.MiniPlayerView$4", f = "MiniPlayerView.kt", l = {105}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass4 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.views.MiniPlayerView$4$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.views.MiniPlayerView$4$1", f = "MiniPlayerView.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ MiniPlayerView b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MiniPlayerView miniPlayerView, g51 g51Var) {
                super(2, g51Var);
                this.b = miniPlayerView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((kp4) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kp4 kp4Var = (kp4) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                String str = kp4Var != null ? kp4Var.a : null;
                MiniPlayerView miniPlayerView = this.b;
                miniPlayerView.setVisibleByMediaItem(str);
                if (kp4Var != null) {
                    miniPlayerView.y(kp4Var);
                }
                return tx8.a;
            }
        }

        public AnonymousClass4(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MiniPlayerView.this.new AnonymousClass4(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                MiniPlayerView miniPlayerView = MiniPlayerView.this;
                rv6 rv6Var = miniPlayerView.getMediaSessionController().g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(miniPlayerView, null);
                this.a = 1;
                if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniPlayerView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final sq4 getMediaSessionController() {
        return (sq4) this.q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisibleByMediaItem(String str) {
        setVisibility(str != null && !f88.n0(str) && this.r ? 0 : 8);
    }

    public static void t(MiniPlayerView miniPlayerView) {
        Object value;
        Object value2;
        sq4 mediaSessionController = miniPlayerView.getMediaSessionController();
        Context context = mediaSessionController.a;
        li1 li1Var = mediaSessionController.i;
        if (li1Var != null) {
            li1Var.g(null);
        }
        mediaSessionController.i = null;
        gn4 gn4Var = mediaSessionController.c;
        if (gn4Var != null) {
            gn4Var.O((ir.myket.player.provider.service.b) mediaSessionController.j.getValue());
        }
        mediaSessionController.c = null;
        l lVar = mediaSessionController.d;
        do {
            value = lVar.getValue();
        } while (!lVar.n(value, null));
        l lVar2 = mediaSessionController.f;
        do {
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, null));
        qn4 qn4Var = mediaSessionController.b;
        if (qn4Var != null) {
            gn4.i0(qn4Var);
        }
        mediaSessionController.b = null;
        Intent intent = new Intent(context, (Class<?>) PlaybackService.class);
        intent.setAction("ACTION_STOP_SERVICE");
        context.startService(intent);
    }

    public static void u(MiniPlayerView miniPlayerView) {
        dq4 dq4Var = (dq4) miniPlayerView.getMediaSessionController().e.a.getValue();
        if (dq4Var == null || !dq4Var.b) {
            gn4 gn4Var = miniPlayerView.getMediaSessionController().c;
            if (gn4Var != null) {
                gn4Var.K();
                return;
            }
            return;
        }
        gn4 gn4Var2 = miniPlayerView.getMediaSessionController().c;
        if (gn4Var2 != null) {
            gn4Var2.b();
        }
    }

    public static void v(MiniPlayerView miniPlayerView, Context context) {
        kp4 kp4Var = (kp4) miniPlayerView.getMediaSessionController().g.a.getValue();
        if (kp4Var != null) {
            Intent intentP = wu8.p(kp4Var.e, context, true);
            intentP.setFlags(805306368);
            context.startActivity(intentP, ActivityOptions.makeCustomAnimation(context, gp6.audio_player_in, gp6.activity_hold).toBundle());
        }
    }

    public final void A() {
        dq4 dq4Var = (dq4) getMediaSessionController().e.a.getValue();
        if (dq4Var != null) {
            z(dq4Var);
        }
        kp4 kp4Var = (kp4) getMediaSessionController().g.a.getValue();
        if (kp4Var != null) {
            y(kp4Var);
        }
    }

    public final void B() {
        Context context = getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = true;
        ea7Var.b = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{245, Integer.valueOf(sj8.b().p & 16777215)}, 2)));
        ea7Var.h = 0;
        ea7Var.c(getResources().getDimensionPixelSize(pq6.space_8));
        ea7Var.p = sj8.b().N;
        setBackground(ea7Var.a());
        xv4 xv4Var = this.s;
        xv4Var.A.setTextColor(sj8.b().m);
        xv4Var.v.setTextColor(sj8.b().n);
        Drawable progressDrawable = xv4Var.z.getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView = xv4Var.x;
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
        xv4Var.w.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
    }

    public final boolean getCanShowMiniPlayer() {
        return this.r;
    }

    @Override // defpackage.pz3
    public /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        js3.p(view, "changedView");
        super.onVisibilityChanged(view, i);
        A();
    }

    public final void setCanShowMiniPlayer(boolean z) {
        String str;
        this.r = z;
        kp4 kp4Var = (kp4) getMediaSessionController().g.a.getValue();
        if (kp4Var == null || (str = kp4Var.a) == null) {
            dq4 dq4Var = (dq4) getMediaSessionController().e.a.getValue();
            str = dq4Var != null ? dq4Var.a : null;
        }
        setVisibleByMediaItem(str);
    }

    public final void y(kp4 kp4Var) {
        if (getVisibility() == 0) {
            xv4 xv4Var = this.s;
            MyketTextView myketTextView = xv4Var.A;
            ImageView imageView = xv4Var.y;
            String str = kp4Var.b;
            String str2 = kp4Var.d;
            myketTextView.setText(str);
            myketTextView.setSelected(true);
            xv4Var.v.setText(kp4Var.c);
            boolean zN0 = f88.n0(str2);
            js3.o(imageView, "poster");
            imageView.setVisibility(!zN0 ? 0 : 8);
            if (zN0) {
                return;
            }
            Context context = getContext();
            js3.o(context, "getContext(...)");
            ((f57) zk8.O(context, str2).W(uv1.b()).J(new gd2(), new na7(getResources().getDimensionPixelSize(pq6.space_8)))).P(imageView);
        }
    }

    public final void z(dq4 dq4Var) {
        int i;
        if (getVisibility() == 0) {
            int i2 = dq4Var.b ? yq6.ic_pause : yq6.ic_play;
            xv4 xv4Var = this.s;
            ImageView imageView = xv4Var.x;
            imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(i2);
            ProgressBar progressBar = xv4Var.z;
            int i3 = dq4Var.d;
            int i4 = 0;
            if (i3 > 0 && (i = (dq4Var.c * 100) / i3) >= 0) {
                i4 = i;
            }
            progressBar.setProgress(i4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.q = kotlin.a.b(LazyThreadSafetyMode.a, new de(25, this));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = xv4.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i3 = 1;
        xv4 xv4Var = (xv4) fa1.c(layoutInflaterFrom, js6.mini_player_view, this, true);
        js3.o(xv4Var, "inflate(...)");
        this.s = xv4Var;
        setLayoutDirection(3);
        B();
        final int i4 = 0;
        xv4Var.x.setOnClickListener(new View.OnClickListener(this) { // from class: wv4
            public final /* synthetic */ MiniPlayerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        MiniPlayerView.u(this.b);
                        break;
                    default:
                        MiniPlayerView.t(this.b);
                        break;
                }
            }
        });
        ImageView imageView = xv4Var.w;
        imageView.setImageResource(yq6.ic_action_close);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: wv4
            public final /* synthetic */ MiniPlayerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        MiniPlayerView.u(this.b);
                        break;
                    default:
                        MiniPlayerView.t(this.b);
                        break;
                }
            }
        });
        setOnClickListener(new w50(this, context, 5));
        A();
        bt2.G(cc7.q(this), null, null, new AnonymousClass3(null), 3);
        bt2.G(cc7.q(this), null, null, new AnonymousClass4(null), 3);
    }

    public /* synthetic */ MiniPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
