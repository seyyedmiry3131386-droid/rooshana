package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment;
import ir.mservices.market.movie.ui.detail.review.ReviewAction;
import ir.mservices.market.movie.ui.detail.review.data.LikeOrDislikeData;
import ir.mservices.market.movie.ui.detail.review.data.OpenReportReviewData;
import ir.mservices.market.movie.ui.detail.review.data.SubmitMovieReviewData;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.version2.fragments.content.UserManagerFragment;
import kotlin.Pair;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pk5 {
    public static final void a(am2 am2Var) {
        d dVarB = b(am2Var);
        if (dVarB == null || !(dVarB instanceof BaseContentFragment)) {
            return;
        }
        ((BaseContentFragment) dVarB).e1();
        if (am2Var != null) {
            am2Var.q();
        }
    }

    public static final d b(am2 am2Var) {
        d dVarS;
        if (am2Var == null || (dVarS = am2Var.s()) == null) {
            return null;
        }
        if (!(dVarS instanceof BaseContentFragment)) {
            dVarS = null;
        }
        if (dVarS != null) {
            return dVarS;
        }
        lw.g(null, "Active fragment is not instance of BaseContentFragment", null);
        return null;
    }

    public static final void c(FragmentActivity fragmentActivity, CommentScenario commentScenario) {
        if (fragmentActivity == null) {
            return;
        }
        d dVarG = fragmentActivity.L().G("COMMENT_FLOW_FRAGMENT");
        if (!(dVarG instanceof CommentFlowFragment)) {
            dVarG = null;
        }
        if (dVarG != null) {
            wl2 wl2VarL = fragmentActivity.L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.j(dVarG);
            p40Var.g();
        }
        CommentFlowFragment commentFlowFragment = new CommentFlowFragment();
        commentFlowFragment.u0(is3.g(new Pair("comment_scenario", commentScenario)));
        wl2 wl2VarL2 = fragmentActivity.L();
        try {
            wl2VarL2.getClass();
            p40 p40Var2 = new p40(wl2VarL2);
            p40Var2.h(0, commentFlowFragment, "COMMENT_FLOW_FRAGMENT", 1);
            p40Var2.g();
        } catch (Throwable th) {
            b.a(th);
        }
        commentFlowFragment.J0();
    }

    public static final void d(FragmentActivity fragmentActivity, y80 y80Var) {
        if (fragmentActivity == null) {
            return;
        }
        d dVarG = fragmentActivity.L().G("MovieCommentFlowFragment");
        if (!(dVarG instanceof MovieCommentFlowFragment)) {
            dVarG = null;
        }
        if (dVarG != null) {
            wl2 wl2VarL = fragmentActivity.L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.j(dVarG);
            p40Var.g();
        }
        MovieCommentFlowFragment movieCommentFlowFragment = new MovieCommentFlowFragment();
        wl2 wl2VarL2 = fragmentActivity.L();
        try {
            wl2VarL2.getClass();
            p40 p40Var2 = new p40(wl2VarL2);
            p40Var2.h(0, movieCommentFlowFragment, "MovieCommentFlowFragment", 1);
            p40Var2.g();
        } catch (Throwable th) {
            b.a(th);
        }
        am2 am2Var = movieCommentFlowFragment.J0;
        if (am2Var != null) {
            am2Var.d(movieCommentFlowFragment.E0(), movieCommentFlowFragment);
        }
        if (y80Var instanceof SubmitMovieReviewData) {
            movieCommentFlowFragment.F0().r(new ReviewAction.SubmitMovieReviewAction((SubmitMovieReviewData) y80Var, "DIALOG_KEY_LOGIN_REVIEW"));
        } else if (y80Var instanceof LikeOrDislikeData) {
            movieCommentFlowFragment.F0().r(new ReviewAction.SendLikeOrDislikeAction((LikeOrDislikeData) y80Var, "DIALOG_KEY_LOGIN_LIKE"));
        } else if (y80Var instanceof OpenReportReviewData) {
            movieCommentFlowFragment.F0().r(new ReviewAction.OpenReportReviewAction((OpenReportReviewData) y80Var, "DIALOG_KEY_LOGIN_REPORT"));
        }
    }

    public static final void e(FragmentActivity fragmentActivity, String str, String str2, UserProfileRefId userProfileRefId) {
        js3.p(userProfileRefId, "refId");
        if (fragmentActivity == null || str == null || str.length() == 0) {
            return;
        }
        d dVarG = fragmentActivity.L().G("USER_MANAGER");
        UserManagerFragment userManagerFragment = dVarG instanceof UserManagerFragment ? (UserManagerFragment) dVarG : null;
        if (userManagerFragment == null) {
            int i = UserManagerFragment.P0;
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_OPEN_STATE", "");
            UserManagerFragment userManagerFragment2 = new UserManagerFragment();
            userManagerFragment2.u0(bundle);
            userManagerFragment = userManagerFragment2;
        }
        wl2 wl2VarL = fragmentActivity.L();
        try {
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.h(0, userManagerFragment, "USER_MANAGER", 1);
            p40Var.e();
            wl2VarL.B(true);
            wl2VarL.H();
        } catch (Throwable th) {
            b.a(th);
        }
        userManagerFragment.H0(str, str2, userProfileRefId);
    }

    public static void f(am2 am2Var, NavIntentDirections.AppDetail appDetail) {
        if (am2Var == null) {
            return;
        }
        g(am2Var, appDetail, -1);
    }

    public static final void g(am2 am2Var, yi5 yi5Var, int i) {
        js3.p(yi5Var, "directions");
        if (am2Var == null) {
            return;
        }
        if (i != -1) {
            dw1.C(am2Var, yi5Var, Integer.valueOf(i), 2);
        } else {
            dw1.C(am2Var, yi5Var, null, 6);
        }
    }

    public static final void h(am2 am2Var, NavIntentDirections navIntentDirections) {
        js3.p(navIntentDirections, "directions");
        g(am2Var, navIntentDirections, -1);
    }
}
