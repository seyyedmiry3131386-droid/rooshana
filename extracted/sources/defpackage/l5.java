package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.a;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperPageTitleRowData;
import ir.mservices.market.app.detail.more.ui.recycler.AgeRateData;
import ir.mservices.market.app.detail.more.ui.recycler.DescriptionData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreSimpleData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreVersionData;
import ir.mservices.market.app.detail.more.ui.recycler.WhatsNewData;
import ir.mservices.market.app.detail.ui.recycler.LocalMessageBoxData;
import ir.mservices.market.app.detail.update.ui.recycler.InAppUpdateAppBarData;
import ir.mservices.market.app.search.result.ui.recycler.RestrictedApplicationData;
import ir.mservices.market.app.suggest.detail.recycler.PlayAppBarData;
import ir.mservices.market.app.suggest.detail.recycler.PlayDescriptionData;
import ir.mservices.market.app.survey.recycler.QuestionData;
import ir.mservices.market.app.update.recycler.UpdateEmptyListData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.intro.recycler.IntroData;
import ir.mservices.market.movie.data.webapi.CastDto;
import ir.mservices.market.movie.data.webapi.PersonDto;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityHalfPriceData;
import ir.mservices.market.movie.streamers.recycler.StreamerHeaderData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieTitleData;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastData;
import ir.mservices.market.movie.ui.detail.recycler.MovieCastTitleData;
import ir.mservices.market.movie.ui.detail.recycler.VerticalLineData;
import ir.mservices.market.movie.ui.detail.review.MovieEmptyReviewData;
import ir.mservices.market.myAccount.city.recycler.EmptyCityData;
import ir.mservices.market.myAccount.city.recycler.SelectCityHeaderData;
import ir.mservices.market.pika.send.recycler.InstalledAppsTitleData;
import ir.mservices.market.social.level.data.LevelInfoDto;
import ir.mservices.market.social.level.recycler.AchievementInfoData;
import ir.mservices.market.social.level.recycler.AchievementTitleData;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.ProfileTagDto;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.RestrictedAppDTO;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteHeaderData;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteLastVersionData;
import ir.mservices.market.versionNote.ui.recycler.VersionRowData;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 extends qg5 {
    public final /* synthetic */ int w;
    public a79 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(int i, View view) {
        super(view);
        this.w = i;
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
    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        f57 f57VarH;
        f57 f57VarH2;
        int i;
        Drawable drawable;
        Drawable drawable2;
        int i2 = this.w;
        String str = "empty_url";
        View view = this.a;
        switch (i2) {
            case 0:
                AchievementInfoData achievementInfoData = (AchievementInfoData) myketRecyclerData;
                js3.p(achievementInfoData, "data");
                LevelInfoDto levelInfoDto = achievementInfoData.a;
                m5 m5Var = (m5) this.x;
                if (m5Var == null) {
                    js3.V("binding");
                    throw null;
                }
                m5Var.x.setText(levelInfoDto.getTitle());
                m5 m5Var2 = (m5) this.x;
                if (m5Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                m5Var2.w.setText(levelInfoDto.getSubtitle());
                js3.o(view, "itemView");
                String valueIconUrl = levelInfoDto.getValueIconUrl();
                if (valueIconUrl == null || f88.n0(valueIconUrl)) {
                    lw.g(null, "url is empty", null);
                } else {
                    str = valueIconUrl;
                }
                try {
                    f57VarH = a.f(view).q(new ne5(str, null));
                    js3.m(f57VarH);
                } catch (Exception unused) {
                    f57VarH = t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
                }
                f57 f57VarW = ((f57) f57VarH.k(yq6.icon)).W(uv1.b());
                m5 m5Var3 = (m5) this.x;
                if (m5Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                f57VarW.P(m5Var3.v);
                String value = levelInfoDto.getValue();
                String strN = dw1.n("\u200e", value != null ? m88.X(value, "/", "\n") : null);
                m5 m5Var4 = (m5) this.x;
                if (m5Var4 != null) {
                    m5Var4.y.setText(strN);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
                break;
            case 1:
                AchievementTitleData achievementTitleData = (AchievementTitleData) myketRecyclerData;
                js3.p(achievementTitleData, "data");
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.space_xl);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_m) + view.getResources().getDimensionPixelSize(pq6.space_20);
                int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.space_m);
                p5 p5Var = (p5) this.x;
                if (p5Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = p5Var.w;
                ViewGroup.LayoutParams layoutParams = myketTextView.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                myketTextView.setLayoutParams(marginLayoutParams);
                myketTextView.setText(achievementTitleData.a);
                return;
            case 2:
                AgeRateData ageRateData = (AgeRateData) myketRecyclerData;
                js3.p(ageRateData, "data");
                a13 a13Var = (a13) this.x;
                if (a13Var == null) {
                    js3.V("binding");
                    throw null;
                }
                a13Var.w.setText(ageRateData.a);
                js3.o(view, "itemView");
                String str2 = ageRateData.b;
                if (str2 == null || f88.n0(str2)) {
                    lw.g(null, "url is empty", null);
                } else {
                    str = str2;
                }
                try {
                    f57 f57VarQ = a.f(view).q(new ne5(str, null));
                    js3.m(f57VarQ);
                    f57VarH2 = f57VarQ;
                    break;
                } catch (Exception unused2) {
                    f57VarH2 = t61.h(str, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
                }
                a13 a13Var2 = (a13) this.x;
                if (a13Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                ImageView imageView = a13Var2.v;
                js3.o(imageView, "ageRate");
                f57VarH2.Q(new av0(imageView, Integer.valueOf(sj8.b().n)), f57VarH2);
                return;
            case 3:
                DescriptionData descriptionData = (DescriptionData) myketRecyclerData;
                js3.p(descriptionData, "data");
                Boolean bool = descriptionData.b;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    c23 c23Var = (c23) this.x;
                    if (c23Var == null) {
                        js3.V("binding");
                        throw null;
                    }
                    c23Var.w.setTextDirection(zBooleanValue ? 4 : 3);
                }
                c23 c23Var2 = (c23) this.x;
                if (c23Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView2 = c23Var2.w;
                js3.o(myketTextView2, ConfirmDTO.INPUT_TYPE_TEXT);
                MyketTextView.setTextFromHtml$default(myketTextView2, descriptionData.a, 1, null, null, false, 28, null);
                c23 c23Var3 = (c23) this.x;
                if (c23Var3 != null) {
                    c23Var3.v.setText(rs6.description);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 4:
                js3.p((DeveloperPageTitleRowData) myketRecyclerData, "data");
                kl1 kl1Var = (kl1) this.x;
                if (kl1Var != null) {
                    kl1Var.v.setText(view.getResources().getString(rs6.developer_list_title));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 5:
                DownloadQualityHalfPriceData downloadQualityHalfPriceData = (DownloadQualityHalfPriceData) myketRecyclerData;
                js3.p(downloadQualityHalfPriceData, "data");
                l23 l23Var = (l23) this.x;
                if (l23Var != null) {
                    l23Var.v.setText(downloadQualityHalfPriceData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 6:
                js3.p((EmptyCityData) myketRecyclerData, "data");
                c12 c12Var = (c12) this.x;
                if (c12Var != null) {
                    c12Var.w.setTextColor(sj8.b().m);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 7:
                InAppUpdateAppBarData inAppUpdateAppBarData = (InAppUpdateAppBarData) myketRecyclerData;
                js3.p(inAppUpdateAppBarData, "data");
                AppBarSampleData appBarSampleData = inAppUpdateAppBarData.a;
                gl3 gl3Var = (gl3) this.x;
                if (gl3Var == null) {
                    js3.V("binding");
                    throw null;
                }
                gl3Var.w.setText(appBarSampleData.getTitle());
                MyketTextView myketTextView3 = gl3Var.y;
                String whatsnew = appBarSampleData.getWhatsnew();
                if (whatsnew == null) {
                    whatsnew = "";
                }
                myketTextView3.setMarkdownText(whatsnew);
                AppIconView appIconView = gl3Var.v;
                appIconView.setErrorImageResId(yq6.icon);
                appIconView.setImageUrl(appBarSampleData.getIconPath(), "app_bar", true);
                MyketTextView myketTextView4 = gl3Var.x;
                x(false);
                js3.m(myketTextView4);
                uy6.m(sj8.b().O.c, myketTextView4);
                myketTextView4.setOnClickListener(new w50(gl3Var, this, i));
                return;
            case 8:
                InstalledAppsTitleData installedAppsTitleData = (InstalledAppsTitleData) myketRecyclerData;
                js3.p(installedAppsTitleData, "data");
                i33 i33Var = (i33) this.x;
                if (i33Var != null) {
                    i33Var.v.setText(view.getResources().getString(rs6.send_app_count_title, Integer.valueOf(installedAppsTitleData.a)));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 9:
                IntroData introData = (IntroData) myketRecyclerData;
                js3.p(introData, "data");
                l33 l33Var = (l33) this.x;
                if (l33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                l33Var.x.setImageResource(introData.d);
                l33 l33Var2 = (l33) this.x;
                if (l33Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                l33Var2.y.setText(view.getResources().getString(introData.a));
                l33 l33Var3 = (l33) this.x;
                if (l33Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                l33Var3.v.setText(view.getResources().getString(introData.b));
                l33 l33Var4 = (l33) this.x;
                if (l33Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                l33Var4.x.setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY));
                Integer num = introData.c;
                if (num != null) {
                    int iIntValue = num.intValue();
                    l33 l33Var5 = (l33) this.x;
                    if (l33Var5 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    MyketTextView myketTextView5 = l33Var5.w;
                    js3.o(myketTextView5, "hint");
                    MyketTextView.setTextFromHtml$default(myketTextView5, view.getResources().getString(iIntValue), 1, null, null, false, 28, null);
                    return;
                }
                return;
            case 10:
                LocalMessageBoxData localMessageBoxData = (LocalMessageBoxData) myketRecyclerData;
                js3.p(localMessageBoxData, "data");
                int i3 = localMessageBoxData.c;
                int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
                int dimensionPixelSize5 = view.getResources().getDimensionPixelSize(pq6.space_16);
                mc4 mc4Var = (mc4) this.x;
                if (mc4Var == null) {
                    js3.V("binding");
                    throw null;
                }
                mc4Var.l.setPadding(dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize5);
                int dimensionPixelSize6 = view.getResources().getDimensionPixelSize(pq6.space_8);
                int dimensionPixelSize7 = view.getResources().getDimensionPixelSize(pq6.border_size);
                mc4 mc4Var2 = (mc4) this.x;
                if (mc4Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = mc4Var2.v;
                Context context = view.getContext();
                js3.o(context, "getContext(...)");
                ea7 ea7Var = new ea7(context);
                ea7Var.b = sj8.b().l;
                ea7Var.c(dimensionPixelSize6);
                ea7Var.h = dimensionPixelSize7;
                ea7Var.i = sj8.b().v;
                constraintLayout.setBackground(ea7Var.a());
                mc4 mc4Var3 = (mc4) this.x;
                if (mc4Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView6 = mc4Var3.x;
                js3.m(myketTextView6);
                MyketTextView.setTextFromHtml$default(myketTextView6, view.getResources().getString(localMessageBoxData.a), 0, null, null, false, 28, null);
                myketTextView6.setTextColor(sj8.b().m);
                mc4 mc4Var4 = (mc4) this.x;
                if (mc4Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                ImageView imageView2 = mc4Var4.w;
                js3.o(imageView2, "icon");
                int i4 = localMessageBoxData.b;
                if (i4 != 0) {
                    mc4 mc4Var5 = (mc4) this.x;
                    if (mc4Var5 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    mc4Var5.w.setImageResource(i4);
                    mc4 mc4Var6 = (mc4) this.x;
                    if (mc4Var6 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    mc4Var6.w.getDrawable().setColorFilter(i3 != 0 ? new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY) : new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
                    i = 0;
                } else {
                    i = 8;
                }
                imageView2.setVisibility(i);
                return;
            case 11:
                MoreSimpleData moreSimpleData = (MoreSimpleData) myketRecyclerData;
                js3.p(moreSimpleData, "data");
                f13 f13Var = (f13) this.x;
                if (f13Var != null) {
                    f13Var.v.setText(moreSimpleData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 12:
                MoreVersionData moreVersionData = (MoreVersionData) myketRecyclerData;
                js3.p(moreVersionData, "data");
                String string = moreVersionData.a;
                j43 j43Var = (j43) this.x;
                if (j43Var == null) {
                    js3.V("binding");
                    throw null;
                }
                j43Var.w.setText(moreVersionData.c);
                j43 j43Var2 = (j43) this.x;
                if (j43Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView7 = j43Var2.v;
                String str3 = moreVersionData.b;
                if (str3 != null && !f88.n0(str3)) {
                    string = view.getResources().getString(rs6.app_version, string, str3);
                    js3.m(string);
                }
                myketTextView7.setText(string);
                return;
            case 13:
                js3.p((MovieCastTitleData) myketRecyclerData, "data");
                q43 q43Var = (q43) this.x;
                if (q43Var != null) {
                    q43Var.v.setText(view.getResources().getString(rs6.movie_cast_title));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 14:
                MovieCastData movieCastData = (MovieCastData) myketRecyclerData;
                js3.p(movieCastData, "data");
                l05 l05Var = (l05) this.x;
                if (l05Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView8 = l05Var.x;
                CastDto castDto = movieCastData.a;
                myketTextView8.setText(castDto.getTitle());
                l05 l05Var2 = (l05) this.x;
                if (l05Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                l05Var2.v.removeAllViews();
                uf2 uf2Var = new uf2(70, 10);
                for (PersonDto personDto : castDto.getPeople()) {
                    Context context2 = view.getContext();
                    js3.o(context2, "getContext(...)");
                    MyketTextView myketTextView9 = new MyketTextView(context2, null);
                    myketTextView9.setGravity(5);
                    myketTextView9.setTextColor(sj8.b().m);
                    myketTextView9.setTextSize(0, view.getResources().getDimension(pq6.font_size_medium));
                    myketTextView9.setText(personDto.getName());
                    l05 l05Var3 = (l05) this.x;
                    if (l05Var3 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    l05Var3.v.addView(myketTextView9, uf2Var);
                }
                return;
            case 15:
                MovieEmptyReviewData movieEmptyReviewData = (MovieEmptyReviewData) myketRecyclerData;
                js3.p(movieEmptyReviewData, "data");
                g55 g55Var = (g55) this.x;
                if (g55Var == null) {
                    js3.V("binding");
                    throw null;
                }
                g55Var.v.setText(view.getResources().getString(movieEmptyReviewData.a ? rs6.audio_review_empty_message : rs6.movie_review_empty_message));
                g55 g55Var2 = (g55) this.x;
                if (g55Var2 != null) {
                    g55Var2.w.setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 16:
                ProfileInfoData profileInfoData = (ProfileInfoData) myketRecyclerData;
                js3.p(profileInfoData, "data");
                AccountDto accountDto = profileInfoData.a;
                int dimensionPixelSize8 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
                view.setPaddingRelative(dimensionPixelSize8, view.getPaddingTop(), dimensionPixelSize8, view.getPaddingBottom());
                u63 u63Var = (u63) this.x;
                if (u63Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView10 = u63Var.v;
                js3.m(myketTextView10);
                MyketTextView.setExpandableText$default(myketTextView10, accountDto.getBio(), null, 3, true, profileInfoData.b, new hk3(27, profileInfoData), 2, null);
                String bio = accountDto.getBio();
                myketTextView10.setVisibility((bio == null || f88.n0(bio)) ? 8 : 0);
                ProfileTagDto tags = accountDto.getTags();
                u63 u63Var2 = (u63) this.x;
                if (u63Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                u63Var2.w.setTags(tags != null ? tags.getAge() : null, tags != null ? tags.getCity() : null, tags != null ? tags.getRegister() : null, tags != null ? tags.getGender() : null);
                u63 u63Var3 = (u63) this.x;
                if (u63Var3 != null) {
                    u63Var3.w.setTagSize(view.getResources().getDimension(pq6.font_size_medium));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 17:
                PlayAppBarData playAppBarData = (PlayAppBarData) myketRecyclerData;
                js3.p(playAppBarData, "playAppBarData");
                e73 e73Var = (e73) this.x;
                if (e73Var == null) {
                    js3.V("binding");
                    throw null;
                }
                AppIconView appIconView2 = e73Var.v;
                appIconView2.setErrorImageResId(yq6.icon);
                AppIconView.setImageUrl$default(appIconView2, playAppBarData.a, null, false, 6, null);
                e73 e73Var2 = (e73) this.x;
                if (e73Var2 != null) {
                    e73Var2.w.setText(playAppBarData.b);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 18:
                PlayDescriptionData playDescriptionData = (PlayDescriptionData) myketRecyclerData;
                js3.p(playDescriptionData, "data");
                js3.o(view, "itemView");
                String str4 = playDescriptionData.a;
                view.setVisibility((str4 == null || f88.n0(str4)) ? 8 : 0);
                b73 b73Var = (b73) this.x;
                if (b73Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView11 = b73Var.v;
                js3.m(myketTextView11);
                MyketTextView.setTextFromHtml$default(myketTextView11, playDescriptionData.a, 1, null, null, false, 28, null);
                myketTextView11.setGravity(playDescriptionData.b ? 5 : 3);
                return;
            case 19:
                QuestionData questionData = (QuestionData) myketRecyclerData;
                js3.p(questionData, "data");
                p73 p73Var = (p73) this.x;
                if (p73Var != null) {
                    p73Var.v.setText(questionData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 20:
                RestrictedApplicationData restrictedApplicationData = (RestrictedApplicationData) myketRecyclerData;
                js3.p(restrictedApplicationData, "data");
                RestrictedAppDTO restrictedAppDTO = restrictedApplicationData.a;
                view.setBackgroundColor(sj8.b().q);
                k77 k77Var = (k77) this.x;
                if (k77Var == null) {
                    js3.V("binding");
                    throw null;
                }
                AppIconView appIconView3 = k77Var.v;
                js3.o(appIconView3, "image");
                AppIconView.setImageUrl$default(appIconView3, restrictedAppDTO.getIconPath(), null, false, 6, null);
                k77 k77Var2 = (k77) this.x;
                if (k77Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                k77Var2.y.setText(restrictedAppDTO.getTitle());
                k77 k77Var3 = (k77) this.x;
                if (k77Var3 != null) {
                    k77Var3.x.setText(restrictedAppDTO.getText());
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 21:
                SelectCityHeaderData selectCityHeaderData = (SelectCityHeaderData) myketRecyclerData;
                js3.p(selectCityHeaderData, "data");
                s83 s83Var = (s83) this.x;
                if (s83Var != null) {
                    s83Var.v.setText(selectCityHeaderData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 22:
                StreamerHeaderData streamerHeaderData = (StreamerHeaderData) myketRecyclerData;
                js3.p(streamerHeaderData, "data");
                u68 u68Var = (u68) this.x;
                if (u68Var != null) {
                    u68Var.v.setText(streamerHeaderData.a);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 23:
                js3.p((StreamerMovieTitleData) myketRecyclerData, "data");
                s93 s93Var = (s93) this.x;
                if (s93Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView12 = s93Var.v;
                myketTextView12.setText(view.getResources().getString(rs6.streamer_movies_title));
                myketTextView12.setTextColor(sj8.b().m);
                return;
            case 24:
                js3.p((UpdateEmptyListData) myketRecyclerData, "data");
                gz8 gz8Var = (gz8) this.x;
                if (gz8Var == null) {
                    js3.V("binding");
                    throw null;
                }
                LottieAnimationView lottieAnimationView = gz8Var.v;
                js3.o(lottieAnimationView, "icon");
                ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.all_updates_done);
                return;
            case 25:
                VersionNoteHeaderData versionNoteHeaderData = (VersionNoteHeaderData) myketRecyclerData;
                js3.p(versionNoteHeaderData, "data");
                h63 h63Var = (h63) this.x;
                if (h63Var != null) {
                    h63Var.v.setText(view.getResources().getString(rs6.version_note_header, versionNoteHeaderData.a));
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            case 26:
                VersionNoteLastVersionData versionNoteLastVersionData = (VersionNoteLastVersionData) myketRecyclerData;
                js3.p(versionNoteLastVersionData, "data");
                view.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().p, PorterDuff.Mode.MULTIPLY));
                t33 t33Var = (t33) this.x;
                if (t33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                t33Var.w.setText(view.getResources().getString(rs6.version_last_note_header));
                t33 t33Var2 = (t33) this.x;
                if (t33Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                t33Var2.v.removeAllViews();
                for (String str5 : versionNoteLastVersionData.b) {
                    t33 t33Var3 = (t33) this.x;
                    if (t33Var3 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    LinearLayout linearLayout = t33Var3.v;
                    Resources resources = view.getResources();
                    js3.o(resources, "getResources(...)");
                    int i5 = yq6.ic_draw_check_mark;
                    try {
                        drawable = q39.a(resources, i5, null);
                        if (drawable == null) {
                            ThreadLocal threadLocal = b77.a;
                            drawable = resources.getDrawable(i5, null);
                            if (drawable == null) {
                                throw new Resources.NotFoundException();
                            }
                        }
                    } catch (Exception unused3) {
                        ThreadLocal threadLocal2 = b77.a;
                        drawable = resources.getDrawable(i5, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
                    Context context3 = view.getContext();
                    js3.o(context3, "getContext(...)");
                    MyketTextView myketTextView13 = new MyketTextView(context3, null);
                    myketTextView13.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                    myketTextView13.setTextColor(sj8.b().n);
                    myketTextView13.setTextSize(0, view.getResources().getDimension(pq6.font_size_medium));
                    myketTextView13.setCompoundDrawablePadding(view.getResources().getDimensionPixelSize(pq6.space_4));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(0, view.getResources().getDimensionPixelSize(pq6.space_12), 0, 0);
                    myketTextView13.setLayoutParams(layoutParams2);
                    myketTextView13.setText(str5);
                    linearLayout.addView(myketTextView13);
                }
                return;
            case 27:
                VersionRowData versionRowData = (VersionRowData) myketRecyclerData;
                js3.p(versionRowData, "data");
                Resources resources2 = view.getResources();
                js3.o(resources2, "getResources(...)");
                int i6 = yq6.ic_draw_check_mark;
                try {
                    drawable2 = q39.a(resources2, i6, null);
                    if (drawable2 == null) {
                        ThreadLocal threadLocal3 = b77.a;
                        drawable2 = resources2.getDrawable(i6, null);
                        if (drawable2 == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused4) {
                    ThreadLocal threadLocal4 = b77.a;
                    drawable2 = resources2.getDrawable(i6, null);
                    if (drawable2 == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                Drawable drawableMutate2 = drawable2.mutate();
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY));
                i63 i63Var = (i63) this.x;
                if (i63Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView14 = i63Var.v;
                myketTextView14.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableMutate2, (Drawable) null);
                myketTextView14.setText(versionRowData.a);
                return;
            case 28:
                js3.p((VerticalLineData) myketRecyclerData, "data");
                w49 w49Var = (w49) this.x;
                if (w49Var != null) {
                    w49Var.v.setBackgroundColor(sj8.b().v);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            default:
                WhatsNewData whatsNewData = (WhatsNewData) myketRecyclerData;
                js3.p(whatsNewData, "data");
                Boolean bool2 = whatsNewData.b;
                if (bool2 != null) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    oa3 oa3Var = (oa3) this.x;
                    if (oa3Var == null) {
                        js3.V("binding");
                        throw null;
                    }
                    oa3Var.v.v.setLayoutDirection(zBooleanValue2 ? 1 : 0);
                }
                oa3 oa3Var2 = (oa3) this.x;
                if (oa3Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                oa3Var2.v.w.setMarkdownText(whatsNewData.a);
                oa3 oa3Var3 = (oa3) this.x;
                if (oa3Var3 != null) {
                    oa3Var3.v.v.setText(rs6.whatsnew);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.w) {
            case 0:
                if (!(a79Var instanceof m5)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (m5) a79Var;
                }
                break;
            case 1:
                if (!(a79Var instanceof p5)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (p5) a79Var;
                }
                break;
            case 2:
                if (!(a79Var instanceof a13)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (a13) a79Var;
                }
                break;
            case 3:
                if (!(a79Var instanceof c23)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (c23) a79Var;
                }
                break;
            case 4:
                if (!(a79Var instanceof kl1)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (kl1) a79Var;
                }
                break;
            case 5:
                if (!(a79Var instanceof l23)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (l23) a79Var;
                }
                break;
            case 6:
                if (!(a79Var instanceof c12)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (c12) a79Var;
                }
                break;
            case 7:
                if (!(a79Var instanceof gl3)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (gl3) a79Var;
                }
                break;
            case 8:
                if (!(a79Var instanceof i33)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (i33) a79Var;
                }
                break;
            case 9:
                if (!(a79Var instanceof l33)) {
                    lw.g(null, "Incompatible view binding", null);
                } else {
                    this.x = (l33) a79Var;
                }
                break;
            case 10:
                if (!(a79Var instanceof mc4)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (mc4) a79Var;
                }
                break;
            case 11:
                if (!(a79Var instanceof f13)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (f13) a79Var;
                }
                break;
            case 12:
                if (!(a79Var instanceof j43)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (j43) a79Var;
                }
                break;
            case 13:
                if (!(a79Var instanceof q43)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (q43) a79Var;
                }
                break;
            case 14:
                if (!(a79Var instanceof l05)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (l05) a79Var;
                }
                break;
            case 15:
                if (!(a79Var instanceof g55)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (g55) a79Var;
                }
                break;
            case 16:
                if (!(a79Var instanceof u63)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (u63) a79Var;
                }
                break;
            case 17:
                if (!(a79Var instanceof e73)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (e73) a79Var;
                }
                break;
            case 18:
                if (!(a79Var instanceof b73)) {
                    lw.g(null, "binding is not incompatible", null);
                } else {
                    this.x = (b73) a79Var;
                }
                break;
            case 19:
                if (!(a79Var instanceof p73)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (p73) a79Var;
                }
                break;
            case 20:
                if (!(a79Var instanceof k77)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (k77) a79Var;
                }
                break;
            case 21:
                if (!(a79Var instanceof s83)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (s83) a79Var;
                }
                break;
            case 22:
                if (!(a79Var instanceof u68)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (u68) a79Var;
                }
                break;
            case 23:
                if (!(a79Var instanceof s93)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (s93) a79Var;
                }
                break;
            case 24:
                if (!(a79Var instanceof gz8)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (gz8) a79Var;
                }
                break;
            case 25:
                if (!(a79Var instanceof h63)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (h63) a79Var;
                }
                break;
            case 26:
                if (!(a79Var instanceof t33)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (t33) a79Var;
                }
                break;
            case 27:
                if (!(a79Var instanceof i63)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (i63) a79Var;
                }
                break;
            case 28:
                if (!(a79Var instanceof w49)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.x = (w49) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof oa3)) {
                    lw.g(null, "Binding is incompatible", null);
                } else {
                    this.x = (oa3) a79Var;
                }
                break;
        }
    }

    public void x(boolean z) {
        Drawable drawable;
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_arrow_down;
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
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        RotateDrawable rotateDrawable = new RotateDrawable();
        rotateDrawable.setFromDegrees(0.0f);
        rotateDrawable.setToDegrees(180.0f);
        rotateDrawable.setPivotX(0.5f);
        rotateDrawable.setPivotY(0.5f);
        rotateDrawable.setDrawable(drawableMutate);
        rotateDrawable.setLevel(z ? 10000 : 0);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.arrow_size);
        rotateDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        gl3 gl3Var = (gl3) this.x;
        if (gl3Var != null) {
            gl3Var.x.setCompoundDrawablesRelative(null, null, rotateDrawable, null);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(View view) {
        super(view);
        this.w = 16;
        w91 w91Var = (w91) qg5.r();
    }
}
