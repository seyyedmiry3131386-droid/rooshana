package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.databinding.ObservableParcelable;
import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.session.legacy.MediaBrowserCompat$MediaItem;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.core.analytics.FilterEventBuilder;
import ir.mservices.market.core.analytics.InboxEventBuilder;
import ir.mservices.market.core.analytics.LaunchAppDetailsEventBuilder;
import ir.mservices.market.loggers.analytics.AnalyticsEventParcelable;
import ir.mservices.market.login.data.BindData;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.myket.auth.domain.models.AuthData;
import ir.myket.movie.common.domain.models.AdInfo;
import ir.myket.movie.common.domain.models.Credits;
import ir.myket.movie.common.domain.models.MovieCredit;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fr5 implements Parcelable.Creator {
    public static final fr5 b = new fr5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fr5(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        switch (this.a) {
            case 0:
                Parcelable parcelable = parcel.readParcelable(fr5.class.getClassLoader());
                ObservableParcelable observableParcelable = new ObservableParcelable();
                observableParcelable.j = parcelable;
                return observableParcelable;
            case 1:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return ApiMetadata.d;
                }
                int iJ = cc7.J(parcel);
                boolean zU = false;
                ComplianceOptions complianceOptions = null;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        complianceOptions = (ComplianceOptions) cc7.j(parcel, i, ComplianceOptions.CREATOR);
                    } else if (c != 2) {
                        cc7.E(i, parcel);
                    } else {
                        zU = cc7.u(i, parcel);
                    }
                }
                cc7.p(iJ, parcel);
                return new ApiMetadata(complianceOptions, zU);
            case 2:
                return new ActionBarEventBuilder(parcel);
            case 3:
                js3.p(parcel, "parcel");
                return new ActivityResult(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 4:
                js3.p(parcel, "parcel");
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                h66 h66Var = h66.d;
                js3.n(h66Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
                e66 e66VarBuild = h66Var;
                if (!linkedHashMap.isEmpty()) {
                    i66 i66Var = new i66(h66Var);
                    i66Var.putAll(linkedHashMap);
                    e66VarBuild = i66Var.build();
                }
                return new AdInfo(i2, e66VarBuild);
            case 5:
                return new AnalyticsEventParcelable(parcel);
            case 6:
                js3.p(parcel, "parcel");
                return new AuthData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.i = 255;
                badgeState$State.k = -2;
                badgeState$State.l = -2;
                badgeState$State.m = -2;
                badgeState$State.t = Boolean.TRUE;
                badgeState$State.a = parcel.readInt();
                badgeState$State.b = (Integer) parcel.readSerializable();
                badgeState$State.c = (Integer) parcel.readSerializable();
                badgeState$State.d = (Integer) parcel.readSerializable();
                badgeState$State.e = (Integer) parcel.readSerializable();
                badgeState$State.f = (Integer) parcel.readSerializable();
                badgeState$State.g = (Integer) parcel.readSerializable();
                badgeState$State.h = (Integer) parcel.readSerializable();
                badgeState$State.i = parcel.readInt();
                badgeState$State.j = parcel.readString();
                badgeState$State.k = parcel.readInt();
                badgeState$State.l = parcel.readInt();
                badgeState$State.m = parcel.readInt();
                badgeState$State.o = parcel.readString();
                badgeState$State.p = parcel.readString();
                badgeState$State.q = parcel.readInt();
                badgeState$State.s = (Integer) parcel.readSerializable();
                badgeState$State.u = (Integer) parcel.readSerializable();
                badgeState$State.v = (Integer) parcel.readSerializable();
                badgeState$State.w = (Integer) parcel.readSerializable();
                badgeState$State.x = (Integer) parcel.readSerializable();
                badgeState$State.y = (Integer) parcel.readSerializable();
                badgeState$State.z = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.t = (Boolean) parcel.readSerializable();
                badgeState$State.n = (Locale) parcel.readSerializable();
                badgeState$State.D = (Boolean) parcel.readSerializable();
                badgeState$State.E = (Integer) parcel.readSerializable();
                return badgeState$State;
            case 8:
                return new ClickEventBuilder(parcel);
            case 9:
                js3.p(parcel, "parcel");
                return new Credits(parcel.readInt() == 0 ? null : MovieCredit.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MovieCredit.CREATOR.createFromParcel(parcel) : null);
            case 10:
                return new DateValidatorPointBackward(parcel.readLong());
            case 11:
                return new DateValidatorPointForward(parcel.readLong());
            case 12:
                return new DownloadRequest(parcel);
            case 13:
                return new DrmInitData(parcel);
            case 14:
                return new FilterEventBuilder(parcel);
            case 15:
                return new InboxEventBuilder(parcel);
            case 16:
                js3.p(parcel, "inParcel");
                Parcelable parcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                js3.m(parcelable2);
                return new IntentSenderRequest((IntentSender) parcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 17:
                return new LaunchAppDetailsEventBuilder(parcel);
            case 18:
                LineMenuItemData lineMenuItemData = new LineMenuItemData();
                lineMenuItemData.a = parcel.readString();
                lineMenuItemData.b = parcel.readString();
                lineMenuItemData.c = parcel.readInt();
                return lineMenuItemData;
            case 19:
                js3.p(parcel, "parcel");
                LoginData loginData = new LoginData((BindData) null, (String) null, "", (String) null, (String) null, (String) null, (String) null, 1016);
                loginData.a = (BindData) parcel.readParcelable(LoginData.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                loginData.c = string;
                loginData.b = parcel.readString();
                loginData.d = parcel.readString();
                loginData.e = parcel.readString();
                loginData.f = parcel.readString();
                loginData.g = parcel.readString();
                loginData.h = parcel.readString();
                loginData.i = parcel.readString();
                loginData.j = parcel.readByte() != 0;
                return loginData;
            case 20:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 21:
                return new android.support.v4.media.MediaBrowserCompat$MediaItem(parcel);
            case 22:
                return MediaDescriptionCompat.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case 23:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = to4.g(mediaDescription);
                CharSequence charSequenceI = to4.i(mediaDescription);
                CharSequence charSequenceH = to4.h(mediaDescription);
                CharSequence charSequenceC = to4.c(mediaDescription);
                Bitmap bitmapE = to4.e(mediaDescription);
                Uri uriF = to4.f(mediaDescription);
                Bundle bundleD = to4.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = rq4.R(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = uo4.a(mediaDescription);
                }
                android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat = new android.support.v4.media.MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.i = mediaDescription;
                return mediaDescriptionCompat;
            case 24:
                return new MediaMetadataCompat(parcel);
            case 25:
                return new android.support.v4.media.MediaMetadataCompat(parcel);
            case 26:
                return new MediaSessionCompat$QueueItem(parcel);
            case 27:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem(parcel);
            case 28:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new MediaSessionCompat$Token(token, null, null);
            default:
                return new android.support.v4.media.session.MediaSessionCompat$Token(parcel.readParcelable(null), null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ObservableParcelable[i];
            case 1:
                return new ApiMetadata[i];
            case 2:
                return new ActionBarEventBuilder[i];
            case 3:
                return new ActivityResult[i];
            case 4:
                return new AdInfo[i];
            case 5:
                return new AnalyticsEventParcelable[i];
            case 6:
                return new AuthData[i];
            case 7:
                return new BadgeState$State[i];
            case 8:
                return new ClickEventBuilder[i];
            case 9:
                return new Credits[i];
            case 10:
                return new DateValidatorPointBackward[i];
            case 11:
                return new DateValidatorPointForward[i];
            case 12:
                return new DownloadRequest[i];
            case 13:
                return new DrmInitData[i];
            case 14:
                return new FilterEventBuilder[i];
            case 15:
                return new InboxEventBuilder[i];
            case 16:
                return new IntentSenderRequest[i];
            case 17:
                return new LaunchAppDetailsEventBuilder[i];
            case 18:
                return new LineMenuItemData[i];
            case 19:
                return new LoginData[i];
            case 20:
                return new MediaBrowserCompat$MediaItem[i];
            case 21:
                return new android.support.v4.media.MediaBrowserCompat$MediaItem[i];
            case 22:
                return new MediaDescriptionCompat[i];
            case 23:
                return new android.support.v4.media.MediaDescriptionCompat[i];
            case 24:
                return new MediaMetadataCompat[i];
            case 25:
                return new android.support.v4.media.MediaMetadataCompat[i];
            case 26:
                return new MediaSessionCompat$QueueItem[i];
            case 27:
                return new android.support.v4.media.session.MediaSessionCompat$QueueItem[i];
            case 28:
                return new MediaSessionCompat$Token[i];
            default:
                return new android.support.v4.media.session.MediaSessionCompat$Token[i];
        }
    }
}
