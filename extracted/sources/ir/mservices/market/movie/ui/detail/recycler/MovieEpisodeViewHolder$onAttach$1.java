package ir.mservices.market.movie.ui.detail.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.b35;
import defpackage.b77;
import defpackage.e71;
import defpackage.f88;
import defpackage.f9;
import defpackage.g51;
import defpackage.ho0;
import defpackage.js3;
import defpackage.pq6;
import defpackage.pt1;
import defpackage.q39;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u45;
import defpackage.v48;
import defpackage.w45;
import defpackage.x45;
import defpackage.yq6;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeViewHolder$onAttach$1", f = "MovieEpisode.kt", l = {166, 173}, m = "invokeSuspend", v = 1)
final class MovieEpisodeViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ MovieEpisodeData c;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeViewHolder$onAttach$1$1", f = "MovieEpisode.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ b b;
        public final /* synthetic */ MovieEpisodeData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, MovieEpisodeData movieEpisodeData, b bVar) {
            super(2, g51Var);
            this.b = bVar;
            this.c = movieEpisodeData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((x45) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
            String bannerUrl;
            x45 x45Var = (x45) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            b bVar = this.b;
            bVar.x().C.setProgress(x45Var.a());
            MovieEpisodeData movieEpisodeData = this.c;
            String secondaryTitle = movieEpisodeData.a.getSecondaryTitle();
            boolean z = movieEpisodeData.d;
            View view = bVar.a;
            MyketTextView myketTextView = bVar.x().y;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) secondaryTitle);
            boolean z2 = x45Var instanceof w45;
            if (z2) {
                spannableStringBuilder.append((CharSequence) "  |  ");
                spannableStringBuilder.append((CharSequence) view.getResources().getString(z ? rs6.audio_playing_in_progress_secondary_title : rs6.movie_watching_in_progress_secondary_title, Integer.valueOf(((w45) x45Var).b)));
            } else if (x45Var.equals(u45.b)) {
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i = yq6.ic_check_mark_inside_circle;
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
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.finished_movie_icon_size);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                spannableStringBuilder.append((CharSequence) "  |  ");
                SpannableString spannableString = new SpannableString(view.getResources().getString(z ? rs6.audio_playing_finished_secondary_title : rs6.movie_watching_finished_secondary_title));
                spannableString.setSpan(new ho0(drawable, 1), 0, 1, 18);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            myketTextView.setText(spannableStringBuilder);
            ProgressBar progressBar = bVar.x().C;
            js3.o(progressBar, "watchProgress");
            progressBar.setVisibility((!z2 || (bannerUrl = movieEpisodeData.a.getBannerUrl()) == null || f88.n0(bannerUrl)) ? 8 : 0);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieEpisodeViewHolder$onAttach$1(g51 g51Var, MovieEpisodeData movieEpisodeData, b bVar) {
        super(2, g51Var);
        this.b = bVar;
        this.c = movieEpisodeData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieEpisodeViewHolder$onAttach$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieEpisodeViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        MovieEpisodeData movieEpisodeData = this.c;
        b bVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            ir.mservices.market.version2.manager.d dVar = bVar.x;
            if (dVar == null) {
                js3.V("movieProgressManager");
                throw null;
            }
            String playId = movieEpisodeData.a.getPlayId();
            js3.p(playId, "playId");
            f9 f9Var = new f9(dVar.f, playId, dVar, 2);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, movieEpisodeData, bVar);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(f9Var, anonymousClass1, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        v48 v48Var = movieEpisodeData.b;
        if (v48Var != null) {
            b35 b35Var = new b35(bVar, movieEpisodeData, 0);
            this.a = 2;
            Object objA = v48Var.a(new pt1(b35Var, 3), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8Var;
    }
}
