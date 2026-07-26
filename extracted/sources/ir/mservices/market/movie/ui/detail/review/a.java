package ir.mservices.market.movie.ui.detail.review;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.d75;
import defpackage.ea7;
import defpackage.g85;
import defpackage.i92;
import defpackage.js3;
import defpackage.jx1;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.p3;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.r45;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v48;
import defpackage.v55;
import defpackage.w91;
import defpackage.x55;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.SmallFillOvalButton;
import ir.mservices.market.views.SmallRegularTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 A;
    public d75 B;
    public final c5 C;
    public final lw8 D;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4, og5 og5Var5) {
        super(view);
        js3.p(view, "itemView");
        js3.p(og5Var, "onUserProfileClickListener");
        js3.p(og5Var2, "onLikeClickListener");
        js3.p(og5Var3, "onDislikeClickListener");
        js3.p(og5Var4, "onSubmitClickListener");
        js3.p(og5Var5, "onEditReviewClickListener");
        this.w = og5Var;
        this.x = og5Var2;
        this.y = og5Var3;
        this.z = og5Var4;
        this.A = og5Var5;
        w91 w91Var = (w91) qg5.r();
        this.C = (c5) w91Var.L.get();
        this.D = (lw8) w91Var.E.get();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof d75) {
            this.B = (d75) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final String x() {
        d75 d75Var = this.B;
        if (d75Var != null) {
            return String.valueOf(d75Var.N.getText());
        }
        js3.V("binding");
        throw null;
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void s(MovieUserSubmitReviewData movieUserSubmitReviewData) {
        js3.p(movieUserSubmitReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieSubmitReviewViewHolder$onAttach$1(null, this, movieUserSubmitReviewData), 3);
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void t(MovieUserSubmitReviewData movieUserSubmitReviewData) {
        String str;
        js3.p(movieUserSubmitReviewData, "data");
        v48 v48Var = movieUserSubmitReviewData.a;
        v48 v48Var2 = movieUserSubmitReviewData.b;
        d75 d75Var = this.B;
        if (d75Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketImageButton myketImageButton = d75Var.z;
        MyketImageButton myketImageButton2 = d75Var.E;
        SmallFillOvalButton smallFillOvalButton = d75Var.M;
        MyketEditText myketEditText = d75Var.N;
        View view = this.a;
        js3.o(view, "itemView");
        d75 d75Var2 = this.B;
        if (d75Var2 == null) {
            js3.V("binding");
            throw null;
        }
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_16);
        View view2 = d75Var2.L;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getResources().getDimensionPixelSize(movieUserSubmitReviewData.g);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().q;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = 0;
        view2.setBackground(ea7Var.a());
        d75Var.H.setText(view.getResources().getString(movieUserSubmitReviewData.e ? rs6.audio_like_title : rs6.movie_like_title));
        c5 c5Var = this.C;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        d75 d75Var3 = this.B;
        if (d75Var3 == null) {
            js3.V("binding");
            throw null;
        }
        c5Var.g(d75Var3.v, true);
        MovieReviewDto movieReviewDto = (MovieReviewDto) v48Var2.getValue();
        if (movieReviewDto != null) {
            d75Var.K.setText(movieReviewDto.getNickname());
            d75 d75Var4 = this.B;
            if (d75Var4 == null) {
                js3.V("binding");
                throw null;
            }
            yq2.L(view, d75Var4, movieReviewDto.isLike());
            myketEditText.setHint(view.getResources().getString(movieReviewDto.isLike() ? rs6.review_like_hint : rs6.review_dislike_hint));
        }
        d75 d75Var5 = this.B;
        if (d75Var5 == null) {
            js3.V("binding");
            throw null;
        }
        x55 x55Var = (x55) v48Var.getValue();
        MovieReviewDto movieReviewDto2 = (MovieReviewDto) v48Var2.getValue();
        yq2.K(view, d75Var5, x55Var, movieReviewDto2 != null && movieReviewDto2.isLike());
        BuzzProgressImageView buzzProgressImageView = d75Var.I;
        js3.o(buzzProgressImageView, "likeIcon");
        BuzzProgressImageView buzzProgressImageView2 = d75Var.B;
        js3.o(buzzProgressImageView2, "dislikeIcon");
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.ic_like_bold);
        Drawable drawableMutate = drawableK.mutate();
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        BuzzProgressImageView.setImage$default(buzzProgressImageView, drawableK, false, 2, (Object) null);
        buzzProgressImageView.setEnabled(false);
        Resources resources2 = view.getResources();
        js3.o(resources2, "getResources(...)");
        Drawable drawableK2 = p3.k(resources2, yq6.ic_dislike_bold);
        drawableK2.mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        BuzzProgressImageView.setImage$default(buzzProgressImageView2, drawableK2, false, 2, (Object) null);
        buzzProgressImageView2.setEnabled(false);
        js3.o(myketEditText, "userComment");
        js3.o(smallFillOvalButton, "submitButton");
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().P;
        ea7Var2.i = sj8.b().w;
        ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.space_12));
        ea7Var2.h = view.getContext().getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var2.p = sj8.b().N;
        myketEditText.setBackground(ea7Var2.a());
        myketEditText.setOnFocusChangeListener(new i92(myketEditText, view, 1));
        if (js3.i(v48Var.getValue(), v55.c)) {
            myketEditText.requestFocus();
        }
        String text = movieUserSubmitReviewData.h;
        if (text == null) {
            MovieReviewDto movieReviewDto3 = (MovieReviewDto) v48Var2.getValue();
            text = movieReviewDto3 != null ? movieReviewDto3.getText() : null;
        }
        myketEditText.setText(text);
        myketEditText.setSelection(String.valueOf(myketEditText.getText()).length());
        myketEditText.addTextChangedListener(new g85(0, smallFillOvalButton, movieUserSubmitReviewData));
        MovieReviewDto movieReviewDto4 = (MovieReviewDto) v48Var2.getValue();
        String text2 = movieReviewDto4 != null ? movieReviewDto4.getText() : null;
        smallFillOvalButton.setEnabled(((text2 == null || text2.length() == 0) && ((str = movieUserSubmitReviewData.h) == null || str.length() == 0)) ? false : true);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.movie_shadow_size);
        myketImageButton2.setOutlineProvider(new r45(dimensionPixelSize2, 100.0f));
        myketImageButton.setOutlineProvider(new r45(dimensionPixelSize2, 100.0f));
        ImageView imageView = d75Var.v;
        js3.o(imageView, "avatar");
        qg5.v(imageView, this.w, this, movieUserSubmitReviewData);
        qg5.v(myketImageButton2, this.x, this, movieUserSubmitReviewData);
        qg5.v(myketImageButton, this.y, this, movieUserSubmitReviewData);
        qg5.v(smallFillOvalButton, this.z, this, movieUserSubmitReviewData);
        SmallRegularTextButton smallRegularTextButton = d75Var.C;
        js3.o(smallRegularTextButton, "editReview");
        qg5.v(smallRegularTextButton, this.A, this, movieUserSubmitReviewData);
        int i2 = sj8.b().x;
        MovieReviewDto movieReviewDto5 = (MovieReviewDto) v48Var2.getValue();
        myketImageButton2.setBackground(yq2.J(view, i2, movieReviewDto5 != null ? Boolean.valueOf(movieReviewDto5.isLike()) : null));
        myketImageButton.setBackground(yq2.J(view, sj8.b().A, ((MovieReviewDto) v48Var2.getValue()) != null ? Boolean.valueOf(!r1.isLike()) : null));
        myketEditText.setMovementMethod(new ScrollingMovementMethod());
        myketEditText.setOnTouchListener(new jx1(1, this));
    }
}
