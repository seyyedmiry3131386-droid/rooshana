package ir.mservices.market.data;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.a05;
import defpackage.a65;
import defpackage.a75;
import defpackage.a86;
import defpackage.al1;
import defpackage.ao7;
import defpackage.bd;
import defpackage.bt1;
import defpackage.bv1;
import defpackage.c29;
import defpackage.c74;
import defpackage.d11;
import defpackage.da7;
import defpackage.dd;
import defpackage.dw4;
import defpackage.dw5;
import defpackage.e56;
import defpackage.em;
import defpackage.em6;
import defpackage.em7;
import defpackage.eq0;
import defpackage.f86;
import defpackage.fp6;
import defpackage.fw5;
import defpackage.g19;
import defpackage.g54;
import defpackage.ga2;
import defpackage.h78;
import defpackage.hp;
import defpackage.hq;
import defpackage.ht;
import defpackage.hz3;
import defpackage.ij7;
import defpackage.iq;
import defpackage.j17;
import defpackage.j4;
import defpackage.ja;
import defpackage.js3;
import defpackage.jy6;
import defpackage.k86;
import defpackage.kk3;
import defpackage.kl6;
import defpackage.kx8;
import defpackage.la6;
import defpackage.lj5;
import defpackage.lk3;
import defpackage.lp8;
import defpackage.m09;
import defpackage.m46;
import defpackage.m49;
import defpackage.mj2;
import defpackage.ml1;
import defpackage.mw6;
import defpackage.n76;
import defpackage.nb8;
import defpackage.nw5;
import defpackage.nx7;
import defpackage.o15;
import defpackage.o19;
import defpackage.o45;
import defpackage.o57;
import defpackage.od;
import defpackage.od0;
import defpackage.ow5;
import defpackage.oy5;
import defpackage.p4;
import defpackage.p76;
import defpackage.pe7;
import defpackage.pl6;
import defpackage.pq;
import defpackage.ql5;
import defpackage.qq;
import defpackage.r92;
import defpackage.rr1;
import defpackage.rr6;
import defpackage.s37;
import defpackage.sb0;
import defpackage.sc8;
import defpackage.sq;
import defpackage.su;
import defpackage.t09;
import defpackage.t71;
import defpackage.td9;
import defpackage.tk6;
import defpackage.tn5;
import defpackage.tn7;
import defpackage.tq;
import defpackage.tx4;
import defpackage.uc5;
import defpackage.us;
import defpackage.v15;
import defpackage.v86;
import defpackage.ve7;
import defpackage.w68;
import defpackage.w77;
import defpackage.wd4;
import defpackage.wh7;
import defpackage.wi7;
import defpackage.wp3;
import defpackage.xb0;
import defpackage.xh7;
import defpackage.xm8;
import defpackage.xq1;
import defpackage.xz4;
import defpackage.y76;
import defpackage.yd1;
import defpackage.yd5;
import defpackage.yf5;
import defpackage.yg5;
import defpackage.yh7;
import defpackage.yi2;
import defpackage.yi5;
import defpackage.yk3;
import defpackage.yk6;
import defpackage.yr;
import defpackage.yw7;
import defpackage.zc9;
import defpackage.zw6;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.app.search.result.data.GoogleSearchConfigDto;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import ir.mservices.market.appDetail.MovieToolbarData;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.feedback.data.TransactionData;
import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import ir.mservices.market.movie.data.webapi.SubscriptionInfo;
import ir.mservices.market.movie.uri.downloadInfo.data.DownloadInfoResponse;
import ir.mservices.market.pika.connect.ConnectionType;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.social.welcome.data.Step;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.PermissionDialogFragment;
import ir.mservices.market.version2.fragments.dialog.UrlDataModel;
import ir.mservices.market.version2.fragments.dialog.c;
import ir.mservices.market.version2.fragments.dialog.f;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavIntentDirections implements yi5 {
    public static final Companion Companion = new Companion(null);
    private static final lj5 defaultTransitions = new lj5(false, false, -1, false, false, fp6.enter_page_forward, fp6.exit_page_forward, fp6.enter_page_backward, fp6.exit_page_backward);
    private final int actionId;
    private final Bundle arguments;
    private final int destinationId;
    private final lj5 navOptions;

    public static final class AdGuard extends NavIntentDirections {
        private final ja args;

        public AdGuard(ja jaVar) {
            js3.p(jaVar, "args");
            int i = rr6.adGuard;
            int i2 = rr6.toAdGuard;
            Bundle bundle = new Bundle();
            bundle.putBoolean("stopVpn", jaVar.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = jaVar;
        }

        public final ja getArgs() {
            return this.args;
        }
    }

    public static final class AlertBottom extends NavDialogDirections {
        private final bd args;

        public AlertBottom(bd bdVar) {
            js3.p(bdVar, "args");
            int i = rr6.alertDialog;
            int i2 = rr6.toAlertDialog;
            Parcelable parcelable = bdVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", bdVar.b);
            bundle.putString("message", bdVar.c);
            bundle.putString("commitTextButton", bdVar.d);
            bundle.putString("cancelTextButton", bdVar.e);
            bundle.putBoolean("isDismissOnAction", bdVar.f);
            super(i, i2, bundle, null, 8, null);
            this.args = bdVar;
        }

        public final bd getArgs() {
            return this.args;
        }
    }

    public static final class AlertButtonComponent extends NavDialogDirections {
        private final dd args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertButtonComponent(dd ddVar) {
            super(rr6.alertButtonComponentDialog, rr6.toAlertButtonComponentDialog, ddVar.a(), null, 8, null);
            js3.p(ddVar, "args");
            this.args = ddVar;
        }

        public final dd getArgs() {
            return this.args;
        }
    }

    public static final class AlertCenter extends NavDialogDirections {
        private final od args;

        public AlertCenter(od odVar) {
            js3.p(odVar, "args");
            int i = rr6.alertCenterDialog;
            int i2 = rr6.toAlertCenterDialog;
            Parcelable parcelable = odVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", odVar.b);
            bundle.putString("message", odVar.c);
            bundle.putString("textButton", odVar.d);
            bundle.putInt("policy", odVar.e);
            super(i, i2, bundle, null, 8, null);
            this.args = odVar;
        }

        public final od getArgs() {
            return this.args;
        }
    }

    public static final class AllSubReviews extends NavIntentDirections {
        private final ht args;

        public AllSubReviews(ht htVar) {
            js3.p(htVar, "args");
            int i = rr6.allSubReviews;
            int i2 = rr6.toAllSubReviews;
            Serializable serializable = htVar.c;
            Serializable serializable2 = htVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", htVar.a);
            if (Parcelable.class.isAssignableFrom(ReviewDto.class)) {
                bundle.putParcelable(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(ReviewDto.class)) {
                    throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, serializable2);
            }
            if (Parcelable.class.isAssignableFrom(ToolbarData.class)) {
                bundle.putParcelable("application", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ToolbarData.class)) {
                    throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("application", serializable);
            }
            bundle.putString("launchSource", htVar.d);
            bundle.putString("detailSubscriberId", htVar.e);
            bundle.putString("reviewId", htVar.f);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = htVar;
        }

        public final ht getArgs() {
            return this.args;
        }
    }

    public static final class AppAddProfileList extends NavIntentDirections {
        private final em args;

        public AppAddProfileList(em emVar) {
            js3.p(emVar, "args");
            int i = rr6.AppAddProfileList;
            int i2 = rr6.toAppAddProfileList;
            Parcelable parcelable = emVar.d;
            Serializable serializable = emVar.c;
            Serializable serializable2 = emVar.b;
            Bundle bundle = new Bundle();
            bundle.putString("title", emVar.a);
            if (Parcelable.class.isAssignableFrom(SocialListPolicies.class)) {
                js3.n(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("policies", (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(SocialListPolicies.class)) {
                    throw new UnsupportedOperationException(SocialListPolicies.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("policies", serializable2);
            }
            if (Parcelable.class.isAssignableFrom(ProfileApplicationListDto.class)) {
                bundle.putParcelable("appList", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ProfileApplicationListDto.class)) {
                    throw new UnsupportedOperationException(ProfileApplicationListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("appList", serializable);
            }
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = emVar;
        }

        public final em getArgs() {
            return this.args;
        }
    }

    public static final class AppDetail extends NavIntentDirections {
        private final hp args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppDetail(hp hpVar) {
            super(rr6.appDetail, rr6.toAppDetail, hpVar.a(), NavIntentDirections.Companion.getDefaultTransitions(), null);
            js3.p(hpVar, "args");
            this.args = hpVar;
        }

        public final hp getArgs() {
            return this.args;
        }
    }

    public static final class AppGateway extends NavDialogDirections {
        private final iq args;

        public AppGateway(iq iqVar) {
            js3.p(iqVar, "args");
            int i = rr6.appGateway;
            int i2 = rr6.toAppGateway;
            Serializable serializable = iqVar.b;
            Parcelable parcelable = iqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            if (Parcelable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("gatewayData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class)) {
                    throw new UnsupportedOperationException(GatewayBottomDialogFragment.GatewayData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("gatewayData", serializable);
            }
            bundle.putString("iconPath", iqVar.c);
            super(i, i2, bundle, null, 8, null);
            this.args = iqVar;
        }

        public final iq getArgs() {
            return this.args;
        }
    }

    public static final class AppUsage extends NavIntentDirections {
        private final su args;

        public AppUsage(su suVar) {
            js3.p(suVar, "args");
            int i = rr6.appsUsage;
            int i2 = rr6.toAppsUsage;
            Parcelable parcelable = suVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = suVar;
        }

        public final su getArgs() {
            return this.args;
        }
    }

    public static final class ApplicationList extends NavIntentDirections {
        private final tq args;

        public ApplicationList(tq tqVar) {
            js3.p(tqVar, "args");
            int i = rr6.applicationList;
            int i2 = rr6.toApplicationList;
            Serializable serializable = tqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ir.mservices.market.version2.webapi.responsedto.ApplicationList.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("apps", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ir.mservices.market.version2.webapi.responsedto.ApplicationList.class)) {
                    throw new UnsupportedOperationException(ir.mservices.market.version2.webapi.responsedto.ApplicationList.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("apps", serializable);
            }
            bundle.putString("title", tqVar.b);
            bundle.putStringArray("ignoreCondition", tqVar.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = tqVar;
        }

        public final tq getArgs() {
            return this.args;
        }
    }

    public static final class Bio extends NavDialogDirections {
        private final sb0 args;

        public Bio(sb0 sb0Var) {
            js3.p(sb0Var, "args");
            int i = rr6.bioDialog;
            int i2 = rr6.toBioDialog;
            Parcelable parcelable = sb0Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", sb0Var.b);
            bundle.putString("input", sb0Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = sb0Var;
        }

        public final sb0 getArgs() {
            return this.args;
        }
    }

    public static final class Birthday extends NavDialogDirections {
        private final xb0 args;

        public Birthday(xb0 xb0Var) {
            js3.p(xb0Var, "args");
            int i = rr6.birthdayBottomDialog;
            int i2 = rr6.toBirthdayBottomDialog;
            Parcelable parcelable = xb0Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("date", xb0Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = xb0Var;
        }

        public final xb0 getArgs() {
            return this.args;
        }
    }

    public static final class Bookmark extends NavIntentDirections {
        private final od0 args;

        public Bookmark(od0 od0Var) {
            js3.p(od0Var, "args");
            int i = rr6.bookmark;
            int i2 = rr6.toBookmark;
            Bundle bundle = new Bundle();
            bundle.putInt("selectedPage", od0Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = od0Var;
        }

        public final od0 getArgs() {
            return this.args;
        }
    }

    public static final class Cheetah extends NavIntentDirections {
        private final eq0 args;

        public Cheetah(eq0 eq0Var) {
            js3.p(eq0Var, "args");
            int i = rr6.cheetah;
            int i2 = rr6.toCheetah;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", eq0Var.a);
            bundle.putString("appIcon", eq0Var.b);
            bundle.putBoolean("stopVpn", eq0Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = eq0Var;
        }

        public final eq0 getArgs() {
            return this.args;
        }
    }

    public static final class ChooseQuality extends NavDialogDirections {
        private final bt1 args;

        public ChooseQuality(bt1 bt1Var) {
            js3.p(bt1Var, "args");
            int i = rr6.chooseQuality;
            int i2 = rr6.toChooseQuality;
            Serializable serializable = bt1Var.g;
            Parcelable parcelable = bt1Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("playId", bt1Var.b);
            bundle.putString("refId", bt1Var.c);
            bundle.putString("movieName", bt1Var.d);
            bundle.putString("secondaryTitle", bt1Var.e);
            bundle.putString("movieId", bt1Var.f);
            if (Parcelable.class.isAssignableFrom(DownloadInfoResponse.class)) {
                bundle.putParcelable("downloadInfo", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(DownloadInfoResponse.class)) {
                    throw new UnsupportedOperationException(DownloadInfoResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("downloadInfo", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = bt1Var;
        }

        public final bt1 getArgs() {
            return this.args;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final lj5 getDefaultTransitions() {
            return NavIntentDirections.defaultTransitions;
        }

        private Companion() {
        }
    }

    public static final class Confirm extends NavDialogDirections {
        private final d11 args;

        public Confirm(d11 d11Var) {
            js3.p(d11Var, "args");
            int i = rr6.confirmDialog;
            int i2 = rr6.toConfirmDialog;
            Serializable serializable = d11Var.g;
            Parcelable parcelable = d11Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("message", d11Var.b);
            bundle.putString("rejectString", d11Var.c);
            bundle.putString("confirmString", d11Var.d);
            bundle.putInt("color", d11Var.e);
            bundle.putInt("textColor", d11Var.f);
            if (Parcelable.class.isAssignableFrom(ThemeData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("theme", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ThemeData.class)) {
                    throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("theme", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = d11Var;
        }

        public final d11 getArgs() {
            return this.args;
        }
    }

    public static final class ConfirmConnect extends NavDialogDirections {
        private final n76 args;

        public ConfirmConnect(n76 n76Var) {
            js3.p(n76Var, "args");
            int i = rr6.pikaConfirmConnect;
            int i2 = rr6.toPikaConfirmConnect;
            Parcelable parcelable = n76Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("desc", n76Var.b);
            bundle.putString("code", n76Var.c);
            bundle.putString("confirm_title", n76Var.d);
            super(i, i2, bundle, null, 8, null);
            this.args = n76Var;
        }

        public final n76 getArgs() {
            return this.args;
        }
    }

    public static final class Crop extends NavIntentDirections {
        private final t71 args;

        public Crop(t71 t71Var) {
            js3.p(t71Var, "args");
            int i = rr6.crop;
            int i2 = rr6.toCrop;
            Parcelable parcelable = t71Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(Uri.class)) {
                bundle.putParcelable("uri", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(Uri.class)) {
                    throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("uri", (Serializable) parcelable);
            }
            bundle.putString("cropMode", t71Var.b);
            bundle.putString("subscriberId", t71Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = t71Var;
        }

        public final t71 getArgs() {
            return this.args;
        }
    }

    public static final class Developer extends NavIntentDirections {
        private final ml1 args;

        public Developer(ml1 ml1Var) {
            js3.p(ml1Var, "args");
            int i = rr6.developer;
            int i2 = rr6.toDeveloper;
            Tracker tracker = ml1Var.d;
            Bundle bundle = new Bundle();
            bundle.putString("developerId", ml1Var.a);
            bundle.putString("packageName", ml1Var.b);
            bundle.putString("title", ml1Var.c);
            if (Parcelable.class.isAssignableFrom(Tracker.class)) {
                js3.n(tracker, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("launcherSource", tracker);
            } else {
                if (!Serializable.class.isAssignableFrom(Tracker.class)) {
                    throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(tracker, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("launcherSource", tracker);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = ml1Var;
        }

        public final ml1 getArgs() {
            return this.args;
        }
    }

    public static final class DeveloperComment extends NavDialogDirections {
        private final al1 args;

        public DeveloperComment(al1 al1Var) {
            js3.p(al1Var, "args");
            int i = rr6.developerComment;
            int i2 = rr6.toDeveloperCommentDialog;
            Parcelable parcelable = al1Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("packageName", al1Var.b);
            bundle.putString("comment", al1Var.c);
            bundle.putString("appName", al1Var.d);
            bundle.putString("commentSource", al1Var.e);
            bundle.putFloat("rating", al1Var.f);
            bundle.putBoolean("isShowEditConfirm", al1Var.g);
            super(i, i2, bundle, null, 8, null);
            this.args = al1Var;
        }

        public final al1 getArgs() {
            return this.args;
        }
    }

    public static final class DocumentFilePermission extends NavDialogDirections {
        private final xq1 args;

        public DocumentFilePermission(xq1 xq1Var) {
            js3.p(xq1Var, "args");
            int i = rr6.documentFilePermissionDialog;
            int i2 = rr6.toDocumentFilePermissionDialog;
            Parcelable parcelable = xq1Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = xq1Var;
        }

        public final xq1 getArgs() {
            return this.args;
        }
    }

    public static final class DownloadList extends NavIntentDirections {
        private final rr1 args;

        public DownloadList(rr1 rr1Var) {
            js3.p(rr1Var, "args");
            int i = rr6.download;
            int i2 = rr6.toDownload;
            Bundle bundle = new Bundle();
            bundle.putString("download_type", rr1Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = rr1Var;
        }

        public final rr1 getArgs() {
            return this.args;
        }
    }

    public static final class DraggableScreenshot extends NavDialogDirections {
        private final bv1 args;

        public DraggableScreenshot(bv1 bv1Var) {
            js3.p(bv1Var, "args");
            int i = rr6.draggableScreenshot;
            int i2 = rr6.toDraggableScreenshot;
            Bundle bundle = new Bundle();
            bundle.putInt("position", bv1Var.a);
            bundle.putString("contextInfo", bv1Var.b);
            bundle.putString("title", bv1Var.c);
            bundle.putParcelableArray("images", bv1Var.d);
            bundle.putIntArray("touchPoint", bv1Var.e);
            super(i, i2, bundle, null, 8, null);
            this.args = bv1Var;
        }

        public final bv1 getArgs() {
            return this.args;
        }
    }

    public static final class FailedStorage extends NavDialogDirections {
        private final hq args;

        public FailedStorage(hq hqVar) {
            js3.p(hqVar, "args");
            int i = rr6.failedStorageDialog;
            int i2 = rr6.toFailedStorageDialog;
            Parcelable parcelable = hqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", hqVar.b);
            bundle.putString("message", hqVar.c);
            bundle.putString("iconPath", hqVar.d);
            bundle.putBoolean("hasButton", hqVar.e);
            super(i, i2, bundle, null, 8, null);
            this.args = hqVar;
        }

        public final hq getArgs() {
            return this.args;
        }
    }

    public static final class Feedback extends NavIntentDirections {
        private final r92 args;

        public Feedback(r92 r92Var) {
            js3.p(r92Var, "args");
            int i = rr6.feedback;
            int i2 = rr6.toFeedback;
            Parcelable parcelable = r92Var.f;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", r92Var.a);
            bundle.putString("title", r92Var.b);
            bundle.putString("scenario", r92Var.c);
            bundle.putString("select", r92Var.d);
            bundle.putBoolean("focus", r92Var.e);
            if (Parcelable.class.isAssignableFrom(TransactionData.class)) {
                bundle.putParcelable("transactionData", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(TransactionData.class)) {
                    throw new UnsupportedOperationException(TransactionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("transactionData", (Serializable) parcelable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = r92Var;
        }

        public final r92 getArgs() {
            return this.args;
        }
    }

    public static final class FeedbackTransaction extends NavDialogDirections {
        private final ga2 args;

        public FeedbackTransaction(ga2 ga2Var) {
            js3.p(ga2Var, "args");
            int i = rr6.feedbackTransactionDialog;
            int i2 = rr6.toFeedbackTransactionDialog;
            Parcelable parcelable = ga2Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = ga2Var;
        }

        public final ga2 getArgs() {
            return this.args;
        }
    }

    public static final class FilmBookmark extends NavIntentDirections {
        public FilmBookmark() {
            super(rr6.filmBookmark, rr6.toFilmBookmark, new Bundle(0), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class Followers extends NavIntentDirections {
        private final j4 args;

        public Followers(j4 j4Var) {
            js3.p(j4Var, "args");
            int i = rr6.followers;
            int i2 = rr6.toFollowers;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", j4Var.a);
            super(i, i2, bundle, null, 8, null);
            this.args = j4Var;
        }

        public final j4 getArgs() {
            return this.args;
        }
    }

    public static final class Following extends NavIntentDirections {
        private final p4 args;

        public Following(p4 p4Var) {
            js3.p(p4Var, "args");
            int i = rr6.following;
            int i2 = rr6.toFollowing;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", p4Var.a);
            super(i, i2, bundle, null, 8, null);
            this.args = p4Var;
        }

        public final p4 getArgs() {
            return this.args;
        }
    }

    public static final class FontStyle extends NavDialogDirections {
        private final yi2 args;

        public FontStyle(yi2 yi2Var) {
            js3.p(yi2Var, "args");
            int i = rr6.fontStyleDialog;
            int i2 = rr6.toFontStyleDialog;
            Parcelable parcelable = yi2Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = yi2Var;
        }

        public final yi2 getArgs() {
            return this.args;
        }
    }

    public static final class ForceUpdate extends NavDialogDirections {
        private final mj2 args;

        public ForceUpdate(mj2 mj2Var) {
            js3.p(mj2Var, "args");
            int i = rr6.forceUpdateDialog;
            int i2 = rr6.toForceUpdateDialog;
            Parcelable parcelable = mj2Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putInt("myketLatestVersionCode", mj2Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = mj2Var;
        }

        public final mj2 getArgs() {
            return this.args;
        }
    }

    public static final class Game extends RootIntentDirections {
        /* JADX WARN: Multi-variable type inference failed */
        public Game() {
            super(rr6.gameFeature, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class InAppGateway extends NavDialogDirections {
        private final kk3 args;

        public InAppGateway(kk3 kk3Var) {
            js3.p(kk3Var, "args");
            int i = rr6.inAppGateway;
            int i2 = rr6.toInAppGateway;
            Serializable serializable = kk3Var.b;
            Parcelable parcelable = kk3Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            if (Parcelable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("gatewayData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(GatewayBottomDialogFragment.GatewayData.class)) {
                    throw new UnsupportedOperationException(GatewayBottomDialogFragment.GatewayData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("gatewayData", serializable);
            }
            bundle.putString("packageName", kk3Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = kk3Var;
        }

        public final kk3 getArgs() {
            return this.args;
        }
    }

    public static final class InAppNotification extends NavDialogDirections {
        private final lk3 args;

        public InAppNotification(lk3 lk3Var) {
            js3.p(lk3Var, "args");
            int i = rr6.inAppNotificationDialog;
            int i2 = rr6.toInAppNotificationDialog;
            Parcelable parcelable = lk3Var.b;
            Parcelable parcelable2 = lk3Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(PushMessage.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("pushMessage", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(PushMessage.class)) {
                    throw new UnsupportedOperationException(PushMessage.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("pushMessage", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = lk3Var;
        }

        public final lk3 getArgs() {
            return this.args;
        }
    }

    public static final class InAppUpdate extends NavDialogDirections {
        private final yk3 args;

        public InAppUpdate(yk3 yk3Var) {
            js3.p(yk3Var, "args");
            int i = rr6.inAppUpdate;
            int i2 = rr6.toInAppUpdate;
            Serializable serializable = yk3Var.b;
            Parcelable parcelable = yk3Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            if (Parcelable.class.isAssignableFrom(InAppUpdateData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("inAppUpdateData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(InAppUpdateData.class)) {
                    throw new UnsupportedOperationException(InAppUpdateData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("inAppUpdateData", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = yk3Var;
        }

        public final yk3 getArgs() {
            return this.args;
        }
    }

    public static final class Inbox extends NavIntentDirections {
        public Inbox() {
            super(rr6.inbox, rr6.toInbox, new Bundle(), null, 8, null);
        }
    }

    public static final class InstallFailed extends NavDialogDirections {
        private final y76 args;

        public InstallFailed(y76 y76Var) {
            js3.p(y76Var, "args");
            int i = rr6.installFailed;
            int i2 = rr6.toInstallFailed;
            Parcelable parcelable = y76Var.c;
            Parcelable parcelable2 = y76Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            bundle.putString("title", y76Var.b);
            if (Parcelable.class.isAssignableFrom(Bitmap.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("icon", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(Bitmap.class)) {
                    throw new UnsupportedOperationException(Bitmap.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("icon", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = y76Var;
        }

        public final y76 getArgs() {
            return this.args;
        }
    }

    public static final class InstallRetry extends NavDialogDirections {
        private final pq args;

        public InstallRetry(pq pqVar) {
            js3.p(pqVar, "args");
            int i = rr6.installRetryDialog;
            int i2 = rr6.toInstallRetryDialog;
            Parcelable parcelable = pqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", pqVar.b);
            bundle.putString("iconPath", pqVar.c);
            super(i, i2, bundle, null, 8, null);
            this.args = pqVar;
        }

        public final pq getArgs() {
            return this.args;
        }
    }

    public static final class InstallSucceed extends NavDialogDirections {
        private final qq args;

        public InstallSucceed(qq qqVar) {
            js3.p(qqVar, "args");
            int i = rr6.installSucceedDialog;
            int i2 = rr6.toInstallSucceedDialog;
            Parcelable parcelable = qqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", qqVar.b);
            bundle.putString("iconPath", qqVar.c);
            bundle.putBoolean("executable", qqVar.d);
            super(i, i2, bundle, null, 8, null);
            this.args = qqVar;
        }

        public final qq getArgs() {
            return this.args;
        }
    }

    public static final class InstallUnSucceed extends NavDialogDirections {
        private final sq args;

        public InstallUnSucceed(sq sqVar) {
            js3.p(sqVar, "args");
            int i = rr6.installUnSucceedDialog;
            int i2 = rr6.toInstallUnSucceedDialog;
            Parcelable parcelable = sqVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", sqVar.b);
            bundle.putString("iconPath", sqVar.c);
            bundle.putInt("installResult", sqVar.d);
            super(i, i2, bundle, null, 8, null);
            this.args = sqVar;
        }

        public final sq getArgs() {
            return this.args;
        }
    }

    public static final class InstalledApp extends NavIntentDirections {
        private final wp3 args;

        public InstalledApp(wp3 wp3Var) {
            js3.p(wp3Var, "args");
            int i = rr6.installedApps;
            int i2 = rr6.toInstalledApps;
            Bundle bundle = new Bundle();
            bundle.putString("deviceName", wp3Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = wp3Var;
        }

        public final wp3 getArgs() {
            return this.args;
        }
    }

    public static final class KidsModeDeActive extends NavDialogDirections {
        private final hz3 args;

        public KidsModeDeActive(hz3 hz3Var) {
            js3.p(hz3Var, "args");
            int i = rr6.kidsModeDeactive;
            int i2 = rr6.toKidsModeDeactive;
            Parcelable parcelable = hz3Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = hz3Var;
        }

        public final hz3 getArgs() {
            return this.args;
        }
    }

    public static final class Level extends NavIntentDirections {
        private final g54 args;

        public Level(g54 g54Var) {
            js3.p(g54Var, "args");
            int i = rr6.level;
            int i2 = rr6.toLevel;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", g54Var.a);
            bundle.putString("avatarUrl", g54Var.b);
            bundle.putString("nickName", g54Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = g54Var;
        }

        public final g54 getArgs() {
            return this.args;
        }
    }

    public static final class LineMenu extends NavDialogDirections {
        private final c74 args;

        public LineMenu(c74 c74Var) {
            js3.p(c74Var, "args");
            int i = rr6.lineMenuDialog;
            int i2 = rr6.toLineMenuDialog;
            Parcelable parcelable = c74Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putParcelableArray("lineMenuData", c74Var.b);
            bundle.putString("title", c74Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = c74Var;
        }

        public final c74 getArgs() {
            return this.args;
        }
    }

    public static final class Login extends NavDialogDirections {
        private final wd4 args;

        public Login(wd4 wd4Var) {
            js3.p(wd4Var, "args");
            int i = rr6.anyLogin;
            int i2 = rr6.toAnyLogin;
            Parcelable parcelable = wd4Var.b;
            Parcelable parcelable2 = wd4Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(LoginData.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("loginData", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(LoginData.class)) {
                    throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("loginData", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = wd4Var;
        }

        public final wd4 getArgs() {
            return this.args;
        }
    }

    public static final class Main extends RootIntentDirections {
        /* JADX WARN: Multi-variable type inference failed */
        public Main() {
            super(rr6.mainFeature, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class MiuiTip extends NavDialogDirections {
        private final dw4 args;

        public MiuiTip(dw4 dw4Var) {
            js3.p(dw4Var, "args");
            int i = rr6.miuiTip;
            int i2 = rr6.toMiuiTip;
            Parcelable parcelable = dw4Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = dw4Var;
        }

        public final dw4 getArgs() {
            return this.args;
        }
    }

    public static final class MoreDescription extends NavIntentDirections {
        private final tx4 args;

        public MoreDescription(tx4 tx4Var) {
            js3.p(tx4Var, "args");
            int i = rr6.moreDescription;
            int i2 = rr6.toMoreDescription;
            Serializable serializable = tx4Var.b;
            Serializable serializable2 = tx4Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(MoreDescriptionData.class)) {
                js3.n(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("descriptionData", (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(MoreDescriptionData.class)) {
                    throw new UnsupportedOperationException(MoreDescriptionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("descriptionData", serializable2);
            }
            if (Parcelable.class.isAssignableFrom(ToolbarData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("application", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ToolbarData.class)) {
                    throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("application", serializable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = tx4Var;
        }

        public final tx4 getArgs() {
            return this.args;
        }
    }

    public static final class MovieAddProfileList extends NavIntentDirections {
        private final xz4 args;

        public MovieAddProfileList(xz4 xz4Var) {
            js3.p(xz4Var, "args");
            int i = rr6.movieAddProfileList;
            int i2 = rr6.toMovieAddProfileList;
            Parcelable parcelable = xz4Var.d;
            Serializable serializable = xz4Var.c;
            Serializable serializable2 = xz4Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("title", xz4Var.a);
            if (Parcelable.class.isAssignableFrom(SocialListPolicies.class)) {
                js3.n(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("policies", (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(SocialListPolicies.class)) {
                    throw new UnsupportedOperationException(SocialListPolicies.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("policies", serializable2);
            }
            if (Parcelable.class.isAssignableFrom(ProfileMovieListDto.class)) {
                bundle.putParcelable("movieList", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ProfileMovieListDto.class)) {
                    throw new UnsupportedOperationException(ProfileMovieListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("movieList", serializable);
            }
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = xz4Var;
        }

        public final xz4 getArgs() {
            return this.args;
        }
    }

    public static final class MovieBannersList extends NavIntentDirections {
        private final a05 args;

        public MovieBannersList(a05 a05Var) {
            js3.p(a05Var, "args");
            int i = rr6.movieBannerList;
            int i2 = rr6.toMovieBannerList;
            Serializable serializable = a05Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(HomeMovieBannerListDto.class)) {
                bundle.putParcelable("bannerList", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(HomeMovieBannerListDto.class)) {
                    throw new UnsupportedOperationException(HomeMovieBannerListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("bannerList", serializable);
            }
            bundle.putBoolean("search", a05Var.b);
            bundle.putString("id", a05Var.c);
            bundle.putString("refId", a05Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = a05Var;
        }

        public final a05 getArgs() {
            return this.args;
        }
    }

    public static final class MovieDetail extends NavIntentDirections {
        private final v15 args;

        public MovieDetail(v15 v15Var) {
            js3.p(v15Var, "args");
            int i = rr6.movieDetail;
            int i2 = rr6.toMovieDetail;
            Bundle bundle = new Bundle();
            bundle.putString("movieId", v15Var.a);
            bundle.putString("refId", v15Var.b);
            bundle.putBoolean(CommonDataKt.RESTRICTION_BUTTON_ACTION_PLAY, v15Var.c);
            bundle.putString("posterUrl", v15Var.d);
            bundle.putString("playId", v15Var.e);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = v15Var;
        }

        public final v15 getArgs() {
            return this.args;
        }
    }

    public static final class MovieDetailMoreList extends NavIntentDirections {
        private final o15 args;

        public MovieDetailMoreList(o15 o15Var) {
            js3.p(o15Var, "args");
            int i = rr6.movieDetailMoreList;
            int i2 = rr6.toMovieDetailMoreList;
            Serializable serializable = o15Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(HomeMovieListDto.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("recommendation", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(HomeMovieListDto.class)) {
                    throw new UnsupportedOperationException(HomeMovieListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("recommendation", serializable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = o15Var;
        }

        public final o15 getArgs() {
            return this.args;
        }
    }

    public static final class MovieHome extends NavIntentDirections {
        private final nw5 args;

        public MovieHome(nw5 nw5Var) {
            js3.p(nw5Var, "args");
            int i = rr6.movieOtherHome;
            int i2 = rr6.toMovieOtherHome;
            Bundle bundle = new Bundle();
            bundle.putString("id", nw5Var.a);
            bundle.putString("title", nw5Var.b);
            bundle.putBoolean("search", nw5Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = nw5Var;
        }

        public final nw5 getArgs() {
            return this.args;
        }
    }

    public static final class MovieHomeRoot extends RootIntentDirections {
        /* JADX WARN: Multi-variable type inference failed */
        public MovieHomeRoot() {
            super(rr6.movieHomeRoot, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class MovieMoreList extends NavIntentDirections {
        private final o45 args;

        public MovieMoreList(o45 o45Var) {
            js3.p(o45Var, "args");
            int i = rr6.movieMoreList;
            int i2 = rr6.toMovieMoreList;
            Bundle bundle = new Bundle();
            bundle.putString("packageKey", o45Var.a);
            bundle.putString("title", o45Var.b);
            bundle.putString("analyticsName", o45Var.c);
            bundle.putBoolean("search", o45Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = o45Var;
        }

        public final o45 getArgs() {
            return this.args;
        }
    }

    public static final class MovieReviews extends NavIntentDirections {
        private final a65 args;

        public MovieReviews(a65 a65Var) {
            js3.p(a65Var, "args");
            int i = rr6.movieReviews;
            int i2 = rr6.toMovieReview;
            Serializable serializable = a65Var.c;
            Serializable serializable2 = a65Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("movieId", a65Var.a);
            if (Parcelable.class.isAssignableFrom(MovieReviewInfoDto.class)) {
                bundle.putParcelable("reviewInfo", (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(MovieReviewInfoDto.class)) {
                    throw new UnsupportedOperationException(MovieReviewInfoDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("reviewInfo", serializable2);
            }
            if (Parcelable.class.isAssignableFrom(MovieToolbarData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("toolbarData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
                    throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("toolbarData", serializable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = a65Var;
        }

        public final a65 getArgs() {
            return this.args;
        }
    }

    public static final class MovieSearch extends NavIntentDirections {
        private final wh7 args;

        public MovieSearch(wh7 wh7Var) {
            js3.p(wh7Var, "args");
            int i = rr6.movieSearch;
            int i2 = rr6.toMovieSearch;
            Bundle bundle = new Bundle();
            bundle.putString("queryString", wh7Var.a);
            bundle.putString("querySource", wh7Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = wh7Var;
        }

        public final wh7 getArgs() {
            return this.args;
        }
    }

    public static final class MovieSeasons extends NavIntentDirections {
        private final a75 args;

        public MovieSeasons(a75 a75Var) {
            js3.p(a75Var, "args");
            int i = rr6.movieSeasons;
            int i2 = rr6.toMovieSeasons;
            Serializable serializable = a75Var.e;
            Serializable serializable2 = a75Var.d;
            Bundle bundle = new Bundle();
            bundle.putString("refId", a75Var.a);
            bundle.putInt("selectedSeason", a75Var.b);
            bundle.putInt("seasonsSize", a75Var.c);
            if (Parcelable.class.isAssignableFrom(MovieToolbarData.class)) {
                js3.n(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("toolbarData", (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
                    throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("toolbarData", serializable2);
            }
            if (Parcelable.class.isAssignableFrom(SubscriptionInfo.class)) {
                bundle.putParcelable("subscriptionInfo", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(SubscriptionInfo.class)) {
                    throw new UnsupportedOperationException(SubscriptionInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("subscriptionInfo", serializable);
            }
            bundle.putString("movieId", a75Var.f);
            bundle.putBoolean("showDownload", a75Var.g);
            bundle.putBoolean("isAudioMode", a75Var.h);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = a75Var;
        }

        public final a75 getArgs() {
            return this.args;
        }
    }

    public static final class MyAccount extends NavIntentDirections {
        private final uc5 args;

        public MyAccount(uc5 uc5Var) {
            js3.p(uc5Var, "args");
            int i = rr6.myAccount;
            int i2 = rr6.toMyAccount;
            Parcelable parcelable = uc5Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = uc5Var;
        }

        public final uc5 getArgs() {
            return this.args;
        }
    }

    public static final class MyMarket extends NavIntentDirections {
        public MyMarket() {
            super(rr6.myMarket, rr6.toMyMarket, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class MyReview extends NavIntentDirections {
        private final yd5 args;

        public MyReview(yd5 yd5Var) {
            js3.p(yd5Var, "args");
            int i = rr6.myReviews;
            int i2 = rr6.toMyReviews;
            Bundle bundle = new Bundle();
            bundle.putInt("selectedPage", yd5Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = yd5Var;
        }

        public final yd5 getArgs() {
            return this.args;
        }
    }

    public static final class MyketUpdateDialog extends NavDialogDirections {
        private final yf5 args;

        public MyketUpdateDialog(yf5 yf5Var) {
            js3.p(yf5Var, "args");
            int i = rr6.myketUpdateDialog;
            int i2 = rr6.toMyketUpdateDialog;
            Parcelable parcelable = yf5Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", yf5Var.b);
            bundle.putString("message", yf5Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = yf5Var;
        }

        public final yf5 getArgs() {
            return this.args;
        }
    }

    public static final class MynetSocial extends NavIntentDirections {
        public MynetSocial() {
            super(rr6.mynetSocial, rr6.toMynetSocial, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static abstract class NavDialogDirections extends NavIntentDirections {
        private final int actionId;
        private final Bundle arguments;
        private final int dialogResId;
        private final lj5 navOptions;

        public /* synthetic */ NavDialogDirections(int i, int i2, Bundle bundle, lj5 lj5Var, yd1 yd1Var) {
            this(i, i2, bundle, lj5Var);
        }

        @Override // ir.mservices.market.data.NavIntentDirections, defpackage.yi5
        public int getActionId() {
            return this.actionId;
        }

        @Override // ir.mservices.market.data.NavIntentDirections, defpackage.yi5
        public Bundle getArguments() {
            return this.arguments;
        }

        public final int getDialogResId() {
            return this.dialogResId;
        }

        @Override // ir.mservices.market.data.NavIntentDirections
        public lj5 getNavOptions() {
            return this.navOptions;
        }

        private NavDialogDirections(int i, int i2, Bundle bundle, lj5 lj5Var) {
            super(i, i2, bundle, lj5Var, null);
            this.dialogResId = i;
            this.actionId = i2;
            this.arguments = bundle;
            this.navOptions = lj5Var;
        }

        public /* synthetic */ NavDialogDirections(int i, int i2, Bundle bundle, lj5 lj5Var, int i3, yd1 yd1Var) {
            this(i, i2, bundle, (i3 & 8) != 0 ? null : lj5Var, null);
        }
    }

    public static final class NearbyPermissionAlert extends NavDialogDirections {
        private final a86 args;

        public NearbyPermissionAlert(a86 a86Var) {
            js3.p(a86Var, "args");
            int i = rr6.nearbyPermission;
            int i2 = rr6.toNearbyPermission;
            Parcelable parcelable = a86Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = a86Var;
        }

        public final a86 getArgs() {
            return this.args;
        }
    }

    public static final class NeedPermission extends NavDialogDirections {
        private final ql5 args;

        public NeedPermission(ql5 ql5Var) {
            js3.p(ql5Var, "args");
            int i = rr6.needPermission;
            int i2 = rr6.toNeedPermission;
            Parcelable parcelable = ql5Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = ql5Var;
        }

        public final ql5 getArgs() {
            return this.args;
        }
    }

    public static final class Nickname extends NavDialogDirections {
        private final tn5 args;

        public Nickname(tn5 tn5Var) {
            js3.p(tn5Var, "args");
            int i = rr6.nickname;
            int i2 = rr6.toNickname;
            Parcelable parcelable = tn5Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString(PackageListMetaDataDTO.KEY_DESCRIPTION, tn5Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = tn5Var;
        }

        public final tn5 getArgs() {
            return this.args;
        }
    }

    public static final class OtherFeature extends NavIntentDirections {
        private final ow5 args;

        public OtherFeature(ow5 ow5Var) {
            js3.p(ow5Var, "args");
            int i = rr6.appOtherHome;
            int i2 = rr6.toAppOtherHome;
            Bundle bundle = new Bundle();
            bundle.putString("title", ow5Var.a);
            bundle.putString("layoutKey", ow5Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = ow5Var;
        }

        public final ow5 getArgs() {
            return this.args;
        }
    }

    public static final class OtherFollowers extends NavIntentDirections {
        private final dw5 args;

        public OtherFollowers(dw5 dw5Var) {
            js3.p(dw5Var, "args");
            int i = rr6.otherFollowing;
            int i2 = rr6.toOtherFollowers;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", dw5Var.a);
            super(i, i2, bundle, null, 8, null);
            this.args = dw5Var;
        }

        public final dw5 getArgs() {
            return this.args;
        }
    }

    public static final class OtherFollowing extends NavIntentDirections {
        private final fw5 args;

        public OtherFollowing(fw5 fw5Var) {
            js3.p(fw5Var, "args");
            int i = rr6.otherFollowing;
            int i2 = rr6.toOtherFollowing;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", fw5Var.a);
            super(i, i2, bundle, null, 8, null);
            this.args = fw5Var;
        }

        public final fw5 getArgs() {
            return this.args;
        }
    }

    public static final class Package extends NavIntentDirections {
        private final oy5 args;

        public Package(oy5 oy5Var) {
            js3.p(oy5Var, "args");
            int i = rr6.packages;
            int i2 = rr6.toPackage;
            Bundle bundle = new Bundle();
            bundle.putString("title", oy5Var.a);
            bundle.putString("packageKey", oy5Var.b);
            bundle.putString("launchSource", oy5Var.c);
            bundle.putString("refId", oy5Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = oy5Var;
        }

        public final oy5 getArgs() {
            return this.args;
        }
    }

    public static final class PaymentRetry extends NavDialogDirections {
        private final m46 args;

        public PaymentRetry(m46 m46Var) {
            js3.p(m46Var, "args");
            int i = rr6.paymentRetry;
            int i2 = rr6.toPaymentRetry;
            Parcelable parcelable = m46Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("packageName", m46Var.b);
            bundle.putString("title", m46Var.c);
            bundle.putString("scenario", m46Var.d);
            super(i, i2, bundle, null, 8, null);
            this.args = m46Var;
        }

        public final m46 getArgs() {
            return this.args;
        }
    }

    public static final class PaymentTrackingApp extends NavDialogDirections {
        private final lp8 args;

        public PaymentTrackingApp(lp8 lp8Var) {
            js3.p(lp8Var, "args");
            int i = rr6.trackingAppPayment;
            int i2 = rr6.toTrackingAppPayment;
            Parcelable parcelable = lp8Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("trackingNumber", lp8Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = lp8Var;
        }

        public final lp8 getArgs() {
            return this.args;
        }
    }

    public static final class Permission extends NavDialogDirections {
        private final c args;

        public Permission(c cVar) {
            js3.p(cVar, "args");
            int i = rr6.permissionDialog;
            int i2 = rr6.toPermissionDialog;
            Serializable serializable = cVar.e;
            Parcelable parcelable = cVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", cVar.b);
            bundle.putString("version", cVar.c);
            bundle.putString("iconPath", cVar.d);
            if (Parcelable.class.isAssignableFrom(PermissionDialogFragment.PermissionList.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("permissions", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(PermissionDialogFragment.PermissionList.class)) {
                    throw new UnsupportedOperationException(PermissionDialogFragment.PermissionList.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("permissions", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = cVar;
        }

        public final c getArgs() {
            return this.args;
        }
    }

    public static final class PermissionReason extends NavDialogDirections {
        private final e56 args;

        public PermissionReason(e56 e56Var) {
            js3.p(e56Var, "args");
            int i = rr6.permissionReasonDialog;
            int i2 = rr6.toPermissionReasonDialog;
            Parcelable parcelable = e56Var.c;
            Parcelable parcelable2 = e56Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            bundle.putBoolean("lastWord", e56Var.b);
            if (Parcelable.class.isAssignableFrom(ir.mservices.market.data.permission.PermissionReason.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("permissionReason", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(ir.mservices.market.data.permission.PermissionReason.class)) {
                    throw new UnsupportedOperationException(ir.mservices.market.data.permission.PermissionReason.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("permissionReason", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = e56Var;
        }

        public final e56 getArgs() {
            return this.args;
        }
    }

    public static final class PikaConnect extends NavIntentDirections {
        private final p76 args;

        public PikaConnect(p76 p76Var) {
            js3.p(p76Var, "args");
            int i = rr6.pikaConnect;
            int i2 = rr6.toPikaConnect;
            Serializable serializable = p76Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ConnectionType.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("connectionType", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ConnectionType.class)) {
                    throw new UnsupportedOperationException(ConnectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("connectionType", serializable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = p76Var;
        }

        public final p76 getArgs() {
            return this.args;
        }
    }

    public static final class PikaHome extends NavIntentDirections {
        public PikaHome() {
            super(rr6.pikaHome, rr6.toPikaHome, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class PikaSelectEndPoint extends NavDialogDirections {
        private final f86 args;

        public PikaSelectEndPoint(f86 f86Var) {
            js3.p(f86Var, "args");
            int i = rr6.pikaSelectDevice;
            int i2 = rr6.toPikaSelectDevice;
            Parcelable parcelable = f86Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = f86Var;
        }

        public final f86 getArgs() {
            return this.args;
        }
    }

    public static final class PinLogin extends NavDialogDirections {
        private final v86 args;

        public PinLogin(v86 v86Var) {
            js3.p(v86Var, "args");
            int i = rr6.pinLogin;
            int i2 = rr6.toPinLogin;
            Parcelable parcelable = v86Var.c;
            Parcelable parcelable2 = v86Var.b;
            Parcelable parcelable3 = v86Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable3, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable3);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable3, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable3);
            }
            if (Parcelable.class.isAssignableFrom(LoginData.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("loginData", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(LoginData.class)) {
                    throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("loginData", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(LoginData.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("backLoginData", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(LoginData.class)) {
                    throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("backLoginData", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = v86Var;
        }

        public final v86 getArgs() {
            return this.args;
        }
    }

    public static final class PlayDetail extends NavIntentDirections {
        private final la6 args;

        public PlayDetail(la6 la6Var) {
            js3.p(la6Var, "args");
            int i = rr6.playDetail;
            int i2 = rr6.toPlayDetail;
            Parcelable parcelable = la6Var.c;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", la6Var.a);
            bundle.putString("title", la6Var.b);
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = la6Var;
        }

        public final la6 getArgs() {
            return this.args;
        }
    }

    public static final class Profile extends NavIntentDirections {
        public Profile() {
            super(rr6.ownProfile, rr6.toOwnProfile, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class ProfileAddList extends NavDialogDirections {
        private final tk6 args;

        public ProfileAddList(tk6 tk6Var) {
            js3.p(tk6Var, "args");
            int i = rr6.profileAddList;
            int i2 = rr6.toProfileAddList;
            Parcelable parcelable = tk6Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = tk6Var;
        }

        public final tk6 getArgs() {
            return this.args;
        }
    }

    public static final class ProfileAppListMore extends NavIntentDirections {
        private final yk6 args;

        public ProfileAppListMore(yk6 yk6Var) {
            js3.p(yk6Var, "args");
            int i = rr6.profileAppListMoreFragment;
            int i2 = rr6.toProfileAppListMoreFragment;
            Serializable serializable = yk6Var.b;
            Parcelable parcelable = yk6Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            if (Parcelable.class.isAssignableFrom(ProfileListTitleData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("profileListTitleData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ProfileListTitleData.class)) {
                    throw new UnsupportedOperationException(ProfileListTitleData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("profileListTitleData", serializable);
            }
            bundle.putString("accountKey", yk6Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = yk6Var;
        }

        public final yk6 getArgs() {
            return this.args;
        }
    }

    public static final class ProfileListTitle extends NavDialogDirections {
        private final kl6 args;

        public ProfileListTitle(kl6 kl6Var) {
            js3.p(kl6Var, "args");
            int i = rr6.profileListTitle;
            int i2 = rr6.toProfileListTitle;
            Parcelable parcelable = kl6Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("title", kl6Var.a);
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = kl6Var;
        }

        public final kl6 getArgs() {
            return this.args;
        }
    }

    public static final class ProfileMovieListMore extends NavIntentDirections {
        private final pl6 args;

        public ProfileMovieListMore(pl6 pl6Var) {
            js3.p(pl6Var, "args");
            int i = rr6.profileMovieListMoreFragment;
            int i2 = rr6.toProfileMovieListMoreFragment;
            Serializable serializable = pl6Var.b;
            Parcelable parcelable = pl6Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            if (Parcelable.class.isAssignableFrom(ProfileListTitleData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("profileListTitleData", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ProfileListTitleData.class)) {
                    throw new UnsupportedOperationException(ProfileListTitleData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("profileListTitleData", serializable);
            }
            bundle.putString("accountKey", pl6Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = pl6Var;
        }

        public final pl6 getArgs() {
            return this.args;
        }
    }

    public static final class Progress extends NavDialogDirections {
        private final em6 args;

        public Progress(em6 em6Var) {
            js3.p(em6Var, "args");
            int i = rr6.progressDialog;
            int i2 = rr6.toProgressDialog;
            Parcelable parcelable = em6Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putBoolean("canceledOnTouchOutside", em6Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = em6Var;
        }

        public final em6 getArgs() {
            return this.args;
        }
    }

    public static final class ReceiveApp extends NavIntentDirections {
        private final mw6 args;

        public ReceiveApp(mw6 mw6Var) {
            js3.p(mw6Var, "args");
            int i = rr6.receiveApp;
            int i2 = rr6.toReceiveApp;
            Bundle bundle = new Bundle();
            bundle.putString("deviceName", mw6Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = mw6Var;
        }

        public final mw6 getArgs() {
            return this.args;
        }
    }

    public static final class ReceiveUpdateRequire extends NavDialogDirections {
        private final k86 args;

        public ReceiveUpdateRequire(k86 k86Var) {
            js3.p(k86Var, "args");
            int i = rr6.receiveUpdateRequire;
            int i2 = rr6.toReceiveUpdateRequire;
            Parcelable parcelable = k86Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("desc", k86Var.b);
            bundle.putString("confirm_title", k86Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = k86Var;
        }

        public final k86 getArgs() {
            return this.args;
        }
    }

    public static final class RecentDownload extends NavDialogDirections {
        private final zw6 args;

        public RecentDownload(zw6 zw6Var) {
            js3.p(zw6Var, "args");
            int i = rr6.recentDownloadDialog;
            int i2 = rr6.toRecentDownloadDialog;
            Parcelable parcelable = zw6Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = zw6Var;
        }

        public final zw6 getArgs() {
            return this.args;
        }
    }

    public static final class Recommended extends NavIntentDirections {
        private final jy6 args;

        public Recommended(jy6 jy6Var) {
            js3.p(jy6Var, "args");
            int i = rr6.recommended;
            int i2 = rr6.toRecommended;
            Tracker tracker = jy6Var.e;
            Bundle bundle = new Bundle();
            bundle.putString("accountId", jy6Var.a);
            bundle.putString("packageName", jy6Var.b);
            bundle.putString("title", jy6Var.c);
            bundle.putString("recommendedType", jy6Var.d);
            if (Parcelable.class.isAssignableFrom(Tracker.class)) {
                js3.n(tracker, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("launchSource", tracker);
            } else {
                if (!Serializable.class.isAssignableFrom(Tracker.class)) {
                    throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(tracker, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("launchSource", tracker);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = jy6Var;
        }

        public final jy6 getArgs() {
            return this.args;
        }
    }

    public static final class Reels extends NavIntentDirections {
        public Reels() {
            super(rr6.reels, rr6.toReels, new Bundle(0), null, 8, null);
        }
    }

    public static final class ReelsHome extends NavIntentDirections {
        private final j17 args;

        public ReelsHome(j17 j17Var) {
            js3.p(j17Var, "args");
            int i = rr6.reelsHome;
            int i2 = rr6.toReelsHome;
            Bundle bundle = new Bundle();
            bundle.putString("refId", j17Var.a);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = j17Var;
        }

        public final j17 getArgs() {
            return this.args;
        }
    }

    public static final class RemoveDownload extends NavDialogDirections {
        private final s37 args;

        public RemoveDownload(s37 s37Var) {
            js3.p(s37Var, "args");
            int i = rr6.removeDownloadDialog;
            int i2 = rr6.toRemoveDownloadDialog;
            Parcelable parcelable = s37Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString(PackageListMetaDataDTO.KEY_DESCRIPTION, s37Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = s37Var;
        }

        public final s37 getArgs() {
            return this.args;
        }
    }

    public static final class ReplyComment extends NavDialogDirections {
        private final ao7 args;

        public ReplyComment(ao7 ao7Var) {
            js3.p(ao7Var, "args");
            int i = rr6.sendReply;
            int i2 = rr6.toSendReplyDialog;
            Parcelable parcelable = ao7Var.e;
            Serializable serializable = ao7Var.d;
            Bundle bundle = new Bundle();
            bundle.putString("launchSource", ao7Var.a);
            bundle.putString("packageName", ao7Var.b);
            bundle.putString("reviewId", ao7Var.c);
            if (Parcelable.class.isAssignableFrom(ReviewDto.class)) {
                bundle.putParcelable("reviewDTO", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ReviewDto.class)) {
                    throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("reviewDTO", serializable);
            }
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = ao7Var;
        }

        public final ao7 getArgs() {
            return this.args;
        }
    }

    public static final class Report extends NavDialogDirections {
        private final f args;

        public Report(f fVar) {
            js3.p(fVar, "args");
            int i = rr6.reportDialog;
            int i2 = rr6.toReportDialog;
            Serializable serializable = fVar.g;
            Parcelable parcelable = fVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", fVar.b);
            bundle.putString("message", fVar.c);
            bundle.putInt("selectedItem", fVar.d);
            bundle.putInt("color", fVar.e);
            bundle.putInt("textColor", fVar.f);
            if (Parcelable.class.isAssignableFrom(ThemeData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("theme", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ThemeData.class)) {
                    throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("theme", serializable);
            }
            bundle.putBoolean("hasOther", fVar.h);
            bundle.putParcelableArray("items", fVar.i);
            super(i, i2, bundle, null, 8, null);
            this.args = fVar;
        }

        public final f getArgs() {
            return this.args;
        }
    }

    public static final class RequestList extends NavIntentDirections {
        private final o57 args;

        public RequestList(o57 o57Var) {
            js3.p(o57Var, "args");
            int i = rr6.requests;
            int i2 = rr6.toRequests;
            Parcelable parcelable = o57Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = o57Var;
        }

        public final o57 getArgs() {
            return this.args;
        }
    }

    public static final class Requests extends NavIntentDirections {
        public Requests() {
            super(rr6.requests, rr6.toRequests, new Bundle(0), null, 8, null);
        }
    }

    public static final class Restriction extends NavDialogDirections {
        private final w77 args;

        public Restriction(w77 w77Var) {
            js3.p(w77Var, "args");
            int i = rr6.restrictionDialog;
            int i2 = rr6.toRestrictionDialog;
            Parcelable parcelable = w77Var.b;
            Parcelable parcelable2 = w77Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(RestrictionInfo.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("restrictionInfo", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(RestrictionInfo.class)) {
                    throw new UnsupportedOperationException(RestrictionInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("restrictionInfo", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = w77Var;
        }

        public final w77 getArgs() {
            return this.args;
        }
    }

    public static final class Reviews extends NavIntentDirections {
        private final yr args;

        public Reviews(yr yrVar) {
            js3.p(yrVar, "args");
            int i = rr6.review;
            int i2 = rr6.toReviews;
            Serializable serializable = yrVar.g;
            Serializable serializable2 = yrVar.f;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", yrVar.a);
            bundle.putString("detailSubscriberId", yrVar.b);
            bundle.putFloat("averageRate", yrVar.c);
            bundle.putIntArray("rates", yrVar.d);
            bundle.putIntArray("ratesOnly", yrVar.e);
            if (Parcelable.class.isAssignableFrom(ReviewDto.class)) {
                bundle.putParcelable(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, (Parcelable) serializable2);
            } else {
                if (!Serializable.class.isAssignableFrom(ReviewDto.class)) {
                    throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, serializable2);
            }
            if (Parcelable.class.isAssignableFrom(ToolbarData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("application", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ToolbarData.class)) {
                    throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("application", serializable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = yrVar;
        }

        public final yr getArgs() {
            return this.args;
        }
    }

    public static abstract class RootIntentDirections extends NavIntentDirections {
        private final Bundle bundle;
        private final int rootId;

        public /* synthetic */ RootIntentDirections(int i, Bundle bundle, yd1 yd1Var) {
            this(i, bundle);
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public final int getRootId() {
            return this.rootId;
        }

        private RootIntentDirections(int i, Bundle bundle) {
            super(i, 0, bundle, null, 8, null);
            this.rootId = i;
            this.bundle = bundle;
        }

        public /* synthetic */ RootIntentDirections(int i, Bundle bundle, int i2, yd1 yd1Var) {
            this(i, (i2 & 2) != 0 ? new Bundle() : bundle, null);
        }
    }

    public static final class RootUpdate extends RootIntentDirections {
        private final da7 args;

        public RootUpdate(da7 da7Var) {
            js3.p(da7Var, "args");
            int i = rr6.rootUpdate;
            Bundle bundle = new Bundle();
            bundle.putBoolean("updateAll", da7Var.a);
            super(i, bundle, null);
            this.args = da7Var;
        }

        public final da7 getArgs() {
            return this.args;
        }
    }

    public static final class Schedule extends NavDialogDirections {
        private final pe7 args;

        public Schedule(pe7 pe7Var) {
            js3.p(pe7Var, "args");
            int i = rr6.scheduleTimeDialog;
            int i2 = rr6.toScheduleTimeDialog;
            Parcelable parcelable = pe7Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("clock", pe7Var.b);
            bundle.putString("title", pe7Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = pe7Var;
        }

        public final pe7 getArgs() {
            return this.args;
        }
    }

    public static final class ScheduleType extends NavDialogDirections {
        private final ve7 args;

        public ScheduleType(ve7 ve7Var) {
            js3.p(ve7Var, "args");
            int i = rr6.scheduleTypeDialog;
            int i2 = rr6.toScheduleTypeDialog;
            Parcelable parcelable = ve7Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putBoolean("isGprsEnable", ve7Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = ve7Var;
        }

        public final ve7 getArgs() {
            return this.args;
        }
    }

    public static final class ScheduleUpdate extends NavIntentDirections {
        public ScheduleUpdate() {
            super(rr6.scheduleUpdate, rr6.toSchedule, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class Search extends NavIntentDirections {
        private final yh7 args;

        public Search(yh7 yh7Var) {
            js3.p(yh7Var, "args");
            int i = rr6.search;
            int i2 = rr6.toSearch;
            Bundle bundle = new Bundle();
            bundle.putString("queryString", yh7Var.a);
            bundle.putString("querySource", yh7Var.b);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = yh7Var;
        }

        public final yh7 getArgs() {
            return this.args;
        }
    }

    public static final class SearchMovie extends NavIntentDirections {
        private final wi7 args;

        public SearchMovie(wi7 wi7Var) {
            js3.p(wi7Var, "args");
            int i = rr6.searchMovie;
            int i2 = rr6.toSearchMovie;
            Bundle bundle = new Bundle();
            bundle.putString("queryString", wi7Var.a);
            bundle.putString("querySource", wi7Var.b);
            bundle.putString("tab", wi7Var.c);
            bundle.putInt("index", wi7Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = wi7Var;
        }

        public final wi7 getArgs() {
            return this.args;
        }
    }

    public static final class SearchResult extends NavIntentDirections {
        private final ij7 args;

        public SearchResult(ij7 ij7Var) {
            js3.p(ij7Var, "args");
            int i = rr6.searchResult;
            int i2 = rr6.toSearchResult;
            Bundle bundle = new Bundle();
            bundle.putString("query", ij7Var.a);
            bundle.putString("querySource", ij7Var.b);
            bundle.putString("tab", ij7Var.c);
            bundle.putInt("index", ij7Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = ij7Var;
        }

        public final ij7 getArgs() {
            return this.args;
        }
    }

    public static final class SearchUser extends NavIntentDirections {
        private final yg5 args;

        public SearchUser(yg5 yg5Var) {
            js3.p(yg5Var, "args");
            int i = rr6.searchUser;
            int i2 = rr6.toSearchUser;
            Bundle bundle = new Bundle();
            bundle.putString("queryString", yg5Var.a);
            bundle.putString("querySource", yg5Var.b);
            bundle.putInt("index", yg5Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = yg5Var;
        }

        public final yg5 getArgs() {
            return this.args;
        }
    }

    public static final class SecurityShield extends NavIntentDirections {
        public SecurityShield() {
            super(rr6.securityShield, rr6.toSecurityShield, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class SelectCity extends NavIntentDirections {
        private final em7 args;

        public SelectCity(em7 em7Var) {
            js3.p(em7Var, "args");
            int i = rr6.selectCity;
            int i2 = rr6.toSelectCity;
            Parcelable parcelable = em7Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = em7Var;
        }

        public final em7 getArgs() {
            return this.args;
        }
    }

    public static final class SendAppDetail extends NavIntentDirections {
        private final tn7 args;

        public SendAppDetail(tn7 tn7Var) {
            js3.p(tn7Var, "args");
            int i = rr6.sendAppDetail;
            int i2 = rr6.toSendAppDetail;
            Bundle bundle = new Bundle();
            bundle.putString("packageName", tn7Var.a);
            bundle.putString("deviceName", tn7Var.b);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = tn7Var;
        }

        public final tn7 getArgs() {
            return this.args;
        }
    }

    public static final class Setting extends NavIntentDirections {
        public Setting() {
            super(rr6.setting, rr6.toSetting, new Bundle(0), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class SignNotMatch extends NavDialogDirections {
        private final us args;

        public SignNotMatch(us usVar) {
            js3.p(usVar, "args");
            int i = rr6.appSignNotMatchDialog;
            int i2 = rr6.toAppSignNotMatchDialog;
            Parcelable parcelable = usVar.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("packageName", usVar.b);
            super(i, i2, bundle, null, 8, null);
            this.args = usVar;
        }

        public final us getArgs() {
            return this.args;
        }
    }

    public static final class SingleChoice extends NavDialogDirections {
        private final yw7 args;

        public SingleChoice(yw7 yw7Var) {
            js3.p(yw7Var, "args");
            int i = rr6.singleChoiceDialog;
            int i2 = rr6.toSingleChoiceDialog;
            Parcelable parcelable = yw7Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", yw7Var.b);
            bundle.putString("titleButton", yw7Var.c);
            bundle.putStringArray("items", yw7Var.d);
            bundle.putInt("selectIndex", yw7Var.e);
            bundle.putBoolean("isDismissOnAction", yw7Var.g);
            bundle.putString("hintMessage", yw7Var.f);
            super(i, i2, bundle, null, 8, null);
            this.args = yw7Var;
        }

        public final yw7 getArgs() {
            return this.args;
        }
    }

    public static final class SingleSelect extends NavDialogDirections {
        private final nx7 args;

        public SingleSelect(nx7 nx7Var) {
            js3.p(nx7Var, "args");
            int i = rr6.singleSelectDialog;
            int i2 = rr6.toSingleSelectDialog;
            Serializable serializable = nx7Var.e;
            Parcelable parcelable = nx7Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("title", nx7Var.b);
            bundle.putParcelableArray("checkBoxItems", nx7Var.c);
            bundle.putInt("checkedItem", nx7Var.d);
            if (Parcelable.class.isAssignableFrom(ThemeData.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("theme", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ThemeData.class)) {
                    throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("theme", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = nx7Var;
        }

        public final nx7 getArgs() {
            return this.args;
        }
    }

    public static final class SocialSearch extends NavIntentDirections {
        private final xh7 args;

        public SocialSearch(xh7 xh7Var) {
            js3.p(xh7Var, "args");
            int i = rr6.userSearchContent;
            int i2 = rr6.toUserSearchContent;
            Bundle bundle = new Bundle();
            bundle.putString("queryString", xh7Var.a);
            bundle.putString("querySource", xh7Var.b);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = xh7Var;
        }

        public final xh7 getArgs() {
            return this.args;
        }
    }

    public static final class StreamerMovies extends NavIntentDirections {
        private final w68 args;

        public StreamerMovies(w68 w68Var) {
            js3.p(w68Var, "args");
            int i = rr6.streamerMovies;
            int i2 = rr6.toStreamerMovies;
            Bundle bundle = new Bundle();
            bundle.putString("streamerKey", w68Var.a);
            super(i, i2, bundle, null, 8, null);
            this.args = w68Var;
        }

        public final w68 getArgs() {
            return this.args;
        }
    }

    public static final class StreamerProfile extends NavIntentDirections {
        private final h78 args;

        public StreamerProfile(h78 h78Var) {
            js3.p(h78Var, "args");
            int i = rr6.streamerProfile;
            int i2 = rr6.toStreamerProfile;
            Bundle bundle = new Bundle();
            bundle.putString("streamerKey", h78Var.a);
            bundle.putString("refId", h78Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = h78Var;
        }

        public final h78 getArgs() {
            return this.args;
        }
    }

    public static final class StreamersMore extends NavDialogDirections {
        public StreamersMore() {
            super(rr6.moreStreamers, rr6.toMoreStreamers, new Bundle(), NavIntentDirections.Companion.getDefaultTransitions(), null);
        }
    }

    public static final class Suggest extends NavIntentDirections {
        private final nb8 args;

        public Suggest(nb8 nb8Var) {
            js3.p(nb8Var, "args");
            int i = rr6.suggest;
            int i2 = rr6.toSuggest;
            Serializable serializable = nb8Var.b;
            Bundle bundle = new Bundle();
            bundle.putString("suggestQueryString", nb8Var.a);
            if (Parcelable.class.isAssignableFrom(GoogleSearchConfigDto.class)) {
                bundle.putParcelable("googleSearchConfig", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(GoogleSearchConfigDto.class)) {
                    throw new UnsupportedOperationException(GoogleSearchConfigDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("googleSearchConfig", serializable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = nb8Var;
        }

        public final nb8 getArgs() {
            return this.args;
        }
    }

    public static final class Survey extends NavIntentDirections {
        private final sc8 args;

        public Survey(sc8 sc8Var) {
            js3.p(sc8Var, "args");
            int i = rr6.survey;
            int i2 = rr6.toSurvey;
            Serializable serializable = sc8Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ApplicationSurveyDto.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(ApplicationSurveyDto.class)) {
                    throw new UnsupportedOperationException(ApplicationSurveyDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", serializable);
            }
            bundle.putString("packageName", sc8Var.b);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = sc8Var;
        }

        public final sc8 getArgs() {
            return this.args;
        }
    }

    public static final class ThemeStyle extends NavIntentDirections {
        public ThemeStyle() {
            super(rr6.themeStyleFragment, rr6.toThemeStyleFragment, new Bundle(), null, 8, null);
        }
    }

    public static final class Togo extends NavIntentDirections {
        private final xm8 args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Togo(xm8 xm8Var) {
            super(rr6.togo, rr6.toTogo, xm8Var.a(), NavIntentDirections.Companion.getDefaultTransitions(), null);
            js3.p(xm8Var, "args");
            this.args = xm8Var;
        }

        public final xm8 getArgs() {
            return this.args;
        }
    }

    public static final class UnbindAllLogin extends NavDialogDirections {
        private final kx8 args;

        public UnbindAllLogin(kx8 kx8Var) {
            js3.p(kx8Var, "args");
            int i = rr6.unbindAllLogin;
            int i2 = rr6.toUnbindAllLogin;
            Parcelable parcelable = kx8Var.b;
            Parcelable parcelable2 = kx8Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(LoginData.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("loginData", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(LoginData.class)) {
                    throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("loginData", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = kx8Var;
        }

        public final kx8 getArgs() {
            return this.args;
        }
    }

    public static final class Update extends NavIntentDirections {
        public Update() {
            super(rr6.update, rr6.toUpdate, new Bundle(), null, 8, null);
        }
    }

    public static final class UrlAlert extends NavDialogDirections {
        private final m09 args;

        public UrlAlert(m09 m09Var) {
            js3.p(m09Var, "args");
            int i = rr6.urlAlertDialog;
            int i2 = rr6.toUrlAlertDialog;
            Parcelable parcelable = m09Var.b;
            Parcelable parcelable2 = m09Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable2);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable2);
            }
            if (Parcelable.class.isAssignableFrom(UrlDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("urlData", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(UrlDataModel.class)) {
                    throw new UnsupportedOperationException(UrlDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("urlData", (Serializable) parcelable);
            }
            bundle.putString("TextButton", m09Var.c);
            super(i, i2, bundle, null, 8, null);
            this.args = m09Var;
        }

        public final m09 getArgs() {
            return this.args;
        }
    }

    public static final class UrlReceive extends NavIntentDirections {
        private final t09 args;

        public UrlReceive(t09 t09Var) {
            js3.p(t09Var, "args");
            int i = rr6.urlReceive;
            int i2 = rr6.toUrlReceive;
            Bundle bundle = new Bundle();
            bundle.putString("url", t09Var.a);
            bundle.putString("launchSource", t09Var.b);
            bundle.putString("title", t09Var.c);
            bundle.putString("type", t09Var.d);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = t09Var;
        }

        public final t09 getArgs() {
            return this.args;
        }
    }

    public static final class UserList extends NavIntentDirections {
        private final g19 args;

        public UserList(g19 g19Var) {
            js3.p(g19Var, "args");
            int i = rr6.userList;
            int i2 = rr6.toUserList;
            Bundle bundle = new Bundle();
            bundle.putString("id", g19Var.a);
            bundle.putString("title", g19Var.b);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = g19Var;
        }

        public final g19 getArgs() {
            return this.args;
        }
    }

    public static final class UserProfile extends NavIntentDirections {
        private final o19 args;

        public UserProfile(o19 o19Var) {
            js3.p(o19Var, "args");
            int i = rr6.userProfile;
            int i2 = rr6.toUserProfile;
            Bundle bundle = new Bundle();
            bundle.putString("accountKey", o19Var.a);
            bundle.putString("nickname", o19Var.b);
            bundle.putString("refId", o19Var.c);
            super(i, i2, bundle, NavIntentDirections.Companion.getDefaultTransitions(), null);
            this.args = o19Var;
        }

        public final o19 getArgs() {
            return this.args;
        }
    }

    public static final class Username extends NavDialogDirections {
        private final c29 args;

        public Username(c29 c29Var) {
            js3.p(c29Var, "args");
            int i = rr6.usernameDialog;
            int i2 = rr6.toUsernameDialog;
            Parcelable parcelable = c29Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            bundle.putString("username", c29Var.b);
            super(i, i2, bundle, null, 8, null);
            this.args = c29Var;
        }

        public final c29 getArgs() {
            return this.args;
        }
    }

    public static final class VersionNote extends NavDialogDirections {
        private final m49 args;

        public VersionNote(m49 m49Var) {
            js3.p(m49Var, "args");
            int i = rr6.versionNoteDialog;
            int i2 = rr6.toVersionNoteDialog;
            Parcelable parcelable = m49Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = m49Var;
        }

        public final m49 getArgs() {
            return this.args;
        }
    }

    public static final class WebView extends NavIntentDirections {
        private final zc9 args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebView(zc9 zc9Var) {
            super(rr6.webView, rr6.toWebView, zc9Var.a(), NavIntentDirections.Companion.getDefaultTransitions(), null);
            js3.p(zc9Var, "args");
            this.args = zc9Var;
        }

        public final zc9 getArgs() {
            return this.args;
        }
    }

    public static final class Welcome extends NavIntentDirections {
        private final td9 args;

        public Welcome(td9 td9Var) {
            js3.p(td9Var, "args");
            int i = rr6.welcomeProfile;
            int i2 = rr6.toWelcomeProfile;
            Parcelable parcelable = td9Var.f;
            Serializable serializable = td9Var.a;
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(Step.class)) {
                js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("step", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(Step.class)) {
                    throw new UnsupportedOperationException(Step.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("step", serializable);
            }
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, td9Var.b);
            bundle.putString("birthday", td9Var.c);
            bundle.putString("gender", td9Var.d);
            bundle.putString("avatar", td9Var.e);
            if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
                js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("data", parcelable);
            } else {
                if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                    throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("data", (Serializable) parcelable);
            }
            super(i, i2, bundle, null, 8, null);
            this.args = td9Var;
        }

        public final td9 getArgs() {
            return this.args;
        }
    }

    public /* synthetic */ NavIntentDirections(int i, int i2, Bundle bundle, lj5 lj5Var, yd1 yd1Var) {
        this(i, i2, bundle, lj5Var);
    }

    @Override // defpackage.yi5
    public int getActionId() {
        return this.actionId;
    }

    @Override // defpackage.yi5
    public Bundle getArguments() {
        return this.arguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public lj5 getNavOptions() {
        return this.navOptions;
    }

    private NavIntentDirections(int i, int i2, Bundle bundle, lj5 lj5Var) {
        this.destinationId = i;
        this.actionId = i2;
        this.arguments = bundle;
        this.navOptions = lj5Var;
    }

    public /* synthetic */ NavIntentDirections(int i, int i2, Bundle bundle, lj5 lj5Var, int i3, yd1 yd1Var) {
        this(i, i2, bundle, (i3 & 8) != 0 ? null : lj5Var, null);
    }
}
