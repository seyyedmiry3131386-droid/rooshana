package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import defpackage.rq4;
import defpackage.wv;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle a;

    static {
        wv wvVar = new wv(0);
        wvVar.put("android.media.metadata.TITLE", 1);
        wvVar.put("android.media.metadata.ARTIST", 1);
        wvVar.put("android.media.metadata.DURATION", 0);
        wvVar.put("android.media.metadata.ALBUM", 1);
        wvVar.put("android.media.metadata.AUTHOR", 1);
        wvVar.put("android.media.metadata.WRITER", 1);
        wvVar.put("android.media.metadata.COMPOSER", 1);
        wvVar.put("android.media.metadata.COMPILATION", 1);
        wvVar.put("android.media.metadata.DATE", 1);
        wvVar.put("android.media.metadata.YEAR", 0);
        wvVar.put("android.media.metadata.GENRE", 1);
        wvVar.put("android.media.metadata.TRACK_NUMBER", 0);
        wvVar.put("android.media.metadata.NUM_TRACKS", 0);
        wvVar.put("android.media.metadata.DISC_NUMBER", 0);
        wvVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        wvVar.put("android.media.metadata.ART", 2);
        wvVar.put("android.media.metadata.ART_URI", 1);
        wvVar.put("android.media.metadata.ALBUM_ART", 2);
        wvVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        wvVar.put("android.media.metadata.USER_RATING", 3);
        wvVar.put("android.media.metadata.RATING", 3);
        wvVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        wvVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        wvVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        wvVar.put("android.media.metadata.DISPLAY_ICON", 2);
        wvVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        wvVar.put("android.media.metadata.MEDIA_ID", 1);
        wvVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        wvVar.put("android.media.metadata.MEDIA_URI", 1);
        wvVar.put("android.media.metadata.ADVERTISEMENT", 0);
        wvVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new fr5(25);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(rq4.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
