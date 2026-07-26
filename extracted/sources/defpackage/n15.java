package defpackage;

import android.os.Bundle;
import ir.mservices.market.app.packages.ui.PackageRecyclerListFragment;
import ir.mservices.market.app.suggest.detail.ui.PlayDetailFragment;
import ir.mservices.market.login.ui.PinLoginDialogFragment;
import ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment;
import ir.mservices.market.movie.ui.home.OtherHomeFragment;
import ir.mservices.market.movie.ui.list.MovieMoreRecyclerListFragment;
import ir.mservices.market.myAccount.MyAccountRecyclerListFragment;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment;
import ir.mservices.market.pika.connect.PikaConnectFragment;
import ir.mservices.market.pika.connect.dialog.PikaConfirmDialogFragment;
import ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog;
import ir.mservices.market.pika.connect.dialog.PikaUpdateDialogFragment;
import ir.mservices.market.pika.home.dialog.NeedPermissionDialog;
import ir.mservices.market.pika.home.dialog.PikaPermissionBottomDialog;
import ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment;
import ir.mservices.market.pika.receive.dialog.PikaInstallFailedDialogFragment;
import ir.mservices.market.social.list.common.ProfileAddListToOwnProfileDialogFragment;
import ir.mservices.market.social.list.common.ProfileListTitleDialogFragment;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment;
import ir.mservices.market.social.search.MynetSearchFragment;
import ir.mservices.market.version2.fragments.MovieIbexFragment;
import ir.mservices.market.version2.fragments.dialog.MyketUpdateBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.PaymentRetryBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import ir.myket.player.provider.service.PlaybackService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n15 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                MovieDetailMoreListRecyclerListFragment movieDetailMoreListRecyclerListFragment = (MovieDetailMoreListRecyclerListFragment) this.b;
                Bundle bundle = movieDetailMoreListRecyclerListFragment.g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + movieDetailMoreListRecyclerListFragment + " has null arguments");
            case 1:
                MovieIbexFragment movieIbexFragment = (MovieIbexFragment) this.b;
                Bundle bundle2 = movieIbexFragment.g;
                if (bundle2 != null) {
                    return bundle2;
                }
                throw new IllegalStateException("Fragment " + movieIbexFragment + " has null arguments");
            case 2:
                MovieMoreRecyclerListFragment movieMoreRecyclerListFragment = (MovieMoreRecyclerListFragment) this.b;
                Bundle bundle3 = movieMoreRecyclerListFragment.g;
                if (bundle3 != null) {
                    return bundle3;
                }
                throw new IllegalStateException("Fragment " + movieMoreRecyclerListFragment + " has null arguments");
            case 3:
                MovieReviewsRecyclerListFragment movieReviewsRecyclerListFragment = (MovieReviewsRecyclerListFragment) this.b;
                Bundle bundle4 = movieReviewsRecyclerListFragment.g;
                if (bundle4 != null) {
                    return bundle4;
                }
                throw new IllegalStateException("Fragment " + movieReviewsRecyclerListFragment + " has null arguments");
            case 4:
                MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = (MovieSeasonsRecyclerListFragment) this.b;
                Bundle bundle5 = movieSeasonsRecyclerListFragment.g;
                if (bundle5 != null) {
                    return bundle5;
                }
                throw new IllegalStateException("Fragment " + movieSeasonsRecyclerListFragment + " has null arguments");
            case 5:
                MyAccountRecyclerListFragment myAccountRecyclerListFragment = (MyAccountRecyclerListFragment) this.b;
                Bundle bundle6 = myAccountRecyclerListFragment.g;
                if (bundle6 != null) {
                    return bundle6;
                }
                throw new IllegalStateException("Fragment " + myAccountRecyclerListFragment + " has null arguments");
            case 6:
                MyketUpdateBottomDialogFragment myketUpdateBottomDialogFragment = (MyketUpdateBottomDialogFragment) this.b;
                Bundle bundle7 = myketUpdateBottomDialogFragment.g;
                if (bundle7 != null) {
                    return bundle7;
                }
                throw new IllegalStateException("Fragment " + myketUpdateBottomDialogFragment + " has null arguments");
            case 7:
                MynetSearchFragment mynetSearchFragment = (MynetSearchFragment) this.b;
                Bundle bundle8 = mynetSearchFragment.g;
                if (bundle8 != null) {
                    return bundle8;
                }
                throw new IllegalStateException("Fragment " + mynetSearchFragment + " has null arguments");
            case 8:
                NeedPermissionDialog needPermissionDialog = (NeedPermissionDialog) this.b;
                Bundle bundle9 = needPermissionDialog.g;
                if (bundle9 != null) {
                    return bundle9;
                }
                throw new IllegalStateException("Fragment " + needPermissionDialog + " has null arguments");
            case 9:
                NicknameDialogFragment nicknameDialogFragment = (NicknameDialogFragment) this.b;
                Bundle bundle10 = nicknameDialogFragment.g;
                if (bundle10 != null) {
                    return bundle10;
                }
                throw new IllegalStateException("Fragment " + nicknameDialogFragment + " has null arguments");
            case 10:
                OtherHomeFragment otherHomeFragment = (OtherHomeFragment) this.b;
                Bundle bundle11 = otherHomeFragment.g;
                if (bundle11 != null) {
                    return bundle11;
                }
                throw new IllegalStateException("Fragment " + otherHomeFragment + " has null arguments");
            case 11:
                ir.mservices.market.app.home.OtherHomeFragment otherHomeFragment2 = (ir.mservices.market.app.home.OtherHomeFragment) this.b;
                Bundle bundle12 = otherHomeFragment2.g;
                if (bundle12 != null) {
                    return bundle12;
                }
                throw new IllegalStateException("Fragment " + otherHomeFragment2 + " has null arguments");
            case 12:
                PackageRecyclerListFragment packageRecyclerListFragment = (PackageRecyclerListFragment) this.b;
                Bundle bundle13 = packageRecyclerListFragment.g;
                if (bundle13 != null) {
                    return bundle13;
                }
                throw new IllegalStateException("Fragment " + packageRecyclerListFragment + " has null arguments");
            case 13:
                PaymentRetryBottomDialogFragment paymentRetryBottomDialogFragment = (PaymentRetryBottomDialogFragment) this.b;
                Bundle bundle14 = paymentRetryBottomDialogFragment.g;
                if (bundle14 != null) {
                    return bundle14;
                }
                throw new IllegalStateException("Fragment " + paymentRetryBottomDialogFragment + " has null arguments");
            case 14:
                ArrayList arrayList = ((o46) this.b).a;
                rb5 rb5Var = new rb5(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fy3 fy3Var = (fy3) arrayList.get(i);
                    Object obj = fy3Var.b;
                    int i2 = fy3Var.a;
                    ba5.a(rb5Var, obj != null ? new ku3(Integer.valueOf(i2), fy3Var.b) : Integer.valueOf(i2), fy3Var);
                }
                return new ba5(rb5Var);
            case 15:
                PikaConfirmDialogFragment pikaConfirmDialogFragment = (PikaConfirmDialogFragment) this.b;
                Bundle bundle15 = pikaConfirmDialogFragment.g;
                if (bundle15 != null) {
                    return bundle15;
                }
                throw new IllegalStateException("Fragment " + pikaConfirmDialogFragment + " has null arguments");
            case 16:
                PikaConnectFragment pikaConnectFragment = (PikaConnectFragment) this.b;
                Bundle bundle16 = pikaConnectFragment.g;
                if (bundle16 != null) {
                    return bundle16;
                }
                throw new IllegalStateException("Fragment " + pikaConnectFragment + " has null arguments");
            case 17:
                PikaInstallFailedDialogFragment pikaInstallFailedDialogFragment = (PikaInstallFailedDialogFragment) this.b;
                Bundle bundle17 = pikaInstallFailedDialogFragment.g;
                if (bundle17 != null) {
                    return bundle17;
                }
                throw new IllegalStateException("Fragment " + pikaInstallFailedDialogFragment + " has null arguments");
            case 18:
                PikaPermissionBottomDialog pikaPermissionBottomDialog = (PikaPermissionBottomDialog) this.b;
                Bundle bundle18 = pikaPermissionBottomDialog.g;
                if (bundle18 != null) {
                    return bundle18;
                }
                throw new IllegalStateException("Fragment " + pikaPermissionBottomDialog + " has null arguments");
            case 19:
                PikaSelectDeviceBottomDialog pikaSelectDeviceBottomDialog = (PikaSelectDeviceBottomDialog) this.b;
                Bundle bundle19 = pikaSelectDeviceBottomDialog.g;
                if (bundle19 != null) {
                    return bundle19;
                }
                throw new IllegalStateException("Fragment " + pikaSelectDeviceBottomDialog + " has null arguments");
            case 20:
                PikaUpdateDialogFragment pikaUpdateDialogFragment = (PikaUpdateDialogFragment) this.b;
                Bundle bundle20 = pikaUpdateDialogFragment.g;
                if (bundle20 != null) {
                    return bundle20;
                }
                throw new IllegalStateException("Fragment " + pikaUpdateDialogFragment + " has null arguments");
            case 21:
                PinLoginDialogFragment pinLoginDialogFragment = (PinLoginDialogFragment) this.b;
                Bundle bundle21 = pinLoginDialogFragment.g;
                if (bundle21 != null) {
                    return bundle21;
                }
                throw new IllegalStateException("Fragment " + pinLoginDialogFragment + " has null arguments");
            case 22:
                PlayDetailFragment playDetailFragment = (PlayDetailFragment) this.b;
                Bundle bundle22 = playDetailFragment.g;
                if (bundle22 != null) {
                    return bundle22;
                }
                throw new IllegalStateException("Fragment " + playDetailFragment + " has null arguments");
            case 23:
                return at2.c0((PlaybackService) this.b).b(g27.a(lz.class), null, null);
            case 24:
                ProfileAddListToOwnProfileDialogFragment profileAddListToOwnProfileDialogFragment = (ProfileAddListToOwnProfileDialogFragment) this.b;
                Bundle bundle23 = profileAddListToOwnProfileDialogFragment.g;
                if (bundle23 != null) {
                    return bundle23;
                }
                throw new IllegalStateException("Fragment " + profileAddListToOwnProfileDialogFragment + " has null arguments");
            case 25:
                ProfileAppListMoreFragment profileAppListMoreFragment = (ProfileAppListMoreFragment) this.b;
                Bundle bundle24 = profileAppListMoreFragment.g;
                if (bundle24 != null) {
                    return bundle24;
                }
                throw new IllegalStateException("Fragment " + profileAppListMoreFragment + " has null arguments");
            case 26:
                ProfileListTitleDialogFragment profileListTitleDialogFragment = (ProfileListTitleDialogFragment) this.b;
                Bundle bundle25 = profileListTitleDialogFragment.g;
                if (bundle25 != null) {
                    return bundle25;
                }
                throw new IllegalStateException("Fragment " + profileListTitleDialogFragment + " has null arguments");
            case 27:
                ProfileMovieListMoreFragment profileMovieListMoreFragment = (ProfileMovieListMoreFragment) this.b;
                Bundle bundle26 = profileMovieListMoreFragment.g;
                if (bundle26 != null) {
                    return bundle26;
                }
                throw new IllegalStateException("Fragment " + profileMovieListMoreFragment + " has null arguments");
            case 28:
                ProgressDialogFragment progressDialogFragment = (ProgressDialogFragment) this.b;
                Bundle bundle27 = progressDialogFragment.g;
                if (bundle27 != null) {
                    return bundle27;
                }
                throw new IllegalStateException("Fragment " + progressDialogFragment + " has null arguments");
            default:
                ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = (ReceiveAppRecyclerListFragment) this.b;
                Bundle bundle28 = receiveAppRecyclerListFragment.g;
                if (bundle28 != null) {
                    return bundle28;
                }
                throw new IllegalStateException("Fragment " + receiveAppRecyclerListFragment + " has null arguments");
        }
    }
}
