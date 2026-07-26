package defpackage;

import android.os.Bundle;
import androidx.fragment.app.d;
import ir.mservices.market.app.recommended.ui.RecommendedRecyclerListFragment;
import ir.mservices.market.app.schedule.ui.dialog.ScheduleTimeBottomDialogFragment;
import ir.mservices.market.app.schedule.ui.dialog.ScheduleTypeBottomDialogFragment;
import ir.mservices.market.app.suggest.search.ui.SuggestListFragment;
import ir.mservices.market.app.survey.SurveyFragment;
import ir.mservices.market.app.update.RootUpdateFragment;
import ir.mservices.market.app.url.UrlRecyclerListFragment;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment;
import ir.mservices.market.login.ui.UnbindAllLoginDialogFragment;
import ir.mservices.market.movie.streamers.StreamerProfileFragment;
import ir.mservices.market.movie.ui.detail.restriction.RestrictionDialogFragment;
import ir.mservices.market.movie.ui.search.SearchContentFragment;
import ir.mservices.market.movie.ui.search.SearchMovieFragment;
import ir.mservices.market.myAccount.city.SelectCityFragment;
import ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment;
import ir.mservices.market.pika.send.SendAppDetailFragment;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.search.result.SearchResultFragment;
import ir.mservices.market.social.profile.user.UserProfileFragment;
import ir.mservices.market.social.requests.RequestListFragment;
import ir.mservices.market.social.users.list.UserListRecyclerListFragment;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.SingleChoiceDialogFragment;
import ir.mservices.market.version2.fragments.dialog.TrackingAppPaymentBottomDialogFragment;
import ir.mservices.market.versionNote.ui.VersionNoteDialogFragment;
import ir.myket.callback.manager.a;

