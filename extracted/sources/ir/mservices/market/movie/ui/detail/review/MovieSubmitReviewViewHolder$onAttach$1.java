package ir.mservices.market.movie.ui.detail.review;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import defpackage.b77;
import defpackage.c5;
import defpackage.d75;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.q39;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v55;
import defpackage.v7;
import defpackage.w55;
import defpackage.x55;
import defpackage.xj;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;
import ir.mservices.market.views.SmallRegularTextButton;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieSubmitReviewViewHolder$onAttach$1", f = "MovieUserSubmitReviewData.kt", l = {125}, m = "invokeSuspend", v = 1)
final class MovieSubmitReviewViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieUserSubmitReviewData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.MovieSubmitReviewViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieSubmitReviewViewHolder$onAttach$1$1", f = "MovieUserSubmitReviewData.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        public /* synthetic */ x55 a;
        public /* synthetic */ MovieReviewDto b;

        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (g51) obj3);
            anonymousClass1.a = (x55) obj;
            anonymousClass1.b = (MovieReviewDto) obj2;
            return anonymousClass1.invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x55 x55Var = this.a;
            MovieReviewDto movieReviewDto = this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            return new Pair(x55Var, movieReviewDto);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.review.MovieSubmitReviewViewHolder$onAttach$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.review.MovieSubmitReviewViewHolder$onAttach$1$2", f = "MovieUserSubmitReviewData.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ a b;
        public final /* synthetic */ MovieUserSubmitReviewData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, a aVar, MovieUserSubmitReviewData movieUserSubmitReviewData) {
            super(2, g51Var);
            this.b = aVar;
            this.c = movieUserSubmitReviewData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(g51Var, this.b, this.c);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            x55 x55Var = (x55) pair.a;
            MovieReviewDto movieReviewDto = (MovieReviewDto) pair.b;
            a aVar = this.b;
            d75 d75Var = aVar.B;
            if (d75Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketEditText myketEditText = d75Var.N;
            boolean z = js3.i(x55Var, v55.a) || js3.i(x55Var, v55.c);
            w55 w55Var = w55.a;
            boolean zI = js3.i(x55Var, w55Var);
            boolean zI2 = js3.i(x55Var, v55.b);
            js3.o(myketEditText, "userComment");
            myketEditText.setVisibility(z ? 0 : 8);
            SmallFillOvalButton smallFillOvalButton = d75Var.M;
            js3.o(smallFillOvalButton, "submitButton");
            smallFillOvalButton.setVisibility(z ? 0 : 8);
            MyketImageButton myketImageButton = d75Var.E;
            js3.o(myketImageButton, "likeButton");
            myketImageButton.setVisibility(!zI ? 0 : 8);
            MyketImageButton myketImageButton2 = d75Var.z;
            js3.o(myketImageButton2, "dislikeButton");
            myketImageButton2.setVisibility(!zI ? 0 : 8);
            ImageView imageView = d75Var.v;
            js3.o(imageView, "avatar");
            imageView.setVisibility(!zI2 ? 0 : 8);
            MyketTextView myketTextView = d75Var.J;
            js3.o(myketTextView, "likeLabel");
            myketTextView.setVisibility(!zI2 ? 0 : 8);
            MyketTextView myketTextView2 = d75Var.K;
            js3.o(myketTextView2, "nickname");
            myketTextView2.setVisibility(!zI2 ? 0 : 8);
            MyketTextView myketTextView3 = d75Var.H;
            js3.o(myketTextView3, "likeDislikeAsk");
            myketTextView3.setVisibility(zI2 ? 0 : 8);
            MyketTextView myketTextView4 = d75Var.x;
            js3.o(myketTextView4, "comment");
            myketTextView4.setVisibility(zI ? 0 : 8);
            Group group = d75Var.G;
            js3.o(group, "likeCountGroup");
            group.setVisibility(zI ? 0 : 8);
            MyketTextView myketTextView5 = d75Var.y;
            js3.o(myketTextView5, "date");
            myketTextView5.setVisibility(zI ? 0 : 8);
            MyketTextView myketTextView6 = d75Var.w;
            js3.o(myketTextView6, "bullet");
            myketTextView6.setVisibility(zI ? 0 : 8);
            SmallRegularTextButton smallRegularTextButton = d75Var.C;
            js3.o(smallRegularTextButton, "editReview");
            smallRegularTextButton.setVisibility(zI ? 0 : 8);
            if (z) {
                myketEditText.requestFocus();
            }
            d75 d75Var2 = aVar.B;
            if (d75Var2 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView7 = d75Var2.x;
            MyketImageButton myketImageButton3 = d75Var2.E;
            MyketImageButton myketImageButton4 = d75Var2.z;
            if (movieReviewDto != null) {
                View view = aVar.a;
                js3.o(view, "itemView");
                d75 d75Var3 = aVar.B;
                if (d75Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                yq2.K(view, d75Var3, x55Var, movieReviewDto.isLike());
                js3.o(view, "itemView");
                d75 d75Var4 = aVar.B;
                if (d75Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                yq2.L(view, d75Var4, movieReviewDto.isLike());
                if (movieReviewDto.isLike()) {
                    Drawable background = myketImageButton4.getBackground();
                    xj xjVar = background instanceof xj ? (xj) background : null;
                    if (xjVar != null) {
                        int i = xj.b;
                        xjVar.b(new v7(2));
                    }
                    Drawable background2 = myketImageButton3.getBackground();
                    xj xjVar2 = background2 instanceof xj ? (xj) background2 : null;
                    if (xjVar2 != null) {
                        int i2 = xj.b;
                        xjVar2.a(new v7(2));
                    }
                } else {
                    Drawable background3 = myketImageButton4.getBackground();
                    xj xjVar3 = background3 instanceof xj ? (xj) background3 : null;
                    if (xjVar3 != null) {
                        int i3 = xj.b;
                        xjVar3.a(new v7(2));
                    }
                    Drawable background4 = myketImageButton3.getBackground();
                    xj xjVar4 = background4 instanceof xj ? (xj) background4 : null;
                    if (xjVar4 != null) {
                        int i4 = xj.b;
                        xjVar4.b(new v7(2));
                    }
                }
                c5 c5Var = aVar.C;
                if (c5Var == null) {
                    js3.V("accountManager");
                    throw null;
                }
                c5Var.g(d75Var2.v, true);
                myketTextView7.setText(movieReviewDto.getText());
                String text = movieReviewDto.getText();
                myketTextView7.setVisibility((text == null || text.length() == 0 || !js3.i(x55Var, w55Var)) ? 8 : 0);
                d75Var2.K.setText(movieReviewDto.getNickname());
                SmallRegularTextButton smallRegularTextButton2 = d75Var2.C;
                smallRegularTextButton2.setText(view.getResources().getString(rs6.edit_comment));
                smallRegularTextButton2.setPrimaryColor(sj8.b().n);
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i5 = yq6.ic_edit;
                try {
                    drawable = q39.a(resources, i5, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i5, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i5, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                smallRegularTextButton2.setBigIcon(drawable);
                smallRegularTextButton2.setTextColor(sj8.b().n);
                d75Var2.y.setText(movieReviewDto.getDate());
                MyketTextView myketTextView8 = d75Var2.F;
                lw8 lw8Var = aVar.D;
                if (lw8Var == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView8.setText(lw8.e(lw8Var, String.valueOf(movieReviewDto.getPositiveLikes())));
                MyketTextView myketTextView9 = d75Var2.A;
                lw8 lw8Var2 = aVar.D;
                if (lw8Var2 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView9.setText(lw8.e(lw8Var2, String.valueOf(movieReviewDto.getNegativeLikes())));
                d75Var2.N.setHint(view.getResources().getString(movieReviewDto.isLike() ? rs6.review_like_hint : rs6.review_dislike_hint));
            }
            this.c.f.invoke();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSubmitReviewViewHolder$onAttach$1(g51 g51Var, a aVar, MovieUserSubmitReviewData movieUserSubmitReviewData) {
        super(2, g51Var);
        this.b = movieUserSubmitReviewData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieSubmitReviewViewHolder$onAttach$1(g51Var, this.c, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieSubmitReviewViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MovieUserSubmitReviewData movieUserSubmitReviewData = this.b;
            h hVar = new h(movieUserSubmitReviewData.a, movieUserSubmitReviewData.b, new AnonymousClass1(3, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, this.c, movieUserSubmitReviewData);
            this.a = 1;
            if (d.f(hVar, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
