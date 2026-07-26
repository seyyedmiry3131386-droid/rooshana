package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ir.mservices.market.app.detail.reivews.recycler.RateWithoutCommentData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityTitleData;
import ir.mservices.market.movie.ui.detail.review.MovieRateWithoutCommentData;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.search.history.ui.recycler.SearchListTitleData;
import ir.mservices.market.setting.recycler.SettingAppVersion;
import ir.mservices.market.social.level.data.XpDetailDto;
import ir.mservices.market.social.level.recycler.LevelDetailData;
import ir.mservices.market.social.level.recycler.LevelInfoData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ft1 extends qg5 {
    public final /* synthetic */ int w;
    public Object x;
    public a79 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft1(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        Drawable drawable2;
        String string;
        int i = this.w;
        View view = this.a;
        switch (i) {
            case 0:
                DownloadQualityTitleData downloadQualityTitleData = (DownloadQualityTitleData) myketRecyclerData;
                js3.p(downloadQualityTitleData, "data");
                d23 d23Var = (d23) this.y;
                if (d23Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = d23Var.v;
                lw8 lw8Var = (lw8) this.x;
                if (lw8Var != null) {
                    myketTextView.setText(lw8.e(lw8Var, downloadQualityTitleData.a));
                    return;
                } else {
                    js3.V("uiUtils");
                    throw null;
                }
            case 1:
                LevelDetailData levelDetailData = (LevelDetailData) myketRecyclerData;
                js3.p(levelDetailData, "data");
                XpDetailDto xpDetailDto = levelDetailData.a;
                e54 e54Var = (e54) this.y;
                if (e54Var == null) {
                    js3.V("binding");
                    throw null;
                }
                int xpLevel = xpDetailDto.getXpLevel();
                int levelStart = xpDetailDto.getLevelStart();
                int levelEnd = xpDetailDto.getLevelEnd();
                int exactXP = xpDetailDto.getExactXP();
                Object obj = lw8.b;
                int iW = js8.w(xpDetailDto.getXpColor());
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.space_36);
                ProgressBar progressBar = e54Var.x;
                ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(dimensionPixelSize);
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                progressBar.setLayoutParams(marginLayoutParams);
                progressBar.setMax(levelEnd - levelStart);
                progressBar.setProgress(exactXP - levelStart);
                float dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.level_item_progress_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(sj8.b().l);
                gradientDrawable.setCornerRadius(dimensionPixelSize2);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(iW);
                gradientDrawable2.setCornerRadius(dimensionPixelSize2);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
                layerDrawable.setId(0, R.id.background);
                layerDrawable.setId(1, R.id.secondaryProgress);
                layerDrawable.setId(2, R.id.progress);
                progressBar.setProgressDrawable(layerDrawable);
                MyketTextView myketTextView2 = e54Var.w;
                lw8 lw8Var2 = (lw8) this.x;
                if (lw8Var2 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView2.setText(lw8.e(lw8Var2, String.valueOf(xpLevel)));
                MyketTextView myketTextView3 = e54Var.v;
                lw8 lw8Var3 = (lw8) this.x;
                if (lw8Var3 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView3.setText(lw8.e(lw8Var3, xpLevel > 99 ? view.getResources().getString(rs6.plus_99) : String.valueOf(xpLevel + 1)));
                MyketTextView myketTextView4 = e54Var.y;
                myketTextView4.setTextColor(iW);
                lw8 lw8Var4 = (lw8) this.x;
                if (lw8Var4 != null) {
                    myketTextView4.setText(lw8.e(lw8Var4, String.valueOf(levelEnd - exactXP)));
                    return;
                } else {
                    js3.V("uiUtils");
                    throw null;
                }
            case 2:
                LevelInfoData levelInfoData = (LevelInfoData) myketRecyclerData;
                js3.p(levelInfoData, "data");
                XpDetailDto xpDetailDto2 = levelInfoData.c;
                i54 i54Var = (i54) this.y;
                if (i54Var == null) {
                    js3.V("binding");
                    throw null;
                }
                AvatarImageView avatarImageView = i54Var.v;
                avatarImageView.setSize(avatarImageView.getResources().getDimensionPixelSize(pq6.header_avatar_size));
                avatarImageView.setVisibility(0);
                AvatarImageView.setImage$default(avatarImageView, levelInfoData.a, levelInfoData.b, null, null, 12, null);
                avatarImageView.setCircle(true);
                int xpLevel2 = xpDetailDto2.getXpLevel();
                Object obj2 = lw8.b;
                int iW2 = js8.w(xpDetailDto2.getXpColor());
                ImageView imageView = i54Var.y;
                int i2 = sj8.b().l;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(i2, mode));
                i54Var.x.setColorFilter(new PorterDuffColorFilter(iW2, mode));
                MyketTextView myketTextView5 = i54Var.w;
                lw8 lw8Var5 = (lw8) this.x;
                if (lw8Var5 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView5.setText(lw8.e(lw8Var5, String.valueOf(xpLevel2)));
                MyketTextView myketTextView6 = i54Var.z;
                String string2 = levelInfoData.b;
                if (string2 == null || f88.n0(string2)) {
                    string2 = view.getResources().getString(rs6.anonymous_user);
                    js3.o(string2, "getString(...)");
                }
                myketTextView6.setText(string2);
                return;
            case 3:
                MovieRateWithoutCommentData movieRateWithoutCommentData = (MovieRateWithoutCommentData) myketRecyclerData;
                js3.p(movieRateWithoutCommentData, "data");
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i3 = yq6.ic_user_without_comment;
                try {
                    drawable = q39.a(resources, i3, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i3, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i3, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                Drawable drawableMutate = drawable.mutate();
                js3.o(drawableMutate, "mutate(...)");
                drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
                d04 d04Var = (d04) this.x;
                if (d04Var == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                if (d04Var.f()) {
                    ev6 ev6Var = (ev6) this.y;
                    if (ev6Var == null) {
                        js3.V("binding");
                        throw null;
                    }
                    ev6Var.v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate, (Drawable) null);
                } else {
                    ev6 ev6Var2 = (ev6) this.y;
                    if (ev6Var2 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    ev6Var2.v.setCompoundDrawablesWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                ev6 ev6Var3 = (ev6) this.y;
                if (ev6Var3 != null) {
                    ev6Var3.v.setText(movieRateWithoutCommentData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 4:
                MovieSeasonFixedTitleData movieSeasonFixedTitleData = (MovieSeasonFixedTitleData) myketRecyclerData;
                js3.p(movieSeasonFixedTitleData, "data");
                w65 w65Var = (w65) this.y;
                if (w65Var == null) {
                    js3.V("binding");
                    throw null;
                }
                w65Var.x.setText(movieSeasonFixedTitleData.a);
                w65 w65Var2 = (w65) this.y;
                if (w65Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                View view2 = w65Var2.v;
                Context context = view.getContext();
                js3.o(context, "getContext(...)");
                ea7 ea7Var = new ea7(context);
                ea7Var.b = sj8.b().l;
                ea7Var.c(0);
                ea7Var.h = 0;
                view2.setBackground(ea7Var.a());
                int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
                w65 w65Var3 = (w65) this.y;
                if (w65Var3 != null) {
                    w65Var3.x.setPadding(dimensionPixelSize3, view.getResources().getDimensionPixelSize(pq6.space_32), dimensionPixelSize3, 0);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 5:
                RateWithoutCommentData rateWithoutCommentData = (RateWithoutCommentData) myketRecyclerData;
                js3.p(rateWithoutCommentData, "data");
                int i4 = rateWithoutCommentData.c;
                Resources resources2 = view.getResources();
                js3.o(resources2, "getResources(...)");
                int i5 = yq6.ic_user_without_comment;
                try {
                    drawable2 = q39.a(resources2, i5, null);
                    if (drawable2 == null) {
                        ThreadLocal threadLocal3 = b77.a;
                        drawable2 = resources2.getDrawable(i5, null);
                        if (drawable2 == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused2) {
                    ThreadLocal threadLocal4 = b77.a;
                    drawable2 = resources2.getDrawable(i5, null);
                    if (drawable2 == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable2.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
                ev6 ev6Var4 = (ev6) this.y;
                if (ev6Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                ev6Var4.v.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                boolean z = i4 == 0 && rateWithoutCommentData.a;
                ev6 ev6Var5 = (ev6) this.y;
                if (ev6Var5 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView7 = ev6Var5.v;
                if (z) {
                    string = view.getResources().getString(rs6.level_rate_without_comment);
                } else {
                    Resources resources3 = view.getResources();
                    int i6 = i4 > 1 ? rs6.rate_without_comment : rs6.one_rate_without_comment;
                    lw8 lw8Var6 = (lw8) this.x;
                    if (lw8Var6 == null) {
                        js3.V("uiUtils");
                        throw null;
                    }
                    string = resources3.getString(i6, lw8.e(lw8Var6, String.valueOf(i4)));
                }
                myketTextView7.setText(string);
                return;
            case 6:
                SearchListTitleData searchListTitleData = (SearchListTitleData) myketRecyclerData;
                js3.p(searchListTitleData, "data");
                ui7 ui7Var = (ui7) this.y;
                if (ui7Var == null) {
                    js3.V("binding");
                    throw null;
                }
                View view3 = ui7Var.l;
                d04 d04Var2 = (d04) this.x;
                if (d04Var2 == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                view3.setLayoutDirection(d04Var2.c());
                ui7 ui7Var2 = (ui7) this.y;
                if (ui7Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                ui7Var2.w.setText(searchListTitleData.a);
                int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
                d04 d04Var3 = (d04) this.x;
                if (d04Var3 == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                int i7 = d04Var3.f() ? dimensionPixelSize4 : 0;
                d04 d04Var4 = (d04) this.x;
                if (d04Var4 == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                view.setPadding(d04Var4.f() ? 0 : dimensionPixelSize4, view.getResources().getDimensionPixelOffset(pq6.margin_default_v2_triple), i7, view.getResources().getDimensionPixelOffset(searchListTitleData.c));
                ui7 ui7Var3 = (ui7) this.y;
                if (ui7Var3 != null) {
                    ui7Var3.v.setData(searchListTitleData.d);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            default:
                SettingAppVersion settingAppVersion = (SettingAppVersion) myketRecyclerData;
                js3.p(settingAppVersion, "data");
                sq7 sq7Var = (sq7) this.y;
                if (sq7Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView8 = sq7Var.w;
                Resources resources4 = view.getResources();
                int i8 = rs6.myket_version;
                lw8 lw8Var7 = (lw8) this.x;
                if (lw8Var7 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView8.setText(resources4.getString(i8, lw8.e(lw8Var7, settingAppVersion.b)));
                myketTextView8.setTextColor(sj8.b().m);
                return;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.w) {
            case 0:
                if (!(a79Var instanceof d23)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (d23) a79Var;
                }
                break;
            case 1:
                if (!(a79Var instanceof e54)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (e54) a79Var;
                }
                break;
            case 2:
                if (!(a79Var instanceof i54)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (i54) a79Var;
                }
                break;
            case 3:
                if (!(a79Var instanceof ev6)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (ev6) a79Var;
                }
                break;
            case 4:
                if (!(a79Var instanceof w65)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (w65) a79Var;
                }
                break;
            case 5:
                if (!(a79Var instanceof ev6)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (ev6) a79Var;
                }
                break;
            case 6:
                if (!(a79Var instanceof ui7)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (ui7) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof sq7)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (sq7) a79Var;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(View view) {
        super(view);
        this.w = 4;
        this.x = view;
    }
}
