package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.session.legacy.RatingCompat;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.firebase.Timestamp;
import com.google.firebase.messaging.RemoteMessage;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.core.analytics.SortEventBuilder;
import ir.mservices.market.core.analytics.UpdateDialogEventBuilder;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.core.notification.PushMessageAction;
import ir.mservices.market.data.permission.ReadStoragePermission;
import ir.mservices.market.data.permission.WriteStoragePermission;
import ir.mservices.market.login.data.UnbindAllBindData;
import ir.mservices.market.version2.ui.ScreenWatchAnalyticsEvent;
import ir.myket.movie.common.domain.models.RecommendationTime;
import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.movie.common.domain.models.SampleWatch;
import ir.myket.movie.common.domain.models.SubscriptionItem;
import ir.myket.player.domain.models.ShareModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ao6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ao6(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        og3 og3Var;
        int iY = 0;
        int iY2 = 0;
        int iY3 = 0;
        boolean zU = false;
        int iY4 = 0;
        int iY5 = 0;
        Bundle bundleG = null;
        Scope[] scopeArr = null;
        String strK = null;
        String strK2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Bundle bundleG2 = null;
        switch (this.a) {
            case 0:
                return new PushMessageAction(parcel);
            case 1:
                RangeDateSelector rangeDateSelector = new RangeDateSelector();
                rangeDateSelector.b = null;
                rangeDateSelector.c = null;
                rangeDateSelector.d = null;
                rangeDateSelector.e = null;
                rangeDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
                rangeDateSelector.c = (Long) parcel.readValue(Long.class.getClassLoader());
                return rangeDateSelector;
            case 2:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 3:
                return new android.support.v4.media.RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new ReadStoragePermission(parcel);
            case 5:
                js3.p(parcel, "parcel");
                return new RecommendationTime(parcel.readInt());
            case 6:
                int iJ = cc7.J(parcel);
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        cc7.E(i, parcel);
                    } else {
                        bundleG = cc7.g(i, parcel);
                    }
                }
                cc7.p(iJ, parcel);
                return new RemoteMessage(bundleG);
            case 7:
                return new Requirements(parcel.readInt());
            case 8:
                js3.p(parcel, "parcel");
                return new RestrictionButton(parcel.readString(), parcel.readString());
            case 9:
                js3.p(parcel, "parcel");
                return new RestrictionInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RestrictionButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RestrictionButton.CREATOR.createFromParcel(parcel));
            case 10:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = g87.o;
                if (strongBinder == null) {
                    og3Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(og3.i);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof og3)) {
                        ng3 ng3Var = new ng3();
                        ng3Var.n = strongBinder;
                        og3Var = ng3Var;
                    } else {
                        og3Var = (og3) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.a = og3Var;
                return resultReceiver;
            case 11:
                js3.p(parcel, "parcel");
                return new SampleWatch(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RestrictionButton.CREATOR.createFromParcel(parcel));
            case 12:
                ScreenWatchAnalyticsEvent screenWatchAnalyticsEvent = new ScreenWatchAnalyticsEvent(parcel);
                screenWatchAnalyticsEvent.d = -1L;
                screenWatchAnalyticsEvent.e = -1L;
                screenWatchAnalyticsEvent.d = parcel.readLong();
                screenWatchAnalyticsEvent.e = parcel.readLong();
                return screenWatchAnalyticsEvent;
            case 13:
                js3.p(parcel, "parcel");
                return new ShareModel(parcel.readString(), parcel.readString());
            case 14:
                SingleDateSelector singleDateSelector = new SingleDateSelector();
                singleDateSelector.a = (Long) parcel.readValue(Long.class.getClassLoader());
                return singleDateSelector;
            case 15:
                return new SortEventBuilder(parcel);
            case 16:
                return new StreamKey(parcel);
            case 17:
                js3.p(parcel, "parcel");
                return new SubscriptionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                js3.p(parcel, "source");
                return new Timestamp(parcel.readInt(), parcel.readLong());
            case 19:
                js3.p(parcel, "parcel");
                return new Tracker(parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                js3.p(parcel, "parcel");
                return new UnbindAllBindData();
            case 21:
                return new UpdateDialogEventBuilder(parcel);
            case 22:
                return new ViewEventBuilder(parcel);
            case 23:
                return new WriteStoragePermission(parcel);
            case 24:
                int iJ2 = cc7.J(parcel);
                int iY6 = 0;
                while (parcel.dataPosition() < iJ2) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iY = cc7.y(i3, parcel);
                    } else if (c == 2) {
                        iY6 = cc7.y(i3, parcel);
                    } else if (c != 3) {
                        cc7.E(i3, parcel);
                    } else {
                        bundleG2 = cc7.g(i3, parcel);
                    }
                }
                cc7.p(iJ2, parcel);
                return new GoogleSignInOptionsExtensionParcelable(iY, iY6, bundleG2);
            case 25:
                int iJ3 = cc7.J(parcel);
                int iY7 = 0;
                while (parcel.dataPosition() < iJ3) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iY5 = cc7.y(i4, parcel);
                    } else if (c2 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) cc7.j(parcel, i4, ParcelFileDescriptor.CREATOR);
                    } else if (c2 != 3) {
                        cc7.E(i4, parcel);
                    } else {
                        iY7 = cc7.y(i4, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                return new BitmapTeleporter(iY5, parcelFileDescriptor, iY7);
            case 26:
                int iJ4 = cc7.J(parcel);
                while (parcel.dataPosition() < iJ4) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iY4 = cc7.y(i5, parcel);
                    } else if (c3 != 2) {
                        cc7.E(i5, parcel);
                    } else {
                        strK2 = cc7.k(i5, parcel);
                    }
                }
                cc7.p(iJ4, parcel);
                return new ClientIdentity(iY4, strK2);
            case 27:
                int iJ5 = cc7.J(parcel);
                int iY8 = 0;
                while (parcel.dataPosition() < iJ5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        zU = cc7.u(i6, parcel);
                    } else if (c4 != 2) {
                        cc7.E(i6, parcel);
                    } else {
                        iY8 = cc7.y(i6, parcel);
                    }
                }
                cc7.p(iJ5, parcel);
                return new ModuleAvailabilityResponse(iY8, zU);
            case 28:
                int iJ6 = cc7.J(parcel);
                int iY9 = 0;
                while (parcel.dataPosition() < iJ6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iY3 = cc7.y(i7, parcel);
                    } else if (c5 == 2) {
                        strK = cc7.k(i7, parcel);
                    } else if (c5 != 3) {
                        cc7.E(i7, parcel);
                    } else {
                        iY9 = cc7.y(i7, parcel);
                    }
                }
                cc7.p(iJ6, parcel);
                return new FavaDiagnosticsEntity(strK, iY3, iY9);
            default:
                int iJ7 = cc7.J(parcel);
                int iY10 = 0;
                int iY11 = 0;
                while (parcel.dataPosition() < iJ7) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iY2 = cc7.y(i8, parcel);
                    } else if (c6 == 2) {
                        iY10 = cc7.y(i8, parcel);
                    } else if (c6 == 3) {
                        iY11 = cc7.y(i8, parcel);
                    } else if (c6 != 4) {
                        cc7.E(i8, parcel);
                    } else {
                        scopeArr = (Scope[]) cc7.n(parcel, i8, Scope.CREATOR);
                    }
                }
                cc7.p(iJ7, parcel);
                return new zaaa(iY2, iY10, iY11, scopeArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PushMessageAction[i];
            case 1:
                return new RangeDateSelector[i];
            case 2:
                return new RatingCompat[i];
            case 3:
                return new android.support.v4.media.RatingCompat[i];
            case 4:
                return new ReadStoragePermission[i];
            case 5:
                return new RecommendationTime[i];
            case 6:
                return new RemoteMessage[i];
            case 7:
                return new Requirements[i];
            case 8:
                return new RestrictionButton[i];
            case 9:
                return new RestrictionInfo[i];
            case 10:
                return new ResultReceiver[i];
            case 11:
                return new SampleWatch[i];
            case 12:
                return new ScreenWatchAnalyticsEvent[i];
            case 13:
                return new ShareModel[i];
            case 14:
                return new SingleDateSelector[i];
            case 15:
                return new SortEventBuilder[i];
            case 16:
                return new StreamKey[i];
            case 17:
                return new SubscriptionItem[i];
            case 18:
                return new Timestamp[i];
            case 19:
                return new Tracker[i];
            case 20:
                return new UnbindAllBindData[i];
            case 21:
                return new UpdateDialogEventBuilder[i];
            case 22:
                return new ViewEventBuilder[i];
            case 23:
                return new WriteStoragePermission[i];
            case 24:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 25:
                return new BitmapTeleporter[i];
            case 26:
                return new ClientIdentity[i];
            case 27:
                return new ModuleAvailabilityResponse[i];
            case 28:
                return new FavaDiagnosticsEntity[i];
            default:
                return new zaaa[i];
        }
    }
}
