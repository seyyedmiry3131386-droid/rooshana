package ir.mservices.market.movie.ui.detail.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.b77;
import defpackage.e71;
import defpackage.fu7;
import defpackage.g51;
import defpackage.js3;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qp2;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.yq6;
import ir.mservices.market.views.MyketVideoView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieTrailerViewHolder$onAttach$1", f = "MovieTrailer.kt", l = {102}, m = "invokeSuspend", v = 1)
final class MovieTrailerViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieTrailerData b;
    public final /* synthetic */ f c;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.recycler.MovieTrailerViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieTrailerViewHolder$onAttach$1$1", f = "MovieTrailer.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ f b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, g51 g51Var) {
            super(2, g51Var);
            this.b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            f fVar = this.b;
            MyketVideoView myketVideoView = fVar.x().w;
            js3.m(myketVideoView);
            uy6.p(myketVideoView, sj8.b().O.c, new Float(myketVideoView.getRadius()));
            myketVideoView.setShowReplayIcon(z);
            myketVideoView.i();
            if (!z) {
                Context context = fVar.a.getContext();
                js3.o(context, "getContext(...)");
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(sj8.b().j);
                gradientDrawable.setCornerRadius(context.getResources().getDimension(pq6.space_24));
                Resources resources = context.getResources();
                js3.o(resources, "getResources(...)");
                int i = yq6.ic_play_detail;
                try {
                    drawable = q39.a(resources, i, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().k, PorterDuff.Mode.MULTIPLY));
                Drawable drawableMutate = drawable.mutate();
                js3.o(drawableMutate, "mutate(...)");
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableMutate});
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(pq6.space_12);
                layerDrawable.setLayerInset(1, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                myketVideoView.setVideoActionDrawable(layerDrawable);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieTrailerViewHolder$onAttach$1(MovieTrailerData movieTrailerData, f fVar, g51 g51Var) {
        super(2, g51Var);
        this.b = movieTrailerData;
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieTrailerViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieTrailerViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            fu7 fu7Var = this.b.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(fu7Var, anonymousClass1, this) == coroutineSingletons) {
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
