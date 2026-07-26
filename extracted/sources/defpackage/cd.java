package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ir.mservices.market.activity.CommentContentActivity;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionFragment;
import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.app.schedule.ui.dialog.ScheduleTimeBottomDialogFragment;
import ir.mservices.market.app.search.result.data.GoogleSearchConfigDto;
import ir.mservices.market.app.search.result.ui.AppSearchRecyclerListFragment;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.common.uploadImage.UploadImageViewModel;
import ir.mservices.market.common.uploadImage.data.UploadImageDto;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment;
import ir.mservices.market.feedback.FeedbackFragment;
import ir.mservices.market.feedback.FeedbackTransactionDialogFragment;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.social.list.common.ProfileSearchView;
import ir.mservices.market.social.profile.common.RelationView;
import ir.mservices.market.social.profile.data.Relation;
import ir.mservices.market.social.profile.own.OwnProfileFragment;
import ir.mservices.market.social.profile.user.recycler.a;
import ir.mservices.market.version2.fragments.BasePlayerVideoFragment;
import ir.mservices.market.version2.fragments.base.BaseDraggableFragment;
import ir.mservices.market.version2.fragments.dialog.AlertButtonComponentDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketVideoView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ws5 ws5VarC;
        ws5 ws5VarC2;
        UploadImageDto uploadImageDto;
        ws5 ws5VarC3;
        RecyclerView recyclerView;
        g adapter;
        int iK;
        ws5 ws5VarC4;
        int i = this.a;
        int iB = -1;
        fileName = null;
        String fileName = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                AlertButtonComponentDialogFragment alertButtonComponentDialogFragment = (AlertButtonComponentDialogFragment) obj;
                alertButtonComponentDialogFragment.getClass();
                alertButtonComponentDialogFragment.N0(DialogResult.a, new Bundle());
                return;
            case 1:
                int i2 = AppReviewsFragment.o1;
                FragmentActivity fragmentActivityF = ((AppReviewsFragment) obj).F();
                if (fragmentActivityF == null || (ws5VarC = fragmentActivityF.c()) == null) {
                    return;
                }
                ws5VarC.b();
                return;
            case 2:
                AppSearchRecyclerListFragment appSearchRecyclerListFragment = (AppSearchRecyclerListFragment) obj;
                int i3 = AppSearchRecyclerListFragment.e1;
                if (appSearchRecyclerListFragment.F() == null) {
                    return;
                }
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("search_google");
                clickEventBuilder.a();
                String string = appSearchRecyclerListFragment.p0().getString("BUNDLE_KEY_QUERY");
                if (string == null || f88.n0(string)) {
                    FragmentActivity fragmentActivityF2 = appSearchRecyclerListFragment.F();
                    hh2.H(new hh2(fragmentActivityF2, fragmentActivityF2 != null ? fragmentActivityF2.getString(rs6.search_fill_query) : null));
                    appSearchRecyclerListFragment.Y0();
                    return;
                }
                GoogleSearchConfigDto googleSearchConfigDto = (GoogleSearchConfigDto) appSearchRecyclerListFragment.U0().I.a.getValue();
                lw.c(string, null);
                if (appSearchRecyclerListFragment.Q() && !appSearchRecyclerListFragment.D) {
                    if (appSearchRecyclerListFragment.Y0 == null) {
                        js3.V("uiUtils");
                        throw null;
                    }
                    lw8.b(appSearchRecyclerListFragment.F());
                }
                pk5.g(appSearchRecyclerListFragment.J0, new NavIntentDirections.Suggest(new nb8(string, googleSearchConfigDto)), -1);
                rn6 rn6Var = appSearchRecyclerListFragment.Z0;
                if (rn6Var != null) {
                    ((ee) rn6Var.b).b("search_google_query", "query", string);
                    return;
                } else {
                    js3.V("searchAnalytics");
                    throw null;
                }
            case 3:
                ((BaseDraggableFragment) obj).A0(false, false);
                return;
            case 4:
                DoubleTapPlayerView doubleTapPlayerView = (DoubleTapPlayerView) obj;
                int i4 = BasePlayerVideoFragment.a1;
                PlayerControlView playerControlView = doubleTapPlayerView.l;
                PlayerControlView playerControlView2 = doubleTapPlayerView.l;
                if (playerControlView != null && playerControlView.j()) {
                    if (playerControlView2 != null) {
                        playerControlView2.g();
                        return;
                    }
                    return;
                } else {
                    boolean zG = doubleTapPlayerView.g();
                    if (doubleTapPlayerView.o()) {
                        playerControlView2.setShowTimeoutMs(zG ? 0 : doubleTapPlayerView.B);
                        playerControlView2.m();
                        return;
                    }
                    return;
                }
            case 5:
                int i5 = BasePlayerVideoFragment.a1;
                FragmentActivity fragmentActivityF3 = ((BasePlayerVideoFragment) obj).F();
                if (fragmentActivityF3 == null || (ws5VarC2 = fragmentActivityF3.c()) == null) {
                    return;
                }
                ws5VarC2.b();
                return;
            case 6:
                at0 at0Var = (at0) obj;
                EditText editText = at0Var.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                at0Var.p();
                return;
            case 7:
                int i6 = CommentContentActivity.y0;
                ((CommentContentActivity) obj).c().b();
                return;
            case 8:
                DetailToolbarView.t((DetailToolbarView) obj);
                return;
            case 9:
                ((mx1) obj).t();
                return;
            case 10:
                FastDownloadView fastDownloadView = (FastDownloadView) obj;
                s82 s82Var = fastDownloadView.k;
                if (s82Var != null) {
                    s82Var.n(fastDownloadView, (r82) fastDownloadView.p.getValue());
                    ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                    clickEventBuilder2.b("fast_download");
                    clickEventBuilder2.a();
                    return;
                }
                return;
            case 11:
                FeedbackFragment feedbackFragment = (FeedbackFragment) obj;
                int i7 = FeedbackFragment.r1;
                ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                actionBarEventBuilder.b("action_bar_feedback_send");
                actionBarEventBuilder.a();
                Object value = ((UploadImageViewModel) feedbackFragment.j1.getValue()).y.a.getValue();
                l99 l99Var = value instanceof l99 ? (l99) value : null;
                if (l99Var != null && (uploadImageDto = (UploadImageDto) l99Var.a) != null) {
                    fileName = uploadImageDto.getFileName();
                }
                feedbackFragment.R1().x(fileName);
                return;
            case 12:
                ((FeedbackTransactionDialogFragment) obj).R0(DialogResult.b, new Bundle());
                return;
            case 13:
                int i8 = MoreDescriptionFragment.l1;
                FragmentActivity fragmentActivityF4 = ((MoreDescriptionFragment) obj).F();
                if (fragmentActivityF4 == null || (ws5VarC3 = fragmentActivityF4.c()) == null) {
                    return;
                }
                ws5VarC3.b();
                return;
            case 14:
                int i9 = MovieDownloadRecyclerListFragment.l1;
                k68 k68Var = ((MovieDownloadRecyclerListFragment) obj).i1;
                if (k68Var != null) {
                    k68Var.t(k68.e);
                    return;
                } else {
                    js3.V("storageUtils");
                    throw null;
                }
            case 15:
                MyketRatingBar myketRatingBar = (MyketRatingBar) obj;
                ArrayList arrayList = myketRatingBar.a;
                js3.p(arrayList, "<this>");
                int iIndexOf = arrayList.indexOf(view) + 1;
                myketRatingBar.setRating(iIndexOf);
                myketRatingBar.c.invoke(Integer.valueOf(iIndexOf));
                return;
            case 16:
                MyketVideoView myketVideoView = (MyketVideoView) obj;
                kg5 kg5Var = myketVideoView.o;
                if (kg5Var == null) {
                    js3.V("binding");
                    throw null;
                }
                PlayerControlView playerControlView3 = kg5Var.z.l;
                if (playerControlView3 != null && playerControlView3.j()) {
                    kg5 kg5Var2 = myketVideoView.o;
                    if (kg5Var2 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    PlayerControlView playerControlView4 = kg5Var2.z.l;
                    if (playerControlView4 != null) {
                        playerControlView4.g();
                        return;
                    }
                    return;
                }
                kg5 kg5Var3 = myketVideoView.o;
                if (kg5Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                PlayerView playerView = kg5Var3.z;
                boolean zG2 = playerView.g();
                PlayerControlView playerControlView5 = playerView.l;
                if (playerView.o()) {
                    playerControlView5.setShowTimeoutMs(zG2 ? 0 : playerView.B);
                    playerControlView5.m();
                    return;
                }
                return;
            case 17:
                OwnProfileFragment ownProfileFragment = (OwnProfileFragment) obj;
                int i10 = OwnProfileFragment.d1;
                FragmentActivity fragmentActivityF5 = ownProfileFragment.F();
                if (fragmentActivityF5 != null) {
                    Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                    PackageManager packageManager = fragmentActivityF5.getPackageManager();
                    if ((packageManager != null ? intent.resolveActivity(packageManager) : null) != null) {
                        fragmentActivityF5.startActivity(intent);
                        return;
                    }
                    int i11 = OwnProfileFragment.d1;
                    FragmentActivity fragmentActivityF6 = ownProfileFragment.F();
                    hh2.H(new hh2(fragmentActivityF6, fragmentActivityF6 != null ? fragmentActivityF6.getString(rs6.uncatchable_intent) : null));
                    return;
                }
                return;
            case 18:
                int i12 = PagingRecyclerListContentFragment.e1;
                FragmentActivity fragmentActivityF7 = ((PagingRecyclerListContentFragment) obj).F();
                if (fragmentActivityF7 != null) {
                    Intent intent2 = new Intent("android.settings.WIRELESS_SETTINGS");
                    PackageManager packageManager2 = fragmentActivityF7.getPackageManager();
                    if ((packageManager2 != null ? intent2.resolveActivity(packageManager2) : null) != null) {
                        fragmentActivityF7.startActivity(intent2);
                        return;
                    } else {
                        int i13 = PagingRecyclerListContentFragment.e1;
                        hh2.H(new hh2(fragmentActivityF7, fragmentActivityF7.getString(rs6.uncatchable_intent)));
                        return;
                    }
                }
                return;
            case 19:
                int i14 = PagingRecyclerListFragment.U0;
                FragmentActivity fragmentActivityF8 = ((PagingRecyclerListFragment) obj).F();
                if (fragmentActivityF8 != null) {
                    Intent intent3 = new Intent("android.settings.WIRELESS_SETTINGS");
                    PackageManager packageManager3 = fragmentActivityF8.getPackageManager();
                    if ((packageManager3 != null ? intent3.resolveActivity(packageManager3) : null) != null) {
                        fragmentActivityF8.startActivity(intent3);
                        return;
                    } else {
                        int i15 = PagingRecyclerListFragment.U0;
                        hh2.H(new hh2(fragmentActivityF8, fragmentActivityF8.getString(rs6.uncatchable_intent)));
                        return;
                    }
                }
                return;
            case 20:
                r26 r26Var = (r26) obj;
                EditText editText2 = r26Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = r26Var.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    r26Var.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    r26Var.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    r26Var.f.setSelection(selectionEnd);
                }
                r26Var.p();
                return;
            case 21:
                ((PlayerControlView) obj).p(!r7.N0);
                return;
            case 22:
                PlayerControlView playerControlView6 = ((bd6) obj).g;
                gb6 gb6Var = playerControlView6.M0;
                if (gb6Var == null || !gb6Var.f0(29)) {
                    return;
                }
                hp8 hp8VarV = playerControlView6.M0.V();
                gb6 gb6Var2 = playerControlView6.M0;
                String str = j29.a;
                gb6Var2.w(hp8VarV.a().d(1).m(1, false).b());
                playerControlView6.l.e[1] = playerControlView6.getResources().getString(bt6.exo_track_selection_auto);
                playerControlView6.q.dismiss();
                return;
            case 23:
                hd6 hd6Var = (hd6) obj;
                PlayerControlView playerControlView7 = hd6Var.x;
                if (hd6Var.s != null && (recyclerView = hd6Var.r) != null && (adapter = recyclerView.getAdapter()) != null && (iK = hd6Var.r.K(hd6Var)) != -1) {
                    iB = adapter.b(hd6Var.s, hd6Var, iK);
                }
                View view2 = playerControlView7.F;
                if (iB == 0) {
                    fd6 fd6Var = playerControlView7.m;
                    view2.getClass();
                    playerControlView7.e(fd6Var, view2);
                    return;
                } else {
                    if (iB != 1) {
                        playerControlView7.q.dismiss();
                        return;
                    }
                    bd6 bd6Var = playerControlView7.o;
                    view2.getClass();
                    playerControlView7.e(bd6Var, view2);
                    return;
                }
            case 24:
                PlayerControlView playerControlView8 = ((bd6) obj).g;
                gb6 gb6Var3 = playerControlView8.M0;
                if (gb6Var3 == null || !gb6Var3.f0(29)) {
                    return;
                }
                playerControlView8.M0.w(playerControlView8.M0.V().a().d(3).g().j(null).l().b());
                playerControlView8.q.dismiss();
                return;
            case 25:
                qd6 qd6Var = (qd6) obj;
                qd6Var.g();
                if (view.getId() == ir6.exo_overflow_show) {
                    qd6Var.q.start();
                    return;
                } else {
                    if (view.getId() == ir6.exo_overflow_hide) {
                        qd6Var.r.start();
                        return;
                    }
                    return;
                }
            case 26:
                ProfileSearchView profileSearchView = (ProfileSearchView) obj;
                profileSearchView.s.x.setText("");
                View.OnClickListener onClickListener = profileSearchView.t;
                if (onClickListener != null) {
                    onClickListener.onClick(profileSearchView.s.x);
                    return;
                }
                return;
            case 27:
                int i16 = ReelsFragment.i1;
                FragmentActivity fragmentActivityF9 = ((ReelsFragment) obj).F();
                if (fragmentActivityF9 == null || (ws5VarC4 = fragmentActivityF9.c()) == null) {
                    return;
                }
                ws5VarC4.b();
                return;
            case 28:
                RelationView relationView = (RelationView) obj;
                int i17 = RelationView.h;
                c5 accountManager = relationView.getAccountManager();
                sl6 sl6Var = relationView.g;
                if (!accountManager.d()) {
                    qt5 qt5Var = relationView.f;
                    if (qt5Var != null) {
                        js3.m(view);
                        a aVar = (a) ((ck4) qt5Var).b;
                        aVar.x.m(view, aVar, b37.a);
                        return;
                    }
                    return;
                }
                Relation relation = relationView.d;
                if (relation == Relation.FOLLOW) {
                    SmallFillOvalButton smallFillOvalButton = sl6Var.v;
                    js3.o(smallFillOvalButton, "highState");
                    smallFillOvalButton.setVisibility(8);
                    SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = sl6Var.w;
                    js3.m(smallEmptyMediumTextOvalButton);
                    smallEmptyMediumTextOvalButton.setVisibility(0);
                    smallEmptyMediumTextOvalButton.setState(MyketProgressState.c);
                    qt5 qt5Var2 = relationView.f;
                    if (qt5Var2 != null) {
                        js3.m(view);
                        d37 d37Var = new d37(relationView.e);
                        a aVar2 = (a) ((ck4) qt5Var2).b;
                        aVar2.x.m(view, aVar2, d37Var);
                        return;
                    }
                    return;
                }
                if (relation == Relation.NONE) {
                    SmallFillOvalButton smallFillOvalButton2 = sl6Var.v;
                    js3.o(smallFillOvalButton2, "highState");
                    smallFillOvalButton2.setVisibility(8);
                    SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton2 = sl6Var.w;
                    js3.m(smallEmptyMediumTextOvalButton2);
                    smallEmptyMediumTextOvalButton2.setVisibility(0);
                    smallEmptyMediumTextOvalButton2.setState(MyketProgressState.c);
                    if (!relationView.getAccountManager().f()) {
                        qt5 qt5Var3 = relationView.f;
                        if (qt5Var3 != null) {
                            js3.m(view);
                            a aVar3 = (a) ((ck4) qt5Var3).b;
                            aVar3.x.m(view, aVar3, c37.a);
                            return;
                        }
                        return;
                    }
                    qt5 qt5Var4 = relationView.f;
                    if (qt5Var4 != null) {
                        js3.m(view);
                        a37 a37Var = new a37(relationView.e);
                        a aVar4 = (a) ((ck4) qt5Var4).b;
                        aVar4.x.m(view, aVar4, a37Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                ScheduleTimeBottomDialogFragment scheduleTimeBottomDialogFragment = (ScheduleTimeBottomDialogFragment) obj;
                Bundle bundle = new Bundle();
                bundle.putInt("schedulePickedTime", scheduleTimeBottomDialogFragment.V0().v.getValue());
                scheduleTimeBottomDialogFragment.R0(DialogResult.a, bundle);
                return;
        }
    }
}
