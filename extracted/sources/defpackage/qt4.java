package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ObservableShort;
import androidx.media3.session.legacy.ParcelableVolumeInfo;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.internal.ParcelableSparseBooleanArray;
import com.google.android.material.internal.ParcelableSparseIntArray;
import ir.mservices.market.core.analytics.MenuEventBuilder;
import ir.mservices.market.core.analytics.MultiSelectEventBuilder;
import ir.mservices.market.core.notification.PopupExtra;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.data.permission.NotificationPermission;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.movie.analytics.MovieClickEventBuilder;
import ir.myket.movie.common.domain.models.AdInfo;
import ir.myket.movie.common.domain.models.Credits;
import ir.myket.movie.common.domain.models.MovieCredit;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.movie.common.domain.models.MovieUri;
import ir.myket.movie.common.domain.models.Orientation;
import ir.myket.movie.common.domain.models.PlayerConfig;
import ir.myket.movie.common.domain.models.RecommendationTime;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import ir.myket.movie.common.domain.models.SampleWatch;
import ir.myket.player.domain.models.PlayerMovie;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.domain.models.ShareModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qt4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ qt4(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [pj3] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        RestrictionInfo restrictionInfo;
        PlayerConfig playerConfig;
        boolean z2;
        Object objB;
        boolean z3;
        switch (this.a) {
            case 0:
                return new MenuEventBuilder(parcel);
            case 1:
                js3.p(parcel, "source");
                return new MovieClickEventBuilder(parcel);
            case 2:
                js3.p(parcel, "parcel");
                return new MovieCredit(parcel.readInt(), parcel.readInt());
            case 3:
                js3.p(parcel, "parcel");
                v1 v1VarB = ml9.B(parcel.createStringArrayList());
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                PlayerConfig playerConfigCreateFromParcel = PlayerConfig.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    restrictionInfo = null;
                    playerConfig = playerConfigCreateFromParcel;
                    z2 = z;
                } else {
                    restrictionInfo = null;
                    playerConfig = playerConfigCreateFromParcel;
                    z2 = false;
                }
                RestrictionInfo restrictionInfoCreateFromParcel = parcel.readInt() == 0 ? restrictionInfo : RestrictionInfo.CREATOR.createFromParcel(parcel);
                Object objCreateFromParcel = restrictionInfo;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    objB = objCreateFromParcel;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(AdInfo.CREATOR.createFromParcel(parcel));
                    }
                    objB = ml9.B(arrayList);
                }
                RecommendationTime recommendationTimeCreateFromParcel = RecommendationTime.CREATOR.createFromParcel(parcel);
                Credits credits = (Credits) (parcel.readInt() == 0 ? objCreateFromParcel : Credits.CREATOR.createFromParcel(parcel));
                if (parcel.readInt() != 0) {
                    objCreateFromParcel = SampleWatch.CREATOR.createFromParcel(parcel);
                }
                return new MovieUri(v1VarB, z4, lValueOf, playerConfig, z2, restrictionInfoCreateFromParcel, string, objB, recommendationTimeCreateFromParcel, credits, (SampleWatch) objCreateFromParcel, ml9.B(parcel.createStringArrayList()), parcel.readString(), Orientation.valueOf(parcel.readString()), parcel.readInt() != 0 ? z : false);
            case 4:
                return new MultiSelectEventBuilder(parcel);
            case 5:
                return new NotificationPermission(parcel);
            case 6:
                boolean z5 = parcel.readInt() == 1;
                ObservableBoolean observableBoolean = new ObservableBoolean();
                observableBoolean.j = z5;
                return observableBoolean;
            case 7:
                byte b = parcel.readByte();
                ObservableByte observableByte = new ObservableByte();
                observableByte.j = b;
                return observableByte;
            case 8:
                char c = (char) parcel.readInt();
                ObservableChar observableChar = new ObservableChar();
                observableChar.j = c;
                return observableChar;
            case 9:
                double d = parcel.readDouble();
                ObservableDouble observableDouble = new ObservableDouble();
                observableDouble.j = d;
                return observableDouble;
            case 10:
                float f = parcel.readFloat();
                ObservableFloat observableFloat = new ObservableFloat();
                observableFloat.j = f;
                return observableFloat;
            case 11:
                int i3 = parcel.readInt();
                ObservableInt observableInt = new ObservableInt();
                observableInt.j = i3;
                return observableInt;
            case 12:
                long j = parcel.readLong();
                ObservableLong observableLong = new ObservableLong();
                observableLong.j = j;
                return observableLong;
            case 13:
                short s = (short) parcel.readInt();
                ObservableShort observableShort = new ObservableShort();
                observableShort.j = s;
                return observableShort;
            case 14:
                return new PagingPlaceholderKey(parcel.readInt());
            case 15:
                return new ParcelImpl(parcel);
            case 16:
                int i4 = parcel.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i4);
                int[] iArr = new int[i4];
                boolean[] zArr = new boolean[i4];
                parcel.readIntArray(iArr);
                parcel.readBooleanArray(zArr);
                for (int i5 = 0; i5 < i4; i5++) {
                    parcelableSparseBooleanArray.put(iArr[i5], zArr[i5]);
                }
                return parcelableSparseBooleanArray;
            case 17:
                int i6 = parcel.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i6);
                int[] iArr2 = new int[i6];
                int[] iArr3 = new int[i6];
                parcel.readIntArray(iArr2);
                parcel.readIntArray(iArr3);
                for (int i7 = 0; i7 < i6; i7++) {
                    parcelableSparseIntArray.put(iArr2[i7], iArr3[i7]);
                }
                return parcelableSparseIntArray;
            case 18:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 19:
                android.support.v4.media.session.ParcelableVolumeInfo parcelableVolumeInfo2 = new android.support.v4.media.session.ParcelableVolumeInfo();
                parcelableVolumeInfo2.a = parcel.readInt();
                parcelableVolumeInfo2.c = parcel.readInt();
                parcelableVolumeInfo2.d = parcel.readInt();
                parcelableVolumeInfo2.e = parcel.readInt();
                parcelableVolumeInfo2.b = parcel.readInt();
                return parcelableVolumeInfo2;
            case 20:
                return new PermissionReason(parcel);
            case 21:
                js3.p(parcel, "parcel");
                return new PhoneBindData(parcel.readString());
            case 22:
                js3.p(parcel, "parcel");
                return new PinBindData(parcel);
            case 23:
                return new PlaybackStateCompat(parcel);
            case 24:
                return new android.support.v4.media.session.PlaybackStateCompat(parcel);
            case 25:
                js3.p(parcel, "parcel");
                return new PlayerConfig(parcel.readInt(), parcel.readInt());
            case 26:
                js3.p(parcel, "parcel");
                return new PlayerMovie(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), MovieType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ShareModel.CREATOR.createFromParcel(parcel));
            case 27:
                js3.p(parcel, "parcel");
                MovieUri movieUri = (MovieUri) parcel.readParcelable(PlayerMovieData.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                PlayerMovie playerMovieCreateFromParcel = PlayerMovie.CREATOR.createFromParcel(parcel);
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z3 = false;
                    z6 = true;
                } else {
                    z3 = false;
                }
                return new PlayerMovieData(movieUri, string2, string3, playerMovieCreateFromParcel, z6, parcel.readInt() == 0 ? z3 : true);
            case 28:
                return new PopupExtra(parcel);
            default:
                return new PushMessage(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MenuEventBuilder[i];
            case 1:
                return new MovieClickEventBuilder[i];
            case 2:
                return new MovieCredit[i];
            case 3:
                return new MovieUri[i];
            case 4:
                return new MultiSelectEventBuilder[i];
            case 5:
                return new NotificationPermission[i];
            case 6:
                return new ObservableBoolean[i];
            case 7:
                return new ObservableByte[i];
            case 8:
                return new ObservableChar[i];
            case 9:
                return new ObservableDouble[i];
            case 10:
                return new ObservableFloat[i];
            case 11:
                return new ObservableInt[i];
            case 12:
                return new ObservableLong[i];
            case 13:
                return new ObservableShort[i];
            case 14:
                return new PagingPlaceholderKey[i];
            case 15:
                return new ParcelImpl[i];
            case 16:
                return new ParcelableSparseBooleanArray[i];
            case 17:
                return new ParcelableSparseIntArray[i];
            case 18:
                return new ParcelableVolumeInfo[i];
            case 19:
                return new android.support.v4.media.session.ParcelableVolumeInfo[i];
            case 20:
                return new PermissionReason[i];
            case 21:
                return new PhoneBindData[i];
            case 22:
                return new PinBindData[i];
            case 23:
                return new PlaybackStateCompat[i];
            case 24:
                return new android.support.v4.media.session.PlaybackStateCompat[i];
            case 25:
                return new PlayerConfig[i];
            case 26:
                return new PlayerMovie[i];
            case 27:
                return new PlayerMovieData[i];
            case 28:
                return new PopupExtra[i];
            default:
                return new PushMessage[i];
        }
    }
}