/* JADX INFO: loaded from: classes3.dex */
public final class yw6 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ yw6(int i, d dVar) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = (RecentDownloadBottomDialogFragment) this.b;
                Bundle bundle = recentDownloadBottomDialogFragment.g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + recentDownloadBottomDialogFragment + " has null arguments");
            case 1:
                RecommendedRecyclerListFragment recommendedRecyclerListFragment = (RecommendedRecyclerListFragment) this.b;
                Bundle bundle2 = recommendedRecyclerListFragment.g;
                if (bundle2 != null) {
                    return bundle2;
                }
                throw new IllegalStateException("Fragment " + recommendedRecyclerListFragment + " has null arguments");
            case 2:
                return at2.c0((ReelsFragment) this.b).b(g27.a(a.class), null, null);
            case 3:
                ReportDialogFragment reportDialogFragment = (ReportDialogFragment) this.b;
                Bundle bundle3 = reportDialogFragment.g;
                if (bundle3 != null) {
                    return bundle3;
                }
                throw new IllegalStateException("Fragment " + reportDialogFragment + " has null arguments");
            case 4:
                RequestListFragment requestListFragment = (RequestListFragment) this.b;
                Bundle bundle4 = requestListFragment.g;
                if (bundle4 != null) {
                    return bundle4;
                }
                throw new IllegalStateException("Fragment " + requestListFragment + " has null arguments");
            case 5:
                RestrictionDialogFragment restrictionDialogFragment = (RestrictionDialogFragment) this.b;
                Bundle bundle5 = restrictionDialogFragment.g;
                if (bundle5 != null) {
                    return bundle5;
                }
                throw new IllegalStateException("Fragment " + restrictionDialogFragment + " has null arguments");
            case 6:
                RootUpdateFragment rootUpdateFragment = (RootUpdateFragment) this.b;
                Bundle bundle6 = rootUpdateFragment.g;
                if (bundle6 != null) {
                    return bundle6;
                }
                throw new IllegalStateException("Fragment " + rootUpdateFragment + " has null arguments");
            case 7:
                ScheduleTimeBottomDialogFragment scheduleTimeBottomDialogFragment = (ScheduleTimeBottomDialogFragment) this.b;
                Bundle bundle7 = scheduleTimeBottomDialogFragment.g;
                if (bundle7 != null) {
                    return bundle7;
                }
                throw new IllegalStateException("Fragment " + scheduleTimeBottomDialogFragment + " has null arguments");
            case 8:
                ScheduleTypeBottomDialogFragment scheduleTypeBottomDialogFragment = (ScheduleTypeBottomDialogFragment) this.b;
                Bundle bundle8 = scheduleTypeBottomDialogFragment.g;
                if (bundle8 != null) {
                    return bundle8;
                }
                throw new IllegalStateException("Fragment " + scheduleTypeBottomDialogFragment + " has null arguments");
            case 9:
                SearchContentFragment searchContentFragment = (SearchContentFragment) this.b;
                Bundle bundle9 = searchContentFragment.g;
                if (bundle9 != null) {
                    return bundle9;
                }
                throw new IllegalStateException("Fragment " + searchContentFragment + " has null arguments");
            case 10:
                ir.mservices.market.social.search.SearchContentFragment searchContentFragment2 = (ir.mservices.market.social.search.SearchContentFragment) this.b;
                Bundle bundle10 = searchContentFragment2.g;
                if (bundle10 != null) {
                    return bundle10;
                }
                throw new IllegalStateException("Fragment " + searchContentFragment2 + " has null arguments");
            case 11:
                ir.mservices.market.app.search.SearchContentFragment searchContentFragment3 = (ir.mservices.market.app.search.SearchContentFragment) this.b;
                Bundle bundle11 = searchContentFragment3.g;
                if (bundle11 != null) {
                    return bundle11;
                }
                throw new IllegalStateException("Fragment " + searchContentFragment3 + " has null arguments");
            case 12:
                SearchMovieFragment searchMovieFragment = (SearchMovieFragment) this.b;
                Bundle bundle12 = searchMovieFragment.g;
                if (bundle12 != null) {
                    return bundle12;
                }
                throw new IllegalStateException("Fragment " + searchMovieFragment + " has null arguments");
            case 13:
                SearchResultFragment searchResultFragment = (SearchResultFragment) this.b;
                Bundle bundle13 = searchResultFragment.g;
                if (bundle13 != null) {
                    return bundle13;
                }
                throw new IllegalStateException("Fragment " + searchResultFragment + " has null arguments");
            case 14:
                SelectCityFragment selectCityFragment = (SelectCityFragment) this.b;
                Bundle bundle14 = selectCityFragment.g;
                if (bundle14 != null) {
                    return bundle14;
                }
                throw new IllegalStateException("Fragment " + selectCityFragment + " has null arguments");
            case 15:
                SendAppDetailFragment sendAppDetailFragment = (SendAppDetailFragment) this.b;
                Bundle bundle15 = sendAppDetailFragment.g;
                if (bundle15 != null) {
                    return bundle15;
                }
                throw new IllegalStateException("Fragment " + sendAppDetailFragment + " has null arguments");
            case 16:
                SendReplyBottomDialogFragment sendReplyBottomDialogFragment = (SendReplyBottomDialogFragment) this.b;
                Bundle bundle16 = sendReplyBottomDialogFragment.g;
                if (bundle16 != null) {
                    return bundle16;
                }
                throw new IllegalStateException("Fragment " + sendReplyBottomDialogFragment + " has null arguments");
            case 17:
                SingleChoiceDialogFragment singleChoiceDialogFragment = (SingleChoiceDialogFragment) this.b;
                Bundle bundle17 = singleChoiceDialogFragment.g;
                if (bundle17 != null) {
                    return bundle17;
                }
                throw new IllegalStateException("Fragment " + singleChoiceDialogFragment + " has null arguments");
            case 18:
                StreamerProfileFragment streamerProfileFragment = (StreamerProfileFragment) this.b;
                Bundle bundle18 = streamerProfileFragment.g;
                if (bundle18 != null) {
                    return bundle18;
                }
                throw new IllegalStateException("Fragment " + streamerProfileFragment + " has null arguments");
            case 19:
                SubmitCommentFragment submitCommentFragment = (SubmitCommentFragment) this.b;
                Bundle bundle19 = submitCommentFragment.g;
                if (bundle19 != null) {
                    return bundle19;
                }
                throw new IllegalStateException("Fragment " + submitCommentFragment + " has null arguments");
            case 20:
                SuggestListFragment suggestListFragment = (SuggestListFragment) this.b;
                Bundle bundle20 = suggestListFragment.g;
                if (bundle20 != null) {
                    return bundle20;
                }
                throw new IllegalStateException("Fragment " + suggestListFragment + " has null arguments");
            case 21:
                SurveyFragment surveyFragment = (SurveyFragment) this.b;
                Bundle bundle21 = surveyFragment.g;
                if (bundle21 != null) {
                    return bundle21;
                }
                throw new IllegalStateException("Fragment " + surveyFragment + " has null arguments");
            case 22:
                TogoFragment togoFragment = (TogoFragment) this.b;
                Bundle bundle22 = togoFragment.g;
                if (bundle22 != null) {
                    return bundle22;
                }
                throw new IllegalStateException("Fragment " + togoFragment + " has null arguments");
            case 23:
                TrackingAppPaymentBottomDialogFragment trackingAppPaymentBottomDialogFragment = (TrackingAppPaymentBottomDialogFragment) this.b;
                Bundle bundle23 = trackingAppPaymentBottomDialogFragment.g;
                if (bundle23 != null) {
                    return bundle23;
                }
                throw new IllegalStateException("Fragment " + trackingAppPaymentBottomDialogFragment + " has null arguments");
            case 24:
                UnbindAllLoginDialogFragment unbindAllLoginDialogFragment = (UnbindAllLoginDialogFragment) this.b;
                Bundle bundle24 = unbindAllLoginDialogFragment.g;
                if (bundle24 != null) {
                    return bundle24;
                }
                throw new IllegalStateException("Fragment " + unbindAllLoginDialogFragment + " has null arguments");
            case 25:
                UrlRecyclerListFragment urlRecyclerListFragment = (UrlRecyclerListFragment) this.b;
                Bundle bundle25 = urlRecyclerListFragment.g;
                if (bundle25 != null) {
                    return bundle25;
                }
                throw new IllegalStateException("Fragment " + urlRecyclerListFragment + " has null arguments");
            case 26:
                UserListRecyclerListFragment userListRecyclerListFragment = (UserListRecyclerListFragment) this.b;
                Bundle bundle26 = userListRecyclerListFragment.g;
                if (bundle26 != null) {
                    return bundle26;
                }
                throw new IllegalStateException("Fragment " + userListRecyclerListFragment + " has null arguments");
            case 27:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.b;
                Bundle bundle27 = userProfileFragment.g;
                if (bundle27 != null) {
                    return bundle27;
                }
                throw new IllegalStateException("Fragment " + userProfileFragment + " has null arguments");
            case 28:
                UsernameBottomDialogFragment usernameBottomDialogFragment = (UsernameBottomDialogFragment) this.b;
                Bundle bundle28 = usernameBottomDialogFragment.g;
                if (bundle28 != null) {
                    return bundle28;
                }
                throw new IllegalStateException("Fragment " + usernameBottomDialogFragment + " has null arguments");
            default:
                VersionNoteDialogFragment versionNoteDialogFragment = (VersionNoteDialogFragment) this.b;
                Bundle bundle29 = versionNoteDialogFragment.g;
                if (bundle29 != null) {
                    return bundle29;
                }
                throw new IllegalStateException("Fragment " + versionNoteDialogFragment + " has null arguments");
        }
    }
}
